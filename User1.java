package user;

public class User1 {

	public User1(String mobno, String password, String email, String addL1, String addL2, String city, String pinCode) {
		
		this.mobno = mobno;
		this.password = password;
		this.email = email;
		AddL1 = addL1;
		AddL2 = addL2;
		City = city;
		PinCode = pinCode;
	}

	public User1() {
		
		// TODO Auto-generated constructor stub
	}
	
	private String mobno;
	private String password;
	private String email;
	private String AddL1;
	private String AddL2;
	private String City;
	private String PinCode;

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddL1() {
		return AddL1;
	}

	public void setAddL1(String addL1) {
		AddL1 = addL1;
	}

	public String getAddL2() {
		return AddL2;
	}

	public void setAddL2(String addL2) {
		AddL2 = addL2;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getPinCode() {
		return PinCode;
	}

	public void setPinCode(String pinCode) {
		PinCode = pinCode;
	}
}
