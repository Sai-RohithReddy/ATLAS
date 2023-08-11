package DesignPatterns;

import java.time.Duration;
import java.time.LocalDateTime;

enum CircuitBreakerStates {
    OPEN,
    CLOSED,
    HALF_OPEN
}

class CircuitBreaker {
    private int failureThreshold;
    private Duration timeout;
    private int failureCount;
    private LocalDateTime lastFailureTime;
    private CircuitBreakerStates state;

    CircuitBreaker(int failureThreshold, Duration timeout) {
        this.failureThreshold = failureThreshold;
        this.timeout = timeout;
        this.failureCount = 0;
        this.lastFailureTime = null;
        this.state = CircuitBreakerStates.CLOSED;
    }

    public void executeRequest() {
        if (state == CircuitBreakerStates.OPEN && isTimeOutExpired()) {
            state = CircuitBreakerStates.HALF_OPEN;
            System.out.println("Transitioning to Half Open State");
        }
        if (state == CircuitBreakerStates.CLOSED || state == CircuitBreakerStates.HALF_OPEN) {
            System.out.println("Sending a request....");
            boolean success = sendRequest();
            if (success) {
                reset();
            } else {
                handleFailure();
            }
        } else {
            System.out.println("Circuit Break is open....");
        }
    }

    private boolean isTimeOutExpired() {
        LocalDateTime currentTime = LocalDateTime.now();
        return lastFailureTime.plus(timeout).isBefore(currentTime);
    }

    private void handleFailure() {
        failureCount++;
        lastFailureTime = LocalDateTime.now();
        System.out.println("Failure Count so far : " + failureCount);
        if (failureCount >= failureThreshold) {
            state = CircuitBreakerStates.OPEN;
            System.out.println("Ciruit Braker Transitioned to OPEN state");
        }

    }

    private void reset() {
        failureCount = 0;
        lastFailureTime = null;
        state = CircuitBreakerStates.CLOSED;
        System.out.println("System is reset");
    }

    private boolean sendRequest() {
        double randomValue = Math.random();
        return randomValue >= 0.5;
    }
}

public class CircuitBreakerPattern {
    public static void main(String args[]) {
        CircuitBreaker circuitBreaker = new CircuitBreaker(2, Duration.ofSeconds(5));

        for (int i = 0; i <= 30; i++) {
            System.out.println("Request no. " + (i + 1));
            circuitBreaker.executeRequest();
        }
    }
}
