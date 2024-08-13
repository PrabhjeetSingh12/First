package Pattern.whilePattern;

public class Diamond {
    public static void diamond(int n){
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
            j++;
            }
            int k=1;
            while(k<=(2*i-1)){
                System.out.print("*");
            k++;
            }
            i++;
            System.out.println();
        }

        int l=n;
        while(l>=1){
            int j=1;
            while(j<=n-l){
                System.out.print(" ");
            j++;
            }
            int k=1;
            while(k<=(2*l-1)){
                System.out.print("*");
            k++;
            }
            l--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond(7);
    }
}
