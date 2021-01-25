package org.lean;

/**
 * @Auther: eftales
 * @Date: 2021/1/24 20:55
 * @Description: 字符和字符串
 * @Version: 0.0.1
 **/

public class CharWithString {
    public void show(){
        System.out.println("-------字符和字符串-------");
        char c = 'a';
        c = '中';
        String s1 = "Hello"; // 和 python 一样 s1 s2 也只是指针而已
        String s2 = "world";
        String s = s1 + " " + s2 + "!" + "5526765";
        System.out.println(s);

    }
}
