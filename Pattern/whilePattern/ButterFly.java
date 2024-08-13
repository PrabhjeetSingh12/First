package Pattern.whilePattern;

public class ButterFly {
    public static void main(String[] args) {
        int n =4;
        int i =1;
        while (i<=n) {
            int j =1;
            while (j<=i) {
                System.out.print("*");
                j++;
            }
            
            int k=1;
            while (k<=2*(n-i)) {
                System.out.print(" ");
               k++; 
            }
            int l =1;
            while (l<=i) {
                System.out.print("*");
                l++;
            }
            i++;
            System.out.println();
        }

        int m =n;
        while (m>=1) {
            int j =1;
            while (j<=m) {
                System.out.print("*");
                j++;
            }
            
            int k=1;
            while (k<=2*(n-m)) {
                System.out.print(" ");
               k++; 
            }
            int l =1;
            while (l<=m) {
                System.out.print("*");
                l++;
            }
            m--;
            System.out.println();
        }
    }
    
}
