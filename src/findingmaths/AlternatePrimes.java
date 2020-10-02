package findingmaths;

public class AlternatePrimes {
    public static void main(String[] args) {
        int n = 15;
        int count =2;
        //if we start count from 1 it would start printing count
        // it would start skipping the prime numbers which are now printed
        // and print which are now skipped
        for (int i = 2; count <= 2*n; i++){
            //we are taking first 15 alternate prime numbers therefore setting count less than 2n or 30
            boolean isPrime = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    //if i is divisibe by j it is not prime therfore bool becomes flase
                    isPrime = false;
                    break;
                }

            }

            if (isPrime==true){
                if (count % 2 == 0){
                    System.out.println(i);
                }

                count++;
            }
        }

    }
}
