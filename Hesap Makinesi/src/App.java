import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        double sayi1, sayi2;
        int islem;
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        sayi1 = scan.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        sayi2 = scan.nextDouble();
        System.out.println("İşlem Seçiniz\n1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
        islem = scan.nextInt();

        switch (islem) {
            case 1: 
            System.out.println(sayi1 + sayi2);
            break;
            case 2:
            System.out.println(sayi1 - sayi2);
            case 3:
            System.out.println(sayi1 * sayi2);
            case 4:
            System.out.println(sayi1 / sayi2);
        }

    }
}
