public class call_by_reference {
    public static void main(String[] args) {
        int num1 = 55;
        int num2 = 85;
        System.out.println("The values before swapping are: number1 = " + num1 + " and number2 = " + num2);
        // Calling the function to swap
        swapByReference(num1, num2);
        System.out.println("\nThe numbers before and after swapping will be same in main:");
        System.out.println("Once the swapping is done, the values will be back to original: num1 = " + num1
                + " and num2 is " + num2);
    }

    public static void swapByReference(int num1, int num2) {
        System.out.println("Before swapping in function locally, num1 = " + num1 + " num2 = " + num2);
        // Swapping number1 and number2
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping in function locally, num1 = " + num1 + " num2 = " + num2);
    }
}