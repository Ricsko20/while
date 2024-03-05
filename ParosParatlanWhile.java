import java.util.Scanner;

public class ParosParatlanWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int szam = 1;
        while (szam > 0) {
            System.out.print("Kérem adjon meg egy pozitív egész számot!");
            szam = scanner.nextInt();
            
            if (szam > 0) {
                if (szam % 2 == 0) {
                    System.out.println("A megadott szám páros.");
                } else {
                    System.out.println("A megadott szám páratlan.");
                }
            }
        }
        
        scanner.close();
    }
}
