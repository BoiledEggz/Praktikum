//1+2+3.. Dst
import java.util.Scanner;
public class pertambahanberuntun 
{
    public static void main(String[]Args){
        int n, p, jumlah = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Masukkan n: ");
            n = sc.nextInt();
        }while(n<=1);
        
        for(p=1;p<=n;p++){
            jumlah += p;
        }
        
        System.out.print("Jumlah bilangan asli dari 1 s.d "+n+" = " + jumlah);
    }
   
    
}
