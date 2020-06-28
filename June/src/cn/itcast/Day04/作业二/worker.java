package cn.itcast.Day04.作业二;
/*
### 第二题

有如下员工信息：

```
姓名：张三，工资：3000 姓名：李四，工资：3500 姓名：王五，工资：4000 姓名：赵六，工资：4500 姓名：田七，工资：5000
```

先需要将所有的员工信息都存入ArrayList集合中，并完成如下操作：

1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”

2、判断是否有姓名为“赵六”的员工，如果有，将其删除

3、给姓名为“田七”的员工，涨500工资
 */
public class worker {
    private String name;
    private int salary;

    public worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
