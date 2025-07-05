package BaiTapBaSao;

//Mô tả: Cho một mảng đã được sắp xếp tăng dần và một số nguyên target,
// hãy tìm hai số trong mảng có tổng bằng target và trả về chỉ số (index) của chúng (bắt đầu từ 1).
// Ví dụ: Input: numbers = [2,7,11,15], target = 9 Output: [1,2]

public class BT1 {

    public static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    return new int[] {i + 1, j + 1};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

    }
}
