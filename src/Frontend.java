import java.util.Scanner;
public class Frontend {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("x eingeben");
        int x = s.nextInt();
        System.out.println("y eingeben");
        int y = s.nextInt();
        Backend b = new Backend(x, y);
        System.out.println("x*y = " + b.rechneXmalY() + "\n" + "x-y = " + b.rechneXminusY() + "\n" + "x:y rest = " + b.rechneXmoduloY());
        s.close();
    }
}
