import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("what type of pool do you want? ");
		String poolItem = scan.next();
		
		System.out.println("what's the temp of spa?");
		String temp = scan.next();
		System.out.println("what's the size of spa?");
		String tSize = scan.next();
		System.out.println("what's the number of Jets of spa?");
		String numJ = scan.next();
		HotTub ht = new HotTub(Integer.parseInt(temp), Integer.parseInt(tSize), Integer.parseInt(numJ));
		
	}
}
