package java0409;

public class User {

	public User()
	{
		usernames = new String[] {"abcd","hello"};
		psw = new String[] {"123","123456"};
	}
	
	String username;
	String password;
	
	String[] usernames;
	String[] psw;
	
	public boolean checkUser(String username,String password)
	{
		for(int i=0;i<usernames.length;i++)
		{
			if(usernames[i].equals(username) && psw[i].equals(password))
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
}
