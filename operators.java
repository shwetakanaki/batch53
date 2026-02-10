class operators {
    public static void main(String[] args) {

        // operators :  it do some operartion based on the operands 
        // types of operators :
        // 1. Arithmetic operators : + , - , * , / , %, ++ , -- 
        //relational operators :  > , < , >= , <= , == , != boolean
        //logical operators :  && , || , !
        //assignment operators :  = , += , -= , *= , /= , %=      
        // bitwise operators :  & , | , ^ , ~ , << , >> , >>>  
        int a = 10;
        int b = 20;
        int c=60;
        // arithmetic operators
        // System.out.println("addition :" + (a+b));  // 30
        // System.out.println("subtraction :" + (a-b));  // -10
        // System.out.println("multiplication :" + (a*b)); //200
        // System.out.println("division :" + (a/b));  // 0
        // System.out.println("modulus :" + (a%b));// 10
        // System.out.println("a++ = " + (a++));  //  10
        // System.out.println("a++ = " + a); //11
        // System.out.println("++a =" + (++a)); // 12
        // System.out.println(a);
        // System.out.println("--a = " + (--a)); // 11
        // System.out.println("a-- = " + (a--)); //
        // System.out.println(a);  //10


        // relational operators
        // System.out.println("a>b:" + (a>b));   //false 
        // System.out.println("a<b:" + (a<b));   //true
        // System.out.println("a<=b:" + (a<=b));// true
        // System.out.println("a>=b:" + (a>=b)); //false
        // System.out.println("a==b:" + (a==b)); //false
        // System.out.println("a!=b:" + (a!=b)); //true

        // //logical operators
        // System.out.println((a>b) && (a>c)); 
        // System.out.println((a<b) && (a<c));

        // System.out.println((a>b)|| (a<b));
        // System.out.println((a>c)&& ((a<c)|| (b<c)));
        // System.out.println(!((a>c)&& ((a<c)|| (b<c))));

        //bitwise operators
        // System.out.println(a & b);   
        // System.out.println(a | b);
        // System.out.println(a<<2);
        // System.out.println(b>>2);
        
       // assignment operators
       a += 4;  // a+4
       System.out.println(a);
       a -=5 ; //a-5
         System.out.println(a);
    }
    
}
