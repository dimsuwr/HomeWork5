import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Суворов Дмитрий Алексеевич", "Начальник", "sda@gmail.com",
                "+7(910)100-00-01", 180000, 26);


        employee1.info();
    }

}
