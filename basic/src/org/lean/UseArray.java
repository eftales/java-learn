package org.lean;
import java.util.Arrays;
/**
 * @Auther: eftales
 * @Date: 2021/1/24 22:15
 * @Description:
 * @Version: 0.0.1
 **/

public class UseArray {
    public void show(){
        int[] ia = {4,3,2,1};
        Arrays.sort(ia);
        System.out.println(Arrays.toString(ia));
        int[][] ns = {
                { 1,  },
                { 5,  8 },
                { 9, 10, 11, 12,14 }
        };
        System.out.println(ns[1][1]);
    }
}
