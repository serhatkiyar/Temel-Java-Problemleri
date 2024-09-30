import java.util.Scanner;
public class Nested_Loops {
    static Scanner scanner = new Scanner(System.in);

    // 5x5 boyutunda bir yıldız (*) matrisi ekrana yazdır.
    public static void problem1() {
        System.out.print("Matrisin satır sayısını giriniz: \n>>> ");
        int rowCount = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz: \n>>> ");
        int columnCount = scanner.nextInt();

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    // 1’den 10’a kadar olan sayıların çarpım tablosunu yazdır.
    public static void problem2() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }

    //Bir dik üçgen şeklinde yıldız (*) deseni yazdır:
    public static void problem3() {
        System.out.print("Dik üçgen için boyut giriniz: \n>>> ");
        int dimension = scanner.nextInt();

        for (int i = 1; i <= dimension; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Piramit şeklinde bir yıldız deseni ekrana yazdır.
    public static void problem4() {
        System.out.print("Piramit Yıldız çizmek için boyut bilgisi giriniz: \n>>> ");
        int dimension = scanner.nextInt();

        for (int i = 0; i < dimension; i++) {
            for(int space = 1; space < dimension - i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Aşağıya doğru inen bir üçgen deseni ekrana yazdır.
    public static void problem5() {
        System.out.print("Ters üçgen çizmek için boyut bilgisi giriniz: \n>>> ");
        int dimension = scanner.nextInt();

        for (int i = dimension; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Pascal üçgenini döngüler kullanarak ekrana yazdır.
    public static void problem6() {
        System.out.print("Pascal üçgeni çizmek için boyut bilgisi giriniz: \n>>> ");
        int dimension = scanner.nextInt();

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 | j == 0 | i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print((factorial(i) / (factorial(j) * factorial(i - j))) + " ");
                }
            }
            System.out.println();

        }
    }

    // Kullanıcıdan bir sayı alarak o sayıya kadar olan asal sayıları ekrana yazdır.
    public static void problem7() {
        System.out.print("Hangi sayıya kadar olan asalları yazdırmak istiyorsunuz: \n>>> ");
        int number = scanner.nextInt();
        if (number > 0) {

            for (int i = 0; i <= number; i++) {
                if (i <= 1) {
                    continue;
                } else {
                    int carpan_sayisi = 0;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            carpan_sayisi += 1;
                        }
                    }
                    if (carpan_sayisi <= 1) {
                        System.out.print(i + " ");
                    }
                }

            }
        }

    }














}
