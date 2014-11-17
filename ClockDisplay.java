
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // definimos los atributos de la clase ColckDisplay
    private NumberDisplay horas;
    private NumberDisplay minutos;
    private String horaActual;
    
    /**
     * Constructor para fijar las horas y minutos a cero
     */
    public ClockDisplay()
    {
      horas = new NumberDisplay (23);
      minutos = new NumberDisplay (59);
      horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
      
    }
   
    /**
     * Constructor de la clase ClockDisplay para fijar las horas y minutos
     */
    public ClockDisplay(int nuevaHora, int nuevosMinutos)
    {
        // initialise instance variables
        horas = new NumberDisplay (23);
        minutos = new NumberDisplay (59);
        horas.setValue(nuevaHora);
        minutos.setValue(nuevosMinutos);
        horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
    
    /**
     * Metodo que fija las horas y minutos en los valores de la hora actual
   
     */
    public void setTime (int actualHora, int actualMinutos)    
    {
       horas = new NumberDisplay (actualHora);
       minutos = new NumberDisplay (actualMinutos);
    }
    
    /**
     * Método que devuelve la hora en formato de 5 caracteres
     */
    public String getTime ()
    {
        horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        return horaActual;
    }   
    
    /**
     * Método que hace avanzar un minuto la hora actual
     */
    
    public void timeTick ()
    {
        minutos.increment();
    }
}
