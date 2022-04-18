public class array {
   public static void main(String[] args) {
       int sum = 0;
        Object[] obj = new Object[] {0, 1, 2, 3, 4, 5};
        
        for (int i = 0; i < obj.length; i++) {
            sum += (int) obj[i];
            System.out.println(obj[i].getClass());
        } System.out.println(sum);

        // if (obj[1] + obj[3] == obj[5]);
   } 
}
