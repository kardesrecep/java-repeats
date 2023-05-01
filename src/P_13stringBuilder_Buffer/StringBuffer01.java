package P_13stringBuilder_Buffer;

public class StringBuffer01 {
    public static void main(String[] args) {
        /*
         Java'da StringBuffer, değiştirilebilir bir karakter dizisi oluşturmak için
         kullanılan bir sınıftır. StringBuilder sınıfı ile benzer özelliklere sahiptir,
          ancak StringBuffer sınıfı, aynı zamanda thread-safe (çoklu işlemci desteği)
           özelliklerine sahiptir.

StringBuffer sınıfı, StringBuilder sınıfına benzer şekilde, karakter dizisinde değişiklik
yapmak için bir dizi yöntem sağlar. Ancak, bu yöntemlerin çoğu synchronized anahtar kelimesi
 ile tanımlanır ve bu nedenle StringBuffer sınıfı, aynı anda birden fazla işlemcinin aynı
 nesneye erişmesine izin verir.

StringBuffer sınıfı, StringBuilder sınıfına göre biraz daha yavaş olabilir çünkü
 thread-safe olması için senkronizasyon işlemlerini gerçekleştirir. Ancak, aynı anda
 birden fazla işlemcinin aynı String nesnesine erişmesi gerektiğinde veya çoklu
 işlemci desteği gerektiğinde kullanılabilir.
İşte bir örnek kod parçası, StringBuffer kullanarak String'in karakterlerini
tersine çeviriyor:

String originalString = "Merhaba, Dünya!";
StringBuffer sb = new StringBuffer(originalString);
String reversedString = sb.reverse().toString();
System.out.println("Ters çevrilmiş string: " + reversedString);



Bu örnekte, StringBuffer nesnesi oluşturuyoruz ve reverse()
yöntemini kullanarak String'in karakterlerini tersine çeviriyoruz.
 Daha sonra, tersine çevrilmiş String'i toString() yöntemini kullanarak String'e dönüştürüyoruz
  ve sonucu ekrana yazdırıyoruz.
         */
        String originalString = "Merhaba, Dünya!";
        StringBuffer sb = new StringBuffer(originalString);
        String reversedString = sb.reverse().toString();
        System.out.println("Ters çevrilmiş string: " + reversedString);
    }
}
