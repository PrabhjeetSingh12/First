package Pattern.whilePattern;

public class Triangle0_1 {
    public static void main(String[] args) {
        int n =5;
        int i=1;
        while (i<=n) {
            int j=1;
            while (j<=i) {
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
