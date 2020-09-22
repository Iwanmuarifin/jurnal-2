import java.util.Scanner;

public class permennyaDira{
	public static void main(String[] args){
		int permen;
		int temandira;
		int hasil;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("permen dira :" );
		permen = keyboard.nextInt();
		System.out.print("teman dira:" );
		temandira = keyboard.nextInt();
		
		//pembagian
		hasil = permen / temandira;
		System.out.println("Hasil bagi = "+ hasil);
		// sisa bagi
		hasil = permen % temandira;
		System.out.println("Hasil sisa bagi = "+ hasil);
	}
}