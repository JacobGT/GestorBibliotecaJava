import java.time.LocalDate;
import java.util.*;

public class Usuarios extends Persona{
    /*Lamentablemente... el objeto clase me daba un NullPinterException... asi que mejor lo quite
    Libros librosPrestamos;
    Revistas revistasPrestamos;
    Otros otrosPrestamos;
    */
    String posLib;
    String updatePos;
    String posRev;
    String updatePosR;
    String posOtro;
    String updatePosO;
    int duracionPrestamo;
    private int saldo;

    public String getPosLib(){
        return posLib;
    }

    public void setPosLib(String newPosLib){
        this.posLib = newPosLib;
    }

    public void setUpdatePos(String newUpdatePos){
        this.updatePos = newUpdatePos;
    }

    public void setUpdatePosR(String newUpdatePosR){
        this.updatePosR = newUpdatePosR;
    }

    public void setUpdatePosO(String newUpdatePosO){
        this.updatePosO = newUpdatePosO;
    }

    public String getPosRev(){
        return posRev;
    }

    public void setPosRev(String newPosRev){
        this.posRev = newPosRev;
    }

    public String getPosOtro(){
        return posOtro;
    }

    public void setPosOtro(String newPosOtro){
        this.posOtro = newPosOtro;
    }

    public void Usuarios(String name, String surName, int durPrest, int pago){
        super.Persona(name, surName);
        duracionPrestamo = durPrest;
        saldo = pago;

    }

    public LocalDate dateColector(){
        LocalDate inicioPrestamo = LocalDate.now();
        return inicioPrestamo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(int newSaldo) {
        this.saldo = newSaldo;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSaldo: " + saldo + "\nLibro Prestado (Posicion): " + posLib + "\nLibros ya devueltos por el usuario (Posicion): " + updatePos + "\nRevista Prestada (Posicion): " + posRev + "\nRevistas ya devueltas por el ususario (Posicion): " + updatePosR + "\nDocumento Prestado (Posicion): " + posOtro + "\nDocumentos ya devueltos por el ususario (Posicion): " + updatePosO;
    }

}
/*String obrasPrestamos = input.nextLine();
        String[] values = obrasPrestamos.split(",");
        for(String s: values)
            System.out.println(s);
        obrasPrestamos[5] = new obrasPrestamo(values[0], values[1], values[2], values[3]);*/
