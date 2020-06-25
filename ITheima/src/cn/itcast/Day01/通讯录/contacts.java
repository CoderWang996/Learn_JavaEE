package Day01Code.通讯录;

public class contacts {
    private String name;
    private int age;
    private String Adress;
    private String phoneNunber;

    public contacts(){ }
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public void setPhoneNunber(String phoneNunber) {
        this.phoneNunber = phoneNunber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNunber() {
        return phoneNunber;
    }

    public String getAdress() {
        return Adress;
    }

    public int getAge() {
        return age;
    }

    public contacts(String name, int age, String Adress, String phoneNunber){
        this.name=name;
        this.age=age;
        this.Adress=Adress;
        this.phoneNunber=phoneNunber;
    }
    public void show(){
        System.out.println(name+","+age+","+Adress+","+phoneNunber);
    }
}
