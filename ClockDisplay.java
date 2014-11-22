
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
    private NumberDisplay dia;
    private NumberDisplay mes;
    private NumberDisplay año;
    private String horaActual;
    private String fechaActual;
    /**
     * Constructor para fijar las horas y minutos, dia, mes y año a cero de un objeto
     */
    public ClockDisplay()
    {
      horas = new NumberDisplay (24); 
      minutos = new NumberDisplay (60);
      dia = new NumberDisplay (30); 
      mes = new NumberDisplay (12);
      año = new NumberDisplay (99);
      updateDisplay(); 
      
      
    }
   
    /**
     * Constructor de la clase ClockDisplay para fijar las horas, los minutos, 
     * el dia, el mes y el año en una cifra determinada de un objeto
     */
    public ClockDisplay(int nuevaHora, int nuevosMinutos, int nuevoDia, int nuevoMes, int nuevoAño) 
                                                                                                  
    {
        horas = new NumberDisplay (24); 
        minutos = new NumberDisplay (60);
        horas.setValue(nuevaHora); 
        minutos.setValue(nuevosMinutos);
        dia = new NumberDisplay (30);
        mes = new NumberDisplay (12);
        año = new NumberDisplay (99);
        dia.setValue(nuevoDia);
        mes.setValue(nuevoMes);
        año.setValue(nuevoAño);
        updateDisplay();
    }
   
    /**
     * Metodo que fija las horas, minutos, dia, mes y año en los valores deseados, cuando no se han fijado por parametro
   
     */
    public void setTime (int actualHora, int actualMinutos, int actualDia, int actualMes, int actualAño)    
    {
       horas.setValue(actualHora); 
       minutos.setValue(actualMinutos);
       dia.setValue(actualDia);
       mes.setValue(actualMes);
       año.setValue(actualAño);
       updateDisplay(); //¿?
    }
    
    public void setFecha (int actualDia, int actualMes, int actualAño)
    {
        dia.setValue(actualDia);
        mes.setValue(actualMes);
        año.setValue(actualAño);

    }
    
    /**
     * Método que devuelve la hora en formato de 16 caracteres
     */
    public String getTime ()
    {
        return horaActual + " " +  fechaActual;
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
        
        if (horas.getValue() > 24)
        {
            dia.increment();
        }
        
        if (dia.getValue() > 30)
        {
            mes.increment();
        }
        
        if (mes.getValue() > 12)
        {
            año.increment();
        }
        
        horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + "a.m";
        horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + "p.m";
        fechaActual = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
     
    }
    
    /**
     * Metodo que actualiza el atributo display
     */
    private void updateDisplay()
    
    
    {
        if (horas.getValue() < 12)
        {
             
            if (horas.getValue() == 0)
             {

                 horaActual = "12" + ":" + minutos.getDisplayValue() + " p.m";
                 fechaActual = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
               
             }
             
             else
             
             {
                
                 horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " a.m";
                 fechaActual = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
           
             }
        }
        
        else 
        {
            int horapm = (horas.getValue() - 12);
            
            if ((horapm < 10) && (horapm == 0))
            {
                horaActual = "0" + horapm + ":" + minutos.getDisplayValue() + " p.m";
                fechaActual = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
                
            }
            else if (horapm == 0)
            {
                horaActual = "12" + ":" + minutos.getDisplayValue() + " p.m";
                fechaActual = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();

            }
           
            else
            {
                horaActual = horapm + ":" + minutos.getDisplayValue() + " p.m";
                fechaActual = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();

            }

        }
       
    }
}
       
       
  
    
    
    


