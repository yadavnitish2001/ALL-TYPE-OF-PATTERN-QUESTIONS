import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r=sc.nextInt();
		System.out.println("Enter the number of columns");
		int c=sc.nextInt();

		//For loop
		/*
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		 */

		//While loop
		/*
		int i=1,j=1;
		while (i <= r) {
            while (j <= c) {
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        }
		 */

		//Using Do while loop
		int i=1,j=1;
		do {
			do{
				System.out.print("*"+" ");
				j++;
			}
			while (j <= c);
			System.out.println();
			i++;
			j = 1;
		}
		while (i <= r);	
	}
}

