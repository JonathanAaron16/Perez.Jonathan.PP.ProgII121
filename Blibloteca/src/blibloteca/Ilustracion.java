
package blibloteca;


public class Ilustracion extends Publicacion{
    private String nombreIlustrador;
    private static double ANCHO;
    private static double ALTO;

    public Ilustracion(String nombreIlustrador, String titulo, int anio) {
        super(titulo, anio);
        this.nombreIlustrador = nombreIlustrador;
    }

    @Override
    public String toString() {
        return "Ilustracion{" + "nombreIlustrador=" + nombreIlustrador + '}';
    }

    

    

    @Override
    public void leer() {
        
    }
    
    
    
}