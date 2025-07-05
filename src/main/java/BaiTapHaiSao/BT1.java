package BaiTapHaiSao;
//Mô tả: Viết một chương trình Java tính thuế thu nhập cá nhân dựa trên mức thu nhập hàng năm của một người.
// Chương trình sẽ yêu cầu người dùng nhập thu nhập hàng năm và sau đó tính thuế dựa trên các mức thuế sau:
// 1.Thu nhập từ 0 đến 5 triệu đồng: 5%
// 2.Thu nhập từ 5 triệu đến 10 triệu đồng: 10%
// 3.Thu nhập từ 10 triệu đến 18 triệu đồng: 15%
// 4.Thu nhập từ 18 triệu đến 32 triệu đồng: 20%
// 5.Thu nhập từ 32 triệu đến 52 triệu đồng: 25%
// 6.Thu nhập từ 52 triệu đến 80 triệu đồng: 30%
// 7.Thu nhập trên 80 triệu đồng: 35%
// Yêu cầu: 1.Nhập thu nhập hàng năm từ người dùng. 2.Tính số thuế phải trả theo từng mức thuế suất. 3.Xuất số thuế phải trả.
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
