package P_06loops;

public class ForLoops4 {
    public static void main(String[] args) {
        String str="Andromegadmmrg;al;";
        for (int i =0 ; i <str.length() ; i++) {
            char c=str.charAt(i);
            if (c!='m'){
                System.out.print(c);

            }
        }
    }
}
