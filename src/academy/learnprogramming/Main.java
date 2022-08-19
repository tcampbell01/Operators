package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        int result = 1+2;
        System.out.println(result); //3
        int previousResult = result;
        System.out.println(previousResult); //3
        result = result -1;
        System.out.println(result); //2

        result = result * 10;
        System.out.println(result); //20

        result = result / 5; //4
        System.out.println(result);

        result = result % 3; //remainder of (4 % 3) = 1
        System.out.println(result);
    }
}