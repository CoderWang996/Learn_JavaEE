package Day01Code.Day1_3Student;

 class Student {
    private String name;
    private int age;
    public void setName(String n){
        name=n;
        //this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        if (age<0||age>120) {
            System.out.println("你输入的年龄有误");
        }
        else {
            age=a;
            //this.age=age;
        }
        }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
