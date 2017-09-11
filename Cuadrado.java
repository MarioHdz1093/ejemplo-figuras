/**
 * Esta clase es circulo que esta heredada de la super clase figura
 * 
 * @author (El niño) 
 * @version (1.0)
 */
public class Cuadrado extends Figura
{
    private float lado;

    /**
     * Constructor para el objeto de la clase cuadrado
     */
    public Cuadrado(float unLado)
    {
        // initialise instance variables
        lado = unLado;
    }

    @Override
    public void calcularArea()
    {
        area = lado + lado + lado + lado;
    }
}
