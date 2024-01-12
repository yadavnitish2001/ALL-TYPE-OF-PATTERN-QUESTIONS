import java.util.Scanner;
//class method
public class SingleLineStar {
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		//FOR LOOP
		
//		for(int i=1;i<=n;i++) {
//			System.out.print("*"+" ");
//		}
		
		//WHILE LOOP
//		
//		int i = 1;
//		while(i<=n) {
//			System.out.print("*"+" ");
//			i++;
//		}
		
		//Do while loop
		
		int i=1;
		do {
			System.out.print("*"+" ");
			i++;
		}
		while(i<=n);
	}

}
