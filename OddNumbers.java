public class OddNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array, you can modify as needed
        int count = 0;

        System.out.println("Odd Numbers:");

        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
                count++;
            }
        }

        System.out.println("Count of Odd Numbers: " + count);
    }
}
