import java.util.Scanner;
public class BelajarVariabel{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String nim,kelas,nama;
    
    System.out.println("======Penilaian Akademik Semester I=====");
    System.out.println("=====Tingkat I Manajemen Informatika====");
    System.out.println("=======Politeknik Negeri Malang=========");
    
    System.out.print("Masukkan nama    : ");
    nama = sc.nextLine();
    System.out.print("Masukkan NIM     : ");
    nim = sc.nextLine();
    System.out.print("Masukkan Kelas   : ");
    kelas = sc.nextLine();
  
    int i,j;
    int [][] arrayAngka = {{1,2},
                           {2,3}
                    };
    for(i=0; i<arrayAngka.length; i++){
        for(j=0; j<arrayAngka[j].length; j++){
            System.out.format(" %s \t", arrayAngka[i][j]);
    
        System.out.println("  ");
        }
    }
   }
}
