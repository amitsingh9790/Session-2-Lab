package Calculator;

class Main{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5,6));
        System.out.println(calculator.add(5.4,6.1));
        System.out.println(calculator.add(5,6,7));

    }
}