public class Libros extends Obras{
    String genero;
    int volumen;

    public String getGenero(){
        return genero;
    }

    public void setGenero(String newGenero){
        this.genero = newGenero;
    }

    public int getVolumen(){
        return volumen;
    }

    public void setVolumen(int newVol){
        this.volumen = newVol;
    }

    @Override
    public String toString(){
        return super.toString() + "\nGenero: " + genero + "\nVolumen: " + volumen;
    }
}
//"Titulo: " + titulo + "\nAutor: " + autor + "\nAnno de Publicacion: " + anoPub + "\nDisponible: " +  disponible + "
