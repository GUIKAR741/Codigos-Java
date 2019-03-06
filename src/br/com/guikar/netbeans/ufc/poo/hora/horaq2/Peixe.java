package br.com.guikar.netbeans.ufc.poo.hora.horaq2;

public class Peixe {
    private String especie;
    private float peso;
    public Peixe() {
        super();
    }
    public Peixe(String especie, float peso) {
        setEspecie(especie);
        setPeso(peso);
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        if(especie != null)
            this.especie = especie;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        if(peso > 0)
            this.peso = peso;
    }
}
