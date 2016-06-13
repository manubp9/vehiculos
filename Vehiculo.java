
/**
 * Write a description of class Vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vehiculo
{
    // instance variables - replace the example below with your own
    private Marcas marca;
    private int kilometraje;
    private int antiguedad;
    private int numeroId;
    

    /**
     * Constructor for objects of class Vehiculo
     */
    public Vehiculo(Marcas marca,int kilometraje,int antiguedad)
    {
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.antiguedad = antiguedad;
        numeroId = 0;
        
    }
    /**
     * 
     */
    public Marcas getMarca()
    {
        return marca;
    }
    /**
     * 
     */
    public int getKilometraje()
    {
        return kilometraje;
    }
    /**
     * 
     */
    public int getAntiguedad()
    {
        return antiguedad;
    }
    /**
     * 
     */
    public int getNumeroId()
    {
        return numeroId;
    }
    /**
     * 
     */
    public void incrementId()
    {
        numeroId++;
    }
    /**
     * 
     */
    public void setNumeroId(int identificador)
    {
        numeroId = identificador;
        
    }
}
