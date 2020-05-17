// No 11 tugas 9
//program String Class

/*
Nama		: Fadhilah Rifqi
Stambuk	: 13020180091
Kelas	: B2
*/

class StringClass{
	public static void main(String[] args){
	
	String data="Fadhilah";
	
	System.out.println("1. Menggabungkan String");
	String data1 = data + " Rifqi";
	System.out.println(data1);
	
	System.out.println("2. Menggabungkan string dengan non string");
	int umur = 19;
	String str = data + " " +umur +" tahun."; //di casting
	System.out.println(str);
	
	System.out.println("3. Substring");
	String str1 = data.substring(2, 7);
	System.out.println(str1);
	
	System.out.println("4. Menggunakan uppercase");
	String str2 = data.toUpperCase();
	System.out.println(str2);
	
	System.out.println("5. Menggunakan LowerCase");
	String str3 = data.toLowerCase();
	System.out.println(str3);
	}
}

/*
output:
1. Menggabungkan String
Fadhilah Rifqi
2. Menggabungkan string dengan non string
Fadhilah 19 tahun.
3. Substring
dhila
4. Menggunakan uppercase
FADHILAH
5. Menggunakan LowerCase
fadhilah

penjelasan:
beberapa metoda dari kelas String yang sering digunakan untuk membuat 
dan memanipulasi obyek string. seperti di atas misalnya menggabungkan string
denga string, menggabungkan string dengan non-string, substring, menggunakan 
UpperCase dan LowerCase.
*/