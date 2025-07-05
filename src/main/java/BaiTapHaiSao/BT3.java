package BaiTapHaiSao;
//Xóa Ký Tự Lặp Lại Trong Chuỗi Mô tả: Viết một hàm xóa các ký tự lặp lại trong chuỗi, chỉ giữ lại ký tự xuất hiện đầu tiên của mỗi loại.
// Yêu cầu: Hàm nhận vào một chuỗi và trả về chuỗi mới không chứa ký tự lặp lại.
// Ví dụ: Input: "programming" Output: "progamin" Input: "abca" Output: "abc"

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BT3 {

    public static String xoaChu(String input){
        Set<Character> seen = new HashSet<>();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char kiTu = input.charAt(i);
            if(!seen.contains(kiTu)) {
                seen.add(kiTu);
                result = result + kiTu;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(xoaChu("programming"));
        System.out.println(xoaChu("adca"));
    }
}
