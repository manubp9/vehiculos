
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche extends VehiculoPequeño
{
   

    /**
     * Constructor for objects of class Coche
     */
    public Coche(int numeroPlazas,Marcas marca,int kilometraje,int antiguedad,int numeroId,
    boolean cumpleNormativa,int revision)
    {
        super(numeroPlazas, marca,kilometraje,antiguedad,numeroId);
        if (!super.getMarca().equals("FORD"))
        {
            super.setRevision(1);
        }
        if(numeroPlazas<= 5)
        {
            super.setCumpleNormativa() ;
        }
        
    

    }

    
}
