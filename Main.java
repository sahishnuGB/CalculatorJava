public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        UserInput input = new UserInput();
        int choice;
        do 
        {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Fibonacci Sequence");
            System.out.println("6. Mean of Array");
            System.out.println("7. Variance of Array");
            System.out.println("8. Exit");
            choice = input.inputSingle(); // Get user's choice
            switch (choice) {
                case 1:
                    System.out.println("Sum is: " + cal.addition());
                    break;
                case 2:
                    System.out.println("Difference is: " + cal.subtraction());
                    break;
                case 3:
                    System.out.println("Product is: " + cal.multiplication());
                    break;
                case 4:
                    System.out.println("Quotient is: " + cal.division());
                    break;
                case 5:
                    cal.fibonacci(input.inputSingle());
                    break;
                case 6:
                    cal.mean(input.inputArray());
                    break;
                case 7:
                    cal.variance(input.inputArray());
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
            }
        } while (choice != 8);
    }
}
