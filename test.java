class test {
    static String bankname= "canara";
            String accountname= "shweta ";
            long accno=1234566678797l;

    public static void test1(){
      System.out.println(bankname);
      bankname="helo";


    }

    public void test2(){
        System.out.println(accountname);
        System.out.println(accno);
    }

    public static void main(String[] args) {
        new test().test2();  
        System.out.println(new test().accountname);
      }


    
}
