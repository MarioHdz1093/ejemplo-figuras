/**
 * Esta clase es Triangulo que esta heredada de la super clase figura
 * 
 * @author (El niño) 
 * @version (1.0)
 */
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    /**
     * Constructor para el objeto de la clase triangulo
     */
    public Triangulo(float base, float alturaT)
    {
        // initialise instance variables
        this.base = base;
        altura = alturaT;
    }

    @Override
    public void calcularArea()
    {
        area = (base * altura) / 2;
    }
}
