import java.util.Scanner;

public class PenjualanTiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahTiket = 10;
        int pembeli = 0;
        int beliTiket;
        final int TIKET_MAKSIMAL_PER_ORANG = 4;
        while (jumlahTiket > 0) {

            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            beliTiket = input.nextInt();
            if (beliTiket > TIKET_MAKSIMAL_PER_ORANG) {
                System.out.println("Anda tidak bisa membeli lebih dari 4 tiket.");
            }
            if (beliTiket > jumlahTiket) {
                System.out.println("Maaf, sisa tiket yang tersisa adalah " + jumlahTiket + " tiket.");
            } else {
                if (beliTiket >= 1 && beliTiket <= 4 && beliTiket <= jumlahTiket) {
                    jumlahTiket = jumlahTiket - beliTiket;
                    pembeli++;
                }
                if (beliTiket > 0 && beliTiket <= 4) {
                    System.out.println("Anda membeli sebanyak " + beliTiket + " tiket.");
                }
                if (jumlahTiket >= 1 && beliTiket > 0 && beliTiket <= 4) {
                    System.out.println("Sisa tiket yang tersedia: " + jumlahTiket);
                }
            }

        }
        System.out.println("Semua tiket telah terjual kepada " + pembeli + " pembeli.");
    }
}
