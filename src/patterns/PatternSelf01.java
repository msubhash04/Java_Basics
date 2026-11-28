package patterns;

public class PatternSelf01 {
    public static void main(String[] args) {
        /*
                            0
                           101
                          01010
                         1010101
                        010101010
         */

        int n=5;

        for(int i=1;i<=n;i++){
            //Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum%2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }

            int number=1;
            for(int j=2; j<=i; j++){
                if(number==1) {
                    System.out.print("1");
                    number--;
                }else{
                    System.out.print("0");
                    number++;
                }
            }

            System.out.println();
        }
    }
}
