class constoverloading {
    // creating multiple constructor with same name in the class 
    // by differing in no of parameters 
    // position of the parameter
    
public constoverloading(){
System.out.println(" this is the constoverloading() constructor ");
}

public constoverloading(int a){
System.out.println(" this is the constoverloading(int a) constructor ");
}

public constoverloading(float a,int b , int c){
System.out.println(" this is the constoverloading(int a, int b , int c) constructor ");
}

    public static void main(String[] args) {
        new constoverloading();
        new constoverloading(4);
        new constoverloading(2,4,56);
        
    }
}
