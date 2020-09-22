import java.util.Scanner;
public class ProgramDira{
	public static void main(String[] args) {
	
		//membuat variable dan Scanner
		String name;
		int age;
		Scanner scan = new Scanner(System.in);
		
		//mengambil input
		System.out.print("Name: ");
		name = scan.nextLine();
		System.out.print("Umur: ");
		age = scan.nextInt();
		
		System.out.println("Halo"+name);
		System.out.println("Ternyata usiamu baru" + age +"tahun ya!!");
		
	}
}