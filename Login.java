import java.util.*;
class Login{
	public static void main(String[] args){
		String email,password;
		String[][] userinfo = { {"huteu@gmail.com","ueuuoeau"}, {"oeuuoeu@hotmail.com","1111111ueu1"},{"euaoeuoe@yahoo.com","ueaouaoeuo"},
        {"uoeuoeuoea@gmail.com","oeuaoeuoeu"},{"ueouoaeuo@gmail.com", "euaouoaeu"}};

            System.out.println("welcome to pakistan ARMY'S WEBSITE ");
			Scanner obj = new Scanner(System.in);

			System.out.println("Enter Your Email Address: ");
			email = obj.next();
            System.out.println("Enter Your Password: ");
			password = obj.next();
        
                int i;
                boolean AccountExists = false;

                for( i=0;i< userinfo.length;i++){
                    if(userinfo[i][0].equals(email)) {
                        AccountExists = true;
                        
                        if( userinfo[i][1].equals(password))  {
                            System.out.println(" you are login ");
                            break;
                        }
                    }
                }
                if(i == userinfo.length)  
                  System.out.println(":Invalid Credentials");

                if(AccountExists)  
                  System.out.println(":Account Exists");
                else
                  System.out.println(":Account Doesn't exists");
 
        }
}
