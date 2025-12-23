public class DbLogger implements Logger {
    //void log(String msg) {
    //    System.out.println("DB: " + msg);
    //}

    //Нарушение принципа подстановки Барбары Лисков и отсутствие полиморфизма.

    @Override
    public void log(String msg) {
        System.out.println("DB: " + msg);
    }
}
