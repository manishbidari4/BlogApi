package RestAPIblogpost.exception;

import org.springframework.http.HttpStatus;

import java.io.Serial;

public class BlogapiException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = 2669293150219020249L;

	private final HttpStatus status;
	private final String message;

	public BlogapiException(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public BlogapiException(HttpStatus status, String message, Throwable exception) {
		super(exception);
		this.status = status;
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

}
