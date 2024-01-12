import java.util.Scanner;
/*
 **********
  *******
   *****
    ***
     *

 */
public class ReversePyramid {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("Enter the character to be printed: ");
        char ch = sc.next().charAt(0);

        // To print rows
        for (int i = 1; i <= n; i++) {
            // To print 'i' spaces in every row
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // To print (11 - 2 * i) characters in every row
            for (int j = 1; j <= 11 - 2 * i; j++) {
                System.out.print(ch);
            }
            // To move to the next line after each row
            System.out.println();
        }
    }

}
