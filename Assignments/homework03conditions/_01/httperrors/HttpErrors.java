package homework03conditions._01.httperrors;

public enum HttpErrors {
	BAD_REQUEST("400"), UNAUTHORIZED("401"), FORBIDDEN("403"), NOT_FOUND("404"), INTERNAL_SERVER_ERROR("500");

	private String number;

	public String getNumber() {
		return number;
	}

	private HttpErrors(String number) {
		this.number = number;
	}

}
