package loger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ProdLogger implements MyLogger {

    public static final Logger LOG = LoggerFactory.getLogger(ProdLogger.class);

    @Override
    public void info(String message) {
        LOG.info(message);

    }
}


