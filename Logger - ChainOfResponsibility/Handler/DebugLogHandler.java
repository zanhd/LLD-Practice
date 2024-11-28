package Handler;

public class DebugLogHandler extends LogHandler {
    public DebugLogHandler(LogHandler nextHandler) {
        super(nextHandler);
    }

    public void log(Level level, String details) {
        if(level != Level.DEBUG) {
            super.log(level, details);
        } else {
            System.out.println("[DEBUG-LEVEL] : " + details);
        }
    }
}
