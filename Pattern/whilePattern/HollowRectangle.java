package Pattern.whilePattern;

public class HollowRectangle {
    public static void main(String[] args) {
        int totRows =4;
        int i =1;
        int totColumn=5;
        while(i<=totRows){
            int j=1;
            while(j<=totColumn){
                if(i==1 || i==totRows || j==totColumn || j==1){
                    System.out.print("*");
                   
                }
                else{
                    System.out.print(" ");
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }
    
}
