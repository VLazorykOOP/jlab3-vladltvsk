// Базовий клас "Товар"
class Product {
    protected String name;
    protected double price;
    protected String manufacturer;

    public Product(String name, double price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public void Show() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

// Підклас "Іграшка"
class Toy extends Product {
    private String ageCategory;

    public Toy(String name, double price, String manufacturer, String ageCategory) {
        super(name, price, manufacturer);
        this.ageCategory = ageCategory;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Age Category: " + ageCategory);
    }
}

// Підклас "Молочний продукт"
class DairyProduct extends Product {
    private double fatContent;

    public DairyProduct(String name, double price, String manufacturer, double fatContent) {
        super(name, price, manufacturer);
        this.fatContent = fatContent;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Fat Content: " + fatContent + "%");
    }
}

// Підклас "Продукт" (може бути базовим для інших підкласів)
class GeneralProduct extends Product {
    private String expirationDate;

    public GeneralProduct(String name, double price, String manufacturer, String expirationDate) {
        super(name, price, manufacturer);
        this.expirationDate = expirationDate;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Expiration Date: " + expirationDate);
    }
}

public class Main {
    public static void main(String[] args) {
        // Створення масиву товарів типу суперкласу Product
        Product[] products = new Product[5];

        // Створення об'єктів класів
        products[0] = new Toy("Lego Set", 25.99, "Lego", "5+");
        products[1] = new DairyProduct("Milk", 1.49, "DairyCo", 3.5);
        products[2] = new GeneralProduct("Apple", 0.99, "Orchard", "2024-05-01");
        products[3] = new Toy("Action Figure", 15.75, "Hasbro", "6+");
        products[4] = new DairyProduct("Cheese", 4.99, "CheeseCorp", 5.0);

        // Виведення всіх товарів із масиву
        for (Product product : products) {
            product.Show();
            System.out.println(); // Порожній рядок між товарами для зручності
        }
    }
}
