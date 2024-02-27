public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array of numbers
        int count = 0;

        System.out.println("Even numbers:");

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
                count++;
            }
        }

        System.out.println("Count of even numbers: " + count);
    }
}
