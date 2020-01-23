
public class Customer {

	
	private String memberId;
	private String email;
	private boolean goldStatus;
	
	public Customer(String a, String b) {
		memberId = a;
		email = b;
		goldStatus = false;
	}
	
	public String getMemberId() { return memberId; }
	public String getEmail() { return email; }
	public boolean isgold() { return goldStatus; }
	public void changeStatus() { goldStatus = goldStatus; }
}
