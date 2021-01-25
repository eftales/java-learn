package org.lean.javacoreclass;

/**
 * @Auther: eftales
 * @Date: 2021/1/25 13:20
 * @Description:
 * @Version: 0.0.1
 **/

class StringMethod {
    void show(){
        String s = "Hello";
        s.contains("lo"); // 是否包含子串
        s.indexOf('l');
        s.lastIndexOf('l');
        String s1 = s.substring(2,4);
        s.replace('l','b');
        s.replace("bb","dd");

        String s2 = "A,B,C,D";
        String[] ss = s2.split(""); // 分割成一个一个的字母
        String s3 = String.join("--",ss);

        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));
    }
}
