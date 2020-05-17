// No 6 tugas 9
//program MultiTypeParameterGenetic

/*
Nama		: Fadhilah Rifqi
Stambuk	: 13020180091
Kelas	: B2
*/

class Test<T, U> 
{ 
    T nama;  // An object of type T 
    U umur;  // An object of type U 
   
    Test(T nama, U umur) 
    { 
        this.nama = nama; 
        this.umur = umur; 
    } 
  
    public void print() 
    { 
        System.out.println("Nama	: " +nama); 
        System.out.println("Umur	: " +umur); 
    } 
} 
  
// Driver class to test above 
class MultiTypeParameterGenetic 
{ 
    public static void main (String[] args) 
    { 
        Test <String, Integer> tampil =  new Test<String, Integer>("Fadhilah Rifqi", 19); 
  
        tampil.print(); 
    } 
}

/*
output:
Nama    : Fadhilah Rifqi
Umur    : 19

penjelasan:
Class Test <TYPE1, TYPE2>". Baris ini menunjukkan bahwa kelas dapat bekerja 
dengan dua tipe data yang berbeda di setiap objeknya yaitu nama dan umur.
dengan memasukkan nilai pada variabel nama dan umur dengan konstructor test.
dan untuk menampilkan nilai dengan menggunakan void print.
Pada fungsi main kita membuat intace tampil dengan 2 tipe data berbeda yaitu
tipe string untuk nama dan integer untuk umur.
setiap objek akan mencetak data yang sesuai dengan objek yang disimpan di dalamnya.

*/