package patterns;

public class ButterflyPattern {
    public static void main(String[] args) {
        /*
                        *          *
                        **        **
                        ***      ***
                        ****    ****
                        *****  *****
                        ************
                        ************
                        *****  *****
                        ****    ****
                        ***      ***
                        **        **
                        *          *
        */
        int n=6;

        for(int i=1;i<=n;i++){
            //Print the left stars...
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //Print the spaces...
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //Print the right stars...
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            //Print the left stars...
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //Print the spaces...
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //Print the right stars...
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
