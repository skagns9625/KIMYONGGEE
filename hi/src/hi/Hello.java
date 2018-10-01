//2015041083 김용기
package hi;
import java.util.Scanner;

public class Hello {
   
   public static void main(String[] args) {
	   
	  Scanner scanner = new Scanner(System.in);
      System.out.println("2015041083 김용기");
      System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
      int a1 = scanner.nextInt();
      int b1= scanner.nextInt();
      int c1= scanner.nextInt();
      
      System.out.print("두번째 원의 중심과 반지름 입력 >>> ");
      int a2 = scanner.nextInt();
      int b2= scanner.nextInt();
      int c2= scanner.nextInt();

      int x = ((a1-a2)*(a1-a2)) + ((b1-b2)*(b1-b2));
      int y = (c1+c2)*(c1+c2);
      
      if(x>y)
         System.out.print("두 원은 서로 겹치지 않는다");
      else
         System.out.print("두 원은 서로 겹친다.");
     
   }
}
