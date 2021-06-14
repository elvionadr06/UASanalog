
public class Project {

	// class variabel
	String USERNAME;
	int PASSWORD;
	protected String nama;
	protected String nim;
	protected String fakultas;
	protected String prodi;
	protected String semesterke;

	// default constructor for Project
	Project() {
		this.USERNAME = "EMPTY";
		this.PASSWORD = 0;
	}

	// overloaded constructor for Project
	Project(String un, int pw) {
		USERNAME = un;
		PASSWORD = pw;
	}

	public Project(String nm, String ni, String fak, String pro, String semke) {
		nama = nm;
		nim = ni;
		fakultas = fak;
		prodi = pro;
		semesterke = semke;
	}

	// modifier to set the USERNAME
	public void setUSERNAME(String un) {
		USERNAME = un;
	}

	// modifier to set the PASSWORD
	public void setPASSWORD(int pw) {
		PASSWORD = pw;
	}

	// accessor to get the USERNAME
	public String getUSERNAME() {

		return USERNAME;
	}

	// accessor to get the PASSWORD
	public int getPASSWORD() {

		return PASSWORD;
	}

	// print method
	public void print() {
		// System.out.println(USERNAME + " " + PASSWORD);
	}
}
