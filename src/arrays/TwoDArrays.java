package arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        int a[][] = new int[5][3];// this is two dimensional array having 5 rows and 3 coumns
        int b [][] = {
                {3, 1, 5, 7, 2},
                {4, 1 , 7},
                {1, 2 , 5, 3, 5, 6, 10}
                };
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){//by typing b[i] we get inside the array
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

    }
}
