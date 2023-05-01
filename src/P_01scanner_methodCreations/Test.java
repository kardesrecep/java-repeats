package P_01scanner_methodCreations;

public class Test {
    public static void main(String[] args) {
        System.out.println((Test.test()));
    }
    public static String test(){
        try {
            System.out.println("try");
            throw new Exception();
        }catch (Exception e){
            System.out.println("catch");
            return "return";
        }finally {
            System.out.println("finally");
            return "return in finally";
        }
    }

    


}
