package BaiTapBaSao;
// Mô tả: Tìm chuỗi con đối xứng (palindromic substring) dài nhất trong một chuỗi cho trước.
// Ví dụ: Input: "babad" Output: "bab" (hoặc "aba", vì cả hai đều là chuỗi con đối xứng dài nhất)

public class BT2 {
        public static String longestPalindrome(String s) {
            int n = s.length();
            // Duyệt độ dài chuỗi con từ lớn nhất tới 1
            for (int length = n; length >= 1; length--) {
                // Duyệt từng vị trí bắt đầu có thể
                for (int start = 0; start <= n - length; start++) {
                    int end = start + length - 1; // Ký tự cuối cùng của chuỗi con

                    if (isPalindrome(s, start, end)) {
                        // Trả ra chuỗi con đối xứng đầu tiên tìm được (dài nhất vì duyệt từ lớn -> nhỏ)
                        return s.substring(start, end + 1);
                    }
                }
            }
            return "";
        }
        // Hàm kiểm tra chuỗi con s[start..end] có phải đối xứng không
        private static boolean isPalindrome(String s, int left, int right) {
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        public static void main(String[] args) {
            String s = "babad";
            String h = "cbbd";
            System.out.println("Chuỗi con đối xứng dài nhất: " + longestPalindrome(s));
            System.out.println("Chuỗi con đối xứng dài nhất: " + longestPalindrome(h));

        }
    }





