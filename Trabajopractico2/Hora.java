public class Hora {
    /*Una hora se compone de 3 elementos: hora, minutos y segundos. Codificar la clase Hora con los siguientes
métodos:
a) Cuando se crea el objeto de la clase Hora, los valores de hora, minutos y segundos deben ser
válidos (es decir, una hora correcta en Argentina). Si alguno es inválido, generar la hora 00:00:00.
b) Permitir cambiar la hora, los minutos y los segundos por separado.
c) Devolver la hora en minutos.
d) Mostrar la hora de la siguiente forma: hh:mm:ss. clase Hora, y probar los m
e) Crear dos objetos de laétodos correspondientes. */

    private int hora;
    private int minutos;
    private int segundos;

    public Hora (int hora, int minutos, int segundos){
        if (horaValida(hora, minutos, segundos)){
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        }
        else{
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }
    public int getHora() {
        return hora;
    }
     public int getMinutos() {
        return minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setHora(int hora) {
         if (horaValida(hora, this.minutos, this.segundos)) {
            this.hora = hora;
         }
    }
    public void setMinutos(int minutos) {
        if (horaValida(this.hora, minutos, this.segundos)){
        this.minutos = minutos;
        }
    }
    public void setSegundos(int segundos) {
        if (horaValida(this.hora, this.minutos, segundos)){
        this.segundos = segundos;
        }
    }
   public boolean horaValida (int hora, int minutos, int segundos) {
    return (hora >= 0 && hora < 24) &&
               (minutos >= 0 && minutos < 60) &&
               (segundos >= 0 && segundos < 60);
   }
    public int enMinutos() {
        return hora * 60 + minutos;
    }
     public String toString() {
        return "La hora es: " + hora +":"+ minutos+":"+ segundos;
    }


    }