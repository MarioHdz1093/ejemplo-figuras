
/**
 * Esta clase es circulo que esta heredada de la super clase figura
 * 
 * @author (El niño) 
 * @version (1.0)
 */
public class Circulo extends Figura
{
    private float radio;

    /**
     * Constructor para el objeto de la clase circulo
     */
    public Circulo(float unRadio)
    {
        // initialise instance variables
        radio = unRadio;
    }

    @Override
    public void calcularArea()
    {
        area = 3.14f * radio * radio;
    }
}
