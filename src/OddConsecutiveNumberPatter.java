/*
02 04 06 08 10 
12 14 16 18 20 
22 24 26 28 30 
32 34 36 38 40 
42 44 46 48 50 
 */
import java.util.Scanner;
public class OddConsecutiveNumberPatter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
			{
				count=count+2;
				if(count%2==0) {
					if (count>=10) {
					System.out.print(count+" ");
				}else {
					System.out.print("0"+count+" ");
				}
			}
		}
			System.out.println();
		}
	}

}
