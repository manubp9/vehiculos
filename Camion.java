
/**
 * Write a description of class Camion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion extends VehiculoGrande
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Camion
     */
    public Camion(int peso,Marcas marca,int kilometraje,int antiguedad,int numeroId)
    {
        super(peso,marca,kilometraje,antiguedad,numeroId);
        if (super.getMarca().equals("FORD")|| super.getMarca().equals("FIAT"))
        {
            super.setArticulado();
        }
        if(super.getArticulado() && getPeso()<3000)
        {
            super.setCumpleNormativa();
        }
        if(!super.getArticulado() && getPeso()<2000)
        {
            super.setCumpleNormativa();
        }

    }
}