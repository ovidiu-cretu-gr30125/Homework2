package isp.lab2;
import java.util.Random;

public class Exercise5 {

    /**
     * This method should generate an array that have 20 random nubers between -1000 and 1000
     *
     * @return the random numbers
     */
    public static int[] generateRandomNumbers() {
        Random x = new Random();
        int [] a= new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = -1000+x.nextInt(2000);
        }
        return a;
    }

    /**
     * This method should sort the given random numbers
     *
     * @param randomNumbers numbers generated random
     * @return sorted int array
     */
    public static int[] getSortedNumbers(int[] randomNumbers) {
        int aux;
        for(int i=0;i<randomNumbers.length;i++){
            for(int j=i+1;j<randomNumbers.length;j++){
                if(randomNumbers[i]>=randomNumbers[j]){
                    aux=randomNumbers[i];
                    randomNumbers[i]=randomNumbers[j];
                    randomNumbers[j]=aux;
                }
            }
        }
        return randomNumbers;
    }

    public static void main(String[] args) {
        // display the random generated numbers
        int[] randomNumbers = generateRandomNumbers();
        System.out.println("The random generated numbers are:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + ", ");
        }
        int[] sortedNumbers = getSortedNumbers(randomNumbers);
        // display the sorted numbers
        System.out.println("The sorted numbers are:");
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + ", ");
        }
    }
}
