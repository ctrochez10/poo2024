
package smartphone;


public class Operador {
    public String nombre;
    public String pais;
    
    Operador(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public void mostrarInformación(){
        System.out.println("Nombre Operador: "+nombre+" País: "+pais);
    }
}
