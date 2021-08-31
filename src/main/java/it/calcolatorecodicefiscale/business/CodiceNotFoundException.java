package it.calcolatorecodicefiscale.business;

@SuppressWarnings("serial")
public class CodiceNotFoundException extends BusinessException {

	public CodiceNotFoundException() {

	}

	public CodiceNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CodiceNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public CodiceNotFoundException(String message) {
		super(message);
	}

	public CodiceNotFoundException(Throwable cause) {
		super(cause);
	}

}
