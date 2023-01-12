public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Ramiro");
        persona.setTelefono("3215648794");
        persona.setEdad(27);

        System.out.println("El nombre del tipo es: " + persona.getNombre());
        System.out.println("El telefono del tipo es: " + persona.getTelefono());
        System.out.println("La edad del tipo es: " + persona.getEdad());


    }
}

class Persona{

    private int edad;
    private String nombre, telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
}