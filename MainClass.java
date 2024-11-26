package conn;

abstract class Myclass{
}

public class MainClass{
    public static void main(String args[]){
          MainClass mainclass = new MainClass(); //error
          
    }
}

abstract class Shape{
  abstract public void area();
  public void display(){
  }
}

class Square extends Shape{
   public void area(){
        int l=7;
        int area = l*l;
       System.out.println("area="+area);
   }
}
