
/**
 * Enumeration class Marca - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Marcas
{
    FORD ("ford"),

    OPEL ("opel"),

    CITROEN("citroen"),

    FIAT("fiat");

    private String marca;

    private Marcas(String marca)
    {
        this.marca = marca;
    }

    public String geMarca()
    {
        return marca;
    }

}

  