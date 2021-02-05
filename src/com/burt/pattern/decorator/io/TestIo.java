package com.burt.pattern.decorator.io;

import java.io.*;

public class TestIo {


    public static void main(String[] args) {
        readFromFile(null);
    }

    private static void readFromFile(String filePath) {

        try {
            InputStream is = new FileInputStream(filePath);

            BufferedInputStream bufferedInputStream = null; // 装饰类，增加buffer功能

            byte[] buffer = new byte[1024];

            bufferedInputStream = new BufferedInputStream(is); // 默认缓冲大小8192

            int len = 0;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                //将读取的字节转为字符串对象
                String s = new String(buffer, 0, len);
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
