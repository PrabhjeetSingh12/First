package Pattern.whilePattern;

public class Character {
    public static void main(String[] args) {
        int n =4;
        int i =1;
        char ch = 'A';
        while (i<=n) {
            int j =1;
            while (j<=i) {
                System.out.print(ch);
                ch++;
                j++; 
            }
            i++;
            System.out.println();
        }
    }
}
