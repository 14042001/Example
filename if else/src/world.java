import java.util.Scanner;

public class world{
       public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("weekendplan:\n\tenter 1 for movies\n\tenter 2 for shopping\n\tenter 3 for eating out\n\tenter 4 for no plan");
       System.out.println("Enter your option");
       int num =sc.nextInt();
       if (num==1){
          	System.out.println("going for movies");
       }else if(num==2){
            System.out.println("going for Shopping");
       }else if(num==3){
            System.out.println("eating out");
       }else if(num==4){
            System.out.println("no plan");
       }else{
            System.out.println("enter valid option");
       }
       sc.close();
       
     
}
}
