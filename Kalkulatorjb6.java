import java.util.Scanner;
public class Kalkulatorjb6{
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    double bil1=0,bil2=0,hasil;
    char operator;

    System.out.print("Masukkan bilangan pertama     : ");
    bil1 = input.nextDouble();
    System.out.print("Masukkan operator (+ - * /)   : ");
    operator = input.next().charAt(0);
    System.out.print("Masukkan bilangan kedua       : ");
    bil2 = input.nextDouble();

    switch(operator){
        case '+':
        hasil = bil1+bil2;
        System.out.println(+bil1+ " + " +bil2+ " = " +hasil);
        break;
        case '-':
        hasil = bil1-bil2;
        System.out.println(+bil1+ " - " +bil2+ " = " +hasil);
        break;
        case '*':
        hasil = bil1*bil2;
        System.out.println(+bil1+ " * " +bil2+ " = " +hasil);
        break;
        case '/':
        hasil = bil1/bil2;
        System.out.println(+bil1+ " / " +bil2+ " = " +hasil);
        break;
        default :
        System.out.println("Input yang Anda masukkan salah!");
        

    }
    }
}