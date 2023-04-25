import java.util.Scanner;
public class SegitigaSikuTerbalik
{
    // Tuliskan method main
    public static void main(String[]args){
        
        // Membuat object Scanner
        Scanner input = new Scanner(System.in);
        
        // Minta pengguna memasukkan nilai n
        // n dalam bentuk angka
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        
        // Loop pertama dengan kondisi jika 'i' sama dengan 'n'
        // selama 'i' lebih besar dari 0
        // 'i' didekrementasi
        for(int i = n ; i >= 1; i--){
            // Loop kedua dengan kondisi jika 'j' sama dengan 0
            // selama 'j' lebih kecil dari 'i'
            // 'j' diinkrementasi
            for(int j = 1; j <= i; j++){
                // Cetak '*'
                System.out.print("*");
            }
            System.out.println();
        }
        
        
            
            
            
                
                
                
            // Cetak String kosong untuk baris baru

    }
}
