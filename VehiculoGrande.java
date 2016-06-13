
/**
 * Write a description of class VehiculoGrande here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VehiculoGrande extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int peso;
    private boolean articulado;
    private boolean cumpleNormativa;

    /**
     * Constructor for objects of class VehiculoGrande
     */
    public VehiculoGrande(int peso,Marcas marca,int kilometraje,int antiguedad,int numeroId)
    {
        super(marca,kilometraje,antiguedad,numeroId);
        this.peso = peso;
        articulado = false;
        cumpleNormativa = false;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getPeso()
    {
        // put your code here
        return peso;
    }

    /**
     * 
     */
    public boolean getArticulado()
    {
        return articulado;
    }

    /**
     * 
     */
    public void setArticulado()
    {
        articulado = !articulado;

    }

    /**
     * 
     * 
     */
    public void setCumpleNormativa()
    {
        cumpleNormativa = !cumpleNormativa;

    }
}
