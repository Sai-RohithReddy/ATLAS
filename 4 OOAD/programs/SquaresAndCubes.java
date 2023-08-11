class CustomMath {
    public int square(int num) {
        // returns square of given number (int)
        return (num * num);
    }
    public int cube(int num) {
        //returns cube or given number (int)
        return (num * num * num);
    }
    public int power(int num, int pow) {
        int result = 1;

        for (int i = 0; i < pow; i++) {
            result *= num;
        }
        
        return result;
    }
}

public class SquaresAndCubes {
    public static void main(String[] args) {
        CustomMath math = new CustomMath();
        int num = 5;
        int sqrOfNum = math.square(num);
        int cubeOfNum = math.cube(num);
        int powOfNum = math.power(num, 4);

        System.out.println("Square of " + num + " is : " + sqrOfNum);
        System.out.println("Cube of " + num + " is : " + cubeOfNum);
        System.out.println(powOfNum);
        
    }
}