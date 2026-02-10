final class constructor {
    // it is same name as class name 
    // it holds the multiple copy of the object 
    // sysntax:
    // access specifier class_name(parameters){
    // block of code 
//}

// two types 
// zero parametraised 
// parametraised 

// public constructor(){  // zero parametraised 
//     int a=50;
//     int b=40;
//     System.out.println("addition"+ (a+b));

// }

constructor(int a){  // parametraised 
    int b=30;
    System.out.println("addition :"+(a+b));
}


// if you do not create the constructor the jvm will create the constructor while creating object 

public static void main(String[] args) {
    // constructor c1= new constructor();
    constructor c2= new constructor(10);

}

}
