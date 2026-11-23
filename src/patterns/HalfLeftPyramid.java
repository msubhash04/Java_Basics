package patterns;

public class HalfLeftPyramid {
    public static void main(String[] args) {
        /*
           *
          **
         ***
        ****
         */
        int n=4;

        for(int i=1;i<=n; i++){
            //Inner loop for printing the spaces.
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
