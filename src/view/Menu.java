package view;

import entities.Student;
import service.StudentService;
import utils.Utils;

import java.util.Map;
import java.util.Scanner;

public class Menu {
    Utils utils = new Utils();

    public void menuSelect(Map<Integer, Student> studentMap, Scanner scanner, StudentService studentService) {
        while (true) {
            System.out.println("Mời bạn chọn");
            System.out.println("1. Thêm sinh viên: ");
            System.out.println("2. Xóa sinh viên theo ID: ");
            System.out.println("3. Tìm sinh viên theo ID: ");
            System.out.println("4. Tính điểm trung bình của tất cả sinh viên: ");
            System.out.println("5. Hiển thị danh sách sinh viên: ");

            int select = utils.inputInt(scanner);

            switch (select) {
                case 1:
                    studentService.inputStudent(studentMap, scanner);
                    break;
                case 2:
                    studentService.removeStudent(studentMap, scanner);
                    break;
                case 3:
                    studentService.getStudent(studentMap, scanner);
                    break;
                case 4:
                    studentService.calScore(studentMap);
                    break;
                case 5:
                    System.out.println(studentMap);
            }
        }
    }
}
