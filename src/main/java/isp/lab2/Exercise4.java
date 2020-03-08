package isp.lab2;

public class Exercise4 {

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
     * This method should get the first(by position) odd number from the given array
     *
     * @param someNumbers the given int array
     * @return first odd number from the array
     */
    public static int firstOdd(int[] someNumbers) {
        int odd=0;
        for(int i=0;i<someNumbers.length;i++){
            if(someNumbers[i]%2!=0) {
                odd=someNumbers[i];
                break;
            }
        }
        return odd;
    }

    /**
     * This method should get the first(by position) even number from the given array
     *
     * @param someNumbers the given int array
     * @return first even number from the array
     */
    public static int firstEven(int[] someNumbers) {
        int even=0;
        for(int i=0;i<someNumbers.length;i++){
            if(someNumbers[i]%2==0) {
                even=someNumbers[i];
                break;
            }
        }
        return even;
    }

    /**
     * This method should get the first(by position) prime number from the given array
     *
     * @param someNumbers the given int array
     * @return first prime number from the array
     */
    public static int firstPrime(int[] someNumbers) {
        // TODO: Use isPrimeNumber(final int number)
        int prim=0;
        for (int i=0;i<someNumbers.length;i++){
            if(isPrimeNumber(someNumbers[i])) {
                prim = someNumbers[i];
                break;
            }
        }
        return prim;
    }

    /**
     * Don't forget to also display the position of ech number
     */
    public static void main(String[] args) {
        int[] someNumbers = new int[]{15, 18, 13, 22, 21, 11, 57, 141, 563, 16};

        System.out.println("First odd number: " + firstOdd(someNumbers));
        System.out.println("First even number: " + firstEven(someNumbers));
        System.out.println("First prime number: " + firstPrime(someNumbers));
    }
}
