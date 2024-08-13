package Pattern.whilePattern;

public class FloydsTriangle {
    public static void main(String[] args) {
        int n=5;
        int i =1;
        int number=1;
        while(i<=n){
            int j=1;
            while (j<=i) {
                System.out.print(" "+number);
                j++;
                number++;
            }
            i++;
            System.out.println();
        }
    }
    
}
