package junitt;

public class MyDivideByZeroException extends Exception{

	/**
	 * 
	 */
	public MyDivideByZeroException() {
	}

	/**
	 * @param message
	 */
	public MyDivideByZeroException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public MyDivideByZeroException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MyDivideByZeroException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MyDivideByZeroException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
