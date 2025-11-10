public class RSA {
    public static void main(String[] args) {
        int a [] = {4,5,6,7,0,1,2};
        System.out.println(findPivot(a));
    }
    static int search(int[] a, int target) {
        int pivot = findPivot(a);
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
}
