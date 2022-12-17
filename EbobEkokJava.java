import java.util.Scanner;

public class EbobEkokJava {
    public static void main(String[] args) {
        int n1, n2, ebob = 1, ekok;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen n1'i giriniz");
        n1 = input.nextInt();
        System.out.print("Lütfen n2'yi giriniz");
        n2 = input.nextInt();
        if (n1 <= n2) {
            for (int i = n1; i >= 1; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    break;
                }
            }
        } else {
            for (int i = n1; i >= 1; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    break;
                }
            }
        }

        for (ekok = 1; !(ekok % n1 == 0 && ekok % n2 == 0); ekok++) {
        }
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}