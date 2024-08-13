package Pattern.whilePattern;

public class HalfPyramid {
    public static void main(String[] args) {
        int n=4;
        int i=1;
        while (i<=n) {
            int j =1;
            int number =1;
            while(j<=i){
                System.out.print(number);
                number++;
                j++;
            }
            i++;
            System.out.println();
        }
    }
    
}
