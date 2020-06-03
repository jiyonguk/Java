package ver6;

public class PhoneBook {
	private int pidx;
	private String pbname;
	private String pbphonenumber;	
	private String pbaddr;
	private String pbemail;
	private String pbtype;
	
	private String pbmajor;
	private int pbgrade;
	
	private String pbcompany;
	private String pbdept;
	private String pbjob;
	
	
	private String pbcafe;
	private String pbnickname;
	
	
	
	public PhoneBook(int pidx, String pbname, String pbphonenumber, String pbaddr, String pbemail, String pbtype,
			String pbmajor, int pbgrade) {
		this.pidx = pidx;
		this.pbname = pbname;
		this.pbphonenumber = pbphonenumber;
		this.pbaddr = pbaddr;
		this.pbemail = pbemail;
		this.pbtype = pbtype;
		this.pbmajor = pbmajor;
		this.pbgrade = pbgrade;
	}
	
	
	public PhoneBook(int pidx, String pbname, String pbphonenumber, String pbaddr, String pbemail, String pbtype,
			String pbcompany, String pbdept, String pbjob) {
		this.pidx = pidx;
		this.pbname = pbname;
		this.pbphonenumber = pbphonenumber;
		this.pbaddr = pbaddr;
		this.pbemail = pbemail;
		this.pbtype = pbtype;
		this.pbcompany = pbcompany;
		this.pbdept = pbdept;
		this.pbjob = pbjob;
	}

	

	public PhoneBook(int pidx, String pbname, String pbphonenumber, String pbaddr, String pbemail, String pbtype,
			String pbcafe, String pbnickname) {
		this.pidx = pidx;
		this.pbname = pbname;
		this.pbphonenumber = pbphonenumber;
		this.pbaddr = pbaddr;
		this.pbemail = pbemail;
		this.pbtype = pbtype;
		this.pbcafe = pbcafe;
		this.pbnickname = pbnickname;
	}


	public int getPidx() {
		return pidx;
	}
	public void setPidx(int pidx) {
		this.pidx = pidx;
	}
	public String getPbname() {
		return pbname;
	}
	public void setPbname(String pbname) {
		this.pbname = pbname;
	}
	public String getPbphonenumber() {
		return pbphonenumber;
	}
	public void setPbphonenumber(String pbphonenumber) {
		this.pbphonenumber = pbphonenumber;
	}
	public String getPbaddr() {
		return pbaddr;
	}
	public void setPbaddr(String pbaddr) {
		this.pbaddr = pbaddr;
	}
	public String getPbemail() {
		return pbemail;
	}
	public void setPbemail(String pbemail) {
		this.pbemail = pbemail;
	}
	public String getPbtype() {
		return pbtype;
	}
	public void setPbtype(String pbtype) {
		this.pbtype = pbtype;
	}
	public String getPbmajor() {
		return pbmajor;
	}
	public void setPbmajor(String pbmajor) {
		this.pbmajor = pbmajor;
	}
	public int getPbgrade() {
		return pbgrade;
	}
	public void setPbgrade(int pbgrade) {
		this.pbgrade = pbgrade;
	}
	public String getPbcompany() {
		return pbcompany;
	}
	public void setPbcompany(String pbcompany) {
		this.pbcompany = pbcompany;
	}
	public String getPbdept() {
		return pbdept;
	}
	public void setPbdept(String pbdept) {
		this.pbdept = pbdept;
	}
	public String getPbjob() {
		return pbjob;
	}
	public void setPbjob(String pbjob) {
		this.pbjob = pbjob;
	}
	public String getPbcafe() {
		return pbcafe;
	}
	public void setPbcafe(String pbcafe) {
		this.pbcafe = pbcafe;
	}
	public String getPbnickname() {
		return pbnickname;
	}
	public void setPbnickname(String pbnickname) {
		this.pbnickname = pbnickname;
	}
	

	


	
	
	
	
	
}
