public class findInMountainArray {
    public static void main(String[] args) {
    int arr [] = {0,1,2,4,2,1};
    int target = 3;
        System.out.println(search(arr, target));
    }
   static int search(int [] arr, int target ) {
        int peak = findPeakElement(arr);
        int firsttry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firsttry != -1) {
            return firsttry;
        }// try to search in 2nd half
        return orderAgnosticBinarySearch(arr , target, peak+1 , arr.length -1);
    }

    static int findPeakElement(int [] a) {
        int st = 0 ;
        int end = a.length - 1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (a[mid] > a[mid + 1]){
                // you r in decresing part of arr
                // this may be the ans (that's why (end != mid - 1) ) ,  but look left side

                end = mid ;
            }else{
                // you r in assending part of arr
                st  = mid + 1; //  because we know mid + 1 id greeter then mid
            }
        }
        // in the end , st ==  end  and pointing to largest num because of the 2 cheks above
        // st and end always trying to find max ele in above 2 cheks
        // hence , when they r pointing to just one ele ,  that is the maximum one that is what cheks say
        // more elaboretion : at every point of time for start and end , they have the best possible answer
        //till that time and we r saying that only one item is remaining , hence cuz of above line that is the
        //best possible ans
        return st; //  st and end both r equal
    }
    static int orderAgnosticBinarySearch(int[] a, int target , int st ,int end ) {


        // 1️⃣ Detect order
        boolean isAscending = a[st] < a[end];

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (a[mid] == target) {
                return mid; // found
            }

            if (isAscending) {
                // 2️⃣ Ascending array logic
                if (target < a[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                // 3️⃣ Descending array logic
                if (target > a[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return -1; // not found

}
}
