import java.util.Scanner;
/*   aaaaa
    aaaa
   aaa
  aa
 a
*/

public class RightAngleCharacterPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println("Enter the charecter to be printed");
		char ch=sc.next().charAt(0);
		//to print rows
	
		for(int i=1;i<=n;i++) {
			//to print n spaces in every row
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(" ");
			}
			//To print n stars in every row
			for(int j=1;j<=(n+1)-i;j++) {
				System.out.print(ch);
			}
			//To send  to net line 
			System.out.println();
		}
	}

}
