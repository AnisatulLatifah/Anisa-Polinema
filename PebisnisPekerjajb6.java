import java.util.Scanner;
public class PebisnisPekerjajb6{
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    String kategori;
    int penghasilan,gajiBersih=0;
    double pajak=0;
    
    System.out.print("Masukkan kategori Anda                        : ");
    kategori = input.nextLine();
    System.out.print("Masukkan jumlah penghasilan anda              : ");
    penghasilan = input.nextInt();

    if(kategori.equalsIgnoreCase("pekerja")){
        if(penghasilan <= 2000000){
        pajak = 0.1;
        }else if(penghasilan <= 3000000){
        pajak = 0.15;
        }else{
        pajak = 0.2;
        }
        //gaji bersih pekerja
        gajiBersih = (int)(penghasilan - (penghasilan * pajak));
        System.out.println("Gaji bersih yang Anda terima adalah     :"+gajiBersih);
 
     }else if(kategori.equalsIgnoreCase("pebisnis")){
        if(penghasilan <= 2500000){
        pajak = 0.15;
        }else if(penghasilan <= 3500000){
        pajak = 0.2;
        }else{
        pajak = 0.25; 
        }
        //gaji bersih pebisnis
        gajiBersih = (int)(penghasilan - (penghasilan * pajak));
        System.out.println("Gaji bersih yang Anda terima adalah     :"+gajiBersih);

    }else{
        System.out.println("Kategori yang anda masukkan salah !");
    }
}
    }