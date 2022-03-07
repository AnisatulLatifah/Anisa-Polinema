import java.util.Scanner;
public class MenghitungGaji{
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    double gajiPokok,hasilPenjualan,komisi,totalGaji;

    System.out.print("Masukkan Gaji Pokok          : ");
    gajiPokok = input.nextDouble();
    System.out.print("Masukkan total penjualan     : ");
    hasilPenjualan = input.nextDouble();

    //Mencari jumlah komisi
    komisi = hasilPenjualan*0.15;
    //Mencari jumlah gaji
    totalGaji = gajiPokok+komisi;

    System.out.print("Total Gaji Anda adalah        : "+totalGaji);

    }
}


