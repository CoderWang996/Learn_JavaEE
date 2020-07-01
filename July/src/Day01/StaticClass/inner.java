package Day01.StaticClass;

public interface inner extends Sleep {
    static void eat(){
        System.out.println("吃烧烤");
    }

    @Override
    void sleep();
    default void shopping(){
        System.out.println("买买买");
    }
}
