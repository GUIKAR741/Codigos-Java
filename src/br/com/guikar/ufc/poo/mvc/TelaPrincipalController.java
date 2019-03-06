package br.com.guikar.ufc.poo.mvc;

public class TelaPrincipalController extends Observer{
    private TelaPrincipal view;
    private Placar model;

    public TelaPrincipalController(TelaPrincipal view, Placar model) {
        if (view != null && model != null) {
            this.view = view;
            this.model = model;
        }
    }

    public void acao(int opcao){
        switch (opcao){
            case 1:
                view.lerTime(1);
                break;
            case 2:
                view.lerTime(2);
                break;
            case 3:
                model.addPonto(1);
                break;
            case 4:
                model.addPonto(2);
                break;
            case 5:
                model.setTime(view.getTime(),view.getNome());
                break;
        }
    }
}
