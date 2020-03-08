package isp.lab2;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    /**
     * This method should generate an random number between 2 and 10 then
     * should ask user to enter that amount of numbers from keyboard and
     * store the numbers in an int array which should be returned
     *
     * @return the array of numbers read from keyboard
     */
    private static int[] getUserNumbers() {
        Random x = new Random();
        int [] v1=new int [10];
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n=2+x.nextInt(8);
        for (int i = 0; i < n; i++)
        {
            v1[i] = a;
        }
        return v1;
    }

    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        double mean=0;
        for(int i=0;i<userNumbers.length;i++) {
            mean = mean + userNumbers[i];
        }
            mean=mean/userNumbers.length;
        return mean;


    }

    public static void main(String[] args) {
        int[] userNumbers = getUserNumbers();
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));
    }


}
