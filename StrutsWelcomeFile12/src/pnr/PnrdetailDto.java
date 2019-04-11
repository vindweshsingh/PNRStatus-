
package pnr;

public class PnrdetailDto {

	

	
    private String user_pnr;
    private String dob;
    private String name;
    private String address;
    private String status;
    
	public String getUser_pnr() {
		return user_pnr;
	}
	public void setUser_pnr(String user_pnr) {
		this.user_pnr = user_pnr;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "PnrdetailDto [user_pnr=" + user_pnr + ", dob=" + dob + ", name=" + name + ", address=" + address
				+ ", status=" + status + "]";
	}

	
	

}
  
    
    
