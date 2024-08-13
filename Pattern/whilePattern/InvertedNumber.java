package Pattern.whilePattern;

public class InvertedNumber {
    public static void inverted(int n){
        int i =1;
        
        while(i<=n){
            int j =1;
            int number=1;
            while(j<=(n-i+1)){
                System.out.print(number);
               j++;
               number++;
            }
            i++;
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        inverted(4);
    }
}
