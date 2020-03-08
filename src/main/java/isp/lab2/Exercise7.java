package isp.lab2;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {

    /**
     * This method should generate a random number which
     * represent the position in the given arrays,so
     * the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {
        Random x=new Random();
        int a=x.nextInt(7);
        return a;
    }

    public static void main(String[] args) {
        int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};
        int[] answers = new int[]{10, 4, 2, 1, 2, 1, 1, 1};
        int times = generateARandom();
        System.out.println("How many teams win the UCL trophy "+ucl[times]+" times");
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        if(x==answers[times])
            System.out.println("You got it!");
        else
            if(x<answers[times]||x>answers[times]) {
                System.out.println("Wrong! You got on more chance!");
                int y = in.nextInt();
                if (y == answers[times])
                    System.out.println("You got it this time!");
                else
                    if (y<answers[times]||y>answers[times])
                        System.out.println("Wrong answer:( The right one is "+answers[times]+"");
            }
    }
}
