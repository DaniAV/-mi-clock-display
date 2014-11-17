
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int limitDisplay;
    private int valorDisplay;
   
    /**
     * Constructor para los objetos de la clase NumberDisplay
     */
    public NumberDisplay(int limit)
    {
        // initialise instance variables
        valorDisplay = 0;
        limitDisplay = limit;
    }

    /**
     * Método que fija el valor actual del display al valor pasado como parámetro 
     */
    public void setValue(int valor)
    {
        if (valor < limitDisplay && valorDisplay >= 0)
        {
            valorDisplay = valor;
        }
    }
    
    /**
     * Método que devuelve el valor actual del display.
     */
    public String getDisplayValue()
    {
        
        int var2 = valorDisplay;
        if (var2<10)
            {
                return "0" + var2;
            }
        
        else 
            {    
                return "" + var2;
            }
               
    }
    
    /**
     * Metodo que devuelve el valor actual del display como entero
     */
    public int getValue()
        {
            return valorDisplay;
        }
    
    /**
     * Método que incremente en 1 el display y lo hace volver al principio si alcanza 
     * el limite (increment)
     */
    public void increment()
    {
        valorDisplay = valorDisplay+1;
        if (valorDisplay >= limitDisplay)
        {

            valorDisplay = 0;
        }
    }
}
