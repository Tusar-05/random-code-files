public class FibonacciSeries {
    public static void main(String[] args) {
        // Number of terms to print
        int n = 10; 
        
        // Initializing the first two terms
        int firstTerm = 0;
        int secondTerm = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        for (int i = 1; i <= n; ++i) {
            // Print the current term
            System.out.print(firstTerm + " ");
            
            // Compute the next term by adding the previous two
            int nextTerm = firstTerm + secondTerm;
            
            // Update variables for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
