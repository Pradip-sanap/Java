package _JavaDec_2024;

public class _02_AgeLessthanZeroException extends Exception{
	
	public _02_AgeLessthanZeroException() {}
	
	public _02_AgeLessthanZeroException(String mesg) {
		super(mesg);
	}
	
	public _02_AgeLessthanZeroException(Throwable e) {
		super(e);
	}
	
	public _02_AgeLessthanZeroException(String mesg, Throwable e) {
		super(mesg, e);
	}

}
