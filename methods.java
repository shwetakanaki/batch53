class methods {
    // it is set of block of instruction or code which will execute whenever  the being called 
    //syntax:
    // access_specifiers access_modifiers retur_type funaction_name(parameters){
//     block of code 
// }


//access_specifirs : public, private, final,protected
// access_modifiers: static, non static 
// return type : void , data types 

// public static void demo(){  // function decaleration
//     System.out.println("this is the demo() method ");  // function defination
// }

//two types :
// user defined : two types:
// zero parametrised , parametriased 

public static void demo(){  // function decaleration
    System.out.println("this is the demo() method ");  // function defination   // called function
}


// parametraise funcion 
public static void demo1(int a,int b,char s){
    System.out.println("this is the demo1() method a value is:  " +a+" b value is :"+b +"s value is :"+s);
}
public static void main(String[] args) {  // calling function 
    demo();
    demo1(40,70,'d');
    
}

//note: no of parameters passed in the function decleration those many no of arguments should be passed while calling the function
// built in: main(), length(),sizeof() etc 


}



// why ?
//code reusability
//code modularity  
