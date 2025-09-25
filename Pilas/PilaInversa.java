public class PilaInversa {
    /*3. Realice un programa que dado el ingreso de una palabra como cadena de caracteres, permita visualizarla
en forma inversa.*/
    private char[] elementos;
    private int cima;
    private int maxElementos = 20;

    // Constructor
    public PilaInversa() {
        elementos = new char[maxElementos];
        cima = -1;
    }

     public boolean estaVacia()  {
      return (cima == -1); 
        }
        public boolean estaLlena() {
       return (cima == maxElementos - 1); // Completar: devolver true si cima está en el límite del array
    }
    //push
     public void meter(char elem) {
        cima++;
    elementos [cima] = elem;  
    }

    //pop
    public char sacar() {
        char aux = elementos[cima];
        cima--;
        return aux;   // Completar: guardar el elemento de la cima, decrementar cima y devolverlo
        }

    }














