package Handler;

public class ErrorLogHandler extends LogHandler {
    public ErrorLogHandler(LogHandler nextHandler) {
        super(nextHandler);
    }

    public void log(Level level, String details) {
        if(level != Level.ERROR) {
            super.log(level, details);
        } else {
            System.out.println("[ERROR-LEVEL] : " + details);
        }
    }
}
