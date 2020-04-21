import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Суворов Дмитрий Алексеевич", "Android разработчик", "sda@gmail.com",
                "+7(910)100-00-01", 180000, 26);
        employees[1] = new Employee("Поседько Юлия Станиславовна", "Графический дизайнер", "pju@gmail.com",
                "+7(910)100-00-02", 120000, 25);
        employees[2] = new Employee("Найда Олег Юрьевич", "Старший специалист", "nou@gmail.com",
                "+7(910)100-00-03", 90000, 47);
        employees[3] = new Employee("Шиш Владимир Дмитриевич", "Специалист", "hwd@gmail.com",
                "+7(910)100-00-04", 75000, 41);
        employees[4] = new Employee("Чечеткина Ирина Максимовна", "Младший специалист", "chim@gmail.com",
                "+7(910)100-00-05", 50000, 40);


        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].info();
            }
        }
    }

}
