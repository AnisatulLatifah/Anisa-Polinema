import java.util.Scanner;
public class Berkendarajb5{
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int umur;
    
    System.out.print("Masukkan umur Anda    : ");
    umur = input.nextInt();
    if(umur >= 17){
        System.out.print("Anda boleh berkendara !");
    }else{
        System.out.print("Anda tidak boleh berkendara !");
    }
}
}