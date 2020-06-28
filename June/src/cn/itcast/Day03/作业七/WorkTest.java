package cn.itcast.Day03.作业七;
/*
现已知工人（Worker）类，属性包含姓名（name）、工龄（year），请编写该类，提供构造方法和get、set方法。
在测试类中，请查看键盘录入Scanner类的API，创建工人类对象，属性值由键盘录入，打印对象的属性值。运行效果如下：

```text
 张三 请录入工人工龄： 5 该工人对象的属性信息如下： 姓名：张三 工龄：5
```
 */
import java.util.Scanner;

public class WorkTest {
    public static void main(String[] args) {
        Worker worker=new Worker();
        Scanner cin=new Scanner(System.in);
        System.out.println("请录入工人姓名");
        worker.setName(cin.nextLine());
        System.out.println("请录入工人工龄");
        worker.setYear(cin.nextInt());
        System.out.println("该工人对象的属性信息如下：姓名："+worker.getName()+"工龄："+worker.getYear());
    }
}
