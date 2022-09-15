package io.scanner;

/**
 * @author TingxuanHu
 * @version 2022/9/11 11:04
 */

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // 获取用户的姓名、年龄和薪酬信息
        System.out.println("name: ");
        String name = myScanner.next();
        System.out.println("age: ");
        int age = myScanner.nextInt();
        System.out.println("salary: ");
        double salary = myScanner.nextFloat();
        System.out.println("Personal profile (simplified)\n"
                + "name: " + name + "\n"
                + "age: " + age + "\n"
                + "salary: " + salary);
    }



}
