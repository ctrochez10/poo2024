
package smartphone;


public class Fabricante {
    
    public String nombre;
    public String pais;
    
    Fabricante(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre Fabricante: "+nombre+" País del Fabricante: "+pais);
    }
}
