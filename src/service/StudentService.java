package service;

import entities.Student;
import utils.Utils;

import java.util.Map;
import java.util.Scanner;

public class StudentService {
    Utils utils = new Utils();

    public void inputStudent(Map<Integer, Student> studentMap, Scanner scanner) {
        System.out.println("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập điểm: ");
        double score = utils.inputDouble(scanner);
        Student student = new Student(name, score);
        studentMap.put(student.getId(), student);
    }

    public void removeStudent(Map<Integer, Student> studentMap, Scanner scanner) {
        System.out.println("Nhập id sinh viên bạn cần xóa: ");
        int id = utils.inputInt(scanner);
        studentMap.remove(id);
        System.out.println("Sinh viên đã được xóa");
    }

    public void getStudent(Map<Integer, Student> studentMap, Scanner scanner) {
        System.out.println("Nhập id sinh viên bạn muốn tìm");
        int id = utils.inputInt(scanner);

        if (studentMap.containsKey(id)) {
            System.out.println("Thông tin sinh viên bạn cần tìm:");
            System.out.println(studentMap.get(id));
        } else {
            System.out.println("Không tìm thấy sinh viên với ID: " + id);
        }
    }

    public void calScore(Map<Integer, Student> studentMap) {
        double totalScore = 0;
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            totalScore += entry.getValue().getScore();
        }
        System.out.println("Điểm trung bình của sinh viên là: "+ (totalScore/studentMap.size()));
    }

}
