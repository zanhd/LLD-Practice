package Handler;

public class InfoLogHandler extends LogHandler {
    public InfoLogHandler(LogHandler nextHandler) {
        super(nextHandler);
    }

    public void log(Level level, String details) {
        if(level != Level.INFO) {
            super.log(level, details);
        } else {
            System.out.println("[LOG-LEVEL] : " + details);
        }
    }
}
