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



        //result = result + 1;
        result++; //1 + 1
        System.out.println(result);
        result --; //2-1 = 1
        System.out.println(result);

        //result = result +2;
        result += 2; //1+2
        System.out.println(result);

        //result = result * 10;
        result *= 10; //3*10 = 30
        System.out.println(result);

        //result = result/3;
        result /=3; //30/3=10;
        System.out.println(result);

        //result = result -2;
        result -=2; //10-2 =8;
        System.out.println(result);
    }
}