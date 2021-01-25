package org.lean.javaclass;

/**
 * @Auther: eftales
 * @Date: 2021/1/25 8:25
 * @Description:
 * @Version: 0.0.1
 **/

class Person {
    protected String name = "";
    public int age;
    public Person(){
        this.age = 1;
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person(int age){
        this("age",age); // 调用无参数输入的构造方法
    }
    public void setName(String name){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name.strip();
    }

    public void run(){
        System.out.println("Person is running...");
    }

    public final void study(){ // final 不允许被 Override 但是可以 overload
        System.out.println("Person should study");
    }


}
