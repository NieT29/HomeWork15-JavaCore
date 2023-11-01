import entities.Student;
import view.Menu;
import service.StudentService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        StudentService studentManagement = new StudentService();
        Menu menu = new Menu();
        menu.menuSelect(studentMap, scanner, studentManagement);
    }
}
