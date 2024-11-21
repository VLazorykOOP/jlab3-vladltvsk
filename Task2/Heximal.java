class Heximal extends Integer {

    // Конструктор для ініціалізації шістнадцяткового числа з рядка
    public Heximal(String hexString) {
        digits = hexString.toUpperCase().toCharArray();
    }

    // Додавання шістнадцяткових чисел
    @Override
    public Integer add(Integer other) {
        if (other instanceof Heximal) {
            String thisHex = new String(this.digits);
            String otherHex = new String(((Heximal) other).digits);
            int result = Integer.parseInt(thisHex, 16) + Integer.parseInt(otherHex, 16);
            return new Heximal(Integer.toHexString(result).toUpperCase());
        }
        throw new UnsupportedOperationException("Unsupported operation for the given type.");
    }

    // Віднімання шістнадцяткових чисел
    @Override
    public Integer subtract(Integer other) {
        if (other instanceof Heximal) {
            String thisHex = new String(this.digits);
            String otherHex = new String(((Heximal) other).digits);
            int result = Integer.parseInt(thisHex, 16) - Integer.parseInt(otherHex, 16);
            return new Heximal(Integer.toHexString(result).toUpperCase());
        }
        throw new UnsupportedOperationException("Unsupported operation for the given type.");
    }

    // Множення шістнадцяткових чисел
    @Override
    public Integer multiply(Integer other) {
        if (other instanceof Heximal) {
            String thisHex = new String(this.digits);
            String otherHex = new String(((Heximal) other).digits);
            int result = Integer.parseInt(thisHex, 16) * Integer.parseInt(otherHex, 16);
            return new Heximal(Integer.toHexString(result).toUpperCase());
        }
        throw new UnsupportedOperationException("Unsupported operation for the given type.");
    }
}
