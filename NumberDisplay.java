
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
    public NumberDisplay(int limit, int valor)
    {
        // initialise instance variables
        valorDisplay = valor;
        limitDisplay = limit;
    }

    /**
     * Método que fija el valor actual del display al valor pasado como parámetro 
     */
    public int setValue(int valor)
    {
         return valorDisplay = valor;
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
}
