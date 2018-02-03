import java.util.Scanner;

public class Fibonacci {
    private static long n;
    public Fibonacci() {
        long n = 0;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long z = 0;
        while (z < 1) {
            System.out.println("Positive Zahl eingeben eingeben");
            z = s.nextInt();
        }
        n = z;
        long startTime = System.currentTimeMillis();
        System.out.println(itFib(n));
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Zeit in Millisekunden mit Iterativer Berechnung: " + elapsedTime + "\n");
        long startTimeR = System.currentTimeMillis();
        System.out.println(recFib(n));
        long stopTimeR = System.currentTimeMillis();
        long elapsedTimeR = stopTimeR - startTimeR;
        System.out.println("Zeit in Millisekunden mit Rekursiver Berechnung: " + elapsedTimeR);
        s.close();
    }

    private static long recFib(long n) {
        if (n <= 0){
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return recFib(n-2) + recFib(n-1);
        }
    }
    private static long itFib(long n) {
        long a = 0;
        long b = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {b++;}
            if (i % 2 == 0) {
                b += a;
            }
            else {
                a += b;
            }
        }
        if (a<b) {return b;}
        else {return a;}
    }
}
