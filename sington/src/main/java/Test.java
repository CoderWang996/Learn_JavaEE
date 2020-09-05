public class Test {
    private volatile static Test test;
    private Test(){}
    public static Test getInstance(){
        if (test==null){
            synchronized(Test.class){
                if (test==null){
                    test=new Test();
                }
            }
        }
        return test;
    }
}
