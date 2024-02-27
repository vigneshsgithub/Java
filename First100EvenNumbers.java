public class First100EvenNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 2; // Starting with the first even number

        System.out.println("First 100 even numbers:");

        while (count < 100) {
            System.out.println(number);
            count++;
            number += 2; // Incrementing by 2 to get the next even number
        }
    }
}
