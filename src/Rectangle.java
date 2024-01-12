import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r=sc.nextInt();
		System.out.println("Enter the number of columns");
		int c=sc.nextInt();

		//For loop

		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
