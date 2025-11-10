public class splitarraySum {
    public static void main(String[] args) {
        int a [] = {4,5,6,7,8,0,1,2};
        int k = 3; // number of subarrays
        System.out.println(splitArray(a, k));
    }

    static int splitArray(int[] nums, int k) {
        int st = 0;
        int end = 0;

        // Find the range [max element, total sum]
        for (int i = 0; i < nums.length; i++) {
            st = Math.max(st, nums[i]);
            end += nums[i];
        }

        // Binary search
        while (st < end) {
            int mid = st + (end - st) / 2;
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // start new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;  // ✅ fixed
                }
            }

            if (pieces > k) {
                st = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // or return st (both same here)
    }
}
