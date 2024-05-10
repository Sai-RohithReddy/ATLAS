package recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println(toh(3, 'A', 'C', 'B'));
    }
    public static long toh(int N, char from, char to, char aux) {
        if (N == 0) {
            return 0;
        }
        
        long moves = toh(N - 1, from, aux, to);
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        moves++;
        moves += toh(N - 1, aux, to, from);
        
        return moves;
    }
}
