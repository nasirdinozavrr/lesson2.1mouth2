package classWork;

import classWork.IllegalAgeLengthException;
import classWork.IllegalNameLengthException;

public class User {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws IllegalAgeLengthException {
        if (age <= 0 || age >= 100){
            throw new IllegalAgeLengthException("Возраст человека не может " +
                    "быть меньше 0 или больше 100. Вы ввели" + age);
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        if (name.length() > 20){
            throw new IllegalNameLengthException("Длинна имени не может "+
                    "быть больше 20 символов. Вы ввели " + name);
        }
        this.name = name;
    }
}
