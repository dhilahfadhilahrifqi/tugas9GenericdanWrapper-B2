// No 5 tugas 9
//Program Generic

/*
Nama		: Fadhilah Rifqi
Stambuk	: 13020180091
Kelas	: B2
*/

class Test<T> 
{  
    T obj; 
   
	void setObject(T obj) {  
		this.obj = obj;  
	} 
	
    public T getObject()  { 
		return this.obj; 
	} 
} 
    
class Generic 
{ 
    public static void main (String[] args) 
    { 
        // Untuk data string 
        Test <String> nama = new Test<String>(); 
		
		nama.setObject("Fadhilah Rifqi");
        System.out.println("Nama	: " +nama.getObject()); 
   
        // Untuk data integer 
        Test <Integer> umur = new Test<Integer>(); 
		
		umur.setObject(19);
        System.out.println("Umur	: " +umur.getObject());
    } 
}

/*
output:
Nama    : Fadhilah Rifqi
Umur    : 19

penjelasan:
Disana kita membuat beberapa Instance/Objek dengan tipe data yang berbeda-beda 
instance nama dengan tipe data string, dan instance umur dengan tipe data integer.
Dengan 1 buah variable didalamnya yaitu obj, pada variable obj kita dapat 
melakukan apa saja

Untuk memasukan nilai pada variable tersebut, menggunakan method void setObject 
dan untuk mencetak atau mengembalikan nilainya, menggunakan method return getObject.  
*/