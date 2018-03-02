
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author COPECO -13
 */
public class EscuadronHeroe {

    private String nombre;
    private String localidadBase;
    private String lema;
    private String lider;
    private String tipo; //heroe/villano
    //LISTAS
    private ArrayList<Heroes> baseHeroes;

    public EscuadronHeroe() {
    }

    public EscuadronHeroe(String nombre, String localidadBase, String lema, String lider, String tipo, ArrayList<Heroes> baseHeroes) {
        this.nombre = nombre;
        this.localidadBase = localidadBase;
        this.lema = lema;
        this.lider = lider;
        this.tipo = tipo;
        this.baseHeroes = baseHeroes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidadBase() {
        return localidadBase;
    }

    public void setLocalidadBase(String localidadBase) {
        this.localidadBase = localidadBase;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Heroes> getBaseHeroes() {
        return baseHeroes;
    }

    public void setBaseHeroes(ArrayList<Heroes> baseHeroes) {
        this.baseHeroes = baseHeroes;
    }

    @Override

    public String toString() {
        return "EscuadronHeroe{" + "nombre=" + nombre + ", localidadBase=" + localidadBase + ", lema=" + lema + ", lider=" + lider + ", tipo=" + tipo + ", baseHeroes=" + baseHeroes + '}';
    }

}
