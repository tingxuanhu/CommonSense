package io.file;

import java.io.File;

/**
 * @author TingxuanHu
 * @version 1.0
 * @date 2022/9/8
 */

public class FileInfo {
    public static void main(String[] args) {

    }

    public void info() {
        // get info related to the doc
        File file = new File("C:\\Users\\Lenovo\\Documents\\GitHub\\CommonSense\\src\\io\\news1.txt");

        // call related methods for the info
        System.out.println(file.getName());
    }
}
