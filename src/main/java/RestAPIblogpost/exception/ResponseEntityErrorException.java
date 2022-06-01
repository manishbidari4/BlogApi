package RestAPIblogpost.exception;

import RestAPIblogpost.payload.ApiResponse;
import org.springframework.http.ResponseEntity;

import java.io.Serial;

public class ResponseEntityErrorException extends RuntimeException {
	@Serial
	private static final long serialVersionUID = 2669293150219020249L;

	private transient ResponseEntity<ApiResponse> apiResponse;

	public ResponseEntityErrorException(ResponseEntity<ApiResponse> apiResponse) {
		this.apiResponse = apiResponse;
	}

	public ResponseEntity<ApiResponse> getApiResponse() {
		return apiResponse;
	}
}
