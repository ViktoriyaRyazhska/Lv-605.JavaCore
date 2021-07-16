package lesson3;

public enum HTTPError {
    NO_CONTENT, FORBIDDEN, NOT_FOUND,REQUEST_TIMEOUT, CONFLICT, GONE, UNAVAILABLE_FOR_LEGAL_REASONS;

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

