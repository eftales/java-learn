package org.lean.javaclass;

/**
 * @Auther: eftales
 * @Date: 2021/1/25 9:06
 * @Description:
 * @Version: 0.0.1
 **/

class Student extends Person {
    private double score;
    public Student(){
        super();
        this.score = 0;
        this.name = "student";
    }

    @Override
    public void run(){
        System.out.println("Student is running...");
    }
    public void study(int days){
        System.out.printf("Student studied for %d days." ,days);
    }
    public void runTwice(){
        this.run();
        super.run();
    }
}
