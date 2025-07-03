package BaiTapHaiSao;
import java.util.Scanner;

public class BT2 {

    public static String checkPalindrome(String str){
        str = str.trim().toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return "(False) Không phải là đối xứng!!!";
            }
            left ++;
            right--;
        }
        return "(True) Là đối xứng!!!";

    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome("madam"));
        System.out.println(checkPalindrome("hello"));

    }
}
