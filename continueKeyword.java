public class continueKeyword {
    public static void main(String[] args) {
        for(int num = 1; num <= 20;num++){
            if(num % 3 == 0){
                continue;
            }
            System.out.println(num);
        }
    }
}
