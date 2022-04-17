// Boolean Algebra Expression

public class bool {
    public static void main(String[] args) {
        boolean 
            x = true, 
            y = true, 
            z = true;
    
        boolean 
            LHS, 
            RHS;

        LHS = x || y && (z || !x && !z);
        RHS = x || y || y && z;

        System.out.print(LHS == RHS?true:false);
    }  
}