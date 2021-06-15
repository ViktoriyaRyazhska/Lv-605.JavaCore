package lesson4.homework;

public enum HTTPError {
	BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN,
	NOT_FOUND, METHOD_NOT_ALLOWED, NOT_ACCEPTABLE, PROXY_AUTHENTICATION_REQUIRED;
	
	private int errorCode;
	private static int nextErrorCode = 400;
	
	HTTPError(){
		setErrorCode();
	}
	private void setErrorCode() {
		this.errorCode = nextErrorCode++;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public int getNextErrorCode() {
		return nextErrorCode;
	}
}
