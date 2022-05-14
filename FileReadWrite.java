package com.homework.java.filereadwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**@author rowling
 * version 1.0
 * 从外部csv文件查询数据并写入到文本文件
 */
public class FileReadWrite {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入查询人的姓名：");
        String name=scanner.next();
        FileReader fileReader=new FileReader("/Users/maibangbangtangsongdemacbookpro/Desktop/java测试/第七次开课-学生成绩20220420.csv");
        BufferedReader reader=new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("/Users/maibangbangtangsongdemacbookpro/Desktop/java测试/test.txt");
        BufferedWriter writer =new BufferedWriter(fileWriter);
        String str;
        int num=1;
        while ((str=reader.readLine())!=null) {
            if (num==1)
            {   //打印表头
                writer.write(str);
                writer.newLine();
                num=-1;
                System.out.println(str);
            }
            if (str.startsWith(name)) { //检索指定字符并写入打印
                writer.write(str);
                writer.newLine();
                System.out.println(str);
            }
        }
        reader.close();
        writer.close();
    }
}
