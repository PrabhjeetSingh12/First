package Pattern.whilePattern;

public class InverRotHalf {

    public static void inverted(int n){
        int i=1;
    

    while(i<=n){
        int j =1;
        while(j<=n-i){
            System.out.print(" ");
            j++;
        }
        int k =1;
        while (k<=i) {
            System.err.print("*");
            k++;
        }
        i++;
        System.out.println();


    }
}  
    public static void main(String[] args) {
        inverted(4);
    }
}
