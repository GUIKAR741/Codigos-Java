package br.com.guikar.netbeans.ufc.poo.eclusa.controller;

import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.CargaMaximaException;
import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.MenorQueZeroException;
import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.NecessarioUmContainerException;
import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.ValorEntreIntervaloException;
import br.com.guikar.netbeans.ufc.poo.eclusa.exceptions.VazioException;
import br.com.guikar.netbeans.ufc.poo.eclusa.model.*;
import br.com.guikar.netbeans.ufc.poo.eclusa.view.EmbarcacoesView;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class EmbarcacoesController {

    private Eclusa model;
    private EmbarcacoesView view;
    private boolean podeCadastrar=true;



    public EmbarcacoesController(EmbarcacoesView view, Eclusa model) {
        if (view != null && model != null) {
            this.view = view;
            this.model = model;
        }
    }


    public void acao(ActionEvent evt) {
        String nome;
        float peso;
        int index = view.getListArray().getSelectedIndex(), indexEdit = 0;
        Container container;
        Pessoa pessoa;
        Embarcacao embarcacao;
        switch (evt.getActionCommand()) {
            case "Balsa":
                view.getListaTela().removeAllElements();
                view.getLista().clear();
                view.setLblNomeVisible(false);
                view.setTxtNomeVisible(false);
                view.setBtnAdd("Adicionar Container");
                view.setBtnEdit("Editar Container");
                view.setBtnRm("Remover Container");
                view.setLblContainer("Containers");
                break;
            case "Cargueiro":
                view.getListaTela().removeAllElements();
                view.getLista().clear();
                view.setLblNomeVisible(false);
                view.setTxtNomeVisible(false);
                view.setBtnAdd("Adicionar Container");
                view.setBtnEdit("Editar Container");
                view.setBtnRm("Remover Container");
                view.setLblContainer("Containers");
                break;
            case "Lancha":
                view.getListaTela().removeAllElements();
                view.getLista().clear();
                view.setLblNomeVisible(true);
                view.setTxtNomeVisible(true);
                view.setBtnAdd("Adicionar Pessoa");
                view.setBtnEdit("Editar Pessoa");
                view.setBtnRm("Remover Pessoa");
                view.setLblContainer("Pessoas");
                break;
            case "Adicionar Container":
                podeCadastrar = true;
                peso = view.getTxtPeso();
                container = new Container();
                try {
                    container.setPeso(peso);
                    container.setCodigo((int) ((Math.random() * 10000) + 1));
                } catch (MenorQueZeroException ex) {
                    view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    podeCadastrar = false;
                }
                if (podeCadastrar) {
                    view.setTxtPeso("");
                    view.getLista().add(container);
                    view.getListaTela().addElement("ID:" + container.getCodigo() + " Peso:" + container.getPeso());
                }
                break;
            case "Adicionar Pessoa":
                podeCadastrar = true;
                peso = view.getTxtPeso();
                nome = view.getTxtNome();
                pessoa = new Pessoa();
                try {
                    pessoa.setPeso(peso);
                    pessoa.setNome(nome);
                } catch (VazioException | MenorQueZeroException ex) {
                    view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    podeCadastrar = false;
                }
                if (podeCadastrar) {
                    view.setTxtPeso("");
                    view.setTxtNome("");
                    view.getLista().add(pessoa);
                    view.getListaTela().addElement("Nome:" + pessoa.getNome() + " Peso:" + pessoa.getPeso());
                }
                break;
            case "Atualizar Container":
                podeCadastrar = true;
                peso = view.getTxtPeso();
                container = ((Container) view.getLista().get(indexEdit));
                try {
                    container.setPeso(peso);
                } catch (MenorQueZeroException ex) {
                    view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    podeCadastrar = false;
                }
                if (podeCadastrar) {
                    view.getListaTela().setElementAt("ID: " + container.getCodigo() + " Peso: " + container.getPeso(), index);
                    view.setTxtPeso("");
                    view.setBtnAdd("Adicionar Container");
                }
                break;
            case "Atualizar Pessoa":
                podeCadastrar = true;
                peso = view.getTxtPeso();
                nome = view.getTxtNome();
                pessoa = ((Pessoa) view.getLista().get(indexEdit));
                try {
                    pessoa.setPeso(peso);
                    pessoa.setNome(nome);
                } catch (VazioException | MenorQueZeroException ex) {
                    view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    podeCadastrar = false;
                }
                if (podeCadastrar) {
                    view.getListaTela().setElementAt("Nome: " + pessoa.getNome() + " Peso: " + pessoa.getPeso(), index);
                    view.setTxtPeso("");
                    view.setTxtNome("");
                    view.setBtnAdd("Adicionar Pessoa");
                }
                break;
            case "Editar Container":
                if (index != -1) {
                    view.setTxtPeso(Float.toString(((Container) view.getLista().get(index)).getPeso()));
                    indexEdit = index;
                    view.setBtnAdd("Atualizar Container");
                } else {
                    view.mensagem("Erro", "Selecione um Container para Editar", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "Remover Container":
                if (index != -1) {
                    if(view.getBtnAdd().equals("Atualizar Container"))
                        view.setBtnAdd("Adicionar Container");
                    view.getLista().remove(index);
                    view.getListaTela().removeElementAt(index);
                } else {
                    view.mensagem("Erro", "Selecione um Container para Excluir", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "Editar Pessoa":
                if (index != -1) {
                    pessoa = (Pessoa) view.getLista().get(index);
                    view.setTxtPeso(Float.toString(pessoa.getPeso()));
                    view.setTxtNome(pessoa.getNome());
                    indexEdit = index;
                    view.setBtnAdd("Atualizar Pessoa");
                } else {
                    view.mensagem("Erro", "Selecione uma Pessoa para Editar", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "Remover Pessoa":
                if (index != -1) {
                    if(view.getBtnAdd().equals("Atualizar Pessoa"))
                        view.setBtnAdd("Adicionar Pessoa");
                    view.getLista().remove(index);
                    view.setTxtPeso("");
                    view.getListaTela().removeElementAt(index);
                } else {
                    view.mensagem("Erro", "Selecione uma Pessoa para Excluir", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "Adicionar Embarcação":
                embarcacao=criaEmbaracacao();
                if (podeCadastrar) {
                    model.entrarEmbarcacaoNaFila(embarcacao);
                    view.dispose();
                    view.mensagem("Sucesso", "Embarcação adicionada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "Atualizar Embarcação":
                embarcacao=criaEmbaracacao();
                if (podeCadastrar) {
                    model.atualizarEmbarcacaoNaFila(embarcacao);
                    view.dispose();
                    view.mensagem("Sucesso", "Embarcação Editada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
        }
    }
    private Embarcacao criaEmbaracacao(){
        String capitao, portoOri, portoDes, sentido;
        float largura, comprimento, cargaMaxima;
        int dia,mes,ano;
        Embarcacao embarcacao;
        Data data=new Data();
        podeCadastrar=true;
        capitao = view.getTxtCapitao();
        portoOri = view.getTxtPortoOri();
        portoDes = view.getTxtPortoDes();
        sentido = view.getSentido();
        largura = view.getTxtLargura();
        comprimento = view.getTxtComprimento();
        cargaMaxima = view.getTxtCargaMax();
        dia=view.getSpnDia();
        mes=view.getSpnMes();
        ano=view.getSpnAno();
        switch (view.getTipoEmbarcacao()) {
            case "Balsa": {
                embarcacao = new Balsa();
                for (int i = 0; i < view.getLista().size(); i++) {
                    ((Balsa) embarcacao).getContainers().add((Container) view.getLista().get(i));
                }
                break;
            }
            case "Cargueiro": {
                embarcacao = new Cargueiro();
                for (int i = 0; i < view.getLista().size(); i++) {
                    ((Cargueiro) embarcacao).getContainers().add((Container) view.getLista().get(i));
                }
                break;
            }
            default: {
                embarcacao = new Lancha();
                for (int i = 0; i < view.getLista().size(); i++) {
                    ((Lancha) embarcacao).getPessoas().add((Pessoa) view.getLista().get(i));
                }
                break;
            }
        }
        try {
            embarcacao.setCapitao(capitao);
            embarcacao.setPortoDeOrigem(portoOri);
            embarcacao.setPortoDeDestino(portoDes);
            embarcacao.setSentido(sentido);
            embarcacao.setCargaMaxima(cargaMaxima);
            if(comprimento<=model.getComprimento())
                embarcacao.setComprimento(comprimento);
            else{
                view.mensagem("Erro", "Comprimento deve ser Menor ou Igual ao Comprimento da Eclusa:"+model.getComprimento()+"!", JOptionPane.ERROR_MESSAGE);
                podeCadastrar = false;
            }
            if(largura<=model.getLargura())
                embarcacao.setLargura(largura);
            else{
                view.mensagem("Erro", "Largura deve ser Menor ou Igual a Largura da Eclusa:"+model.getLargura()+"!", JOptionPane.ERROR_MESSAGE);
                podeCadastrar = false;
            }
            embarcacao.setId(view.getIndex());
            embarcacao.calcularCarga();
            data.setDia(dia);
            data.setMes(mes);
            data.setAno(ano);
            embarcacao.setDataViagem(data);
        } catch (CargaMaximaException | NecessarioUmContainerException | MenorQueZeroException
                | VazioException | ValorEntreIntervaloException ex) {
            view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            podeCadastrar = false;
        }
        return embarcacao;
    }

}
