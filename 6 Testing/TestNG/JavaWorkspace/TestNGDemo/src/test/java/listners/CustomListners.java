package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListners implements ITestListener {

    public void onStart(ITestContext arg) {
        System.out.println("Starts Test execution.... " + arg.getName());
    }

    public void onFinish(ITestContext arg) {
        System.out.println("Finish Test execution.... " + arg.getName());
    }

    public void onTestStart(ITestResult arg) {
        System.out.println("Starts Test.... " + arg.getName());
    }

    public void onTestSkipped(ITestResult arg) {
        System.out.println("Skipped Test.... " + arg.getName());
    }

    public void onTestSuccess(ITestResult arg) {
        System.out.println("Passed Test.... " + arg.getName());
    }

    public void onTestFailure(ITestResult arg) {
        System.out.println("Failed Test.... " + arg.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg) {

    }
}
