import java.util.Scanner;

public class SingleColumnLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the charecter");
		String s=sc.next();
		
		//FOR LOOP
		
//		for(int i=1;i<=n;i++) {
//			System.out.println("*"+" ");
//		}
		
		//WHILE LOOP
//		
//		int i = 1;
//		while(i<=n) {
//			System.out.println("*"+" ");
//			i++;
//		}
		
		//Do while loop
		
		int i=1;
		do {
			System.out.println(s+" ");
			i++;
		}
		while(i<=n);

	}

}
