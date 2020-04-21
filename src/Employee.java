public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("Сотрудник\nФИО: " + fullName + "\nРаботает в должности: " + position + "\nАдрес эл. почты: " + email +
                "\nНомер телефона: " + phoneNumber + "\nЗарплата: " + salary + "\nВозраст: " + age + "\n\n");
    }

    public int getAge() {
        return age;
    }
}
