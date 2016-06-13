
/**
 * Write a description of class FurgonetaPequeña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaPequeña extends VehiculoPequeño
{
    /**
     * Constructor for objects of class Coche
     */
    public FurgonetaPequeña(int numeroPlazas,Marcas marca,int kilometraje,int antiguedad,
    boolean cumpleNormativa,int revision)
    {
        super(numeroPlazas, marca,kilometraje,antiguedad);
        if (!super.getMarca().equals("FORD"))
        {
            super.setRevision(1);
        }
        if(numeroPlazas<= 7)
        {
            super.setCumpleNormativa() ;
        }
    

    }
}
