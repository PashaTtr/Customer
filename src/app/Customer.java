package app;

public class Customer {

    // Виправлені декларації змінних класу
    private final String name;
    private final String phone;

    // Виправлене визначення конструктора
    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Getters для всіх змінних класу
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
