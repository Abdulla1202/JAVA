import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter priniple ");
        float p = sc.nextFloat();
        System.out.println("Rtae of intrest");
        float r = sc.nextFloat();
        System.out.println("enter time");
        float t = sc.nextFloat();
        float si = (p*r*t)/100;
        System.out.println("priniple :"+ p);
        System.out.println("rate :"+ r);
        System.out.println("time:"+t);
        System.out.println("Simple Intrest :"+si);

    }
}
