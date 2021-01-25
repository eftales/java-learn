package org.lean;

import java.util.Scanner;

/**
 * @Auther: eftales
 * @Date: 2021/1/24 21:11
 * @Description:  * @Description:
 * @Version: 0.0.1
 **/

public class Input {
    public void show(){
        System.out.println("-------输入输出-------");
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
    }
}
