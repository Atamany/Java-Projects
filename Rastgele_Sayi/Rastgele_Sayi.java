import java.util.Random;
import java.util.Scanner;

public class Rastgele_Sayi {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        Random random = new Random();

       int R1 = random.nextInt(9) + 1;
       int R2 = random.nextInt(10);
       int R3 = random.nextInt(10);
       int R4 = random.nextInt(10);

       System.out.println("Bilgisayar sayi tutuyor: " + R1 + R2 + R3 + R4);

       if(R1 == R2 || R2 == R3 || R3 == R4 || R1 == R3 || R1 == R4 || R2 == R4) {
        System.out.println("Hata");
       }

    if(R1 != R2 && R2 != R3 && R3 != R4 && R1 != R3 && R1 != R4 && R2 != R4) {

        System.out.println("Klavyeden 4 basamakli sayi giriniz: ");
        int sayi = scan.nextInt();
        int bir = sayi % 10;
        int on = (sayi / 10) % 10;
        int yuz = (sayi/100) % 10;
        int bin = sayi / 1000;

        if (bin == yuz || yuz == on || on == bir || bin == on || bin == bir || yuz == bir) {
            System.out.println("Hata");
        }
        if(bin != yuz && yuz != on && on != bir && bin != on && bin != bir && yuz != bir) {
            System.out.println("Klavyeden girilen sayi: " + bin + yuz+ on + bir);
        }

            if (R1 == bin) {
                System.out.println("+1");
            }
            if (R2 == yuz) {
                System.out.println("+1");
            }
                if (R3 == on) {
                System.out.println("+1");
                }
                if (R4 == bir) {
                System.out.println("+1");
                }

                if (R1 == yuz) {
                System.out.println("-1");
                }
                if (R1 == on) {
                System.out.println("-1");
                }
                if (R1 == bir) {
                System.out.println("-1");
                }

                if (R2 == bin) {
                System.out.println("-1");
                }
                if (R2 == on) {
                System.out.println("-1");
                }
                if (R2 == bir) {
                System.out.println("-1");
                }

                if (R3 == bin) {
                System.out.println("-1");
                }
                if (R3 == yuz) {
                System.out.println("-1");
                }
                if (R3 == bir) {
                System.out.println("-1");
                }

                if (R4 == bin) {
                System.out.println("-1");
                }
                if (R4 == yuz) {
                System.out.println("-1");
                }
                if (R4 == on) {
                System.out.println("-1");
                }
}
}
}
    
