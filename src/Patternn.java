import java.util.Scanner;

public class Patternn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=sc.nextInt();
		System.out.println("Enter the number of columns");
		int m=sc.nextInt();
		
		//to print rows
		for(int i=1;i<=n;i++) {
			//to print n spaces in every row
			for(int j=1;j<=m;j++) {
				System.out.print(" ");
			}
			//To print n stars in every row
			for(int j=1;j<=n;j++) {
				System.out.print("*"+" ");
			}
			//To send  to net line 
			System.out.println();
		}
	}

}
