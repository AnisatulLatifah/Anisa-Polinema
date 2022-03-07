import java.util.Scanner;
public class acak{
public static void main(String[] args){
String[] kata = new String[8];
int i;
Scanner sc = new Scanner(System.in);

for(int i=1; i<kata.length; i++){
    System.out.print("Huruf ke-" + i + ": ");
    kata[i] = sc.nextLine();
}
System.out.println("--------------------------------------------");

for(i=kata.length-1; i>=0; i--){
    System.out.printf(kata[i]);
}
}
}