class looping {
   public static void main(String[] args) {
    // looping statements: block of code will execute continiuously until certain condition gets false 
    // 3 types of looping statements in java
    // 1. for loop
    // 2. while loop
    // 3 . do-while loop

// for loop : when you know the where to stop / number of iterartions 
// syntax: 
// for (initialization; condition; increment/decrement){
//     // block of code to be executed
//    } 


// for (int i=0;i<5;i++){
//     System.out.println(i);
// }


// nested for loop:
//syntax :
// for(initialization; condition; increment/decrement){
//    for (initialization; condition; increment/decrement){
//        block of code to be executed
//    }
//   }
// }

//ex:
// for(int i=0;i<=3;i++){   // outer for loop 
//     for(int j=0;j<=3;j++){  // inner for loop
// System.out.println("i value:"+i +"  j value :"+j);
//     }
// System.out.println();
// }


// for(int i=1;i<4;i++){
//     for(int j=1;j<3;j++){
//         System.out.println(i+","+j);
//     }
// }



// pattern matching 

// * * * 


// for(int i=1;i<4;i++){
//     System.out.print("*"+" ");
// }


// * * * 
// * * *
// * * *

// for(int i=1;i<4;i++){
//     for (int j=1;j<4;j++){
//         System.out.print("*"+" ");
//     }
//     System.out.println();

// }


// 1 2 3
// 1 2 3
// 1 2 3
// for(int i=1;i<4;i++){
//     for (int j=1;j<4;j++){
//         System.out.print(j+" ");
//     }
//     System.out.println();

// }

//*
//* * 
//* * * 

// for(int i=1;i<4;i++){   // 3 //4
//     for (int j=1;j<=i;j++ ){ // 1 
//         System.out.print(j +" ");
//     }
//     System.out.println();

// }

//1
//1 2
//1 2 3

//1 2 3
//4 5 6
//7 8 9
// int a=1;
// for (int i=1;i<4;i++){
//     for (int j=1;j<4;j++){
//     System.out.print(a+" ");
//     a++;

//     }

//     System.out.println();
// }


//1 
//2 3
//4 5 6

//while loop : while can used used when you dont know exact end or iterartion to stop 
// Syntax:
// while(condition){
//     block of code to be executed 
// }

// example:
boolean x=true;
while(x==true){  // true   false==true   
    System.out.println("cloud");
    x=false;
}


// int a=1;
// while(a<5){  //true ,5 false
//     System.out.println(a);  //2  3 4 
//     a++;  //1++ =2   3 4 5
// }


// while(a>10){
//     System.out.println(a);
//     a--;
// }

// do while loop  :  before checking the condtion(true / false ) of while atleast one time the stament has to ececute 

// synstax:
// do {
//     block of code
// }while(condition);



int a=1;
//ex:
do{
    System.out.println(a);
    a++;
}while(a<10);   // false 

   }

}

