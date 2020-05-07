package sample.Classes;

public class User
{
	private String login;
	private Passwords passwords;

	public User(String login, String password)
	{
		this.login = login;
		this.passwords = new Passwords(password);
		if (!passwords.getPasswords().get(0).isActive()) {
			this.passwords.getPasswords().set(0, Password.generateRandomly());
		}
	}

	@Override
	public String toString()
	{
		return "login='" + login + ", passwords=" + passwords;
	}

	public String getLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public Passwords getPasswords()
	{
		return passwords;
	}

	public void setPasswords(Passwords passwords)
	{
		this.passwords = passwords;
	}
}
