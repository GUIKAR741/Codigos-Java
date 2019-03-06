package br.com.guikar.ufc.poo.hora.eventoempreendedorismo;
public class Empresa {
    private String nome;
    private String horaDeFuncionamento;
    private String areaDeNegocio;
    private Funcionario[] funcionario = new Funcionario[5];
    public Empresa() {
        super();
    }
    public Empresa(String nome) {
        this();
        setNome(nome);
    }
    public Empresa(String nome, String horaDeFuncionamento) {
        this(nome);
        setHoraDeFuncionamento(horaDeFuncionamento);
    }
    public Empresa(String nome, String horaDeFuncionamento, String areaDeNegocio) {
        this(nome, horaDeFuncionamento);
        setAreaDeNegocio(areaDeNegocio);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome != null)
            this.nome = nome;
    }
    public String getHoraDeFuncionamento() {
        return horaDeFuncionamento;
    }
    public void setHoraDeFuncionamento(String horaDeFuncionamento) {
        if (horaDeFuncionamento != null)
            this.horaDeFuncionamento = horaDeFuncionamento;
    }
    public String getAreaDeNegocio() {
        return areaDeNegocio;
    }
    public void setAreaDeNegocio(String areaDeNegocio) {
        if (areaDeNegocio != null)
            this.areaDeNegocio = areaDeNegocio;
    }
    public Funcionario[] getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        int ver = 0;
        for (int i = 0; i < this.funcionario.length; i++) {
            if (this.funcionario[i] == null) {
                this.funcionario[i] = funcionario;
                break;
            } else {
                ver++;
            }
        }
        if (ver == this.funcionario.length)
            try {
                throw new TamanhoFuncionariosException();
            } catch (TamanhoFuncionariosException e) {
                System.out.println("Erro:" + e.getMessage());
            }
    }
    public void checar() {
        Verificador verificador = new Verificador(this);
        try {
            verificador.verificar();
        } catch (CpfInvalidoException e) {
            System.out.println("Erro:" + e.getMessage());
            System.out.println("Funcionario:" + e.getFuncionario().getNome());
        } catch (CpfTamanhoException e) {
            System.out.println("Erro:" + e.getMessage());
            System.out.println("Funcionario:" + e.getFuncionario().getNome());
        } catch (CpfErradoException e) {
            System.out.println("Erro:" + e.getMessage());
            System.out.println("Funcionario:" + e.getFuncionario().getNome());
        } catch (NenhumFuncionarioException e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}