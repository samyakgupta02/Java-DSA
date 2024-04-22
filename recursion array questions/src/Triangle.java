public class Triangle {
    public static void main(String[] args) {

    }

    static void triangle(int r,int c){
        if ( r == 0){
            return;
        }
        if(c<r){
            System.out.println("*");
            triangle(r,c+1);

        }else{
            System.out.println("*");
            triangle(r+1,c);
        }


    }
}
