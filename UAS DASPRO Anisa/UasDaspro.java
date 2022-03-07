public class UasDaspro{
    public static void main (String[] args){
        int x,y;
        x = 5;
        y = hitung(x);
        
        System.out.println("x = " + x + " , y = " + y);
        
        x = 6;
        y = hitung(x);
        
        System.out.println("x = " + x + " , y = " + y); 
    
    }
    static int hitung(int x){
    int hasil;
    hasil = x / x;
    
    return hasil;
    }
  }