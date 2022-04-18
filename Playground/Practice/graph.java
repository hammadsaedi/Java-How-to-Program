public class graph {
   public static void main(String[] args){
       int[] a = {1,2,3,4,5}, b ={2,4,6,8,10};
       
       for(int i = a.length; i > 0; i--){
            System.out.printf("%d|",i);
            for (int j = i - 1; j > 0; j--){
                System.out.print("\t");             
            } 
            System.out.println("\t0");
       }

    //    for (int i = 0; i < b.length; i++){
    //         System.out.print("---");
    //     } System.out.println();
       
        System.out.printf("0|\t");
        for (int i = 1; i <= b.length; i++){
            System.out.print(i + "\t");
        } 
   } 
}
