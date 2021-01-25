package org.lean.javaclass;

/**
 * @Auther: eftales
 * @Date: 2021/1/24 22:46
 * @Description:
 * @Version: 0.0.1
 **/

public class ClassDemo {
    public void show(){
        // ming 是一个引用类型的变量；与引用类型对应的是基本类型
        Person ming = new Person("xiao ming",23); // 创建实例必须用到 new 操作符
        // 同一文件夹下的类可以直接相互调研，不必import
        Person hong = new Person();
        hong.setName("xiao hong");
        hong.age = 33;

        // 转型
        Person p = new Student(); //向下转型 申明的变量是 Person 类型，student完全可以满足Person的所有要求，所有可以
        // Student s = new Person(); // 非法
        Student s = (Student) p; // 向上转型 只有当 p 原本就指向 Student 类时才可以
        if (p instanceof Student && p instanceof Person){
            System.out.println("p instanceof Student and Person" );
        }
        if (s instanceof Student && s instanceof Person){
            System.out.println("s instanceof Student and Person" );
        }
        Person p1 = new Person();
        if (p1 instanceof Person && !(p1 instanceof Student)){
            System.out.println("p1 instanceof Person" );
        }
        // 覆写
        p1.run();
        p.run(); // !!!这里是 student is running...
        s.run();
        s.runTwice();

        // 重载
        s.study();
        s.study(2);

        // 抽象类
        Book bk = new TBE(); // 抽象类的好处：声明父类变量即可，不关注子类的具体类型，子类一定会覆写父类的方法
        bk.read();

        // 接口
        org.lean.javaclass.ClasswithItf cwf = new ClasswithItf(); // 完整的类名 = 包名+类名

        // 内部类
        Outer o = new Outer("");
        Outer.Inner i = o.new Inner();
    }
}
