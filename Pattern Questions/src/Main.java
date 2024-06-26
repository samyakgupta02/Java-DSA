public class Main {
    public static void main(String[] args) {
        pattern4(4);

    }

    static void pattern1(int n){
        for(int i =1;i<=n;i++){
            //for every row, run the columns
            for(int j = 1;j<=i;j++){
                System.out.print(" * ");
            }

            //when one row is printed, we need to add a new line
            System.out.println();
             
        }
    }

    static void pattern2(int n){
        for(int i =1;i<=n;i++){
            //for every row, run the columns
            for(int j = 1;j<=n;j++){
                System.out.print(" * ");
            }

            //when one row is printed, we need to add a new line
            System.out.println();

        }
    }

    static void pattern3(int n){
        for(int i =1;i<=n;i++){
            //for every row, run the columns
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(" * ");
            }

            //when one row is printed, we need to add a new line
            System.out.println();

        }
    }

    static void pattern4(int n){
        for(int i =1;i<=n;i++){
            //for every row, run the columns
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }

            //when one row is printed, we need to add a new line
            System.out.println();

        }
    }
}