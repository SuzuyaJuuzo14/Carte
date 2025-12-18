public class Luhn {

    public static boolean estValideCarte(long numero) {
        String numeroStr = String.valueOf(numero);
        int[] chiffres = new int[numeroStr.length()];

        for (int i = 0; i < numeroStr.length(); i++) {
            chiffres[i] = numeroStr.charAt(i) - '0';
        }

        int somme = 0;
        int longueur = chiffres.length;

        for (int i = longueur - 1; i >= 0; i--) {
            int positionDepuisDroite = longueur - 1 - i;

            int chiffre = chiffres[i];

            if (positionDepuisDroite % 2 == 1) {
                chiffre = chiffre * 2;

                if (chiffre > 9) {
                    chiffre = chiffre - 9;
                }
            }

            somme = somme + chiffre;
        }

        return (somme % 10 == 0);
    }

    public static void main(String[] args) {
        long n1 = 1714;
        long n2 = 12345;
        long n3 = 891;
        long n4 = 49927398716L;
        long n5 = 4012_0010_3714_1112L;

        System.out.println(n1 + " -> " + estValideCarte(n1));
        System.out.println(n2 + " -> " + estValideCarte(n2));
        System.out.println(n3 + " -> " + estValideCarte(n3));
        System.out.println(n4 + " -> " + estValideCarte(n4));
        System.out.println(n5 + " -> " + estValideCarte(n5));
    }
}
