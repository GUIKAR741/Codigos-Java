package br.com.guikar.eclusa.controller;

import br.com.guikar.eclusa.exceptions.MenorQueZeroException;
import br.com.guikar.eclusa.exceptions.VazioException;
import br.com.guikar.eclusa.model.Balsa;
import br.com.guikar.eclusa.model.Cargueiro;
import br.com.guikar.eclusa.model.Container;
import br.com.guikar.eclusa.model.Eclusa;
import br.com.guikar.eclusa.model.Embarcacao;
import br.com.guikar.eclusa.model.Lancha;
import br.com.guikar.eclusa.model.Pessoa;
import br.com.guikar.eclusa.view.CaixaView;
import br.com.guikar.eclusa.view.EclusaView;
import br.com.guikar.eclusa.view.EmbarcacoesView;
import br.com.guikar.eclusa.view.GerenciamentoEclusaView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class EclusaController {

    private EclusaView view;
    private Eclusa model;
    private int idEmbarcacao = 0;
    private long tempo = 10;
    private boolean statusEclusa = false;
    private JLabel lblTeste;

    public EclusaController(EclusaView view, Eclusa model) {
        if (view != null && model != null) {
            this.view = view;
            this.model = model;
            lblTeste = new JLabel();
            int x = 175, y = 150;
            view.getPnlBarcos().add(lblTeste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, x, y));
            lblTeste.setSize(x, y);
        }
    }

    public void trocaImagem(JLabel label, String end) {
        ImageIcon image = new ImageIcon(getClass().getResource("/eclusa/images/" + end));
        image.setImage(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(image);
    }

    public Thread subirBarraRio(Thread espera) {
        Thread subirRio = new Thread() {
            public void run() {
                if (espera != null) {
                    try {
                        espera.join();
                    } catch (InterruptedException ex) {
                        view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
                int larg = view.getPnlBarRio().getSize().width;
                int alt = view.getPnlBarRio().getSize().height;
                int x = view.getPnlBarRio().getX();
                int y = view.getPnlBarRio().getY();
                int altOriginal = alt;
                while (true) {
                    alt++;
                    y--;
                    if (alt > altOriginal * 2) {
                        break;
                    }
                    view.getPnlBarRio().setLocation(x, y);
                    view.getPnlBarRio().setSize(larg, alt);
                    try {
                        sleep(tempo);
                    } catch (InterruptedException e) {
                        view.mensagem("Erro", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        };
        subirRio.start();
        return subirRio;
    }

    public Thread subirBarraMar(Thread espera) {
        Thread subirRio = new Thread() {
            public void run() {
                if (espera != null) {
                    try {
                        espera.join();
                    } catch (InterruptedException ex) {
                        view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
                int larg = view.getPnlBarMar().getSize().width;
                int alt = view.getPnlBarMar().getSize().height;
                int x = view.getPnlBarMar().getX();
                int y = view.getPnlBarMar().getY();
                int altOriginal = alt;
                while (true) {
                    alt++;
                    y--;
                    if (alt > altOriginal * 2) {
                        break;
                    }
                    view.getPnlBarMar().setLocation(x, y);
                    view.getPnlBarMar().setSize(larg, alt);
                    try {
                        sleep(tempo);
                    } catch (InterruptedException e) {
                        view.mensagem("Erro", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        };
        subirRio.start();
        return subirRio;
    }

    public Thread desceBarraRio(Thread espera) {
        Thread descerMar = new Thread() {
            public void run() {
                if (espera != null) {
                    try {
                        espera.join();
                    } catch (InterruptedException ex) {
                        view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
                int larg = view.getPnlBarRio().getSize().width;
                int alt = view.getPnlBarRio().getSize().height;
                int altOriginal = alt;
                int x = view.getPnlBarRio().getX();
                int y = view.getPnlBarRio().getY();
                while (true) {
                    alt--;
                    y++;
                    if (alt < altOriginal / 2) {
                        break;
                    }
                    view.getPnlBarRio().setLocation(x, y);
                    view.getPnlBarRio().setSize(larg, alt);
                    try {
                        sleep(tempo);
                    } catch (InterruptedException e) {
                        view.mensagem("Erro", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        };
        descerMar.start();
        return descerMar;
    }

    public Thread desceBarraMar(Thread espera) {
        Thread descerMar = new Thread() {
            public void run() {
                if (espera != null) {
                    try {
                        espera.join();
                    } catch (InterruptedException ex) {
                        view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
                int larg = view.getPnlBarMar().getSize().width;
                int alt = view.getPnlBarMar().getSize().height;
                int altOriginal = alt;
                int x = view.getPnlBarMar().getX();
                int y = view.getPnlBarMar().getY();
                while (true) {
                    alt--;
                    y++;
                    if (alt < altOriginal / 2) {
                        break;
                    }
                    view.getPnlBarMar().setLocation(x, y);
                    view.getPnlBarMar().setSize(larg, alt);
                    try {
                        sleep(tempo);
                    } catch (InterruptedException e) {
                        view.mensagem("Erro", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        };
        descerMar.start();
        return descerMar;
    }

    public Thread moveEmbarcacaoRioEclusa(Thread espera, String tipo) {
        lblTeste.setLocation(75, 75);
        if (tipo != null) {
            if (tipo.equals("Lancha")) {
                trocaImagem(lblTeste, tipo + "RioMar.png");
            } else if (tipo.equals("Balsa")) {
                trocaImagem(lblTeste, tipo + "RioMar.png");
            } else {
                trocaImagem(lblTeste, "CargueiroRioMar.png");
            }
        } else {
            trocaImagem(lblTeste, "CargueiroRioMar.png");
        }
        Thread rioEclusa = new Thread() {
            public void run() {
                if (espera != null) {
                    try {
                        espera.join();

                    } catch (InterruptedException ex) {
                        view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
                desceBarraRio(null);
                int x = lblTeste.getX(), y = lblTeste.getY();

                while (true) {
                    x++;
                    if (x > 500) {
                        break;
                    }
                    lblTeste.setLocation(x, y);
                    try {
                        sleep(tempo);
                    } catch (InterruptedException e) {
                        view.mensagem("Erro", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        };
        rioEclusa.start();
        return subirBarraRio(subirBarraRio(rioEclusa));
    }

    public Thread moveEmbarcacaoEclusaSubir(Thread espera) {
        desceBarraMar(subirEclusa(espera));

        Thread rioEclusa = new Thread() {
            public void run() {
                if (espera != null) {
                    try {
                        espera.join();
                    } catch (InterruptedException ex) {
                        view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
                int y = lblTeste.getY(), yCima = y - 80, x = lblTeste.getX();
                int vazao = (int) (Math.ceil((model.getCapacidadeMaxima() - model.getCapacidadeMinima()) / model.getVazao()));
                while (true) {
//                    y-=vazao;
                    y--;
                    if (y < yCima) {
                        break;
                    }
                    lblTeste.setLocation(x, y);
                    try {
                        sleep(tempo);
                    } catch (InterruptedException e) {
                        view.mensagem("Erro", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        };
        rioEclusa.start();
        return rioEclusa;
    }

    public Thread moveEmbarcacaoEclusaDesce(Thread espera) {
        desceEclusa(espera);
        Thread rioEclusa = new Thread() {
            public void run() {
                if (espera != null) {
                    try {
                        espera.join();
                    } catch (InterruptedException ex) {
                        view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
                int y = lblTeste.getY(), yCima = y + 80, x = lblTeste.getX();
                while (true) {
                    y++;
                    if (y > yCima) {
                        break;
                    }
                    lblTeste.setLocation(x, y);
                    try {
                        sleep(tempo);
                    } catch (InterruptedException e) {
                        view.mensagem("Erro", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        };
        rioEclusa.start();
        return desceBarraRio(desceBarraRio(rioEclusa));
    }

    public Thread moveEmbarcacaoEclusaMar(Thread espera) {
        Thread rioEclusa = new Thread() {
            public void run() {
                if (espera != null) {
                    try {
                        espera.join();
                    } catch (InterruptedException ex) {
                        view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
                int y = lblTeste.getY(), x = lblTeste.getX(), xFim = x + 500;
                while (true) {
                    x++;
                    if (x > xFim) {
                        break;
                    }
                    lblTeste.setLocation(x, y);
                    try {
                        sleep(tempo);
                    } catch (InterruptedException e) {
                        view.mensagem("Erro", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        };
        rioEclusa.start();
        return subirBarraMar(rioEclusa);
    }

    public Thread moveEmbarcacaoEclusaRio(Thread espera) {
        Thread rioEclusa = new Thread() {
            public void run() {
                if (espera != null) {
                    try {
                        espera.join();
                    } catch (InterruptedException ex) {
                        view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
                int x = lblTeste.getX(), y = lblTeste.getY();
                while (true) {
                    x--;
                    if (x < 75) {
                        break;
                    }
                    lblTeste.setLocation(x, y);
                    try {
                        sleep(tempo);
                    } catch (InterruptedException e) {
                        view.mensagem("Erro", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        };
        rioEclusa.start();
        return subirBarraRio(rioEclusa);
    }

    public Thread moveEmbarcacaoMarEclusa(Thread espera, String tipo) {
        desceBarraMar(espera);
        Thread rioEclusa = new Thread() {
            public void run() {
                if (espera != null) {
                    try {
                        espera.join();
                    } catch (InterruptedException ex) {
                        view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
                lblTeste.setLocation(1000, -5);
                if (tipo != null) {
                    if (tipo.equals("Lancha")) {
                        trocaImagem(lblTeste, tipo + "MarRio.png");
                    } else if (tipo.equals("Balsa")) {
                        trocaImagem(lblTeste, tipo + "MarRio.png");
                    } else {
                        trocaImagem(lblTeste, "CargueiroMarRio.png");
                    }
                } else {
                    trocaImagem(lblTeste, "CargueiroMarRio.png");
                }

                int x = lblTeste.getX(), y = lblTeste.getY();

                while (true) {
                    x--;
                    if (x < 510) {
                        break;
                    }
                    lblTeste.setLocation(x, y);
                    try {
                        sleep(tempo);
                    } catch (InterruptedException e) {
                        view.mensagem("Erro", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        };
        rioEclusa.start();
        return subirBarraMar(rioEclusa);
    }

    public Thread subirEclusa(Thread espera) {
        this.statusEclusa = true;
        Thread encher = new Thread() {
            public void run() {
                if (espera != null) {
                    try {
                        espera.join();
                    } catch (InterruptedException ex) {
                        view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
                int larg = view.getPnlEclusa().getSize().width;
                int alt = view.getPnlEclusa().getSize().height;
                int altOriginal = alt;
                int x = view.getPnlEclusa().getX();
                int y = view.getPnlEclusa().getY();
                while (true) {
                    alt++;
                    y--;
                    if (alt > altOriginal * 2) {
                        break;
                    }
                    view.getPnlEclusa().setLocation(x, y);
                    view.getPnlEclusa().setSize(larg, alt);
                    try {
                        sleep(tempo);
                    } catch (InterruptedException e) {
                        view.mensagem("Erro", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        };
        encher.start();
        return encher;
    }

    public Thread desceEclusa(Thread espera) {
        this.statusEclusa = false;
        Thread secar = new Thread() {
            public void run() {
                if (espera != null) {
                    try {
                        espera.join();
                    } catch (InterruptedException ex) {
                        view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
                int larg = view.getPnlEclusa().getSize().width;
                int alt = view.getPnlEclusa().getSize().height;
                int altOriginal = alt;
                int x = view.getPnlEclusa().getX();
                int y = view.getPnlEclusa().getY();
                while (true) {
                    alt--;
                    y++;
                    if (alt < altOriginal / 2) {
                        break;
                    }
                    view.getPnlEclusa().setLocation(x, y);
                    view.getPnlEclusa().setSize(larg, alt);
                    try {
                        sleep(tempo);
                    } catch (InterruptedException e) {
                        view.mensagem("Erro", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        };
        secar.start();
        return secar;
    }

    public void espera(Thread espera, boolean altera) {
        Thread esp = new Thread() {
            public void run() {
                if (espera != null) {
                    try {
                        espera.join();
                    } catch (InterruptedException ex) {
                        view.mensagem("Erro", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
                    if (altera) {
                        alteraBtn(altera);
                    }
                }

            }
        };
        esp.start();
    }

    private void gerenciarFila() {
        Thread thread = null;
        Embarcacao embarcacao;
        String tipoEmb;
        while (!model.getFilaRioMar().isEmpty() || !model.getFilaMarRio().isEmpty()) {
            if (!model.getFilaRioMar().isEmpty()) {
                embarcacao = model.getFilaRioMar().get(0);
                model.sairEmbarcacaoDaFila(embarcacao);
                if (embarcacao instanceof Cargueiro) {
                    tipoEmb = "Cargueiro";
                } else if (embarcacao instanceof Lancha) {
                    tipoEmb = "Lancha";
                } else {
                    tipoEmb = "Balsa";
                }
                if (this.statusEclusa) {
                    thread = desceBarraRio(desceEclusa(thread));
                    System.out.println(lblTeste.getLocation());
                }
                thread = moveEmbarcacaoRioEclusa(thread, tipoEmb);
                thread = moveEmbarcacaoEclusaSubir(thread);
                thread = moveEmbarcacaoEclusaMar(thread);
            }
            espera(thread, false);
            if (!model.getFilaMarRio().isEmpty()) {
                embarcacao = model.getFilaMarRio().get(0);
                model.sairEmbarcacaoDaFila(embarcacao);
                if (embarcacao instanceof Cargueiro) {
                    tipoEmb = "Cargueiro";
                } else if (embarcacao instanceof Lancha) {
                    tipoEmb = "Lancha";
                } else {
                    tipoEmb = "Balsa";
                }
                if (this.statusEclusa == false) {
                    subirEclusa(subirBarraRio(thread));
                }
                thread = moveEmbarcacaoMarEclusa(thread, tipoEmb);
                thread = moveEmbarcacaoEclusaDesce(thread);
                thread = moveEmbarcacaoEclusaRio(thread);
            }
            espera(thread, false);
        }
        if (thread != null) {
            espera(thread, true);
        }
    }

    public void acao(ActionEvent evt) {
        int indexRio = view.getListRio().getSelectedIndex();
        int indexMar = view.getListMar().getSelectedIndex();
        Embarcacao embarcacao;
        EmbarcacoesView tela;
        switch (evt.getActionCommand()) {
            case "<html><p style=\"text-align:center;\">Adicionar Embarcação</p></html>":
                tela = new EmbarcacoesView(model);
                tela.setIndex(idEmbarcacao++);
                tela.setVisible(true);
                break;
            case "<html><p style=\"text-align:center;\">Editar Embarcação Fila Rio-Mar</p></html>":
                if (indexRio != -1) {
                    embarcacao = ((Embarcacao) view.getListRio().getSelectedValue());
                    tela = new EmbarcacoesView(model);
                    tela.setBtnAddEmb("Atualizar Embarcação");
                    tela.setTxtCapitao(embarcacao.getCapitao());
                    tela.setTxtCargaMax(Float.toString(embarcacao.getCargaMaxima()));
                    tela.setTxtComprimento(Float.toString(embarcacao.getComprimento()));
                    tela.setTxtLargura(Float.toString(embarcacao.getLargura()));
                    tela.setTxtPortoDes(embarcacao.getPortoDeDestino());
                    tela.setTxtPortoOri(embarcacao.getPortoDeOrigem());
                    tela.setSpnDia(Integer.toString(embarcacao.getDataViagem().getDia()));
                    tela.setSpnMes(Integer.toString(embarcacao.getDataViagem().getMes()));
                    tela.setSpnAno(Integer.toString(embarcacao.getDataViagem().getAno()));
                    tela.getLista().clear();
                    if (embarcacao instanceof Balsa || embarcacao instanceof Cargueiro) {
                        tela.getListaTela().removeAllElements();
                        Container container;
                        if (embarcacao instanceof Balsa) {
                            tela.setTipoEmbarcacao("Balsa");
                            for (int i = 0; i < ((Balsa) embarcacao).getContainers().size(); i++) {
                                container = ((Balsa) embarcacao).getContainers().get(i);
                                tela.getLista().add(container);
                                tela.getListaTela().addElement("ID: " + container.getCodigo() + " Peso: " + container.getPeso());
                            }
                        } else if (embarcacao instanceof Cargueiro) {
                            tela.setTipoEmbarcacao("Cargueiro");
                            for (int i = 0; i < ((Cargueiro) embarcacao).getContainers().size(); i++) {
                                container = ((Cargueiro) embarcacao).getContainers().get(i);
                                tela.getLista().add(container);
                                tela.getListaTela().addElement("ID: " + container.getCodigo() + " Peso: " + container.getPeso());
                            }
                        }
                    } else if (embarcacao instanceof Lancha) {
                        tela.setTipoEmbarcacao("Lancha");
                        tela.getListaTela().removeAllElements();
                        tela.setTxtNomeVisible(true);
                        tela.setLblNomeVisible(true);
                        Pessoa pessoa;
                        for (int i = 0; i < ((Lancha) embarcacao).getPessoas().size(); i++) {
                            pessoa = ((Lancha) embarcacao).getPessoas().get(i);
                            tela.getLista().add(pessoa);
                            tela.getListaTela().addElement("Nome: " + pessoa.getNome() + " Peso: " + pessoa.getPeso());
                        }
                    }
                    tela.setIndex(embarcacao.getId());
                    tela.setVisible(true);
                } else {
                    view.mensagem("Erro", "Selecione uma embarcação da Fila Rio-Mar para Editar", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "<html><p style=\"text-align:center;\">Remover Embarcação Fila Rio-Mar</p></html>":
                if (indexRio != -1) {
                    embarcacao = ((Embarcacao) view.getListRio().getSelectedValue());
                    view.getListaRio().removeElementAt(indexRio);
                    model.sairEmbarcacaoDaFila(embarcacao);
                } else {
                    view.mensagem("Erro", "Selecione uma embarcação da Fila Rio-Mar para Excluir", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "<html><p style=\"text-align:center;\">Editar Embarcação Fila Mar-Rio</p></html>":
                if (indexMar != -1) {
                    embarcacao = ((Embarcacao) view.getListMar().getSelectedValue());
                    tela = new EmbarcacoesView(model);
                    tela.setBtnAddEmb("Atualizar Embarcação");
                    tela.setTxtCapitao(embarcacao.getCapitao());
                    tela.setTxtCargaMax(Float.toString(embarcacao.getCargaMaxima()));
                    tela.setTxtComprimento(Float.toString(embarcacao.getComprimento()));
                    tela.setTxtLargura(Float.toString(embarcacao.getLargura()));
                    tela.setTxtPortoDes(embarcacao.getPortoDeDestino());
                    tela.setTxtPortoOri(embarcacao.getPortoDeOrigem());
                    tela.setSpnDia(Integer.toString(embarcacao.getDataViagem().getDia()));
                    tela.setSpnMes(Integer.toString(embarcacao.getDataViagem().getMes()));
                    tela.setSpnAno(Integer.toString(embarcacao.getDataViagem().getAno()));
                    tela.setSentido(embarcacao.getSentido());
                    tela.getLista().clear();
                    if (embarcacao instanceof Balsa || embarcacao instanceof Cargueiro) {
                        tela.getListaTela().removeAllElements();
                        Container container;
                        if (embarcacao instanceof Balsa) {
                            tela.setTipoEmbarcacao("Balsa");
                            for (int i = 0; i < ((Balsa) embarcacao).getContainers().size(); i++) {
                                container = ((Balsa) embarcacao).getContainers().get(i);
                                tela.getLista().add(container);
                                tela.getListaTela().addElement("ID: " + container.getCodigo() + " Peso: " + container.getPeso());
                            }
                        } else if (embarcacao instanceof Cargueiro) {
                            tela.setTipoEmbarcacao("Cargueiro");
                            for (int i = 0; i < ((Cargueiro) embarcacao).getContainers().size(); i++) {
                                container = ((Cargueiro) embarcacao).getContainers().get(i);
                                tela.getLista().add(container);
                                tela.getListaTela().addElement("ID: " + container.getCodigo() + " Peso: " + container.getPeso());
                            }
                        }
                    } else if (embarcacao instanceof Lancha) {
                        tela.setTipoEmbarcacao("Lancha");
                        tela.getListaTela().removeAllElements();
                        tela.setTxtNomeVisible(true);
                        tela.setLblNomeVisible(true);
                        Pessoa pessoa;
                        for (int i = 0; i < ((Lancha) embarcacao).getPessoas().size(); i++) {
                            pessoa = ((Lancha) embarcacao).getPessoas().get(i);
                            tela.getLista().add(pessoa);
                            tela.getListaTela().addElement("Nome: " + pessoa.getNome() + " Peso: " + pessoa.getPeso());
                        }
                    }
                    tela.setIndex(embarcacao.getId());
                    tela.setVisible(true);
                } else {
                    view.mensagem("Erro", "Selecione uma embarcação da Fila Mar-Rio para Editar", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "<html><p style=\"text-align:center;\">Remover Embarcação Fila Mar-Rio</p></html>":
                if (indexMar != -1) {
                    embarcacao = ((Embarcacao) view.getListMar().getSelectedValue());
                    view.getListaMar().removeElementAt(indexMar);
                    model.sairEmbarcacaoDaFila(embarcacao);
                } else {
                    view.mensagem("Erro", "Selecione uma embarcação da Fila Mar-Rio para Excluir", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "<html><p style=\"text-align:center;\">Gerenciar Caixa</p></html>":
                new CaixaView(model).setVisible(true);
                break;
            case "<html><p style=\"text-align:center;\">Modificar Eclusa</p></html>":
                view.dispose();
                GerenciamentoEclusaView telaEclusa = new GerenciamentoEclusaView(model);
                telaEclusa.setBtnIniEclusa("Atualizar Eclusa");
                telaEclusa.setTxtCapMax(Float.toString(model.getCapacidadeMaxima()));
                telaEclusa.setTxtCapMin(Float.toString(model.getCapacidadeMinima()));
                telaEclusa.setTxtLargura(Float.toString(model.getLargura()));
                telaEclusa.setTxtComprimento(Float.toString(model.getComprimento()));
                telaEclusa.setTxtVazao(Float.toString(model.getVazao()));
                telaEclusa.setVisible(true);
                break;
            case "<html><p style=\"text-align:center;\">Iniciar Filas</p></html>":
                if (!model.getFilaRioMar().isEmpty() || !model.getFilaMarRio().isEmpty()) {
                    try {
                        model.calcularPreco();
                        alteraBtn(false);
                        gerenciarFila();
                    } catch (VazioException | MenorQueZeroException e) {
                        view.mensagem("Erro", e.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    view.mensagem("Erro", "Impossivel Iniciar Filas Não há Embarcacões!", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
    }

    private void alteraBtn(boolean altera) {
        view.btnIniciarEnable(altera);
        view.btnAddEmbEnable(altera);
        view.btnEditEmbMarRioEnable(altera);
        view.btnEditEmbRioMarEnable(altera);
        view.btnModEclusaEnable(altera);
        view.btnRemEmbMarRioEnable(altera);
        view.btnRemEmbRioMarEnable(altera);
    }
}
