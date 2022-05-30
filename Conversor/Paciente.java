package Conversor;

import java.util.Arrays;

public class Paciente {

    private String codigo, nome, nascimento, sexo, logradouro, numero, bairro, cidade, uf, telefoneCelular, telefoneResidencial, telefoneComercial, rg, orgaoEmissor;

    public Paciente(String codigo, String nome, String nascimento, String sexo, String logradouro, String numero, String bairro, String cidade, String uf, String telefoneCelular, String telefoneResidencial, String telefoneComercial, String rg, String orgaoEmissor) {
        this.codigo = codigo;
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.telefoneCelular = telefoneCelular;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneComercial = telefoneComercial;
        this.rg = rg;
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getnascimento() {
        return nascimento;
    }

    public void setnascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getsexo() {
        return sexo;
    }

    public void setsexo(String sexo) {
        this.sexo = sexo;
    }

    public String getlogradouro() {
        return logradouro;
    }

    public void setlogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getnumero() {
        return numero;
    }

    public void setnumero(String numero) {
        this.numero = numero;
    }

    public String getbairro() {
        return bairro;
    }

    public void setbairro(String bairro) {
        this.bairro = bairro;
    }

    public String getcidade() {
        return cidade;
    }

    public void setcidade(String cidade) {
        this.cidade = cidade;
    }

    public String getuf() {
        return uf;
    }

    public void setuf(String uf) {
        this.uf = uf;
    }

    public String gettelefoneCelular() {
        return telefoneCelular;
    }

    public void settelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefone_residencial) {
        this.telefoneResidencial = telefone_residencial;
    }

    public String gettelefoneComercial() {
        return telefoneComercial;
    }

    public void settelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getrg() {
        return rg;
    }

    public void setrg(String rg) {
        this.rg = rg;
    }

    public String getorgaoEmissor() {
        return orgaoEmissor;
    }

    public void setorgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public void ajeitaNasc() {
        if (!nascimento.equals("NULL")) {
            String[] nasc = nascimento.split("/");
            if (nasc.length == 3) {
                String aux = nasc[0];
                nasc[0] = nasc[2];
                nasc[2] = aux;
                nascimento = Arrays.toString(nasc).replaceAll("\\[", "").replaceAll("]", "").replaceAll("/", "").replaceAll(", ", "");
            }
            else {
                nascimento = "NULL";
            }
        }
    }
    public void ajeitaNome() {
        String[] nomeSobrenome = nome.split(" ");
        int contador = 0;
        String aux;
        int parada = nomeSobrenome.length / 2;
        for (String s : nomeSobrenome) {
            aux = nomeSobrenome[contador];
            nomeSobrenome[contador] = nomeSobrenome[(nomeSobrenome.length - 1) - contador];
            nomeSobrenome[(nomeSobrenome.length - 1) - contador] = aux;
            if (contador == parada) {
                break;
            }
            contador++;
        }
        nome = Arrays.toString(nomeSobrenome).replaceAll(", ", "^").replaceAll("\\[", "").replaceAll("]", "");
    }

    @Override
    public String toString() {
        return "PID|||" +
                codigo + "||" +
                nome.toUpperCase() + "|" +
                nascimento + "|" +
                sexo.toUpperCase() + "|||" +
                logradouro.toUpperCase() + "^" +
                numero.toUpperCase() + "^" +
                bairro.toUpperCase() + "^" +
                cidade.toUpperCase() + "^" +
                uf.toUpperCase() + "||" +
                telefoneCelular + "|" +
                telefoneResidencial + "|" +
                telefoneComercial + "||" +
                rg.replaceAll(",", "").replaceAll("-", "").replaceAll("\\.", "") + "^" +
                orgaoEmissor.toUpperCase() +
                "<cr>";
    }
}
