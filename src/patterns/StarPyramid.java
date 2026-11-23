package patterns;

public class StarPyramid {
    public static void main(String[] args) {
      /*
                             *
                            ***
                           *****
                          *******
                         *********
                        ***********
        */
        int n=6;

        for(int i=1;i<=n;i++){
            //For loop to print the spaces.
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //For loop to print the stars left side.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //For loop to print the stars right side.
            for(int j=1; j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
