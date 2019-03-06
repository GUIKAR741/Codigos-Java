/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guikar.netbeans.ufc.poo.termometro.model;

import java.util.ArrayList;

/**
 * @author Guilherme
 */
public class Cidade {
    private String nome;
    private String uf;
    private int tipoTemperatura;
    private String clima;
    private float temperatura;
    private ArrayList<Observer> observer = new ArrayList<>();

    public Cidade() {
    }

    public Cidade(String nome, String uf, int tipoTemperatura, String clima, float temperatura) {
        setNome(nome);
        setUf(uf);
        setTipoTemperatura(tipoTemperatura);
        setClima(clima);
        setTemperatura(temperatura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
            updateObserver();
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf != null) {
            this.uf = uf;
            updateObserver();
        }
    }

    public float getTemperatura() {
        return tipoTemperatura == 0 ? temperatura : (9 * temperatura + 160) / 5;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        updateObserver();
    }

    public String getTipoTemperatura() {
        return tipoTemperatura == 0 ? "ºC" : "ºF";
    }

    public void setTipoTemperatura(int tipoTemperatura) {
        //0-c
        //1-f
        if (tipoTemperatura >= 0 && tipoTemperatura <= 1) {
            this.tipoTemperatura = tipoTemperatura;
            updateObserver();
        }
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        if (clima != null) {
            this.clima = clima;
            updateObserver();
        }
    }

    public void addObserver(Observer observer) {
        if (observer != null)
            this.observer.add(observer);
    }

    private void updateObserver() {
        for (int i = 0; i < observer.size(); i++) {
            observer.get(i).update();
        }
    }

    public void aumentarTemperatura() {
        float temperatura;
        if (tipoTemperatura == 0)
            temperatura = getTemperatura();
        else
            temperatura = (float) ((getTemperatura() - 32) / 1.8);
        setTemperatura(temperatura + 1);
    }

    public void dimuirTemperatura() {
        float temperatura;
        if (tipoTemperatura == 0)
            temperatura = getTemperatura();
        else
            temperatura = (float) ((getTemperatura() - 32) / 1.8);
        setTemperatura(temperatura - 1);
    }

    public void disposeObserver() {
        for (int i = 0; i < observer.size(); i++) {
            ((javax.swing.JFrame) observer.get(i)).dispose();
        }
    }
}
