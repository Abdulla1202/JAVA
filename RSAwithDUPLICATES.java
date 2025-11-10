public class RSAwithDUPLICATES {
    public static void main(String[] args) {
        int a [] = {4,5,6,7,8,8,8,8,0,1,2};
        int target = 6;
        System.out.println(search(a,target));
    }
    static int search(int[] a, int target) {
        int pivot = findPivotwithDUPLICATE(a);
        // if u dont  have pivot it means arr is not roteted
        if(pivot == -1){
            // just do normal binary search
            return binarySerch(a,target, 0, a.length-1);
        }
        // u find the pivot u found 2 assending sorted array
        if(a[pivot] == target){
            return pivot;
        }
        if(target >= a[0]){
            return binarySerch(a,target,0,pivot-1);
        }
        return binarySerch(a,target,pivot+1,a.length-1);

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
    // not work for dublicate values
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
