/*
 * 
  * * 
   * * * 
    * * * * 
     * * * * * 
 */
import java.util.Scanner;
public class HollowSpaceTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		//to print rows
		/*
		for(int i=1;i<=n;i++) {
			//to print n spaces in every row
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//To print n stars in every row
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			//To send  to net line 
			System.out.println();
		}
		*/
		for(int i=1;i<=n;i++) {
			//to print n spaces in every row
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//To print n stars in every row
			for(int j=1;j<=i;j++) {
				if(i==1||i==n||j==1||j==i) {
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
