/**
 * Esta clase es una superclase para representar las carateristica 
 * comunes en muchas figuras
 * 
 * @author (El niño) 
 * @version (1.0)
 */


public class Figura
{
    protected float area;
    
    public Figura()
    {
        area = 0;
     
    }
    
    public void calcularArea()
    {
        System.out.println("No se como calcular el area!!");
       
    
    }
    
    public void imprimeArea()
    {
        System.out.println("El area de la figura es: " + area);
    }
}


