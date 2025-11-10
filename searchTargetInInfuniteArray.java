public class searchTargetInInfuniteArray {
    public static void main(String[] args) {
        int a [] = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(a,target));

    }
    static int ans(int  [] a , int target){
        //  1st find the rang
        // 1st start with box size of 0
        int st = 0;
        int end = 1;
        while (target > a[end]){
            int newst = end + 1;
            // double the size of box
            //end = privious end  + sizeofbox*2
            // size of box = (end - st + 1 )
            end = end + (end - st + 1) * 2;
            st = newst;
        }
        return binarySerch(a , target,st , end);
    }
    static int binarySerch(int a [] , int target , int st, int end) {
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target < a[mid]) {
                end = mid - 1;
            } else if (target > a[mid]) {
                st = mid + 1;
            } else {
                return mid;

            }
        }
        return -1;
    }
}
