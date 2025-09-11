public class Fecha {

    private int dia;
    private int mes;
    private int anio;

     public Fecha (int dia, int mes, int anio){
        if (fechaValida(dia, mes, anio)) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        }
            else {
                this.dia = 01;
                this.mes = 01;
                this.anio = 2013;
            }
        }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setDia(int dia) {
        if (fechaValida(dia, this.mes, this.anio)) {
            this.dia = dia;
        }
    }
    public void setMes(int mes) {
        if (fechaValida(this.dia, mes, this.anio)) {
            this.mes = mes;
        }
    }
    public void setAnio(int anio) {
        if (fechaValida(this.dia, this.mes, anio)) {
            this.anio = anio;
        }
    }
     public boolean fechaValida(int dia, int mes, int anio) {
    if (mes < 1 || mes > 12 || dia < 1) {
        return false;
    }

    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
        return dia <= 31;
    } 
    else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        return dia <= 30;
    } 
    else if (mes == 2) {  
        return dia <= 28;
    }
    return false;
}
    public String getNombreMes() {
        switch (mes) {
            case 1: 
                 return "Enero";
            case 2: 
                 return "Febrero";
            case 3:  
                return "Marzo";
            case 4:  
                return "Abril";
            case 5:  
                return "Mayo";
            case 6:  
                return "Junio";
            case 7:  
                return "Julio";
            case 8:  
                return "Agosto";
            case 9:  
                return "Septiembre";
            case 10: 
                return "Octubre";
            case 11: 
                return "Noviembre";
            case 12: 
                return "Diciembre";
           default:  
                return "Mes inválido";
        }
    }
     public String toString() {
        return this.dia + "de" + getNombreMes() + "de" + this.anio;
    }

    }