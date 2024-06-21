
package smartphone;


public class Chip {
    private Operador operador;
    public int numero;
    
    Chip(Operador operador, int numero){
        this.numero = numero;
        this.operador = operador;
    }

    public String getOperador() {
        return this.operador.nombre + " " +this.operador.pais;
        
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void mostrarInformacion(){
        System.out.println("Operador: "+ operador+" Número: "+numero);
    }
}
