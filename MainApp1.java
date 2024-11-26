package java8feature;

//functional interface with argument lambda expression



@FunctionalInterface
interface MyInterfacee{
   void add();


  
  }


@FunctionalInterface
interface MyInterface1{
	void sub(int i, int j); //with arg and no return type
}
@FunctionalInterface
interface MyInterface2{
	int mult(int i, int j);
}


////Lambda Expression->Functional Interface
//class MyClass implements MyInterface{
//   public void add(){
//       System.out.println("Add method");
//    }
//}


//using Lambda expression write functional interface convert your lowercase string to uppercase
public class MainApp1{
   public static void main(String args[]){
//          MyClass obj = new MyClass();
//            obj.add();


       //Annonymous class
//       MyInterface obj1 = new MyInterface(){
//    	   public void add() {
//            System.out.println("Add method");
//    	   }
// 
//      };
//      obj1.add();


     //Using Lambda Expression ,method with no arg and no return type
      MyInterfacee obj2 = ()->{
           System.out.println("Add method");


      };
      obj2.add();
     
//      MyInterface1 obj3 =(i,j)->{
//    	  int r=i-j;
//    	   System.out.println("The difference of two nos="+r);
//      };
//      obj3.sub(6,3);
      
    MyInterface1 obj3 =(i,j)->System.out.println("The difference of two nos="+(i-j));
          obj3.sub(6,3);
          
//     MyInterface2 obj4 =(i,j)->{
//    	 return i*j;
//     };
     
          MyInterface2 obj4 =(i,j)->(i*j);
          
     System.out.println("Product of two numbers ="+obj4.mult(7, 8));
   }
}

