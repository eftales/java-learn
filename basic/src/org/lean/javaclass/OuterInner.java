package org.lean.javaclass;

/**
 * @Auther: eftales
 * @Date: 2021/1/25 11:03
 * @Description:
 * @Version: 0.0.1
 **/

class Outer {
    private String name;

    Outer(String name) {
        this.name = name;
    }

    class Inner {
        void hello() {
            System.out.println("Hello, " + Outer.this.name);
        }
    }
}