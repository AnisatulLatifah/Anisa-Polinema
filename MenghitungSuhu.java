import java.util.Scanner;
public class MenghitungSuhu{
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    float celcius;
    System.out.print("Masukkan suhu     : ");
    celcius = input.nextFloat();
    //rumus
    double reamur = (0.8*celcius),fahrenheit = (1.8*celcius)+32;
    float kelvin = celcius+273;

    System.out.println("Suhu yang anda masukkan adalah "+celcius+ " celcius ");
    System.out.println("Suhu yang anda masukkan adalah "+reamur+ " reamur ");
    System.out.println("Suhu yang anda masukkan adalah "+fahrenheit+ " fahrenheit ");
    System.out.println("Suhu yang anda masukkan adalah "+kelvin+ " kelvin ");



    }
}