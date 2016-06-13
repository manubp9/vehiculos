import java.util.ArrayList;
/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    // instance variables - replace the example below with your own
    private ArrayList<Vehiculo> vehiculos;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        
        vehiculos = new ArrayList<>();
    }

    /**
     * añade un vehiculo
     */
    public void addVehiculo(Vehiculo vehiculo)
    {
        int id = 1;
        vehiculo.setNumeroId(id);
        vehiculos.add(vehiculo);
        id++;
    }
    /**
     * elimina un vehiculo
     */ 
    public void removeVehiculo(int numeroId){
        boolean encontrado = false;
        int i = 0;
        while(i < vehiculos.size()&& !encontrado){
            if(vehiculos.get(i).getNumeroId() == numeroId)
            {
                vehiculos.remove(i);
            }
        
            
        }
        
    }}

