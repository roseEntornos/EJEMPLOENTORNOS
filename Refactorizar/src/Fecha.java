 /**
  * @author Rosa
  * @version 1.0
  * 
  */

  /**
   * Clase para validar fechas en formato dia, mes , año
   */

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    /**
     * 
     * @param dia del mes en número entero de 1 a 31
     * @param mes número entero de 1 a  q
     * @param anio número entero de 4 dígitos
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.año = anio;
    }

    
    /** 
     * @return int - día 
     */
    public int getDia() {
        return dia;
    }
    
    /** 
     * @return int -  mes
     */
    public int getMes() {
        return mes;
    }

    
    /** 
     * @return int - año
     */
    public int getAño() {
        return año;
    }

    
    /** 
     * @return boolean - valida si el día está en el rango de su mes
     */
    private boolean validaDiasMes() {
        if (this.dia > diasMes()) {
            return true;
        } else {
            return false;
        }
    }

    
    /** 
     * @return int - días que tiene el mes
     */
    private int diasMes() {
        int z = 0;
        switch (this.mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                z = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                z = 30;
                break;
            case 2:
                if ((this.año % 400 == 0) || ((this.año % 4 == 0) && (this.año % 100 != 0))) {
                    z = 29;
                } else {
                    z = 28;
                }
                break;

        }
        return z;
    }

    
    /** 
     * @return boolean - valida si el mes está en el rango 1 - 12
     */
    private boolean validaMes() {
        return this.mes < 1 || this.mes > 12;
    }

    
    /** 
     * @return boolean - valida si el mes está en el rango 1 - 31
     */
    private boolean validaDia() {
        return this.dia < 1 || this.dia > 31;
    }

}


