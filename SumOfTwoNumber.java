import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 1st number ");
        int num_1 = sc.nextInt();

        System.out.println(" Enter 2st number ");
        int num_2 = sc.nextInt();
        int sum =num_1 + num_2;
        System.out.println("sum :"+ sum);
    }
}
