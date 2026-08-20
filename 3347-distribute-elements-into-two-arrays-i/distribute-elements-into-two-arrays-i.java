class Solution {
    public int[] resultArray(int[] nums) {

        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];

        int j = 1;
        int k = 1;

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        for (int i = 2; i < nums.length; i++) {

            if (arr1[k - 1] > arr2[j - 1]) {
                arr1[k++] = nums[i];
            } else {
                arr2[j++] = nums[i];
            }
        }

        int[] result = new int[nums.length];

        System.arraycopy(arr1, 0, result, 0, k);
        System.arraycopy(arr2, 0, result, k, j);

        return result;
    }
}