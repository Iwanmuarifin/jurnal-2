import java.util.Scanner;

public class TabunganDira2{

	public static void main (String[] args){
	
		int rupiah;
		int hari;
		int hasil = 10000*30;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Rupiah: ");
		rupiah = keyboard.nextInt();
		System.out.print("Hari:");
		hari = keyboard.nextInt();
		
		// perkalian
		hasil = 10000*30;
		System.out.println("Hasil =" + hasil);
	}
}