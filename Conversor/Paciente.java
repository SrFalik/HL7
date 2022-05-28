package Conversor;

import java.util.Arrays;

public class Paciente {

    private String CODIGO, NOME, NASCIMENTO, SEXO, LOGRADOURO, NUMERO, BAIRRO, CIDADE, UF, TELEFONE_CELULAR, TELEFONE_RESIDENCIAL, TELEFONE_COMERCIAL, RG, ORGAO_EMISSOR;

    public Paciente(String CODIGO, String NOME, String NASCIMENTO, String SEXO, String LOGRADOURO, String NUMERO, String BAIRRO, String CIDADE, String UF, String TELEFONE_CELULAR, String TELEFONE_RESIDENCIAL, String TELEFONE_COMERCIAL, String RG, String ORGAO_EMISSOR) {
        this.CODIGO = CODIGO;
        this.NOME = NOME;
        this.NASCIMENTO = NASCIMENTO;
        this.SEXO = SEXO;
        this.LOGRADOURO = LOGRADOURO;
        this.NUMERO = NUMERO;
        this.BAIRRO = BAIRRO;
        this.CIDADE = CIDADE;
        this.UF = UF;
        this.TELEFONE_CELULAR = TELEFONE_CELULAR;
        this.TELEFONE_RESIDENCIAL = TELEFONE_RESIDENCIAL;
        this.TELEFONE_COMERCIAL = TELEFONE_COMERCIAL;
        this.RG = RG;
        this.ORGAO_EMISSOR = ORGAO_EMISSOR;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getNASCIMENTO() {
        return NASCIMENTO;
    }

    public void setNASCIMENTO(String NASCIMENTO) {
        this.NASCIMENTO = NASCIMENTO;
    }

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public String getLOGRADOURO() {
        return LOGRADOURO;
    }

    public void setLOGRADOURO(String LOGRADOURO) {
        this.LOGRADOURO = LOGRADOURO;
    }

    public String getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(String NUMERO) {
        this.NUMERO = NUMERO;
    }

    public String getBAIRRO() {
        return BAIRRO;
    }

    public void setBAIRRO(String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }

    public String getCIDADE() {
        return CIDADE;
    }

    public void setCIDADE(String CIDADE) {
        this.CIDADE = CIDADE;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getTELEFONE_CELULAR() {
        return TELEFONE_CELULAR;
    }

    public void setTELEFONE_CELULAR(String TELEFONE_CELULAR) {
        this.TELEFONE_CELULAR = TELEFONE_CELULAR;
    }

    public String getTELEFONE_RESIDENCIAL() {
        return TELEFONE_RESIDENCIAL;
    }

    public void setTELEFONE_RESIDENCIAL(String TELEFONE_RESIDENCIAL) {
        this.TELEFONE_RESIDENCIAL = TELEFONE_RESIDENCIAL;
    }

    public String getTELEFONE_COMERCIAL() {
        return TELEFONE_COMERCIAL;
    }

    public void setTELEFONE_COMERCIAL(String TELEFONE_COMERCIAL) {
        this.TELEFONE_COMERCIAL = TELEFONE_COMERCIAL;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getORGAO_EMISSOR() {
        return ORGAO_EMISSOR;
    }

    public void setORGAO_EMISSOR(String ORGAO_EMISSOR) {
        this.ORGAO_EMISSOR = ORGAO_EMISSOR;
    }

    public void ajeitaNasc() {
        if (!NASCIMENTO.equals("NULL")) {
            String[] nascimento = NASCIMENTO.split("/");
            if (nascimento.length == 3) {
                String aux = nascimento[0];
                nascimento[0] = nascimento[2];
                nascimento[2] = aux;
                NASCIMENTO = Arrays.toString(nascimento).replaceAll("\\[", "").replaceAll("]", "").replaceAll("/", "").replaceAll(", ", "");
            }
            else {
                NASCIMENTO = "NULL";
            }
        }
    }
    public void ajeitaNome() {
        String[] nomeSobrenome = NOME.split(" ");
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
        NOME = Arrays.toString(nomeSobrenome).replaceAll(", ", "^").replaceAll("\\[", "").replaceAll("]", "");
    }

    @Override
    public String toString() {
        return "PID|||" +
                CODIGO + "||" +
                NOME.toUpperCase() + "|" +
                NASCIMENTO + "|" +
                SEXO.toUpperCase() + "|||" +
                LOGRADOURO.toUpperCase() + "^" +
                NUMERO.toUpperCase() + "^" +
                BAIRRO.toUpperCase() + "^" +
                CIDADE.toUpperCase() + "^" +
                UF.toUpperCase() + "||" +
                TELEFONE_CELULAR + "|" +
                TELEFONE_RESIDENCIAL + "|" +
                TELEFONE_COMERCIAL + "||" +
                RG + "^" +
                ORGAO_EMISSOR.toUpperCase();
    }
}
