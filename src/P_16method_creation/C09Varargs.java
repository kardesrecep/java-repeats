package P_16method_creation;

public class C09Varargs {

    public static void main(String[] args) {
        test(5);
        varArgs(10 ,new int[] {1,2,3});
    }

    private static void varArgs(int a, int... numbers) {

        int z=numbers[0];
        int y=numbers[1];
        System.out.println((z*a) + (y*a));

    }

    private static void test( final int x) {
        //x=10;
        System.out.println(x);
    }




}
