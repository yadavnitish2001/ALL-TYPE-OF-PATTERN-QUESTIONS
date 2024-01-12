
import java.util.Scanner;

public class RightAngleHollowTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();

		//For loop
		/*
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		 */

		//While loop
		/*
		int i=1,j=1;
		while (i <= n) {
            while (j <= i) {
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        
        
	}
	*/
		
		/*
		 int i=1;int j = 1;
		do {
			do {
				System.out.print("*"+" ");
				j++;
			}
			while(j<=i);
			 System.out.println();
	            i++;
	            j = 1; 
		}
		while(i<=n);
	}
}
*/
/*
 HOLLOW RIGHT ANGLE TRIANGLE
		*
		**
		* *
		*  *
		*****
*/
for(int i=1;i<=n;i++) {
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
