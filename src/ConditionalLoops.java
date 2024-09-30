import java.util.Scanner;
public class ConditionalLoops {
    static Scanner scanner = new Scanner(System.in);

    // Kullanıcıdan negatif bir sayı girene kadar pozitif sayılar istemeye devam eden bir program yaz.
    public static void problem1() {
        int number;
        do {
        System.out.print("Bir sayı girebilir misiniz: \n>>> ");
        number = scanner.nextInt();
        }
        while (number >= 0);
    }

    //Kullanıcıdan alınan sayının basamaklarının toplamını hesaplayan bir program yaz.
    public static void problem2() {
        System.out.print("Basamaklarını toplamak istediğiniz sayıyı giriniz: \n>>> ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        String len = String.valueOf(number);
        int uzunluk = len.length();
        int total = 0;

        for (int i = 0; i < uzunluk; i++) {
            int reminder = number % 10;
            number /= 10;
            total += reminder;
        }
        System.out.print(total);


    }

    //Kullanıcının girdiği bir sayının asal olup olmadığını bulan bir program yaz.
    public static boolean problem3() {
        System.out.print("Asal sayı kontrol: \n>>> ");
        int number = scanner.nextInt();

        if (number <= 0) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

    //Fibonacci dizisinin ilk 10 terimini ekrana yazdır.
    public static void problem4() {
        int sinir = 10;
        int i = 1;
        int a = 1;
        int b = 1;
        System.out.print("1 ");

        while (i <= sinir) {
            System.out.print(b + " ");
            int temp = b;
            b = a + b;
            a = temp;
            i++;
            }
    }

    //Kullanıcıdan alınan iki sayının EBOB'unu bulan bir program yaz.
    public static int problem5(int sayi1, int sayi2) {
        while (sayi2 != 0) {
            int temp = sayi2;
            sayi2 = sayi1 % sayi2;
            sayi1 = temp;
        }
        return sayi1;

        }
    //Kullanıcıdan alınan iki sayının EKOK'unu bulan bir program yaz.
    public static int problem6(int sayi1, int sayi2) {
        return Math.abs(sayi1 * sayi2) / problem5(sayi1, sayi2);

    }

    //Kullanıcıdan alınan sayının faktöriyelini bulan bir program yaz.
    public static void problem7() {
        System.out.print("Faktöryelini hesaplamak istediğiniz sayıyı giriniz :\n>>> ");
        int number = scanner.nextInt();
        int fak_sabit = 1;

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                fak_sabit *= i;
            }
            System.out.print(fak_sabit);
        }
        else if (number == 0){
            System.out.print(1);
        }
        else {
            System.out.print(-1);
        }
    }

    //Kullanıcının girdiği sayının Armstrong sayısı olup olmadığını bulan bir program yaz.
    public static void problem8() {
        System.out.print("Armstron Sayısı kontrol noktası. Bir sayı giriniz: \n>>> ");
        int number = scanner.nextInt();
        int tmp = number;
        int armstrong = 0;
        String sayi = String.valueOf(number);
        int len = sayi.length();

        while (number > 0) {
            armstrong += Math.pow((number % 10), len);
            number /= 10;
        }
        if (armstrong == tmp) {
            System.out.print("Bu sayı armstrong sayısıdır.");
        }
        else {
            System.out.print("Bu sayı armstrong sayısı değildir.");
        }
    }

    //Girilen iki sayı arasında kalan tüm asal sayıları bulan bir program yaz.


}


