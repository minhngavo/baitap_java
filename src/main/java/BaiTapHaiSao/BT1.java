package BaiTapHaiSao;

import java.util.Scanner;

public class BT1 {
    public static double tinhThue(double thuNhap){
        double thue = 0;
        if(thuNhap <= 0){
           return 0;
        }
        double[] mucThuNhapHangNam = {5, 10, 18, 32, 52, 80};
        double[] thueSuat = {0.05, 0.10, 0.15, 0.20, 0.25, 0.30, 0.35};

        double thuNhapConLai = thuNhap;
        double thuNhapTruoc = 0;

        for(int i = 0; i < mucThuNhapHangNam.length; i++){
            if(thuNhap > mucThuNhapHangNam[i]){
                thue += (mucThuNhapHangNam[i] - thuNhapTruoc) * thueSuat[i];
                thuNhapTruoc = mucThuNhapHangNam[i];
            }else {
                thue += (thuNhap - thuNhapTruoc) * thueSuat[i];
                return thue;
            }
        }
        if(thuNhap > 80){
            thue += (thuNhap - 80) * thueSuat[6];
        }
        return thue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thu nhap hang nam (Trieu VND): ");
        double thuNhap = scanner.nextDouble();
        double thuePhaiTra = tinhThue(thuNhap);
        System.out.println("Thue thu nhap phai tra trong nam la: " + thuePhaiTra + " Trieu dong");

    }
}
