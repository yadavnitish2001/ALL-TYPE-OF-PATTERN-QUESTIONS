/*
01 02 03 04 05 
06 07 08 09 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 
*/

import java.util.Scanner;
public class ConsecutiveTwoIntegerNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
			{
				if(count<10) {
					System.out.print("0"+count+" ");
				}else {
					System.out.print(count+" ");
				}
				count++;
			}
			System.out.println();
		}
	}

}
