import java.util.Scanner;

public class PatternNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n-i;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
		for(int j=1;j>=i-1;j++) {
			System.out.print(j);
		}
		System.out.println();
		}
	}
}
