import Handler.*;

public class Main {
    public static void main(String[] args) {
        LogHandler handler = new InfoLogHandler(new DebugLogHandler(new ErrorLogHandler(null)));
        handler.log(Level.INFO, "Log-Level-Details");
        handler.log(Level.DEBUG, "Debug-Level-Details");
        handler.log(Level.ERROR, "Error-Level-Details");
    }
}
