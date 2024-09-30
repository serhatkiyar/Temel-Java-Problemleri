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

}
