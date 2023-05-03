import java.util.Scanner;

public class FaktorPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan asli: ");
        int bilangan = input.nextInt();
        for (int i = 2; i <= bilangan; i++) {
            while (bilangan % i == 0) {
                System.out.println(i + " ");
                bilangan = bilangan / i;
            }
        }
    }
}
