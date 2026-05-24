package _01_singleton;
 

class DBConnection{
	
	private DBConnection(){	}
	
	//eager
	private static final DBConnection obj = new DBConnection();
	public static DBConnection getInstance() {
		return obj;
	}
	
	//lazy - object is created when needed.
	private static DBConnection lazyObj;
	public static DBConnection getLazyInstance() {
		if(lazyObj == null) {
			lazyObj = new DBConnection();
		}
		return lazyObj; 
	}
	
	//synchronized the method, it lock the method so one thread work at a time.
	private static DBConnection lazyObj2;
	synchronized public static DBConnection getLazyInstance2() {
		if(lazyObj2 == null) {
			lazyObj2 = new DBConnection();
		}
		return lazyObj2; 
	}
	
	
	//Double checking Lock - Here 2 checks are added. If obj is null then object creation code only synchronized.
	// so only one time locking and unlocking is happen.
	private static volatile DBConnection lazyObj3;
	synchronized public static DBConnection getLazyInstance3() {
		if(lazyObj3 == null) {													// 1st check
			synchronized(DBConnection.class) {
				if(lazyObj3 == null) {											// 2nd check
					lazyObj3 = new DBConnection();									
				}
			}
		}
		return lazyObj3; 
	}
	
	// Bill pugh - he overcomes the problem which arize in eager initialization.
	private static class DBConnectionHelper{
		private static final DBConnection obj4 = new DBConnection();
	}
	
	public static DBConnection getInstanceBillPugh() {
		return DBConnectionHelper.obj4;
	}
	
}

enum SingletonEnum {
    INSTANCE;
    
    // Optional: Fields and methods can be added as needed
    private int value;

    // Optional: Enum constructors are implicitly private and run only once
    SingletonEnum() {
        System.out.println("SingletonEnum constructor called, instance created.");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public void doSomething() {
        // Business logic here
        System.out.println("Singleton method called.");
    }
}

 


public class _01_eager_initialization {
	
	

	public static void main(String[] args) {
		// Access the singleton instance
        SingletonEnum singleton = SingletonEnum.INSTANCE;

        // Call methods on the instance
        System.out.println("Initial value: " + singleton.getValue());
        singleton.setValue(10);
        System.out.println("New value: " + singleton.getValue());
        singleton.doSomething();

        // Verify that it's the same instance
        SingletonEnum anotherSingleton = SingletonEnum.INSTANCE;
        System.out.println("Are both instances the same? " + (singleton == anotherSingleton));
		
	}

}
