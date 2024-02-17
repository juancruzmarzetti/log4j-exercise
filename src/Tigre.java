import org.apache.log4j.Logger;
public class Tigre extends Animal{
    private static final Logger loggerTigre = Logger.getLogger(Tigre.class);
    public Tigre(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void esMayorA10() {
        if(getEdad() >= 10){
            loggerTigre.info("El tigre es mayor a 10 años");
        }else{
            loggerTigre.error("El tigre es menor a 10 años");
        }
    }
}
