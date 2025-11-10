public class countRotetion {
    public static void main(String[] args) {
        int a [] = {4,5,6,7,8,0,1,2};
        System.out.println(countRotation(a));
    }

    private static int countRotation(int[] a) {
        int pivot = findPivot(a);
        return pivot + 1;
    }// for non duplicates
    static int findPivot(int a [] ){
        int st = 0;
        int end = a.length - 1;
        while (st<=end) {
            int mid = st + (end - st) / 2;
            if(mid < end && a[mid] > a[mid +1]){
                return mid;
            }if(mid > st && a[mid] < a[mid -1]){
                return mid -1;
            }if(a[mid] <= a[st]){
                end = mid -1;
            }else{
                st = mid + 1;
            }
        }
        return  -1;
    }
    // for duplicates
    static int findPivotwithDUPLICATE(int a [] ){
        int st = 0;
        int end = a.length - 1;
        while (st<=end) {
            int mid = st + (end - st) / 2;
            if(mid < end && a[mid] > a[mid +1]){
                return mid;
            }if(mid > st && a[mid] < a[mid -1]) {
                return mid - 1;
            }
            // IF ELE AT MID , ST , END ARE EQUAL THEN JUST SKIP  THE DUPLICATES
            if(a[mid] == a[st] && a[mid] == a[end]){
                // skip duplicate
                //NOTE: what if these ele st and end were the pivot ??
                // chek if st id pivot
                if(a[st] > a[st + 1]){
                    return st;
                }
                st++;
                // end id pivot or not
                if(a[end] < a[end -1]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted , pivot should be in right
            else if(a[st] < a[mid] || (a[st] == a[mid] &&  a[mid] > a[end])){
                st = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return  -1;
    }
}
