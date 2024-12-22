import java.util.Scanner;
public class SumLargest{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1=scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2=scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3=scanner.nextInt();
        int largest = Math.max(num1 , Math.max(num2 ,num3));

        double average = (num1 + num2 + num3)/3.0;

        System.out.println("The sum of the largest number is:" + largest);
        System.out.println("the average of the three numbers is:"+ average);
            }
}