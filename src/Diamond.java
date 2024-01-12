import java.util.Scanner;
/*
 *  *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
 */

public class Diamond {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println("Enter the charecter to be printed");
		char ch=sc.next().charAt(0);
		for(int i=1;i<=n;i++) {
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

		for(int i=2;i<=n;i++) {
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
	}

}
