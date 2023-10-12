
package scanner1;

import java.util.Scanner;
public class Scanner1 {

    
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); 
      
        System.out.println("unsay ngan nimo? ");
        String name = scan.nextLine();
        System.out.println("pila pod imo edad? ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("unsa na imung ge kaon? ");
        String food = scan.nextLine();
       
        
        System.out.println("ako ni si "+ name);
        System.out.println("akong edad kay "+ age);
        System.out.println("akong ge kaon kay "+ food);
    }
    
}
