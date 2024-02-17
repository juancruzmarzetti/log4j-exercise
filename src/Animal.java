import org.apache.log4j.Logger;
public abstract class Animal {
    private static final Logger logger = Logger.getLogger(Animal.class);
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void correr(){
        logger.info("El animal está corriendo");
    }
    public abstract void esMayorA10();
}
