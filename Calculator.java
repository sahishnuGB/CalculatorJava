public class Calculator {
    int arr[];
    public Calculator ()
    {
        UserInput in = new UserInput();
        this.arr = in.input();
    }
    //Calculator Operations
    int addition()
    {
        int sum = arr[0] + arr[1];
        return(sum);
    }
    int subtraction()
    {
        int diff = arr[0] - arr[1];
        return(diff);
    }
    int multiplication()
    {
        int prod = arr[0] * arr[1];
        return(prod);
    }
    double division()
    {
        double quotient = 0.0d;
        if(arr[1]==0)
        {
            System.out.println("Cannot divide by zero, returning 0 as a result.");
            quotient = 0;
        }
        else
        {
            quotient = (double)(arr[0]/arr[1]);
        }
        return (quotient);
    }

    //Fibonacci series
    void fibonacci(int n)
    {
        int first_term =0, second_term = 1, sum;
        for (int i = 0; i < n; i++)
        {
            System.out.print(first_term+" ");
            sum = first_term+second_term;
            first_term = second_term;
            second_term = sum;

        }
        System.out.println();
        
    }

    // Mean of array
    void mean(int[] array)
    {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Mean is: " + (sum / array.length));
    }

    // Variance of array
    void variance(int[] array)
    {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double mean = sum / array.length;
        double sumSquaredDiffs = 0;
        for (int num : array) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }
        System.out.println("Variance is: " + (sumSquaredDiffs / array.length));
    }     
}
