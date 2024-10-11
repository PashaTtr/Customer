package app;

public class Main {

    public static void main(String[] args) {
        // Получаем объект Customer с помощью метода getCustomer
        Customer customer = getCustomer(getData());

        // Формируем строку для вывода информации о клиенте
        String output = "Customer: " + customer.getName() +
                ", phone " + customer.getPhone();

        // Выводим информацию
        getOutput(output);
    }

    // Метод для получения данных (имя и телефон клиента)
    public static String[] getData() {
        // Возвращаем массив с именем и телефоном клиента
        return new String[]{"Tom", "555 123-8596"};
    }

    // Метод для создания объекта Customer на основе массива данных
    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    // Метод для вывода информации о клиенте
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
