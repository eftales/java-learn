package org.lean;

/**
 * @Auther: eftales
 * @Date: 2021/1/24 19:42
 * @Description: 运算符
 * @Version: 0.0.1
 **/

public class Arithmetic {
    public void show(){
        System.out.println("-------运算符-------");
        // 整数运算只能得到整数
        int i=47,j=11;
        System.out.printf("%d + %d = %d%n",i,j,i+j);
        System.out.printf("%d - %d = %d%n",i,j,i-j);
        System.out.printf("%d * %d = %d%n",i,j,i*j);
        System.out.printf("%d / %d = %d%n",i,j,i/j);
        System.out.printf("%d %% %d = %d%n",i,j,i%j); // 注意输出 % 需要两个 %

        // 溢出
        i = 2147483640;
        j = 11;
        long k_ = i+j; // 得到-2147483645这个溢出答案
        long k = (long)i+j; // 正解
        System.out.printf("%d + %d = %d(溢出) %d%n",i,j,k_,k);

        // 移位操作
        i = -536870912;
        System.out.printf("%d %d %d%n%d %d%n",i,i>>8,i>>16,i,i>>>8,i>>>16);

        // 位运算
        System.out.printf("1&0=%d 1|0=%d ~1=%d(按位取反) 0b0101^0b1010=0b",1&0,1|0,~i);
        i = 0b0101^0b1010;
        while (i>0){
            System.out.printf("%d",i&1);
            i = i >> 1;
        }
        System.out.printf("%n",i&1);

        // 浮点数运算
        double d = 0.0 / 0;
        System.out.printf("0.0/0=%f 0/0.0!=0/0.0 -> %b 0/0.0==0/0.0 -> %b%n",d,d!=d,d==d);
        d = 1.0/0;
        System.out.printf("1.0/0=%f 1/0.0!=1/0.0 -> %b 1/0.0==1/0.0 -> %b%n",d,d!=d,d==d);

        // bool 运算
        j = -11;
        i = j >= 0 ? j : -j;
        System.out.printf("1==(1|0)->%b  0==(1&&0)->%b%n",1==(1|0),0==(1|0));
    }

}
