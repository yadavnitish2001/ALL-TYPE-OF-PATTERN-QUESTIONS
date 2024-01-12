/*
 SOLID REVERSE PYRAMID
*****
****
***
**
*
 */
import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();

		//For loop
	/*
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 */

		//While loop
		/*
		int i=n,j=1;
		while (i>=1) {
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
            j = 1;  
	}
		*/
		
		//USing DO while loop
		/*
		int i=n;int j = 1;
		do {
			do {
				System.out.print("*");
				j++;
			}
			while(j<=i);
			 System.out.println();
	            i--;
	            j = 1; 
		}
		while(i>=1);
		*/
		
		/*  
 *****
 *  *
 * *
 **
 *
 
*/
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(i==1||i==n||j==1||j==i) {
					System.out.print("*");
				}
					else {
						System.out.print(" ");
					}
			}
			System.out.println();
		}
	}
}
