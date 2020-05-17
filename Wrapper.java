// No 10 tugas 9
//program Wrapper
/*
Nama		: Fadhilah Rifqi
Stambuk	: 13020180091
Kelas	: B2
*/ 
  
import java.util.ArrayList; 
class Wrapper 
{ 
    public static void main(String args[]){  
		
		int a=50;  
        Integer a2 = new Integer(a);//Boxing  
        Integer a3 = 5;//Boxing  
        String b = Long.toOctalString(a);
		//Fungsi tersebut untuk mengubah bilangan dengan basis 10 menjadi basis lainnya
		
        System.out.println(a2+" dan "+a3);  
		System.out.println("Bilangan octal dari "+a2+" adalah "+b); // mengkonversikan bilangan di variabel a yaitu 50 ke bentuk octal
		
	}
}

/*
output:
50 dan 5
Bilangan octal dari 50 adalah 62

penjelasan:
program ini menggunakan wrapper clacc-boxing 
yang mana boxes the primitive untuk Interger a3=5 misalnya.
dan juga wrapper class-toOctalString untuk mengembalikan 
representasi string argumen integer sebagai integer yang basis 8
*/