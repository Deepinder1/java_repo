package arrays;

public class ArraysIntro {
    public static void main(String[] args) {
//        int [] marks = new int[5];// 5 insid denote how many marks we can store
//        // this is one method of making array
//        int [] mark;
//        mark = new int[10];
//        // this is another method

        // two ways of putting sqaure brakets is as follows

//        int marks [] = new int[5];

        //2nd way is good bcoz if we want to declare two arrays at the same time
//        int [] rolNums, clases = new int[5];
        // array starts with the 0 position and positions go upto n-1
    // initialize of array
    int[] age = {2, 5, 1, 34,12};

    double[] marks = {1.0, 3.4, 14.0, 12.4, 2.9};

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
        // this is not way we would use for loop
        marks[4] = 4.56;
        // get and set
        for (int i = 0; i < age.length; i++){
            System.out.println(age[i]);
        }


    }
}
