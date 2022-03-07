import java.util.Scanner;
public class MenghitungFaktorialjb7{
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int angka,faktorial=1;
    System.out.print("Masukkan sebuah angka     : ");
    angka = input.nextInt();

    for(int i=1; i<=angka; i++){
        faktorial*=i;
       System.out.println("Hasil faktorial dari angka " +angka+ " adalah " +faktorial);
    }
    }
}