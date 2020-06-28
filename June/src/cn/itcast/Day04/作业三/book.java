package cn.itcast.Day04.作业三;
/*
### 第三题
```
利用面向对象的思想设计一个图书管理系统。图书的属性有：编号，书名，作者，价格。要求提供如下功能：
1、提供操作菜单，可以选择要进行的操作。
2、可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。
3、可以查询图书，显示所有图书信息，然后返回到菜单。
4、可以根据书名，查询单本图书信息，显示信息后，返回到菜单。
5、可以删除图书，通过编号删除，删除成功后，返回到菜单。
6、可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。
7、可以退出系统，结束程序运行。提示：1、所有图书信息由键盘录入2、图书的价格可以定义为字符串类型，
因为在键盘录入时，不可以先使用nextInt()方法获取整数然后再使用nextLine()方法获取字符串，
这样会导致nextLine()方法获取不到数据。
 */
public class book {
    private String id;
    private String name;
    private String author;
    private int price;

    public book(String id, String name, String author, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
