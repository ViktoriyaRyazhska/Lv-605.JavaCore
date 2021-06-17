public enum Error {
    BADREQUEST("400"), UNAUTHORIZED("401"), PAYMENTREQUIRED("402"), FORBIDDEN("403"),
    NOTFOUND("404");

private String code;
    Error(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }

}





