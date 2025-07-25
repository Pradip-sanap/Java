
public class AgeLessthanZeroException extends Exception{
	
	public AgeLessthanZeroException() {}
	
	public AgeLessthanZeroException(String mesg) {
		super(mesg);
	}
	
	public AgeLessthanZeroException(Throwable e) {
		super(e);
	}
	
	public AgeLessthanZeroException(String mesg, Throwable e) {
		super(mesg, e);
	}

}
