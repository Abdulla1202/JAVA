public class LogicalOpretor {
    public static void main(String[] args) {
        int p= 15 , q=10, r=5;

        // && opretor
        System.out.println((p>q)&&(p>r));//true
        System.out.println((p<q)&&(p>r));//false

        // or opretor
        System.out.println((r<q)||(p<q));//true
        System.out.println((p<q)||(q<r));//false

        // ! opretor
        System.out.println(!(p==q));//true
        System.out.println(!(p>q));//false





    }
}
