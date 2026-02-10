class demo{
    public demo(int a){
     super();
        System.out.println(a);
    }
}

class demo1  extends demo{
    public demo1(){
          super(10);
           int b=20;
        System.out.println(b);
    }
}


class superstatement {
    public static void main(String[] args) {
        demo1 d1=new demo1();
     
    }
}
