import java.util.Scanner;
class Frequency {
	public static void main(String args[]) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		System.out.print("Enter a character: ");
		char ch = sc.nextLine().charAt(0);
		for(int i = 0; i < str.length(); i++ ) {
			if(str.toLowerCase().charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("The frequency is " + count);
	}
}