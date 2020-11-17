public class Demo19 {
    public static void main(String[] args) {
        int i =11,j = 5;
        switch(i /j)

        {
            case 3:

                j += i;

            case 2:

                j += 4;//注意这里没有break
            case 4:

                j += 5;//注意这里没有break

            case 1:

                j += 1;
                break;//到这才跳出Switch

        }

        System.out.println(j);
    }
}
