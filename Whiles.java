public class Whiles {
    public static void main(String[] args) {
        int szam1 = (int) (Math.random() * 99) + 1;
        int szam2 = (int) (Math.random() * 99) + 1;

        int kisebb = Math.min(szam1, szam2);
        int nagyobb = Math.max(szam1, szam2);

        int sor = 0;

        while (kisebb <= nagyobb) {
            System.out.print(kisebb + " ");
            kisebb++;
            sor++;

            if (sor == 10) {
                System.out.println();
                sor = 0;
            }
        }

        if (sor != 0) {
            System.out.println();
        }

        int szamlalo = 0;

        do {
            if (szamlalo != 0 && szamlalo % 10 == 0) 
                System.out.println();
            System.out.print(kisebb++ + " ");
            szamlalo++;
        } while (kisebb <= nagyobb);
    }
}