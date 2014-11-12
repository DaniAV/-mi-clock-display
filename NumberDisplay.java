
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int valorDisplay;
    private int limitDisplay;
    /**
     * Constructor para los objetos de la clase NumberDisplay
     */
    public NumberDisplay(int limit, int valor)
    {
        // initialise instance variables
        valorDisplay = 00;
        limitDisplay = limit;
    }

    /**
     * Método que devuelve el valor actual del display en forma de cadena de dos caracteres 
     */
    public int setValue(int valor)
    {
        // put your code here
        
        return valorDisplay = valor;
    }
}
