import java.util.Scanner;

public class soal2 {
    /** 
* Program berikut untuk mencoba seleksi if-else if
*/ 
    public static void main(String[] args) {
    int nilai;
    Scanner in = new Scanner(System.in); 
    System.out.println(" Menghitung nilai mahasiswa\n");
    System.out.print("Masukkan nilai : ");
    nilai = in.nextInt();
     
    if(nilai>=87){ 
    System.out.println("A grade"); 
    } 
    else if(nilai>=78 && nilai<87){ 
    System.out.println("AB grade"); 
    } 
    else if(nilai>=69 && nilai<78){ 
    System.out.println("B grade"); 
    } 
    else if(nilai>=60 && nilai<69){ 
    System.out.println("BC grade"); 
    } 
    else if(nilai>=51 && nilai<60){ 
    System.out.println("C grade");
    }else if(nilai>=41 && nilai<51){ 
    System.out.println("D grade"); 
    }else if(nilai<41){
    System.out.println("E grade"); 
    }else{ 
    System.out.println("Invalid!"); 
        } 
    } 
} 
