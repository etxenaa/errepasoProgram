package examenErrepaso;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class bezeroak implements Serializable {

	private String user;
	private String password;
	private int mota;

	public bezeroak() {
		this.user = "";
		this.password = "";
		this.mota = 0;
	}

	public bezeroak(String u, String p, int m) {
		this.user = u;
		this.password = p;
		this.mota = m;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMota() {
		return mota;
	}

	public void setMota(int mota) {
		this.mota = mota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mota;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		bezeroak other = (bezeroak) obj;
		if (mota != other.mota)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "bezeroak [user=" + user + ", password=" + password + ", mota=" + mota + "]";
	}

	public void irakurri(Scanner sc) {
		try {
		System.out.print("User---> ");
		this.user = sc.next();
		System.out.print("Password---> ");
		this.password = sc.next();
		
		System.out.print("Mota? 0 / 1---> ");
		

			this.mota = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Zenbakia bakarrik");
		}
		

	}

}
