package br.com.guikar.ufc.poo.hora.eventoempreendedorismo;
public class Verificador {
    private Empresa empresa;
    public Verificador(Empresa empresa) {
        setEmpresa(empresa);
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        if(empresa!=null)
            this.empresa = empresa;
    }
    public void verificar() throws CpfInvalidoException, CpfTamanhoException, CpfErradoException, NenhumFuncionarioException {
        String cpf;
        Funcionario funcio;
        int qtd=0;
        for (int i = 0; i < empresa.getFuncionario().length; i++)
            if (empresa.getFuncionario()[i] != null)
                qtd++;
        if(qtd==0)
            throw new NenhumFuncionarioException();
        for (int i = 0; i < empresa.getFuncionario().length; i++) {
            funcio=empresa.getFuncionario()[i];
            if(funcio!=null) {
                cpf = funcio.getCpf();
                int cont = 0, peso = 10, dig0, dig1;
                if (cpf.length() < 11)
                    throw new CpfTamanhoException(funcio);
                for (int j = 0; j < 9; j++) {
                    if (Character.isDigit(cpf.charAt(j))) {
                        cont += Integer.parseInt(String.valueOf(cpf.charAt(j))) * peso;
                        peso--;
                    } else
                        throw new CpfErradoException(funcio);
                }
                int resto1 = 11 - (cont % 11);
                if (resto1 > 9)
                    dig0 = 0;
                else
                    dig0 = resto1;
                peso = 11;
                cont = 0;
                for (int j = 0; j < 10; j++) {
                    cont += Integer.parseInt(String.valueOf(cpf.charAt(j))) * peso;
                    peso--;
                }
                int resto2 = 11 - (cont % 11);
                if (resto2 > 9)
                    dig1 = 0;
                else
                    dig1 = resto2;
                if (!(dig0 == Integer.parseInt(String.valueOf(cpf.charAt(cpf.length() - 2))) &&
                        dig1 == Integer.parseInt(String.valueOf(cpf.charAt(cpf.length() - 1)))))
                    throw new CpfInvalidoException(funcio);
            }
        }
    }
}
