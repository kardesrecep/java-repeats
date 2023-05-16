package P_18Oop.EncLab02;

public class Square {
    private int x;
    private int y;
    private int length;

    public int getX() {
        return x;
    }

    public void setX(int x) {
      if (x>=0){
          this.x=x;

      }else {
          System.out.println("x should be grater than -1");
      }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y >= 0) {
            this.y = y;

        } else {
            System.out.println("y should be grater than -1");
        }
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {

        if (length>=0){
            this.length = length;
        }else{
            System.out.println("length should be grater than 0");
        }


    }
    public void showResult(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("length = " + length);

    }

}
