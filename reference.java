class reference{
    public reference(){
        System.out.println("this is the constructor");
    }
public void test(){
    System.out.println("non static method ");
}

public static void main(String[] args) {
    reference d2= new reference();
 reference d3=new reference();
    System.out.println(d2);
    System.out.println(d3);

    reference d4=d2;
  System.out.println(d4);
// d2.reference();  // can not be called 
// reference d2=new reference(); // can not be created with reference variable 


}
}