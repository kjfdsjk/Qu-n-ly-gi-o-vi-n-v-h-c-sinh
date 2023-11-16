import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ManageTeacher manageTeacher = new ManageTeacher();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm mới");
            System.out.println("2. Sửa");
            System.out.println("3. Xoá");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("5. Tìm giáo viên theo môn");
            System.out.println("6. Sắp xếp danh sách giáo viên lương tăng dần ");
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
                    System.out.println("Nhập môn dạy:");
                    String newTeachingSubject = scanner.nextLine();
                    System.out.println("Nhập lương:");
                    double newSalary = scanner.nextInt();
                    manageTeacher.addTeacher(new Teacher(newId, newName, newTeachingSubject, newSalary));
                    break;
                case 2:
                    System.out.println("Nhập ID muốn sửa: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    manageTeacher.updateTeacher(updateId, new Teacher());
                    break;
                case 3:
                    System.out.println("Nhập ID muốn xóa: ");
                    int removeId = scanner.nextInt();
                    manageTeacher.deleteTeacher(removeId);
                    break;
                case 4:
                    System.out.println("Danh sách hiện có");
                    manageTeacher.showTeacher();
                    break;
                case 5:
                    System.out.println("Giáo viên bạn tìm dạy môn");
                    String findSubject = scanner.nextLine();
                    manageTeacher.findBySubject(findSubject);
                    break;
                case 6:
                    System.out.println("Danh sách xếp theo lương tăng dần");
                    manageTeacher.sortUpBySalary();
                    break;
            }
        }
    }
}
