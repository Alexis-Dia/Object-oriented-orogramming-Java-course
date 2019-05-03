package by.bntu.fitr.povt.alexeyd.lab18.exercise4.xml;

import by.bntu.fitr.povt.alexeyd.lab18.exercise4.xml.firstpackage.First;
import by.bntu.fitr.povt.alexeyd.lab18.exercise4.xml.secondpackage.Second;
import org.apache.log4j.Logger;

public class Test {
    public static final Logger LOG;

    static {
        LOG = Logger.getRootLogger();
    }

    public static void main(String[] args) {
        First.test();
        Second.test();
        LOG.trace("Second trace");//Когда дебажим и тресируем
        LOG.debug("Second debug");//Когда дебажим и тресируем
        LOG.info("Second info"); //Когда нужен конечный результат выполнения приложения
        LOG.warn("Second warn"); //Там когда могут происходить непредвиденные ситуации не фатальные, но в то же время требуют внимания со стороны администратора
        LOG.error("Second error");//Пишутся в блоке try catch и именно те Exceptions которые фатальные либо Error все остальные эксепшены Exceptions
        LOG.fatal("Second fatal");
    }
}
