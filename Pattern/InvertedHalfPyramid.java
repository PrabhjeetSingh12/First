package Pattern;

public class InvertedHalfPyramid{
    public static void InvertedHalfpyramid(int n)
    {
        //outer
        for(int i =1;i<=n;i++){
            //spaces
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");

            }
            System.out.println();
        }
}
    public static void main(String[] args) {
        InvertedHalfpyramid(4);
    }
}