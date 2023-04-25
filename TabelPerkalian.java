/*
    Program ini menampilkan tabel perkalian dari 1 s.d 10
    menggunakan loop tersarang.
 */
public class TabelPerkalian
{
    public static void main(String[]args){
        final int NMAX = 10;
        final int XMAX = 10;
        for(int x = 1;x <=XMAX;x++)
        {
            for (int n = 1; n <= NMAX; n++)
            {
                int hasil = x * n;
                System.out.printf("%3s  ",hasil);
            }
            System.out.println();
        }
    }

}
