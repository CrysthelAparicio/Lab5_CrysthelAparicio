
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
public class Villanos {

    private String nombre;
    private String poder;
    private String debilidad;
    private ArrayList<EscuadronVillano> baseEscuadron;
    private int fuerza;
    private int agilidadFisica;
    private int agilidadMental;

    public Villanos() {
    }

    public Villanos(String nombre, String poder, String debilidad, ArrayList<EscuadronVillano> baseEscuadron, int fuerza, int agilidadFisica, int agilidadMental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.baseEscuadron = baseEscuadron;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public ArrayList<EscuadronVillano> getBaseEscuadron() {
        return baseEscuadron;
    }

    public void setBaseEscuadron(ArrayList<EscuadronVillano> baseEscuadron) {
        this.baseEscuadron = baseEscuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadFisica() {
        return agilidadFisica;
    }

    public void setAgilidadFisica(int agilidadFisica) {
        this.agilidadFisica = agilidadFisica;
    }

    public int getAgilidadMental() {
        return agilidadMental;
    }

    public void setAgilidadMental(int agilidadMental) {
        this.agilidadMental = agilidadMental;
    }

    @Override
    public String toString() {
        return "Villanos{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", baseEscuadron=" + baseEscuadron + ", fuerza=" + fuerza + ", agilidadFisica=" + agilidadFisica + ", agilidadMental=" + agilidadMental + '}';
    }

}
