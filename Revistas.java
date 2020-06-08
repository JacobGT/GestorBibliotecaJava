public class Revistas extends Obras{
    int edicion;
    String genero;
    int mesPublicacion;

    public void setEdicion(int newEdicion){
        this.edicion = newEdicion;
    }

    public void setGenero(String newGenero){
        this.genero = newGenero;
    }

    public void setMesPublicacion(int newMesPub){
        this.mesPublicacion = newMesPub;
    }

    @Override
    public String toString(){
        return super.toString() + "\nEdicion: " + edicion + "\nGenero: " + genero + "\nMes de Publicacion: " + mesPublicacion;
    }
}
//"Titulo: " + titulo + "\nAutor: " + autor + "\nAnno de Publicacion: " + anoPub + "\nDisponible: " +  disponible +