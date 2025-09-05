package _16_chain_of_responsibility;

//Step 1: Handler abstract class
abstract class Logger {
 public static int INFO = 1;
 public static int DEBUG = 2;
 public static int ERROR = 3;

 protected int level;

 // next element in chain of responsibility
 protected Logger nextLogger;

 public void setNextLogger(Logger nextLogger) {
     this.nextLogger = nextLogger;
 }

 public void logMessage(int level, String message) {
     if (this.level <= level) {
         write(message);
     }
     if (nextLogger != null) {
         nextLogger.logMessage(level, message);
     }
 }

 protected abstract void write(String message);
}

//Step 2: Concrete Handlers
class InfoLogger extends Logger {
 public InfoLogger(int level) {
     this.level = level;
 }

 @Override
 protected void write(String message) {
     System.out.println("INFO: " + message);
 }
}

class DebugLogger extends Logger {
 public DebugLogger(int level) {
     this.level = level;
 }

 @Override
 protected void write(String message) {
     System.out.println("DEBUG: " + message);
 }
}

class ErrorLogger extends Logger {
 public ErrorLogger(int level) {
     this.level = level;
 }

 @Override
 protected void write(String message) {
     System.out.println("ERROR: " + message);
 }
}

//Step 3: Client creates chain
public class Main {
 private static Logger getChainOfLoggers() {
     Logger errorLogger = new ErrorLogger(Logger.ERROR);
     Logger debugLogger = new DebugLogger(Logger.DEBUG);
     Logger infoLogger = new InfoLogger(Logger.INFO);

     // chain: error → debug → info
     errorLogger.setNextLogger(debugLogger);
     debugLogger.setNextLogger(infoLogger);

     return errorLogger; // first element in chain
 }

 public static void main(String[] args) {
     Logger loggerChain = getChainOfLoggers();

     loggerChain.logMessage(Logger.INFO, "This is an information.");
     loggerChain.logMessage(Logger.DEBUG, "This is a debug level info.");
     loggerChain.logMessage(Logger.ERROR, "This is an error message.");
 }
}

