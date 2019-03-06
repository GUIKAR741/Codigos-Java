package br.com.guikar.netbeans.ufc.poo.eclusa.controller;

import br.com.guikar.netbeans.ufc.poo.eclusa.model.Caixa;
import br.com.guikar.netbeans.ufc.poo.eclusa.model.Data;
import br.com.guikar.netbeans.ufc.poo.eclusa.model.Eclusa;
import br.com.guikar.netbeans.ufc.poo.eclusa.model.Registro;
import br.com.guikar.netbeans.ufc.poo.eclusa.view.CaixaView;
import java.awt.event.ActionEvent;

public class CaixaController {

    private CaixaView view;
    private Eclusa model;
    private Caixa caixa;
    public CaixaController(CaixaView view,Eclusa model) {
        if (view != null && model != null) {
            this.model = model;
            this.view = view;
            caixa=this.model.getCaixa();
        }
    }

    public Caixa getCaixa() {
        return caixa;
    }
    
    public void acao(ActionEvent evt){
        switch(evt.getActionCommand()){
            case "Procurar":
                int dia=view.getSpnDia(),mes=view.getSpnMes(),ano=view.getSpnAno();
                view.getLista().removeAllElements();
                Registro reg;
                Data data;
                for (int i = 0; i < caixa.getHistorico().size(); i++) {
                    reg=caixa.getHistorico().get(i);
                    data=reg.getData();
                    if(data.getDia()==dia && data.getMes()==mes && data.getAno()==ano){
                        view.getLista().addElement(reg);
                    }
                }
                break;
            case "Resetar":
                view.update();
                break;
        }
                
    }
    
    
}
