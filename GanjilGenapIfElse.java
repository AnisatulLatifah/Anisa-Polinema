import java.util.Scanner;
public class GanjilGenapIfElse{
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int angka;
    System.out.print("Masukkan sebuah bilangan      : ");
    angka = input.nextInt();
    if(angka %2==0){
        System.out.print("Angka yang anda masukkan adalah sebuah bilangan genap");
    }else{
        System.out.print("Angka yang anda masukkan adalah sebuah bilangan ganjil");
    }
    //CATATAN : CODINGAN DIBAWAH DAPAT MENJADI PENGGANTI UNTUK PROGRAM BAGIAN STRUKTUR PEMILIHAN
    String output = (angka %2==0) ? "Bilangan Genap" : "Bilangan Ganjil";
    System.out.println(output);
}
}