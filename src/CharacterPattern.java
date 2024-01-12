/*
A B C D E 
F G H I J 1111111111111```````````````````````
K L M N O 
P Q R S T 
U V W X Y 

 */
import java.util.Scanner;
public class CharacterPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		//int alpha=97;
		int alpha=65;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(alpha++)+" ");
			}
			System.out.println();
		}
	}
}
