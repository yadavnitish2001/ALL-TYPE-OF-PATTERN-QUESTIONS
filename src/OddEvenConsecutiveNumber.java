/*
02 04 06 08 10 
12 14 16 18 20 
01 03 05 07 09 
11 13 15 17 19 
21 23 25 27 29 
 */
import java.util.Scanner;
public class OddEvenConsecutiveNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
			int count1=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
			{
				if(i<=2) {
				count=count+2;
				if(count%2==0) {
					if (count>=10) {
					System.out.print(count+" ");
				}else {
					System.out.print("0"+count+" ");
				}
			}
		}
				
				if(i>=3) {
					
					if(count1%2!=0) {
						if (count1>=10) {
						System.out.print(count1+" ");
						}
						else {
						System.out.print("0"+count1+" ");
					}
					
				}
				
					count1=count1+2;	
			}
		}
			System.out.println();
		}
	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   