package Reflect;

public class Person
{




    @TestAnno(list = {"name2","name3"},name = "name")
    private String name;
    @TestAnno(list = {"ageBlog"},name = "age")
    private Integer age;
    private String name2;
    private String name3;
    private Integer ageBlog;

    public Person(String name, Integer age, String name2, String name3, Integer ageBlog) {
        this.name = name;
        this.age = age;
        this.name2 = name2;
        this.name3 = name3;
        this.ageBlog = ageBlog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public Integer getAgeBlog() {
        return ageBlog;
    }

    public void setAgeBlog(Integer ageBlog) {
        this.ageBlog = ageBlog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", name2='" + name2 + '\'' +
                ", name3='" + name3 + '\'' +
                ", ageBlog=" + ageBlog +
                '}';
    }
}
