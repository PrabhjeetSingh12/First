package Pattern;

public class FloydsTriangle {
    public static void Triangle(int n){
        //outer 
        int number =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Triangle(5);
    }
}
