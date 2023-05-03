import java.util.Scanner;
public class JarakTempuh {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int v;
            do{
                System.out.print("Masukkan kecepatan kendaraan (km/jam): ");
                v = input.nextInt();
                if(v<0){
                System.out.println("Kecepatan tidak bisa negatif. Masukkan kembali kecepatan.");
                }
            }while(v<0);
            int t;
            do{
                System.out.print("Masukkan waktu tempuh (jam): ");
                t = input.nextInt();
                if(t<1){
                System.out.println("Waktu tempuh harus lebih besar dari atau sama dengan 1 jam. Masukkan kembali waktu tempuh.");
                }
            }while(t<1);
            System.out.println("Waktu (jam)\tJarak (km)");
            for(int tet=1;tet<=t;tet++){
                int spid=tet*v;
                System.out.printf("%-11d\t%6d\n",tet,spid);
            }
            

        

            
            
        }
    
}
