package methods;

public class Introduc {
    public static void main(String[] args) {
        //this is main method returning and entrypoint

        int firstNum = 34;
        int secondNum = 23;

        int result = maxOf(firstNum, secondNum);
        // now this is calling method
//        we are calling maxOf and passing parameter

        System.out.println(result);
        sayHi();
        sayHi();
    }

    static int maxOf(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    static void sayHi() {
        System.out.println("Hi");
        System.out.println("Good Morning");
    }

    static void maxOf(float d){

    }
}
