import java.util.Scanner;

public class ParosParatlanDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int szam;
        do {
            System.out.print("Kérem adjon meg egy pozitív egész számot (0 vagy kisebb szám kilép): ");
            szam = scanner.nextInt();
            
            if (szam > 0) {
                if (szam % 2 == 0) {
                    System.out.println("A megadott szám páros.");
                } else {
                    System.out.println("A megadott szám páratlan.");
                }
            }
        } while (szam > 0);
        
        scanner.close();
    }
}
