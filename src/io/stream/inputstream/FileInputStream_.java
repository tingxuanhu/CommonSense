package io.stream.inputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author TingxuanHu
 * @version 2022/9/8 22:39
 */

// 类名不要与导入的东西重合
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    // 指定字节长度来读取 而不是单字节单字节地读取
    @Test
    public void readFile2() {
        String filePath = "/Users/tingxuanhu/IdeaProjects/CommonSense/src/io/stream/IO流原理.md";
        // 创建字节数组  所谓字节数组指的是指定若干个字节  一次读取
        byte[] buf = new byte[8];
        // 定义readLen是因为什么？
        // 类似于pytorch里的batch size 最后一组可能不够满的batch size，而规定的字节数组是按照batch size送进去
        // 这时候最后一组就要单独限定一下了
        // 而这里的做法就是定义readLen变量  把每一次读取返回到实际读取的字节数给到它
        int readLen = 0;
        // 创建一个FileInputStream用于读取文件
        // 把fileInputStream定义在外面可以扩大作用域 这样在finally中可以释放资源
        // 否则的话在finally中接受不到作用域仅限于try中的内容
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            // read方法从该输入流读取指定个字节的数据 如果没有输入可用 将阻止 返回-1
            // 所以要循环着来读
            // 文本文件，由于是按照字节流读取，而以汉字UTF-8每个字三字节的编码为例
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));  // 读取结果用char类型显示  不用println（不换行）
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭文件流  释放资源
            try {
                // 只要保证执行了close方法就可以了  不套娃反复关闭套异常 关闭套异常
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void readFile1() {
        String filePath = "/Users/tingxuanhu/IdeaProjects/CommonSense/src/io/stream/IO流原理.md";
        int readData = 0;
        // 把fileInputStream定义在外面可以扩大作用域 这样在finally中可以释放资源
        // 否则的话在finally中接受不到作用域仅限于try中的内容
        FileInputStream fileInputStream = null;
        try {
            // 创建一个FileInputStream用于读取文件
            fileInputStream = new FileInputStream(filePath);

            // read方法从该输入流读取一个字节的数据 如果没有输入可用 将阻止 返回-1
            // 所以要循环着来读
            // 读取的是文本文件，由于是按照字节流读取，而以汉字UTF-8每个字三字节的编码为例
            // 一个字节一个字节地拿走 必然会出现乱码
            while ((readData = fileInputStream.read()) != -1) {
                System.out.println((char) readData);  // 读取结果用char类型显示
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭文件流  释放资源
            try {
                // 只要保证执行了close方法就可以了  不套娃反复关闭套异常 关闭套异常
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }



}
