package BaiTapHaiSao;

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
