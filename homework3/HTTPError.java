package homework3;

public enum HTTPError {
	e400("Bad Request"),
	e401("Unauthorized"), 
	e402("Payment Required"), 
	e403("Forbidden"), 
	e404("Not Found"), 
	e405("Method Not Allowed"), 
	e406("Not Acceptable"), 
	e407("Proxy Authentication Required"), 
	e408("Request Timeout");
	
	private HTTPError(String nameOfError) {
		this.nameOfError = nameOfError;
	}
	
	public String nameOfError = "default";
}
