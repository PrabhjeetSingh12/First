package Pattern.whilePattern;

public class SolidRhombus {
    public static void main(String[] args) {
        int n =5;
        int i=1;
        while (i<=n) {
            int j=1;
            while (j<=n-i) {
                System.out.print(" ");
                j++;
            }
            int k=1;
            while (k<=n) {
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println();
        }
    }
    
}
