/*
25 24 23 22 21 
20 19 18 17 16 
15 14 13 12 11 
10 09 08 07 06 
05 04 03 02 01 

 */
import java.util.Scanner;
public class ConsecutiveTwoDigitNumbeeReversePattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the count number");
		int count=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
			{
				if(count>=10) {
					System.out.print(count+" ");
				}else {
					System.out.print("0"+count+" ");
				}
				count--;
			}
			System.out.println();
		}
	}

}
