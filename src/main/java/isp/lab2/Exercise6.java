package isp.lab2;

public class Exercise6 {
    static int[] v1;
    /**
     * This method should generate the required vector non-recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateVector(int n) {
        int [] v = new int[n];
        v[0]=1;
        v[1]=2;
        for(int i=2;i<n;i++){
            v[i]=v[i-2]*v[i-1];
        }
        return v;
    }

    /**
     * This method should generate the required vector recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateRandomVectorRecursively(int n) {
        if(v1==null){
            v1 = new int[n];
            v1[0] = 1;
            v1[1] = 2;
        }
        else{

        }
        return v1;
    }


    public static void main(String[] args) {
        // TODO: print the vectors
        for (int i = 0; i <generateVector(10).length-1; i++) {
            System.out.print("a[" + i + "]=" + generateVector(10)[i] + " ");
        }
        System.out.println();
        for(int i: generateRandomVectorRecursively(8))
            System.out.println(i);
    }
}
