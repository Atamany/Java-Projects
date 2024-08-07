import java.math.BigInteger;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<BigInteger> Liste1 = new LinkedList<BigInteger>();
        LinkedList<BigInteger> Liste2 = new LinkedList<BigInteger>();
        LinkedList<BigInteger> Sonuc = new LinkedList<BigInteger>();

        System.out.println("1. Sayıyı Giriniz: ");
        String birincisayi = scan.nextLine();
        System.out.println("2. Sayıyı Giriniz: ");
        String ikincisayi = scan.nextLine();

        for (int i = 0; i < birincisayi.length(); i++) {
            int j = birincisayi.charAt(i);
            Liste1.add(BigInteger.valueOf(j - 48));

        }
        for (int i = 0; i < ikincisayi.length(); i++) {
            int j = ikincisayi.charAt(i);
            Liste2.add(BigInteger.valueOf(j - 48));

        }
        BigInteger toplam = BigInteger.ZERO;
        int k = Liste1.size() - 1;
        System.out.println("     " + birincisayi);
        System.out.println("x    " + ikincisayi);
        System.out.println("------------------------------------------------------------------------------------");

        for (k = Liste1.size() - 1; k > -1; --k) {

            for (int j = 0; j < Liste2.size(); j++) {

                toplam = toplam.add(Liste1.get(k).multiply(Liste2.get(j)).multiply(BigInteger.valueOf((long) Math.pow(10, Liste2.size() - j - 1))));
            }
            Sonuc.add(toplam);

            for (int h = k; h > 0; --h) {
                System.out.print(" ");
            }

            System.out.printf(sagaHizala("   " + toplam.toString(), 20));

            System.out.println(" ");
            toplam = BigInteger.ZERO;

        }

        BigInteger genelToplamS = BigInteger.ZERO;
        int q = 0;

        while (q < Sonuc.size()) {
            genelToplamS = genelToplamS.add(Sonuc.get(q).multiply(BigInteger.valueOf((long) Math.pow(10, q))));
            q++;
        }

        System.out.println("+");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf(sagaHizala(genelToplamS.toString(), 22));
    }

    public static String sagaHizala(String s, int karakterSayisi) {
        return String.format("%" + karakterSayisi + "s", s);
    }

    public static String sagaHizala(BigInteger s, int karakterSayisi) {
        return String.format("%" + karakterSayisi + "s", s.toString());
    }
}