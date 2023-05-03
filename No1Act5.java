import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int count = 0;
        System.out.print("Masukkan angka floating point positif (-1 untuk mengakhiri): ");
        double num = input.nextDouble();
        
        do{
            if(num != -1){
            sum += num;
            count++;
            
            if(num > max) {
                max = num;
            }
            
            if(num < min) {
                min = num;
            }
            
            System.out.print("Masukkan angka floating point positif (-1 untuk mengakhiri): ");
            num = input.nextDouble();
            }
        }while(num != -1);
        
        if(count>0){
        double average = sum / count;
        double diff = max - min;
        
        System.out.println("Rata-rata = " + average);
        System.out.println("Maksimum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Selisih Maks dan Min = " + diff);
        }
    }
}
