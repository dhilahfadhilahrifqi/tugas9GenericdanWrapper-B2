// No 8 tugas 9
//program wildcard unbound 

/*
Nama		: Fadhilah Rifqi
Stambuk	: 13020180091
Kelas	: B2
*/

import java.util.Arrays; 
import java.util.List; 
  
class Unbounded
{ 
    public static void main(String[] args)  
    { 
  
        //Integer List 
        List<Integer> list1= Arrays.asList(1,2,3); 
  
        //Double list 
        List<Double> list2=Arrays.asList(1.1,2.2,3.3);

		//String list 
        List<String> list3=Arrays.asList("satu", "dua", "tiga", "empat", "lima");
	
		//Char list 
        List<Character> list4=Arrays.asList('a', 'i', 'u', 'e', 'o');
		
        printlist(list1); 
		printlist(list2);
        printlist(list3); 
		printlist(list4);
    } 
  
    private static void printlist(List<?> list)  
    { 
        System.out.println(list); 
    } 
}

/*
output:
[1, 2, 3]
[1.1, 2.2, 3.3]
[satu, dua, tiga, empat, lima]
[a, i, u, e, o]

penjelasan:
pada pemangginal menggunakan generic unbound
dia tdk membatasi list mana yang di panggil.

Tujuan printList adalah untuk mencetak daftar jenis apa pun, 
tetapi gagal untuk mencapai tujuan itu - ia hanya mencetak 
daftar instance Object;
*/ 