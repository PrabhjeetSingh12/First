package Pattern;

public class CharPattern { public static void main(String[] args){
    int n =4;
    char ch = 'a';
    for(int line=1;line<=n;line++){
        for(int number = 1;number<=line;number++){
            System.out.print(ch++);
            
        } 
        System.out.println();
    }
}
    
}
