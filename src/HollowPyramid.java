/* 
 THIS IS SOLID PYRAMID
     *
    ***
   *****
  *******
 *********

*/

import java.util.Scanner;

public class HollowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println("Enter the charecter to be printed");
		char ch=sc.next().charAt(0);
		//to print rows
		/*for(int i=1;i<=n;i++) {
			//to print n spaces in every row
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(" ");
			}
			//To print n stars in every row
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(ch);
			}
			//To send  to net line 
			System.out.println();
		}
		*/
		
		/*
THIS IS HOLLOW PYRAMID
	 *   
    * *
   *   *
  *     *
 *********

		 */
		for(int i=1;i<=n;i++) {
		//to print n spaces in every row
		for(int j=1;j<=n-i+1;j++) {
			System.out.print(" ");
		}
		//To print n stars in every row
		for(int j=1;j<=2*i-1;j++) {
			if(i==1||i==n||j==1||j==2*i-1) {
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
