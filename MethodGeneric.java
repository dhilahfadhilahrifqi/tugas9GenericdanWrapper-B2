// No 7 tugas 9
//program Generic method

/*
Nama		: Fadhilah Rifqi
Stambuk	: 13020180091
Kelas	: B2
*/

public class MethodGeneric{  
  
   public static < T > void print(T data) {  
            System.out.println(data);  
    }  
    public static void main( String args[] ) {  
        String nama = "Fadhilah Rifqi";
		Integer umur = 19;
		
        System.out.print( "Nama	: " );  
        print(nama);   
  
        System.out.print( "Umur	: " );  
        print(umur);   
    }   
}

/*
output:
Nama    : Fadhilah Rifqi
Umur    : 19

penjelasan:
methode print <T>. Baris ini menunjukkan bahwa method dapat bekerja 
dengan 1 parameter tipe yang berbeda di setiap objeknya yaitu nama dan umur.
dan untuk menampilkan nilai dengan menggunakan method print.
dengan memasukkan nilai pada variabel nama dan umur pada fungsi main.
Pada fungsi main kita memberikan nilai pada nama yang bertipe string dan
pada umut bertipe integer.
*/