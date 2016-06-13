
/**
 * Write a description of class VehiculoPequeño here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculoPequeño extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int numeroPlazas;
    public boolean cumpleNormativa;
    public int revision;

    /**
     * Constructor for objects of class VehiculoPequeño
     */
    public VehiculoPequeño(int numeroPlazas,Marcas marca,int kilometraje,int antiguedad)
    {
        super(marca,kilometraje,antiguedad);
        this.numeroPlazas = numeroPlazas;
        cumpleNormativa = false;
        revision = 2;
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getNumeroPlazas()
    {
        return numeroPlazas;
    }
    /**
     *devuelve los años de revision 
     */
    public int getRevision()
    {
        return revision;
    }
    public void setRevision(int año)
    {
        revision = año;
        
    }
    public void setCumpleNormativa()
    {
        cumpleNormativa = !cumpleNormativa;
        
    }
}
