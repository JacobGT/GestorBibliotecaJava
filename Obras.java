public class Obras {
   String titulo;
   String autor;
   int anoPub;
   boolean disponible = true;

   public String toString(){
      return "Titulo: " + titulo + "\nAutor: " + autor + "\nAnno de Publiccion: " + anoPub + "\nDisponible: " + disponible;
   }

   public void setAutor(String newAutor){
      this.autor = newAutor;
   }

   public String getTitulo(){
      return titulo;
   }

   public void setTitulo(String newTitulo){
      this.titulo = newTitulo;
   }

   public int getAnoPub(){
      return anoPub;
   }

   public void setAnoPub(int newAnno){
      this.anoPub = newAnno;
   }

   public boolean getDisponible(){
      return disponible;
   }

   public void setDisponible(boolean newDisp){
      this.disponible = newDisp;
   }

   public void Obras(String title, int annoPub, boolean disp){
      titulo = title;
      anoPub = annoPub;
      disponible = disp;
   }
}