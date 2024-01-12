/*
 REVERSE PYRAMID
 *********
  *******
   *****
    ***
     *
     */
import java.util.Scanner;

public class ReverseHollowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println("Enter the charecter to be printed");
		char ch=sc.next().charAt(0);
		//to print rows
		/*
		for(int i=1;i<=n;i++) {
			//to print n spaces in every row
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//To print n stars in every row
			for(int j=1;j<=11-2*i;j++) {
				System.out.print(ch);
			}
			//To send  to net line 
			System.out.println();
		}
*/
		/*
HOLLW REVERSE PYRAMID

 *********
  *     *
   *   *
    * *
     *
		 */
		
		//to print rows
				for(int i=1;i<=n;i++) {
					//to print n spaces in every row
					for(int j=1;j<=i;j++) {
						System.out.print(" ");
					}
					//To print n stars in every row
					for(int j=1;j<=11-2*i;j++) {
						if(i==1||i==n||j==1||j==11-2*i) {
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
