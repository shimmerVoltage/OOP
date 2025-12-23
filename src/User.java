public class User {
    //class User {
    //    public String name;
    //    public int age;
    //}

    //Поля public, что позволяет внешнему коду напрямую изменять состояние объекта.
    //В поля можно записать некорректные значения.


    private String name;
    private int age;

    public User(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150!");
        }
        this.age = age;
    }
}