package org.lean.javacoreclass;

/**
 * @Auther: eftales
 * @Date: 2021/1/25 13:32
 * @Description:
 * @Version: 0.0.1
 **/

class StringBuilderMethod {
    void show(){
        StringBuilder sb = new StringBuilder(1024);
        for (int i=0;i<1000;++i){
            sb.append(',').append(i);
        }
    }
}

