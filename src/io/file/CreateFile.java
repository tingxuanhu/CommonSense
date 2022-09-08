package io.file;

/**
 * @author TingxuanHu
 * @version 1.0
 * @date 2022/9/8
 */

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {

    }

    // new File(String pathname)
    @Test
    public void create01() {
        String filePath = "C:/Users/Lenovo/Documents/GitHub/CommonSense/src/io/news1.txt";

        // new File 在内存中创了对象 但只是一个对象而已  没有持久化存储到硬盘
        // 执行createNewFile方法 --> 从内存中持久化写入磁盘 创建文件
        // 没有这个动作文件是不会产生的
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("Finished!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // new File(File parent, String child)
    @Test
    public void createNewFile02() {
        File parentFile = new File("C:/Users/Lenovo/Documents/GitHub/CommonSense/src/io");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);

        try {
            file.createNewFile();
            System.out.println("Finished!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // new File(String parent, String child)
    @Test
    public void create03() {
        String parentFile = "C:/Users/Lenovo/Documents/GitHub/CommonSense/src/io";
        String filePath = "news3.txt";
        File file = new File(parentFile, filePath);

        try {
            file.createNewFile();
            System.out.println("Finished!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
