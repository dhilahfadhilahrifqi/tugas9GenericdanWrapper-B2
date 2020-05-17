// No 9 tugas 9
//program Generic Interface dan Abstract

/*
Nama		: Fadhilah Rifqi
Stambuk	: 13020180091
Kelas	: B2
*/

abstract class Mahasiswa<T,U>{
	T nama; U umur;
	 
	public Mahasiswa(T nama, U umur){
	  this.nama=nama;
	  this.umur=umur;
	} 
	public void tampil(){
	  System.out.println("Nama	: "+nama);
	  System.out.println("Umur	: "+umur);
	}
}

interface LakiLaki<T>{
	 String jk="Laki-Laki";
	 public void jeniskelamin();
}

interface Perempuan<T>{
	 String jk="Perempuan";
	 public void jeniskelamin();
}

class Mahasiswa1<T,U,S> extends Mahasiswa<T,U> implements LakiLaki<T>{
	T nama; U umur; S tinggi;
	  public Mahasiswa1 (T nama, U umur, S tinggi){
	  super(nama, umur);
	  this.tinggi=tinggi;
	 }
	 public void jeniskelamin(){
	  System.out.println("Jenis Kelamin	: "+jk);
	 }
	 
	 public void Data(){
	  tampil();
	  jeniskelamin();
	  System.out.println("Tinggi	: "+tinggi);
	 }
}

class Mahasiswa2<T,U,S> extends Mahasiswa<T,U> implements Perempuan<T>{
	T nama; U umur; S tinggi;
	  public Mahasiswa2 (T nama, U umur, S tinggi){
	  super(nama, umur);
	  this.tinggi=tinggi;
	 }
	 
	 public void jeniskelamin(){
	  System.out.println("Jenis Kelamin	: "+jk);
	 }
	 
	 public void Data(){
	  tampil();
	  jeniskelamin();
	  System.out.println("Tinggi	: "+tinggi);
	 }
}

class GenericInterfaceAbstract{
	public static void main (String[] args){
	
	Mahasiswa1<String, Integer, Double> mhs1 = new Mahasiswa1<String, Integer, Double>("Bambang",21,189.1);
	System.out.println("Mahasiswa 1");
	mhs1.Data();
	System.out.println();
		
	Mahasiswa2<String, Integer, Double> mhs2 = new Mahasiswa2<String, Integer, Double>("Atry",19,150.4);
	System.out.println("Mahasiswa 2");
	mhs2.Data();
	System.out.println();
	  
	}
}

/*
output:
Mahasiswa 1
Nama    : Bambang
Umur    : 21
Jenis Kelamin   : Laki-Laki
Tinggi  : 189.1

Mahasiswa 2
Nama    : Atry
Umur    : 19
Jenis Kelamin   : Perempuan
Tinggi  : 150.4

penjelasan:
terdapat interface lakilaki<T> dan interface perempuan<T>.
abstract Class Mahasiswa <T, U>". Baris ini menunjukkan bahwa kelas abstract
dapat bekerja dengan dua tipe data yang berbeda di setiap objeknya yaitu nama dan umur.
terdapat class mahasiswa1<T,U,S> yang merupakan extends dari class abstract mahasiswa1
dan juga merupakan implements interface lakilaki. dimana memiliki 3 tipe yaitu
string, integer, dan double.
terdapat class mahasiswa2<T,U,S> yang merupakan extends dari class abstract mahasiswa1
dan juga merupakan implements interface perempuan. dimana memiliki 3 tipe yaitu
string, integer, dan double
*/