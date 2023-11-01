package utils;

import java.util.Scanner;

public class Utils {
    public double inputDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập sai, nhập lại");
            }
        }
    }

    public int inputInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập sai, nhập lại");
            }
        }
    }
}
