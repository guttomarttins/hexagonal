package br.com.cams.layer.application.exception;

public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(String msg) {
		super(msg);
	}

	public ProductNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
