package P_11PassByValue;

public class MO02 {
    /*
    Method overloading, bir sınıfta birden fazla metot tanımlamanın bir yoludur.
     Bu yöntem, aynı isme sahip farklı parametrelerle farklı davranışlar
      gerçekleştiren metotları tanımlamanıza olanak tanır.

Java'da bir metot nasıl aşırı yüklenir:

Bir sınıfta birden fazla metot tanımlayın.
1-Metotların isimleri aynı olmalıdır, ancak parametrelerin sayısı veya türü farklı olmalıdır.
2-Metotların geri dönüş türleri aynı olabilir veya farklı olabilir.
3-Metotlar arasında en uygun olanı, çağrıldığında seçilir.
Örnek olarak, aşağıdaki Java kodunu göz önünde bulundurun:
     */
    public static void main(String[] args) {
    }
        public int sum(int x, int y) {
            return x + y;
        }
        public int sum(int x, int y, int z) {
            return x + y + z;
        }
        public double sum(double x, double y) {
            return x + y;
        }
    }


