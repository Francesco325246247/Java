package login;

public class Login {

		public static boolean validateUser(String usr, String pwd){
			
			if (usr.equals("Francesco")&& pwd.equals("328452")){
			return true;
			
			} if(usr.equals("Marina")&& pwd.equals("iwark")){
				return true;
			}
			return false;
		}

		}

