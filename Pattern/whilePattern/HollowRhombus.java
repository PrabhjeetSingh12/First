package Pattern.whilePattern;

public class HollowRhombus {
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
                if(i==1||i==n||k==1||k==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                k++;
            }
            i++;
            System.out.println();
        }
    }
}
