import java.util.Date;

public class LoggerImpl implements Logger {

    public void log(String message) {
        System.out.println(new Date()+ ": " + message);
    }
}
