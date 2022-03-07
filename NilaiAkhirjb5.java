import java.util.Scanner;
public class NilaiAkhirjb5{
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    double nilaiAkhir,uas,uts,kuis,tugas,nilai1,nilai2,nilai3,nilai4;

    System.out.print("Masukkan nilai UAS Anda   : ");
    uas = input.nextDouble();
    System.out.print("Masukkan nilai UTS Anda   : ");
    uts = input.nextDouble();
    System.out.print("Masukkan nilai KUIS Anda  : ");
    kuis = input.nextDouble();
    System.out.print("Masukkan nilai TUGAS Anda : ");
    tugas = input.nextDouble();

    //rumus mencari bobot nilai
    nilai1 = 0.4 * uas;
    nilai2 = 0.3 * uts;
    nilai3 = 0.1 * kuis;
    nilai4 = 0.2 * tugas;
    //rumus mencari nilai akhir
    nilaiAkhir = nilai1+nilai2+nilai3+nilai4;
    System.out.println("Nilai akhir Anda adalah   : " +nilaiAkhir);

    if(nilaiAkhir <= 60){
        System.out.println("Anda harus melakukan remidi !");
    }else{
        System.out.println("Anda tidak perlu remidi !");
    }
    }
}