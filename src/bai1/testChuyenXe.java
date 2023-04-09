package bai1;

import java.util.ArrayList;

public class testChuyenXe {
	public static void main(String[] args) {
        ArrayList<chuyenXe> dsChuyenXe = new ArrayList<chuyenXe>();

        // Tạo 2 chuyến xe nội thành
        chuyenXe cx1 = new chuyenXeNoiThanh("CX001", "Nguyen Van A", 12345,1, 40, 2000000);
        chuyenXe cx2 = new chuyenXeNoiThanh("CX002", "Tran Thi B", 67890, 2, 35, 1800000);

        // Tạo 2 chuyến xe ngoại thành
        chuyenXe cx3 = new chuyenXeNgoaiThanh("CX003", "Le Van C", 24680, "Nha Trang", 3, 3500000);
        chuyenXe cx4 = new chuyenXeNgoaiThanh("CX004", "Pham Thi D", 13579, "Phan Thiet", 2, 2000000);

        // Thêm các chuyến xe vào danh sách
        dsChuyenXe.add(cx1);
        dsChuyenXe.add(cx2);
        dsChuyenXe.add(cx3);
        dsChuyenXe.add(cx4);


        // Tính tổng doanh thu của từng loại chuyến xe
        double tongDTNoiThanh = 0, tongDTNgoaiThanh = 0;
        for (chuyenXe cx : dsChuyenXe) {
            if (cx instanceof chuyenXeNoiThanh) {
                tongDTNoiThanh += cx.tinhDoanhThu();
            } else if (cx instanceof chuyenXeNgoaiThanh) {
                tongDTNgoaiThanh += cx.tinhDoanhThu();
            }
        }

        // Xuất tổng doanh thu của tất cả các chuyến xe
        System.out.println("Tong doanh thu cua tat ca cac chuyen xe: " + (tongDTNgoaiThanh+tongDTNoiThanh));
        // Xuất tổng doanh thu của từng loại chuyến xe
        System.out.println("Tong doanh thu cua cac chuyen xe noi thanh: " + tongDTNoiThanh);
        System.out.println("Tong doanh thu cua cac chuyen xe ngoai thanh: " + tongDTNgoaiThanh);
    }
}
