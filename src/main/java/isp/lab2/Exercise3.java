package isp.lab2;

public class Exercise3 {

    /**
     * This method should verify if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime and false otherwise
     */
    public static boolean isPrimeNumber(final int number) {

        if(number==0 || number==1)
            return false;
        if(number==2)
            return true;
        if(number%2==0)
            return false;
        for(int i=3;i<number;i++)
            if(number%i==0)
                return false;

            return true;
    }

    /**
     * This method should calculate the sum of digits of a given number
     *
     * @param number the number used to calculate the sum of digits
     * @return an int representing the sum of digits of the given number
     */
    public static int calculateSumOfDigits(int number) {
        int sum=0,digit,aux=number;
        while(aux!=0)
        {
          digit=aux%10;
          sum=sum+digit;
          aux=aux/10;
        }
        return sum;
    }

    /**
     * This method should extract the prime numbers from a given interval
     * using isPrimeNumber(final int number) method defined above
     * NOTE* a < b
     *
     * @param a the left end of the interval
     * @param b the right end of the interval
     * @return and int array consisting of the prime numbers from the given interval
     */
    public static int[] getPrimeNumbersFromInterval(int a, int b) {
        // TODO: Use isPrimeNumber(final int number)
        int l=0,k=0;
        for(int i=a;i<=b;i++) {
            if (isPrimeNumber(i))
            {
                l++;
            }
        }
        int [] v1= new int [l];
        for(int i=a;i<=b;i++)
        {
            if(isPrimeNumber(i))
            {
                v1[k]=i;
                k++;
            }
        }
            return v1;
    }

    /**
     * This method should calculate the geometric mean of the given prime numbers
     *
     * @param primeNumbers the numbers used to calculate the geometric mean
     * @return the geometric mean of the given numbers
     */
    public static double calculateGeometricMean(int[] primeNumbers) {
        double gmean=0,p=1;
        for(int i=0;i<primeNumbers.length;i++)
        {
            p=p*primeNumbers[i];
        }
        gmean=(double)Math.pow(p,(double)1/primeNumbers.length);
        return gmean;
    }

    /**
     * This method should calculate the number of prime numbers which
     * have the sum of digits an even number
     * NOTE* use calculateSumOfDigits(int number)
     *
     * @param primeNumbers prime numbers used for calculation
     * @return the numbers which respect the given condition
     */
    public static int numberOfPNWithEvenSumOfDigits(int[] primeNumbers) {
        // TODO: Use calculateSumOfDigits(int number)
        int k=0;
        for (int i=0;i<primeNumbers.length;i++)
        {
            if(calculateSumOfDigits(primeNumbers[i])%2==0) {
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 50;
        System.out.println("The geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a, b)));
        System.out.println("The number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(getPrimeNumbersFromInterval(a, b)));
    }
}
