abstract class Integer {
    // Масив цифр числа
    protected char[] digits;

    // Абстрактні методи для арифметичних операцій
    public abstract Integer add(Integer other);
    public abstract Integer subtract(Integer other);
    public abstract Integer multiply(Integer other);

    // Метод для виведення числа
    public void show() {
        System.out.println(new String(digits));
    }
}
