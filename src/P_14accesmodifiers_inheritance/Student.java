package P_14accesmodifiers_inheritance;

public class Student {

    /*
    public=her classtan cagirip kullanabilirim
    private= sadece icinde bulundugu classta kullanabilirim
    default=baska packageden kullanilamazlar sadece icinde olan package icinden kullanilabilirler
    protected= icinde bulundugu packageden ve child classlarindan kullanilabilirler

    ==> public> protected > default> private

     */
    public String name="Ali Can";
    protected String adress="Istanbul";
    private String sttId="123asd123";
    String email="alican@gmail.com";

}
