//2015041083 ����
package hi;
import java.util.Scanner;

public class Hello {
   
   public static void main(String[] args) {
	   
	  Scanner scanner = new Scanner(System.in);
      System.out.println("2015041083 ����");
      System.out.print("ù��° ���� �߽ɰ� ������ �Է� >> ");
      int a1 = scanner.nextInt();
      int b1= scanner.nextInt();
      int c1= scanner.nextInt();
      
      System.out.print("�ι�° ���� �߽ɰ� ������ �Է� >>> ");
      int a2 = scanner.nextInt();
      int b2= scanner.nextInt();
      int c2= scanner.nextInt();

      int x = ((a1-a2)*(a1-a2)) + ((b1-b2)*(b1-b2));
      int y = (c1+c2)*(c1+c2);
      
      if(x>y)
         System.out.print("�� ���� ���� ��ġ�� �ʴ´�");
      else
         System.out.print("�� ���� ���� ��ģ��.");
     
   }
}
