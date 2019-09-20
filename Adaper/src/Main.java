/**
 * @author Zaichenko Vasyl
 * Головний клас, яка реалізую лабораторну роботу №4
 */
public class Main {
    public static void main(String[] args) {
        Dot dot1 = new Dot(-100, 328);
        Dot dot2 = new Dot(65, 270);
        ILine lineAdapter = new LineToDot(dot1, dot2);
    }
}
