public class Main {
    public static void main(String[] args) {
        Client client = new Client("Sergio", "01.01.2001", "Ivanov", 10000);
        Employee employee = new Employee("Margo", "02.02.2002", "Yandex", 200000);

        System.out.println(client.getName());
        System.out.println(client.getMoney());
        client.setMoney(1000);
        System.out.println(client.getMoney());
        System.out.println(client.spendMoney(10));
        client.print();
        client.setName("Alex");
        client.setBirthday("03.03.2003");
        client.print();
        System.out.println(client.getColorOfSeason());

        employee.print();
        System.out.println(employee.getColorOfSeason());
        System.out.println(employee.getSalary());
        employee.changeCompany("OZON");
        employee.print();
        employee.setSalary(300000);
        System.out.println(employee.getSalary());
    }

}

