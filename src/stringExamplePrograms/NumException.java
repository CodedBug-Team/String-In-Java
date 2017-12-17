package stringExamplePrograms;

public class NumException extends Exception {
	
	protected String msg;
	public NumException() {}
	public NumException(String msg) {
		this.msg =msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
