package P_05stringManipulations;

public class SM04 {
    public static void main(String[] args) {
        String a=" Java kolaydir";
        System.out.println(a.replaceFirst("a","A"));

        System.out.println(a.concat(" ,anladin mi"));
        System.out.println("a.trim() = " + a.trim());
        String h="java";
        String i="javA";
        System.out.println(h.compareToIgnoreCase(i));
        System.out.println("a.repeat(\"av\") = " + a.repeat(5));

    }
}
