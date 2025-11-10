import java.util.Scanner;

// print 1 to n

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int num = 1;
        while ( num <= n){
            //System.out.println(num);
            sum = sum + num;
            // num = num + 1;
            num++; // increment opretor ++, num = num + 1
        }
        System.out.println(sum);

    }
}
