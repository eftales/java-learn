package org.lean.javacoreclass;

import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;

/**
 * @Auther: eftales
 * @Date: 2021/1/25 13:17
 * @Description:
 * @Version: 0.0.1
 **/

public class JavaCoreClass {
    public void show(){
        new StringMethod().show();
        new StringBuilderMethod().show();

        Weekday wd = Weekday.FRI;
        wd.name();
        double x = Math.random(); // x的范围是[0,1)

        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong(); // 获取高强度安全随机数生成器
        } catch (NoSuchAlgorithmException e) {
            sr = new SecureRandom(); // 获取普通的安全随机数生成器
        }
        byte[] buffer = new byte[16];
        sr.nextBytes(buffer); // 用安全随机数填充buffer
    }
}
enum Weekday {
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);

    public final int dayValue;

    private Weekday(int dayValue) {
        this.dayValue = dayValue;
    }
}

