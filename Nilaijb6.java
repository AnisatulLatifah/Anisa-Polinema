import java.util.Scanner;
public class Nilaijb6{
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int nilai;
    System.out.print("Masukkan nilai ujian (0-100) :  ");
    nilai = input.nextInt();

    if(nilai >= 0 && nilai <=100){
        if(nilai >=90 && nilai <=100){
            System.out.println("Nilai A");
        } else if (nilai >=80 && nilai <=89){
            System.out.println("Nilai B");
        } else if (nilai >=60 && nilai <=79){
            System.out.println("Nilai C");
        } else if (nilai >=50 && nilai <=59){
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }
    }else if(nilai >100){
        System.out.println("NIlai yg anda masukkan lebih dari 100");
    }else{
    System.out.println("Nilai yg anda masukkan kurang dari 0");
}
    }
}
