import org.apache.log4j.Logger;
public class Leon extends Animal{
    private static final Logger loggerLeon = Logger.getLogger(Leon.class);
    private boolean esAlfa;

    public Leon(String nombre, int edad) {
        super(nombre, edad);
        this.esAlfa = edad >= 10;
    }

    public boolean siEsAlfa() {
        return esAlfa;
    }

    @Override
    public void esMayorA10() {
        if(esAlfa){
            loggerLeon.info("El león es mayor a 10 años y alfa!");
        }else{
            loggerLeon.error("El león no es mayor a 10 años, por lo tanto no es alfa tampoco.");
        }
    }
}
