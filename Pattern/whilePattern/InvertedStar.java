package Pattern.whilePattern;

public class InvertedStar {
    public static void main(String[] args) {
        int i=1;
        int n=4;
        while(i<=n){
            int j =1;
            while(j<=(4-i)+1){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    
}
