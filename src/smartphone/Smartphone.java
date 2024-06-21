
package smartphone;


public class Smartphone {

    private Fabricante marca;
    private String modelo;
    private int almacenamiento;
    private int ram;
    private int tamaniobateria;
    private Chip chip1;
    private Chip chip2;

    public Smartphone(Fabricante marca, String modelo, int almacenamiento, int ram, int tamaniobateria, Chip chip1, Chip chip2) {
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.tamaniobateria = tamaniobateria;
        this.chip1 = chip1;
        this.chip2 = chip2;
    }

    public Fabricante getMarca() {
        return marca;
    }

    public void setMarca(Fabricante marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getTamaniobateria() {
        return tamaniobateria;
    }

    public void setTamaniobateria(int tamaniobateria) {
        this.tamaniobateria = tamaniobateria;
    }

    public Chip getChip1() {
        return chip1;
    }

    public void setChip1(Chip chip1) {
        this.chip1 = chip1;
    }

    public Chip getChip2() {
        return chip2;
    }

    public void setChip2(Chip chip2) {
        this.chip2 = chip2;
    }
    
    public void mostrarDatos(){
        System.out.println("Marca: "+this.marca.nombre);
        System.out.println("País: "+this.marca.pais);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Almacenamiento: "+this.almacenamiento +" Gb");
        System.out.println("RAM: "+this.ram+" Gb");
        System.out.println("Batería: "+this.tamaniobateria);
        System.out.println("Número Chip1: "+this.chip1.numero);
        System.out.println("Número Chip2: "+this.chip2.numero);
        
    }
    
  
    public static void main(String[] args) {
        Fabricante f1 = new Fabricante("Motorola","China");
        Operador o1 = new Operador("Claro","Honduras");
        o1.setNombre("Claro");
        o1.setPais("Honduras");
        Chip c1 = new Chip(o1,92390863);
        Chip c2 = new Chip(o1,96540266);
       
        Smartphone s1 = new Smartphone(f1,"A2",128,12,4500,c1,c2);
        
        s1.mostrarDatos();
        
    }
    
}
