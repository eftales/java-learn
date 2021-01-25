package org.lean;

/**
 * @Auther: eftales
 * @Date: 2021/1/24 21:09
 * @Description: 流程控制
 * @Version: 0.0.1
 **/

public class ProcessControl {
    public void show(){
        System.out.println("-------流程控制-------");
        int score = 78;
        if (score > 80){
            System.out.println("漂亮！");
        } else if (score > 60){
            System.out.println("还行.");
        }
        else{
            System.out.println("蛤？");
        }

        String s1 = "hi",s2 = "h1";
        s1.equals(s2); // true
        if (s1 == s2){ // false
        }
        System.out.println("用==判断两个引用类型是否指向同一块内存");

        switch ("aa"){ // 只可以是 int 或 String
            case "78":
                break;
            case "123":

            default:
                break;
        }

        int[] arr = {11,22,33,44};
        for (int each:arr){ // 无法改变arr的值
            each = 0;
        }
        double pi = 0;
        for (double i = 1; i <= 9999L; i += 4) {
            pi += 4/i;
            pi -= 4/(i + 2);
        }

    }
}
