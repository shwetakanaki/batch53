class demo1{
static int a=20;   // data members of the class 
public static void test(){
    System.out.println("this is the test() method variable="+a);

}

public void test1(){
    demo1 d1=new demo1();
    System.out.println("this is the test1() method "+d1.a);
}

public void test2(){
test1();

}
}


class demo {
    public static void main(String[] args) {
      System.out.println(demo1.a);  
      demo1.test();
      demo1 d2=new demo1();
      d2.test1();
      d2.test2();


    }
}
