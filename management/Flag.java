package management;

public class Flag {
	//this class shows the structure for flagging issues with some object
	//sample flags are "disable", enable, validate
	/*flags can be used by management teams to store actions that need to be done on
	 *  system elements such as clients, parking spaces/lots
	 */
	
	private String cause;
	private boolean isResolved;
	
	public Flag(String cause) {
		this.setCause(cause);
		this.setResolved(false);
	}

	public boolean isResolved() {
		return isResolved;
	}

	public void setResolved(boolean isResolved) {
		this.isResolved = isResolved;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}
	
}
