/*
01 03 05 07 09 
11 13 15 17 19 
21 23 25 27 29 
31 33 35 37 39 
41 43 45 47 49 
 */
import java.util.Scanner;
public class OddConsecutiveNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
			{
				
				if(count%2!=0) {
					if (count>=10) {
					System.out.print(count+" ");
				}else {
					System.out.print("0"+count+" ");
				}
			}
				count=count+2;
		}
			System.out.println();
		}
	}

}
