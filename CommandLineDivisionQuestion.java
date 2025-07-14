public class CommandLineDivisionQuestion {
    public static void main(String[] args) {
        try {
            // Check if exactly 2 command line arguments are provided
            if (args.length != 2) {
                throw new IllegalArgumentException("Exactly two arguments required.");
            }

            try {
                // Parse the arguments to integers
                int dividend = Integer.parseInt(args[0]);
                int divisor = Integer.parseInt(args[1]);

                // Perform division
                double result = dividend / (double) divisor;
                System.out.println("Division result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Arithmetic error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } finally {
            System.out.println("Division operation completed.");
        }
    }
}
