package BaiTH6;

public class test_congNhan {

	public static void main(String[] args) {
		DanhSachCongNhan ls= new DanhSachCongNhan(10);
		
		CongNhan cn1 = new CongNhan("123","vu","binh",25);
		CongNhan cn2 = new CongNhan("123","vu","binh",25);
		CongNhan cn3 = new CongNhan("123","vu","binh",25);
		CongNhan cn4 = new CongNhan("123","vu","binh",25);

		DanhSachCongNhan.themCN(cn1);
		DanhSachCongNhan.themCN(cn2);
		DanhSachCongNhan.themCN(cn3);
		DanhSachCongNhan.themCN(cn4);
		
		System.out.println(CongNhan.getTieuDe());
		for (CongNhan cn: )
		System.out.println();
		
	}

}
