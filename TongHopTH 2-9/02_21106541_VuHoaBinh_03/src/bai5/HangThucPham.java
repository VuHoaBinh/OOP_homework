package bai5;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
		private String mahang;
		private String tenhang;
		private float dongia;
		private LocalDate ngaysanxuat;
		private LocalDate ngayhethan;

		
		// package
		public String getMahang() {
			return mahang;
		}

		private void setMahang(String mahang) throws Exception {
			if (!mahang.trim().equals("")) {
				this.mahang = mahang;
			} else
				throw new Exception("Lỗi! Mã hàng rỗng ");
		}

		public String getTenhang() {
			return tenhang;
		}

		public void setTenhang(String tenhang) throws Exception {
			if (!tenhang.trim().equals("")) {
				this.tenhang = tenhang;
			} else {
				this.tenhang = "xxx";
			}
		}

		public float getDongia() {
			return dongia;
		}

		public void setDongia(float dongia) throws Exception {
			if (dongia >= 0) {
				this.dongia = dongia;
			} else {
				throw new Exception("Lỗi!!Vì đơn giá dưới 0VNĐ");
			}
		}

		public LocalDate getNgaysanxuat() {
			return ngaysanxuat;
		}
		public void setNgaysanxuat(LocalDate ngaysanxuat) {
			if (ngaysanxuat.isBefore(LocalDate.now())) {
				this.ngaysanxuat = ngaysanxuat;
			} else {
				this.ngaysanxuat = LocalDate.now();
			}
		}

		public LocalDate getNgayhethan() {
			return ngayhethan;
		}

		public void setNgayhethan(LocalDate ngayhethan) {
			if (ngayhethan.isAfter(ngaysanxuat)) {
				this.ngayhethan = ngayhethan;
			} else {
				this.ngayhethan = ngaysanxuat;
			}
		}
		
		//contructor
		public HangThucPham(String mahang) throws Exception {
			this.mahang = mahang;
			this.tenhang = "xxx";
			this.ngaysanxuat = LocalDate.now();
			this.ngayhethan = ngaysanxuat;
		}

		public HangThucPham(String mahang, String tenhang, float dongia, LocalDate ngaysanxuat, LocalDate ngayhethan)
				throws Exception {
			setMahang(mahang);
			setTenhang(tenhang);
			setDongia(dongia);
			setNgaysanxuat(ngaysanxuat);
			setNgayhethan(ngayhethan);
		}
		
		// check
		public boolean hetHan() {
			return ngayhethan.isBefore(LocalDate.now()) ? true : false;
		}
		
		// Topic
		public static String getTieuDe() {
			return String.format("%-15s%-15s%-20s%-20s%-20s%-10s", "Mã_hàng", "Tên_hàng", "Đơn_giá", "Ngày_Sản_Xuất",
					"Ngày_Hết_Hạn", "Ghi_chú");
		}

		// print
		@Override
		public String toString() {
			String kq = " ";
			if (hetHan() == true) {
				kq = "Het Han";
			}
			DecimalFormat dongiaf = new DecimalFormat("#,##0.00");
			DateTimeFormatter datef = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			return String.format("%-15s%-15s%-20s%-20s%-20s%-10s", mahang, tenhang, dongiaf.format(dongia),
					datef.format(ngaysanxuat), datef.format(ngayhethan), kq);
		}


}
