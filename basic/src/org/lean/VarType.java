package org.lean;

/**
 * @Auther: eftales
 * @Date: 2021/1/24 19:03
 * @Description: 变量类型
 * @Version: 0.0.1
 **/

public class VarType {
    public void show(){
        System.out.println("-------变量类型-------");
        int i = 10;
        i = 22;
        int j = i;

        // 进制
        int[] jz = new int[4];
        jz[0] = 16;
        jz[1] = 0x10;
        jz[2] = 0b10000;
        jz[3] = 1_6;
        for(i=0;i<4;++i){
            System.out.println(jz[i]);
        }

        // 基本类型
        byte b = 127; // 1 byte
        short s = 32767; // 2 bytes
        int in = 2147483647; // 4 bytes
        long l = 9_223_372_036_854_775_807l; //8 bytes 注意在数字的最后加 l

        float f1 = 3.14f; // 4 bytes 注意在数字后面加 f
        float f2 = 3.4e38f; // 科学计数法 float 最大值
        double d1 = 1.79e308; // 8 bytes
        double d2 = 1.79e308d; // 可加 d 可不加 d

        boolean bl1 = true; // 通常JVM内部会把boolean表示为4字节整数
        boolean bl2 = false; // 不可以是 0 或 1

        char zh = '中'; // 2 bytes 单引号！

        // 引用类型
        String str1 = "hello";
        String str2 = new String("world");

        // 常量
        final int ii = 22; // 无法修改
        // ii = 33;

        // 自动推断类型
        var sb = new StringBuilder(); // 类似于 c++ auto

        // 变量作用范围
        // int iii = 10; // 这样是不行的，同一个方法内不能同时存在多个名字相同的变量
        {
            int iii = 22;
        }
        int iii = 10;


    }
}
