package org.lean.javaclass;

/**
 * @Auther: eftales
 * @Date: 2021/1/25 8:25
 * @Description:
 * @Version: 0.0.1
 **/

abstract class Book {
    public String name;
    public String author;
    public String isbn;
    public double price;

    public abstract void read();

}
