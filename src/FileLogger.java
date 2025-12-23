public class FileLogger implements Logger {
    //void log(String msg) {
    //    System.out.println("FILE: " + msg);
    //}

    //Нарушение принципа подстановки Барбары Лисков и отсутствие полиморфизма.

    @Override
    public void log(String msg) {
        System.out.println("FILE: " + msg);
    }
}
