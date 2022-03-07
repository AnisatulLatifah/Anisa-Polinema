import java.util.Scanner;
public class SisiSegitiga{
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int sisi1,sisi2,sisi3;

    System.out.print("Masukkan sisi pertama     : ");
    sisi1 = input.nextInt();
    System.out.print("Masukkan sisi kedua       : ");
    sisi2 = input.nextInt();
    System.out.print("Masukkan sisi ketiga      : ");
    sisi3 = input.nextInt();


    if((sisi1 == sisi2) && (sisi3 == sisi1)){
        System.out.println("Segitiga sama sisi");
    }else if((sisi1 == sisi2) || (sisi1 == sisi3) || (sisi2 == sisi3)){
        System.out.println("Segitiga sama kaki");
    }else{
        System.out.println("Segitiga sembarang");
    }
    }
}