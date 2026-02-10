class parent{
public static  void test(){
    System.out.println("this is the test() method of the parent class ");
}
}

class test extends parent{

}

class child extends  test {
public static void test1(){
    System.out.println("this is the test1() method of the child class ");
}
}


class inheritance {
    public static void main(String[] args) {
    child.test1();
    child.test();
    }


}


// single level
// multilevel 
// multiple level
// hybrid
//hirarchy


//         * * * * 
             * * *
               * *
                 *
                 
//         A B C 
//         A B C
//         A B C

* * * * *
 * * * *
  * * *
   * * 
    *
   * *
  * * *
 * * * *
* * * * *  
