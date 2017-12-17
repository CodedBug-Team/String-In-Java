package stringExamplePrograms;

public class ShortException extends Exception {

	protected String msg;
	public ShortException() {}
	public ShortException(String msg) {
		this.msg =msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
