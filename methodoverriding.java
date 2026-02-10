



public class methodoverriding {
    
// decleration of the method will be similer but changing the defination the method 
// it has have the inheritance 
//method should be non static only
public static void main(String[] args) {
  test1 t1= new test1();
t1.demo2();  
}


}


class test{
  public  void demo2(){
      System.out.println("this is teh demo() method of test class");
    }
}

class test1 extends  test{
   @Override
   public  void demo2(){
      System.out.println("this is teh demo() method of test1 class");
    } 
}


