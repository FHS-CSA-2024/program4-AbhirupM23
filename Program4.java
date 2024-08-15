import java.util.Scanner;

class Program4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int sum = 0;
        double avg = 0; 

        System.out.println("Please enter your first number: ");
        num1=myScanner.nextInt();

        System.out.println("Please enter your second number: ");
        num2=myScanner.nextInt();

        System.out.println("Please enter your third number: ");
        num3=myScanner.nextInt();

        System.out.println("Please enter your fourth number: ");
        num4=myScanner.nextInt();

        sum = num1+num2+num3+num4;
        System.out.println("The sum of those numbers is:" + sum);

        avg = sum/4.0;
        System.out.println("The average of those numbers is:" + avg); 
    }
}
