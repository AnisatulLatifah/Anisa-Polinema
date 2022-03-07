import java.util.Scanner;
public class Uas{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in); 
      Scanner inputKode = new Scanner(System.in);
      Scanner inputNama = new Scanner(System.in);
      String nim,kelas,kode;
      int i = 0,j,menu;
      String[] nama;
      char ulang = 't';
      System.out.println("====Penilaian Akademik Semester 1====");
      System.out.println("=========Kelas XII Semester I========");
      System.out.println("==========SMA Negeri 1 Barat=========");
      
      do{
          System.out.println("Menu");
          System.out.println("1. Data Siswa");
          System.out.println("2. Daftar Mata Pelajaran");
          System.out.println("3. Input dan kelola nilai");
          System.out.println("4. Cetak rapor nilai");
          System.out.println("5. Nilai permata pelajaran");
          System.out.println("6. Rangking Siswa");
          System.out.print("Masukkan Menu (1,2,3,4,5,6) : ");
          menu = sc.nextInt();
          switch(menu){
              case 1: System.out.println("==Data Siswa==");
              System.out.print("Masukkan jumlah Siswa : ");
              i = sc.nextInt();
              nama = new String[i];
              for(i = 0; i < nama.length; i++){
                System.out.print("Masukkan nama Siswa : ");
                nama[i] = inputNama.nextLine();

                System.out.println(" ");
              }
              break;
              case 2: System.out.println("==Daftar Mata Pelajaran==");
              System.out.println("Pilih Matakuliah");
              System.out.println("1. Matematika");
              System.out.println("2. Kimia");
              System.out.println("3. Fisika");
              System.out.println("4. Biologi");
          
              break;
              case 3: System.out.println("==Input dan kelola nilai==");
              System.out.print("Masukkan Kode Matakuliah (1,2,3,4)  : ");
              kode = inputKode.nextLine();
          
              if(kode.equalsIgnoreCase ("1")){
                  int [][] nilai1 = new int [i][4];
                   
                  double rata = 0;
                  for(i = 0; i < nilai1.length; i++){
                    int total = 0;
                    for(j = 0; j < nilai1[0].length; j++){
                      System.out.printf("Masukkan nilai Siswa  : "+ nilai1[i][j]);
                      nilai1[i][j] = sc.nextInt();
                      total += nilai1[i][j];
                    }
                    
                    rata = (double) total / nilai1[0].length;

                    System.out.printf("coba %d adalah %.2f \n",i,rata);
              }
              }
            
              
               if(kode.equalsIgnoreCase ("2")){
                  int [][] nilai = new int [i][1];
                  for(i = 0; i < nilai.length; i++){
                    for(j = 0; j < nilai[0].length; j++){
                      System.out.printf("Masukkan nilai Mahasiswa : "+ nilai[i][j]);
                      nilai[i][j] = sc.nextInt();
                    }
                    System.out.println(" ");
              }
              }
                  
               if(kode.equalsIgnoreCase ("3")){
                  int [][] nilai = new int [i][1];
                  for(i = 0; i < nilai.length; i++){
                    for(j = 0; j < nilai[0].length; j++){
                      System.out.printf("Masukkan nilai Mahasiswa : "+ nilai[i][j]);
                      nilai[i][j] = sc.nextInt();
                    }
                    System.out.println(" ");
              }
              }
                  
               if(kode.equalsIgnoreCase ("4")){
                  int [][] nilai = new int [i][1];
                  for(i = 0; i < nilai.length; i++){
                    for(j = 0; j < nilai[0].length; j++){
                      System.out.printf("Masukkan nilai Mahasiswa : "+ nilai[i][j]);
                      nilai[i][j] = sc.nextInt();
                    }
                    System.out.println(" ");
              }
              }
              break;
              case 4: System.out.println("==Cetak rapor nilai==");
              break;
              case 5: System.out.println("==Nilai permata pelajaran==");
              break;
              case 6: System.out.println("==Rangking Siswa==");
              break;
              default: System.out.println("Pilihan salah! Masukkan angka hanya 1-6!");
            }
            System.out.println("Apakah Anda ingin Kembali ke Menu ? y/t");
            ulang = sc.next().charAt(0);
            System.out.println();
          }
      while(ulang=='y'|| ulang=='Y');
    }

    }