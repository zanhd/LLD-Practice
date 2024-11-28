package Handler;
public abstract class LogHandler {
    Level level;
    LogHandler nextHandler;

    public LogHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void log(Level level, String details) {
        if(this.nextHandler != null) {
            this.nextHandler.log(level, details);
        }
    }
}
