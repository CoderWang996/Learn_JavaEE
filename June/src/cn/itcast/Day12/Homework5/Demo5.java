package JUNE.src.cn.itcast.Day12.Homework5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
【编号：1505】现有若干图书信息（包含名称title、作者author、定价price）
需要存储到set集合中，保证集合中无重复元素，并遍历查看。
可以认为所有信息都相同的图书为重复数据。
 */
class Book{
    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Book b1=new Book("老人与海","海明威",30);
        Book b2=new Book("我与地坛","史铁生",33);
        Book b4=new Book("老人与海","威哥",30);
        Book b3=new Book("活着","余华",11);
        Book b5=new Book("我与地坛","史铁生",33);
        Set<Book> set=new HashSet<>();
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        set.add(b5);
        for (Book book : set) {
            System.out.println(book);
        }
    }
}
