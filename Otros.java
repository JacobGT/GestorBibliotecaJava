public class Otros extends Obras{
    String otraInfo;
    String tipoDoc;

    public void setOtraInfo(String newOtra){
        this.otraInfo = newOtra;
    }

    public void setTipoDoc(String newTipoDoc){
        this.tipoDoc = newTipoDoc;
    }

    @Override
    public String toString(){
        return super.toString() + "\nTipo de Documento: " + tipoDoc + "\nOtra informacion del documento: " + otraInfo;
    }
}
//"Titulo: " + titulo + "\nAutor: " + autor + "\nAnno de Publicacion: " + anoPub + "\nDisponible: " +  disponible +