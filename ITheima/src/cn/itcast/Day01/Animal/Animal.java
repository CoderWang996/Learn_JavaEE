package Day01Code.Animal;


public class Animal {
    private String kind;
    private int weight;
    public Animal(){}
    public Animal(String kind,int weight){
        this.kind=kind;
        this.weight=weight;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void show(){
        System.out.println(kind+","+weight);
    }
}
