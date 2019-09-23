
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.Appender;
import org.junit.experimental.categories.Category;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.slf4j.LoggerFactory;
import testcategories.Fast;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.verify;

@Category({Fast.class})
public class AbstractUnitTest {

    // for testing logging
    @Mock
    protected Appender appenderMock;

    public void setUp() throws Exception {
        // Add appender for testing logging
       Logger logbackLogger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        logbackLogger.addAppender(appenderMock);
    }

    public void afterTest(){
        // Remove test appender
        Logger logbackLogger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        logbackLogger.detachAppender(appenderMock);
    }

    /**
     * Get logged event
     * */
    protected LoggingEvent getLoggingEvent(){
        verify(appenderMock).doAppend((LoggingEvent) anyObject());
        ArgumentCaptor arguments = ArgumentCaptor.forClass(LoggingEvent.class);
        verify(appenderMock).doAppend(arguments.capture());
        return (LoggingEvent) arguments.getValue();
    }
}
