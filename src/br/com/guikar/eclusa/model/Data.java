package br.com.guikar.eclusa.model;

import br.com.guikar.eclusa.exceptions.ValorEntreIntervaloException;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    @Override
    public String toString() {
        return  dia + "/" + mes + "/" + ano;
    }
   
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws ValorEntreIntervaloException {
        if (dia >= 1 && dia <= 31)
            this.dia = dia;
        else
            throw new ValorEntreIntervaloException("Dia deve ser entre 1 e 31!");
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws ValorEntreIntervaloException {
        if (mes >= 1 && mes <= 12)
            this.mes = mes;
        else
            throw new ValorEntreIntervaloException("Mês deve ser entre 1 e 12!");
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) throws ValorEntreIntervaloException {
        if (ano >= 2000 && ano<=2018)
            this.ano = ano;
        else
            throw new ValorEntreIntervaloException("Ano deve ser entre 2000 e 2018!");
    }
}
