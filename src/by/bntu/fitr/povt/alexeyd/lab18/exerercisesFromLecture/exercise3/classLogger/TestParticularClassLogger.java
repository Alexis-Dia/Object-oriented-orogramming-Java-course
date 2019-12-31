package by.bntu.fitr.povt.alexeyd.lab18.exerercisesFromLecture.exercise3.classLogger;

import org.apache.log4j.Logger;

public class TestParticularClassLogger {

    private static final Logger LOG = Logger.getLogger(TestParticularClassLogger.class);

    public static void main(String[] args) {

        LOG.trace("Send trace message to log");//Когда дебажим и тресируем
        LOG.debug("Send debug message to log");//Когда дебажим и тресируем
        LOG.info("Send info message to log");  //Когда нужен конечный результат выполнения приложения
        LOG.warn("Send warn message to log");  //Там когда могут происходить непредвиденные ситуации не фатальные, но в то же время требуют внимания со стороны администратора
        LOG.error("Send error message to log");//Пишутся в блоке try catch и именно те Exceptions которые фатальные либо Error все остальные эксепшены Exceptions
        LOG.fatal("Send fatal message to log");
    }
}
