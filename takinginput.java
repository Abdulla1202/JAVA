import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name =sc.next(); //by using satring
        System.out.println("Name is :" + name);
        System.out.println("enter your lucky number");
        int num_1 = sc.nextInt();//for taking intiger input
        System.out.println("Lucky number is:"+ num_1);
    }
}
