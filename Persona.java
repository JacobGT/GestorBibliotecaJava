public class Persona {
    String nombre;
    String apellido;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String newApellido){
        this.apellido = newApellido;
    }

    public void Persona(String name, String surName){
        nombre = name;
        apellido = surName;
    }

    public String toString(){
        return "Nombre: " + nombre + "\nApellido: " + apellido;
    }
    
}
