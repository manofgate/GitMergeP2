import java.util.Scanner;


public class HotTub {
	private int temp;
	private int numJets;
	private int size;
	
	public HotTub(int temp, int numJets, int size) {
		super();
		this.temp = temp;
		this.numJets = numJets;
		this.size = size;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("what's the temp of spa?");
		String temp = scan.next();
		System.out.println("what's the size of spa?");
		String tSize = scan.next();
		System.out.println("what's the number of Jets of spa?");
		String numJ = scan.next();
		HotTub ht = new HotTub(Integer.parseInt(temp), Integer.parseInt(tSize), Integer.parseInt(numJ));
		
	}

}
