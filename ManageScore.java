import java.util.Scanner;

public class ManageScore {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm mới");
            System.out.println("2. Sửa");
            System.out.println("3. Xoá");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("5. Hiện danh sách học sinh với các thông tin: số thứ tự, tên, điểm trung bình   ");
            System.out.println("6. Hiện danh sách các học sinh giỏi");
            System.out.println("7. Hiện danh sách học sinh với trạng thái của học sinh");
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
                    System.out.println("Nhập điểm toán:");
                    int newMathScore = scanner.nextInt();
                    System.out.println("Nhập điểm lý:");
                    int newPhysicScore = scanner.nextInt();
                    System.out.println("Nhập điểm hóa:");
                    int newChemicalScore = scanner.nextInt();
                    manageStudent.addStudent(new Student(newId, newName, newMathScore, newPhysicScore, newChemicalScore));
                    break;
                case 2:
                    System.out.println("Nhập ID muốn sửa: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    manageStudent.updateStudent(updateId, new Student());
                    break;
                case 3:
                    System.out.println("Nhập ID muốn xóa: ");
                    int removeId = scanner.nextInt();
                    manageStudent.deleteStudent(removeId);
                    break;
                case 4:
                    System.out.println("Danh sách hiện có");
                    manageStudent.showStudent();
                    break;
                case 5:
                    System.out.println("Danh sách thông tin học sinh ");
                    manageStudent.information();
                    break;
                case 6:
                    System.out.println("Danh sách học sinh giỏi ");
                    manageStudent.exellentStudent();
                    break;
                case 7:
                    System.out.println("Học sinh với trạng thái của học sinh");
                    manageStudent.status();
            }
        }
    }
}