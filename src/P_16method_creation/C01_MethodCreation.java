package P_16method_creation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        System.out.println("new C01_MethodCreation().max(1,2) = "
                + new C01_MethodCreation().max(1, 2));
        //eger method static olarak yazilmasza newlenerek o newlenmis method uzerinden cagirilma yapilabilir
        //aksi takdirde "static " ibaresi eklenerek static olan main method icinden cagrilip kullanilir
int sonuc= new C01_MethodCreation().topla(3,5);
        System.out.println(sonuc);
    }
    public int topla(int x, int y){
        int toplam=x+y;
        return toplam;
    }


    public int max(int x, int y){
        if(x>y){
            return x;
        }
        return y;
    }



}
