package Day01Code.Animal;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setKind("老虎");
        a1.setWeight(10000);
        a1.show();
        Animal a2 = new Animal("狮子", 200000);
        a2.show();
    }
}
