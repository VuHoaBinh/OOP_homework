package bai8;

import java.util.ArrayList;

public class testPerson {

	public static void main(String[] args) {
		// Tạo danh sách người
        ArrayList<person> People = new ArrayList<person>();

        // Thêm các người vào danh sách
        People.add(new person("Nguyen Van A", "123 Nguyễn Văn Linh, Quận 7, TP. HCM"));
        People.add(new person("Tran Thi B", "456 Lê Văn Việt, Quận 9, TP. HCM"));
        People.add(new person("Pham Van C", "789 Quang Trung, Quận Gò Vấp, TP. HCM"));

        // In ra danh sách người
        System.out.println("Danh sách người:");
        for (person person : People) {
            System.out.println(person);
        }

        // Xóa người đầu tiên khỏi danh sách
        People.remove(0);

        // In ra danh sách người sau khi xóa
        System.out.println("\nDanh sách người sau khi xóa:");
        for (person person : People) {
            System.out.println(person);
        }

        // Sắp xếp danh sách người theo thứ tự tên
        sortByName(People);

        // In ra danh sách người sau khi sắp xếp
        System.out.println("\nDanh sách người sau khi sắp xếp theo tên:");
        for (person person : People) {
            System.out.println(person);
        }

	}

	private static void sortByName(ArrayList<person> people) {
		// TODO Auto-generated method stub
		
	}

}
