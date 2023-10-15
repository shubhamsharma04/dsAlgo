public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        return binSearch(nums, target, 0, nums.length - 1);
    }

    private int binSearch(int [] nums, int target, int start, int end) {
        if(start == end) {
            return target <= nums[start] ? start : end +1;
        }

        int mid = (start + end) / 2;

        if(nums[mid] == target){
            return mid;
        } else if(nums[mid] > target) {
            return binSearch(nums, target, start, end - 1);
        }

        return binSearch(nums, target, start + 1, end);
    }
}
