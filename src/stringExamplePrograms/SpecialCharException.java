package stringExamplePrograms;

public class SpecialCharException extends Exception {

	protected String msg;
	public SpecialCharException() {}
	public SpecialCharException(String msg) {
		this.msg =msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
