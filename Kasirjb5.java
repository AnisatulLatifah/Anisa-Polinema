import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Kasirjb5{
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    double hargaA,jumlahA,hargaB,jumlahB,hargaC,jumlahC,harga1,harga2,harga3,total,diskon=0,totalBayar;

    System.out.print("Masukkan harga barang A   : ");
    hargaA = input.nextDouble();
    System.out.print("Masukkan jumlah barang A  : ");
    jumlahA = input.nextDouble();
    System.out.print("Masukkan harga barang B   : ");
    hargaB = input.nextDouble();
    System.out.print("Masukkan jumlah barang B  : ");
    jumlahB = input.nextDouble();
    System.out.print("Masukkan harga barang C   : ");
    hargaC = input.nextDouble();
    System.out.print("Masukkan jumlah barang C  : ");
    jumlahC = input.nextDouble();

    //menghitung total belanja
    harga1 = hargaA * jumlahA;
    harga2 = hargaB * jumlahB;
    harga3 = hargaC * jumlahC;
    total  = harga1 + harga2 + harga3;

    System.out.println("-------------------------------------------------------");
    System.out.println("                      Struk Total                      ");
    System.out.println("-------------------------------------------------------");
    System.out.println("Nama barang      |      Harga     |     Jumlah    |      Total");
    System.out.println("Barang A              "+hargaA+ "           "+jumlahA+"            "+harga1);
    System.out.println("Barang B              "+hargaB+ "           "+jumlahB+"            "+harga2);
    System.out.println("Barang C              "+hargaC+ "           "+jumlahC+"            "+harga3);
    
    //total harga A,B,C
        System.out.println("Total       : "+total);
    //mencari jumlah diskon
    if(total>=1000000){
        diskon = total * 0.1;
        System.out.println("Diskon      : "+diskon);
    }else if(total>=500000){
        diskon = total * 0.05;
        System.out.println("Diskon      : "+diskon);
    }else if(total>=200000){
        diskon = total * 0.02;
        System.out.println("Diskon      : "+diskon);
    }
    //total bayar akhir
    totalBayar = total-diskon;
    System.out.println("Total Bayar     : "+totalBayar);
    }
}



