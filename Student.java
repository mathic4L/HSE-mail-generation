public class Student {

    private String name;
    private String surname;
    private String patronymic;

    private Group group;

    public Student() {

    }

    public Student(String name, String surname, String patronymic, Group group) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.group = group;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public Group getGroup() {
        return group;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public void setGroup(Group group) {
        this.group = group;
    }
}
