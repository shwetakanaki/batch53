class controlstatements {
    // control statements: which helps to control the execution of the program
    // types of control statements:
    // 1. decision making/ conditional statements: if , if-else , nested if , switch

    //if statement:
    //Syntax:
    // if(condition){
    //     block of code to executed 
    // }
    // else{
    //     block of code to be executed 
    // }
    public static void main(String[] args) {
       

    // if(a>b){   // true
    //    System.out.println("a is less than b"); 
    // }
    // else {
    //      System.out.println("a is greater than b");
    // }


// if-else if 
// syntax:
//   if(condition){
//         // block of code to executed
//   }
//   else if(condition){
//         // block of code to be executed
//   }      
    
//  else if(condition){
//         // block of code to be executed
//   } 
//   else{

//   }
// int a=30;
// int b=50;
// int c=90;
//   if(a>b){  // flase
//     System.out.println("a is greater than b");

//   }
//   else if(a>c){  //false 
//     System.out.println("a is greater than c");
//   }
//   else if(a<b){ //true
//     System.out.println("a is less than b");
//   }
//   else if(a<c){
//     System.out.println("a is less than c");
//   }
//   else{
//     System.out.println("none of the condition is true");
//   }






// if(a!=b){  //true
//     System.out.println("a is greater than b");

//   }
// if(a<c){  //true 
//     System.out.println("a is greater than c");
//   }
// if(a<b){ //true
//     System.out.println("a is less than b");
//   }
// if(a<c){
//     System.out.println("a is less than c");
//   }
//   else{
//     System.out.println("none of the condition is true");
//   }
    


// int n=20;
// if(n>=2 && n<10  && n%2==0){
//     System.out.println(n);
// }
// else if(n>=10 && n<21 && n%2!=0 ){
//     System.out.println("odd number");
// }
// else if(n>=21){
//     System.out.println("hello world");
// }
// else {
//     System.out.println("invalid number");
// }

// int a=20;
// int b=90;
// int c=80;

// if (a==2&& b==2 && c==2){
//     System.out.println("10");
// }
// else if(a==b && b==c && c!=a){
//     System.out.println("2");
// }
// else if(a==2 && b==2 && c!=2){
//     System.out.println("5");
// }

// else{
//     System.out.println("0");

// }

// nested if statement: 
// Syntax: 
// if (condition){
//     if(condition){
//         if(condition){
//             // block of code to be executed
        
//         }
//         else{
//  // block of code to be executed
//         }
//     }
//     else{
//  // block of code to be executed
//     }
// }
// else{
//  // block of code to be executed
// }

int a=10;
int b=80;

if(a<b){   //true
    if(a>0){  // true
   System.out.println("a is a positive number and less than b");
    }
    else{
        System.out.println("a is a negative number and less than b");
    }
}
else{
    System.out.println("a is greater than b");
}

}
}

