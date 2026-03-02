
/*Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 74;
        int b = 36;


        System.out.println(a + b);



    /*Write a Java program to divide two numbers and print them on the screen.
      Test Data :
      50/3
      Expected Output :
       16*/


        int c = 50;
        int d = 3;
        System.out.println(c / d);



        /*Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/

        int x = 25;
        int y= 5;


        System.out.println(x*y);



        /*Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

        Scanner obj = new Scanner(System.in);   /// use Scanner for user input
        System.out.println("Enter the number : ");

        int N = obj.nextInt();    /// nrxtln = string
                                  /// nextint = int
                                  ///  nextfloat = float

        System.out.println(N);


        for(int i=1; i<=10; i++)
        {

             int multi = N*i;

            System.out.printf( "%d x %d = %d \n" , N,i,multi);  /// Use "printf" to show int number in output
        }














    }
    }
