
package userlogin;
import java.util.Scanner;
import javax.xml.transform.Source;
public class UserLogin {
public static void main(String[] args) {
Scanner inp = new Scanner(System.in);
String userName , Password;
   
    System.out.println("Kullanıcı adı giriniz : ");
    userName = inp.nextLine();
    System.out.println("Şifre giriniz : ");
    Password = inp.nextLine();
    
    
  if (userName.equals("Zey") && Password.equals("java"))
        System.out.println("Giriş yaptınız.");
  
  else 
      System.out.println("giriş bilgileriniz hatalı.");
  
    
    }
    
}
