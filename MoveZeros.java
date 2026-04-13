public class MoveZeros {

    public static void moveZeros(int[] nums) {
        int index = 0;

        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        // Fill remaining positions with 0
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeros(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
