package patterns;

public class InvertedLeftHalfPyramid {
    public static void main(String[] args) {
      /*
                ****
                 ***
                  **
                   *
        */
        int n=4;

        for(int i=n;i>=1;i--){
            //The for loop to print spaces.
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //The for loop to print *
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
