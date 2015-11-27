package src.edu.iut.exceptions;

public class IUTException extends Exception {
	public IUTException() {
		super();
		src.edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe("empty");
	}
	public IUTException(IUTException e) {
		super (e);
		src.edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(e.getMessage());
	}
	public IUTException(String message) {
		super(message);
		src.edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(message);
	}
	
}
