
package smartphone;


public class Chip {
    private Operador o1;
    public int numero;
    
    Chip(Operador o1, int numero){
        this.numero = numero;
        this.o1 = o1;
    }

    public Operador getO1() {
        return o1;
    }

    public void setO1(Operador o1) {
        this.o1 = o1;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void mostrarInformacion(){
        System.out.println("Operador: "+ o1+" Número: "+numero);
    }
}
