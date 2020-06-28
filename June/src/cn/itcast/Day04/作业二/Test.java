package cn.itcast.Day04.作业二;
import java.util.ArrayList;

/*
### 第二题
有如下员工信息：
```
姓名：张三，工资：3000 姓名：李四，工资：3500 姓名：王五，工资：4000 姓名：赵六，工资：4500 姓名：田七，工资：5000
``
先需要将所有的员工信息都存入ArrayList集合中，并完成如下操作：
1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”
2、判断是否有姓名为“赵六”的员工，如果有，将其删除
3、给姓名为“田七”的员工，涨500工资
 */
public class Test {
    public static void main(String[] args) {
        worker w1 = new worker("张三", 3000);
        worker w2 = new worker("李四", 3500);
        worker w3 = new worker("王五", 4000);
        worker w4 = new worker("赵六", 4500);
        worker w5 = new worker("田七", 5000);
        ArrayList<worker> arrayList = new ArrayList<>();
        arrayList.add(w1);
        arrayList.add(w2);
        arrayList.add(w3);
        arrayList.add(w4);
        arrayList.add(w5);
        look(arrayList);
        System.out.println("--------------------------");
        //1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”
        int index=hasName("王五",arrayList);
        if(index!=-1){
            arrayList.get(index).setName("王小五");
        }
        //2、判断是否有姓名为“赵六”的员工，如果有，将其删除
        int index2=hasName("赵六",arrayList);
        if(index2!=-1){
            arrayList.remove(index2);
        }
        //3、给姓名为“田七”的员工，涨500工资
        int index3=hasName("田七",arrayList);
        if(index3!=-1){
            arrayList.get(index3).setSalary(arrayList.get(index3).getSalary()+500);
        }
        look(arrayList);
    }

    private static int  hasName(String s,ArrayList<worker> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            worker w=arrayList.get(i);
            if (w.getName().equals(s)){
                return i;
            }
        }
        return -1;
    }

    private static void look(ArrayList<worker> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            worker worker=arrayList.get(i);
            System.out.println(worker.getName()+" "+worker.getSalary());
        }
    }
}