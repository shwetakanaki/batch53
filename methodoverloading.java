class methodoverloading{
// creating multiple method with same name 
//    by changing the no of parameter 
//    datatype of parameter
//    position of the parameter

public static void test(){
System.out.println("this is the zero parametraised test() method ");
}
public static void test(int a){
System.out.println("this is the  parametraised test() method :"+ a);
}
public static void test(float  b,float a ){
    System.out.println("this is the zero parametraised test() method "+ a+ " "+b);
    
}
public static void test(int  b,float a ){
    System.out.println("this is the zero parametraised test() method "+ a+ " "+b);
    
}
    public static void main(String[] args) {
        test();
        test(1);
        test(3.0f,4);
        test(2,7);
}
}
// 