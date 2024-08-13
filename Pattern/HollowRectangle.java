package Pattern;

public class HollowRectangle {
    public static void Hollow_Rectangle(int totRows,int totColumn){
        //outer loop
        for(int line=1;line<=totRows;line++){
            //inner column
            for(int j=1;j<=totColumn;j++){
                if(line==1 || line== totRows || j==1 || j==totColumn){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
    public static void main(String[] args){
        Hollow_Rectangle(10,5);
        
    }
    
}
