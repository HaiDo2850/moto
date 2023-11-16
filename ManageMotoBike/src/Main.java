import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageMotoBike manageMotoBike = new ManageMotoBike();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm mới");
            System.out.println("2. Sửa");
            System.out.println("3. Xoá");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("6. Tìm kiếm trong khoảng giá");
            System.out.println("7. Sắp xếp theo cc tăng dần");
            System.out.println("8. Sắp xếp theo cc giảm dần");
            System.out.println("0. Thoát chương trình");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhập ID:");
                    int newId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên:");
                    String newName = scanner.nextLine();
                    System.out.println("Nhập giá:");
                    int newPrice = scanner.nextInt();
                    System.out.println("Nhập CylynderCapacity:");
                    int newCc = scanner.nextInt();
                    manageMotoBike.addMotoBike(new MotoBike(newId, newName, newPrice, newCc));
                    break;
                case 2:
                    System.out.println("Nhập ID muốn sửa: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    manageMotoBike.update(updateId, new MotoBike());
                    break;
                case 3:
                    System.out.println("Nhập ID muốn xóa: ");
                    int removeId = scanner.nextInt();
                    manageMotoBike.deleteMotoBike(removeId);
                    break;
                case 4:
                    System.out.println("Danh sách hiện có");
                    manageMotoBike.showMotoBike();
                    break;
                case 5:
                    System.out.println("Nhập tên muốn tìm: ");
                    String findName = scanner.nextLine();
                    manageMotoBike.findByName(findName);
                    break;
                case 6:
                    System.out.println("Nhập khoảng giá bạn muốn: ");
                    double lowPrice = scanner.nextDouble();
                    System.out.println("Nhập vào số tiền giới hạn trên:");
                    double highPrice = scanner.nextDouble();
                    manageMotoBike.findByValveInRange(lowPrice, highPrice);
                    break;
                case 7:
                    manageMotoBike.sortUpByCc();
                    break;
                case 8:
                    manageMotoBike.sortDownByCc();
                    break;
            }
        }
    }
}