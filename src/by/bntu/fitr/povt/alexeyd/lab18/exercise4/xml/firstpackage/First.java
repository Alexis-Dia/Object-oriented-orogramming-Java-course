package by.bntu.fitr.povt.alexeyd.lab18.exercise4.xml.firstpackage;

import org.apache.log4j.Logger;

public class First {
    public static final Logger LOG;

    static {
        LOG = Logger.getLogger("FirstLogger");
    }

    public static void test() {
        LOG.trace("First trace");//Когда дебажим и тресируем
        LOG.debug("First debug");//Когда дебажим и тресируем
        LOG.info("First info"); //Когда нужен конечный результат выполнения приложения
        LOG.warn("First warn"); //Там когда могут происходить непредвиденные ситуации не фатальные, но в то же время требуют внимания со стороны администратора
        LOG.error("First error");//Пишутся в блоке try catch и именно те Exceptions которые фатальные либо Error все остальные эксепшены Exceptions
        LOG.fatal("First fatal");
    }
}
