import java.util.Scanner;
/*
      ******
      *    *
      *    *
      *    *
      *    *
      ******

 */

public class HollwRectangleBox {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		//to print rows
		for(int i=1;i<=n;i++) {
			//to print n spaces in every row
			for(int j=1;j<=n;j++) {
				System.out.print(" ");
			}
			//To print n stars in every row
			for(int j=1;j<=n;j++) {
				if(j==1||j==n||i==1||i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			//To send  to net line 
			System.out.println();
		}
	}

}
