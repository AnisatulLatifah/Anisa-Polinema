import java.util.Scanner;
public class WarungPedasGembirajb6{
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    String nama;
    int harga,biaya,total=0;

    System.out.print("Masukkan nama makanan                                         : ");
    nama = input.nextLine();
    System.out.print("Masukkan harga makanan                                        : Rp. ");
    harga = input.nextInt();
    System.out.print("Apakah Anda ingin pengiriman ekspress (1= iya, 0= tidak) ?    : ");
    biaya = input.nextInt();

    System.out.println("STRUK PEMBELIAN");
    System.out.println(nama+ "                                                      : "+harga);

    if(biaya == 1){
        biaya = 25000;
    }else if(biaya==0 && harga < 100000){
            biaya = 20000;
    }else if(biaya==0 && harga >=100000){
            biaya = 30000; 
    }else{
        System.out.println(" ");
    }
        total=harga+biaya;
        System.out.println("TOTAL                                                   : Rp. " +total);

     }
    }

    }