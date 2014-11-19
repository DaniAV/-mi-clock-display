
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
    private int horapm;
    
    /**
     * Constructor para fijar las horas y minutos a cero
     */
    public ClockDisplay()
    {
      horas = new NumberDisplay (24);
      minutos = new NumberDisplay (60);
      updateDisplay();
      
    }
   
    /**
     * Constructor de la clase ClockDisplay para fijar las horas y minutos
     */
    public ClockDisplay(int nuevaHora, int nuevosMinutos)
    {
        // initialise instance variables
        horas = new NumberDisplay (24);
        minutos = new NumberDisplay (60);
        horas.setValue(nuevaHora);
        minutos.setValue(nuevosMinutos);
        updateDisplay();
    }
    
    /**
     * Metodo que fija las horas y minutos en los valores de la hora actual
   
     */
    public void setTime (int actualHora, int actualMinutos)    
    {
       horas.setValue(actualHora);
       minutos.setValue(actualMinutos);
       updateDisplay();
    }
    
    /**
     * Método que devuelve la hora en formato de 5 caracteres
     */
    public String getTime ()
    {
        updateDisplay(); //esta linea
        //se podria omitir ya que el valor horaActual, se mantiene actualizado siempre qeu
        //se utilizan los metodos anteriores.
        return horaActual;
    }   
    
    /**
     * Método que hace avanzar un minuto la hora actual
     */
    
    public void timeTick ()
    {
        minutos.increment();
        
        if (minutos.getValue() == 0)
        {
            horas.increment();
        }
        
        horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        
    }
    
    /**
     * Actualiza el atributo display
     */
    private void updateDisplay()
    {
        if (horas.getValue() < 13)
        {
             horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " a.m";
        }
        else 
        {
            horapm = (horas.getValue() - 12);
            horaActual = horapm + ":" + minutos.getDisplayValue() + " p.m";
        }
    }
}
       
       
  
    
    
    


