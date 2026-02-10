class task {
    public static void main(String[] args) {
        int a=5;

        // for (int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(a+" ");
        //         a++;
        //     }
        //     a='A';

        //     System.out.println();
        // }
        for( int i=0;i<5;i++){
            for(int k=0;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<a;j++)
            {
                System.out.print("*"+" ");
                
            }
          
            System.out.println();
              a--;
        }
    }
}
