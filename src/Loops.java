import java.util.Scanner;
public class Loops {
    static Scanner scanner = new Scanner(System.in);

    // 1’den 10’a kadar olan sayıları ekrana yazdıran bir program yaz.
    public static void problem1() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

    // 1’den 100’e kadar olan çift sayıları ekrana yazdır.
    public static void problem2() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    // 1’den 100’e kadar olan tek sayıları ekrana yazdır.
    public static void problem3() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // Kullanıcıdan bir sayı alarak bu sayıya kadar olan sayıların toplamını hesaplayan bir program yaz.
    public static void problem4() {
        System.out.print("Sayı: \n >>> ");
        int number = scanner.nextInt();

        int total = 0;

        for (int i = number; i > 0; i--) {
            total += i;
        }
        System.out.println("Toplam: " + total);

    }

    // 1’den 10’a kadar olan sayıların çarpımını (faktöriyel) hesaplayan bir program yaz.
    public static void problem5() {
        System.out.print("Faktoriyelini bulmak istediğiniz sayıyı giriniz: \n>>> ");
        int number = scanner.nextInt();
        int faktoriyel_sabit = 1;
        for (int i = number; i > 0; i--) {
            faktoriyel_sabit *= i;
        }
        System.out.println("Faktoriyel Sonucu: " + faktoriyel_sabit);

    }

    // Kullanıcıdan pozitif bir sayı alana kadar tekrar tekrar sayı isteyen bir program yaz.
    public static void problem6() {
        int number;
        do {
            System.out.print("Sayı: \n>>> ");
            number = scanner.nextInt();
        }
        while (number <= 0);


    }

    // 1'den 20'ye kadar olan sayıların karelerini yazdıran bir program yaz.
    public static void problem7() {

        for (int i = 1; i <= 20; i++) {
            System.out.print(i*i + " ");

        }
    }

    //Bir sayının tersini döndüren bir program yaz (örneğin, 123 sayısı için çıktı 321 olmalı).
    public static void problem8() {
        System.out.print("Ters çevirmek istediğiniz sayıyı giriniz: \n>>> ");
        int number = scanner.nextInt();
        int reversed_num = 0;
        int power = 1;
        int remainer;
        String num_str = Integer.toString(number);
        int len = num_str.length() - 1;
        int[] steps = {number};
        do {
            remainer = number%10;
            number -= remainer;
            number /= 10;
            reversed_num += remainer * Math.pow(10, len);
            len--;

        }
        while (number > 0);
        System.out.print("Ters çevrilmiş sayı: " + reversed_num);
    }

    // 5’in katlarını 1’den 50’ye kadar yazdır.
    public static void problem9() {
        int number = 5;
        int factor = 1;
        while (number * factor < 50) {
            System.out.print(number * factor + " ");
            factor++;

        }
    }

}
