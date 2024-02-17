// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal leon = new Leon("Jorge", 11);
        Animal tigre = new Tigre("Julian", 11);
        tigre.correr();
        leon.correr();
        tigre.esMayorA10();
        leon.esMayorA10();
        Animal leon1 = new Leon("Bob", 2);
        leon1.esMayorA10();
    }
}