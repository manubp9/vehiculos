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
    private int ident;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        vehiculos = new ArrayList<>();
        ident = 1;
    }

    /**
     * añade un vehiculo
     */
    public void addVehiculo(Vehiculo vehiculo)
    {

        vehiculos.add(vehiculo);
        
        while(ident<vehiculos.size()){
            incrementIdent();

        }
        vehiculo.setNumeroId(ident);
    }

    public void removeVehiculo(int id) {
        boolean vehiculoEncontrado = false;
        int i = 0;
        while(i<vehiculos.size() && vehiculoEncontrado) {
            if(vehiculos.get(i).getNumeroId() == id) {
                vehiculos.remove(i);
                vehiculoEncontrado = true;
            }
            i++;
        }
    }

    /**
     * incrementa el id del vehiculo
     */
    public void incrementIdent()
    {
        ident++;
    }

    /**
     * 
     */
    public void marcaMayoritaria()
    {

    }
}

