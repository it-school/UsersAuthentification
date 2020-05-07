package sample.Classes;

import java.util.ArrayList;

public class Passwords
{
	private ArrayList<Password> passwords;

	public Passwords(String password)
	{
		this.passwords = new ArrayList<>();
		this.passwords.add(new Password(password));
	}

	@Override
	public String toString()
	{
		return "Passwords{" + passwords +'}';
	}

	public ArrayList<Password> getPasswords()
	{
		return passwords;
	}

	public void setPasswords(ArrayList<Password> passwords)
	{
		this.passwords = passwords;
	}

	public boolean add(String password)
	{
		if (canBeAdded(password)) {
			for (Password pass:passwords)
			{
				if (pass.getPassword().equals(password))
					return false;
			}
			/*for (Password pass:passwords)
			{
				pass.setActive(false);
			}*/
			if (Password.isValid(password)) {
				passwords.get(passwords.size() - 1).setActive(false);
				passwords.add(new Password(password));
			}
		}
		return true;
	}

	public boolean isCorrectActivePassword(String password)
	{
		if (passwords.get(passwords.size() - 1).getPassword().equals(password))
			return true;
		else
			return false;
	}

	public boolean canBeAdded(String password)
	{

		return true;
	}
}
