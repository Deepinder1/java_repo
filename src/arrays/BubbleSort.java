package arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {2,3,8,-3,6,4,12};

        int n = a.length;

        for (int i = 0; i < n-1; i++){
            // the outer loop is working n - 1 times
            // now creating a bollean
            boolean sorted = true; // if this boolean would be true the loops would not work excessively
            for (int j = 0; j < n -1-i; j++){// the inner loop will work n-1-i times bcoz the last element is sorted andvalue of i gets increse
                if (a[j+1] < a[j]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;

                    sorted = false;//if the if condition is true even once the code inside the if condition
                                    // would swap and sorted bool will be false
                                    

                }
            }
            // putting a check of boolean for optimisation
            if (sorted) break;
        }
        for (int item: a){//this is for each loop used in array

            System.out.print(item+ " ");
        }


    }

}
