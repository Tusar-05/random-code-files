import java.util.Scanner;

public class armstrongcheck{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check: ");
        int number = scanner.nextInt();
        scanner.close();

        
        int originalNumber = number;
        int sum = 0;
        
        
        int digits = String.valueOf(number).length();
        
        
        int temp = number;
        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        
    
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }
    }
}