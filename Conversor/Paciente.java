package Conversor;

import java.util.Arrays;

public class Paciente {
    private String CODIGO, NOME, PARENTE_1, PARENTE_1_PARENTESCO, PARENTE_1_CONTATO, PARENTE_1_PROFISSAO, PARENTE_2, PARENTE_2_PARENTESCO, PARENTE_2_CONTATO, PARENTE_2_PROFISSAO, NASCIMENTO, SEXO, NATURALIDADE, NACIONALIDADE, ESTADO_CIVIL, PROFISSAO, RG, ORGAO_EMISSOR, DATA_EMISSAO, CPF, RACA, GRADUACAO, TELEFONE_RESIDENCIAL, TELEFONE_CELULAR, TELEFONE_COMERCIAL, TELEFONE_RECADO, NOME_RECADO, EMAIL, OBSERVACAO, NUMERO_DE_REFERENCIA, MATRICULA, CONVENIO, COMO_NOS_CONHECEU, OBSERVACAO_COMO_NOS_CONHECEU, ACEITA_RECEBER_SMS, ACEITA_RECEBER_WHATSAPP, RELIGIAO, OBITO, DATA_OBITO, OBSERVACAO_OBITO, CAUSA_OBITO, DESABILITADO, CODIGO2, LOGRADOURO, COMPLEMENTO, NUMERO, CEP, BAIRRO, CIDADE, UF, PAIS, CODIGOIBGE;

    public Paciente(String CODIGO, String NOME, String PARENTE_1, String PARENTE_1_PARENTESCO, String PARENTE_1_CONTATO, String PARENTE_1_PROFISSAO, String PARENTE_2, String PARENTE_2_PARENTESCO, String PARENTE_2_CONTATO, String PARENTE_2_PROFISSAO, String NASCIMENTO, String SEXO, String NATURALIDADE, String NACIONALIDADE, String ESTADO_CIVIL, String PROFISSAO, String RG, String ORGAO_EMISSOR, String DATA_EMISSAO, String CPF, String RACA, String GRADUACAO, String TELEFONE_RESIDENCIAL, String TELEFONE_CELULAR, String TELEFONE_COMERCIAL, String TELEFONE_RECADO, String NOME_RECADO, String EMAIL, String OBSERVACAO, String NUMERO_DE_REFERENCIA, String MATRICULA, String CONVENIO, String COMO_NOS_CONHECEU, String OBSERVACAO_COMO_NOS_CONHECEU, String ACEITA_RECEBER_SMS, String ACEITA_RECEBER_WHATSAPP, String RELIGIAO, String OBITO, String DATA_OBITO, String OBSERVACAO_OBITO, String CAUSA_OBITO, String DESABILITADO, String CODIGO2, String LOGRADOURO, String COMPLEMENTO, String NUMERO, String CEP, String BAIRRO, String CIDADE, String UF, String PAIS, String CODIGOIBGE) {
        this.CODIGO = CODIGO;
        this.NOME = NOME;
        this.PARENTE_1 = PARENTE_1;
        this.PARENTE_1_PARENTESCO = PARENTE_1_PARENTESCO;
        this.PARENTE_1_CONTATO = PARENTE_1_CONTATO;
        this.PARENTE_1_PROFISSAO = PARENTE_1_PROFISSAO;
        this.PARENTE_2 = PARENTE_2;
        this.PARENTE_2_PARENTESCO = PARENTE_2_PARENTESCO;
        this.PARENTE_2_CONTATO = PARENTE_2_CONTATO;
        this.PARENTE_2_PROFISSAO = PARENTE_2_PROFISSAO;
        this.NASCIMENTO = NASCIMENTO;
        this.SEXO = SEXO;
        this.NATURALIDADE = NATURALIDADE;
        this.NACIONALIDADE = NACIONALIDADE;
        this.ESTADO_CIVIL = ESTADO_CIVIL;
        this.PROFISSAO = PROFISSAO;
        this.RG = RG;
        this.ORGAO_EMISSOR = ORGAO_EMISSOR;
        this.DATA_EMISSAO = DATA_EMISSAO;
        this.CPF = CPF;
        this.RACA = RACA;
        this.GRADUACAO = GRADUACAO;
        this.TELEFONE_RESIDENCIAL = TELEFONE_RESIDENCIAL;
        this.TELEFONE_CELULAR = TELEFONE_CELULAR;
        this.TELEFONE_COMERCIAL = TELEFONE_COMERCIAL;
        this.TELEFONE_RECADO = TELEFONE_RECADO;
        this.NOME_RECADO = NOME_RECADO;
        this.EMAIL = EMAIL;
        this.OBSERVACAO = OBSERVACAO;
        this.NUMERO_DE_REFERENCIA = NUMERO_DE_REFERENCIA;
        this.MATRICULA = MATRICULA;
        this.CONVENIO = CONVENIO;
        this.COMO_NOS_CONHECEU = COMO_NOS_CONHECEU;
        this.OBSERVACAO_COMO_NOS_CONHECEU = OBSERVACAO_COMO_NOS_CONHECEU;
        this.ACEITA_RECEBER_SMS = ACEITA_RECEBER_SMS;
        this.ACEITA_RECEBER_WHATSAPP = ACEITA_RECEBER_WHATSAPP;
        this.RELIGIAO = RELIGIAO;
        this.OBITO = OBITO;
        this.DATA_OBITO = DATA_OBITO;
        this.OBSERVACAO_OBITO = OBSERVACAO_OBITO;
        this.CAUSA_OBITO = CAUSA_OBITO;
        this.DESABILITADO = DESABILITADO;
        this.CODIGO2 = CODIGO2;
        this.LOGRADOURO = LOGRADOURO;
        this.COMPLEMENTO = COMPLEMENTO;
        this.NUMERO = NUMERO;
        this.CEP = CEP;
        this.BAIRRO = BAIRRO;
        this.CIDADE = CIDADE;
        this.UF = UF;
        this.PAIS = PAIS;
        this.CODIGOIBGE = CODIGOIBGE;
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

    public String getPARENTE_1() {
        return PARENTE_1;
    }

    public void setPARENTE_1(String PARENTE_1) {
        this.PARENTE_1 = PARENTE_1;
    }

    public String getPARENTE_1_PARENTESCO() {
        return PARENTE_1_PARENTESCO;
    }

    public void setPARENTE_1_PARENTESCO(String PARENTE_1_PARENTESCO) {
        this.PARENTE_1_PARENTESCO = PARENTE_1_PARENTESCO;
    }

    public String getPARENTE_1_CONTATO() {
        return PARENTE_1_CONTATO;
    }

    public void setPARENTE_1_CONTATO(String PARENTE_1_CONTATO) {
        this.PARENTE_1_CONTATO = PARENTE_1_CONTATO;
    }

    public String getPARENTE_1_PROFISSAO() {
        return PARENTE_1_PROFISSAO;
    }

    public void setPARENTE_1_PROFISSAO(String PARENTE_1_PROFISSAO) {
        this.PARENTE_1_PROFISSAO = PARENTE_1_PROFISSAO;
    }

    public String getPARENTE_2() {
        return PARENTE_2;
    }

    public void setPARENTE_2(String PARENTE_2) {
        this.PARENTE_2 = PARENTE_2;
    }

    public String getPARENTE_2_PARENTESCO() {
        return PARENTE_2_PARENTESCO;
    }

    public void setPARENTE_2_PARENTESCO(String PARENTE_2_PARENTESCO) {
        this.PARENTE_2_PARENTESCO = PARENTE_2_PARENTESCO;
    }

    public String getPARENTE_2_CONTATO() {
        return PARENTE_2_CONTATO;
    }

    public void setPARENTE_2_CONTATO(String PARENTE_2_CONTATO) {
        this.PARENTE_2_CONTATO = PARENTE_2_CONTATO;
    }

    public String getPARENTE_2_PROFISSAO() {
        return PARENTE_2_PROFISSAO;
    }

    public void setPARENTE_2_PROFISSAO(String PARENTE_2_PROFISSAO) {
        this.PARENTE_2_PROFISSAO = PARENTE_2_PROFISSAO;
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

    public String getNATURALIDADE() {
        return NATURALIDADE;
    }

    public void setNATURALIDADE(String NATURALIDADE) {
        this.NATURALIDADE = NATURALIDADE;
    }

    public String getNACIONALIDADE() {
        return NACIONALIDADE;
    }

    public void setNACIONALIDADE(String NACIONALIDADE) {
        this.NACIONALIDADE = NACIONALIDADE;
    }

    public String getESTADO_CIVIL() {
        return ESTADO_CIVIL;
    }

    public void setESTADO_CIVIL(String ESTADO_CIVIL) {
        this.ESTADO_CIVIL = ESTADO_CIVIL;
    }

    public String getPROFISSAO() {
        return PROFISSAO;
    }

    public void setPROFISSAO(String PROFISSAO) {
        this.PROFISSAO = PROFISSAO;
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

    public String getDATA_EMISSAO() {
        return DATA_EMISSAO;
    }

    public void setDATA_EMISSAO(String DATA_EMISSAO) {
        this.DATA_EMISSAO = DATA_EMISSAO;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRACA() {
        return RACA;
    }

    public void setRACA(String RACA) {
        this.RACA = RACA;
    }

    public String getGRADUACAO() {
        return GRADUACAO;
    }

    public void setGRADUACAO(String GRADUACAO) {
        this.GRADUACAO = GRADUACAO;
    }

    public String getTELEFONE_RESIDENCIAL() {
        return TELEFONE_RESIDENCIAL;
    }

    public void setTELEFONE_RESIDENCIAL(String TELEFONE_RESIDENCIAL) {
        this.TELEFONE_RESIDENCIAL = TELEFONE_RESIDENCIAL;
    }

    public String getTELEFONE_CELULAR() {
        return TELEFONE_CELULAR;
    }

    public void setTELEFONE_CELULAR(String TELEFONE_CELULAR) {
        this.TELEFONE_CELULAR = TELEFONE_CELULAR;
    }

    public String getTELEFONE_COMERCIAL() {
        return TELEFONE_COMERCIAL;
    }

    public void setTELEFONE_COMERCIAL(String TELEFONE_COMERCIAL) {
        this.TELEFONE_COMERCIAL = TELEFONE_COMERCIAL;
    }

    public String getTELEFONE_RECADO() {
        return TELEFONE_RECADO;
    }

    public void setTELEFONE_RECADO(String TELEFONE_RECADO) {
        this.TELEFONE_RECADO = TELEFONE_RECADO;
    }

    public String getNOME_RECADO() {
        return NOME_RECADO;
    }

    public void setNOME_RECADO(String NOME_RECADO) {
        this.NOME_RECADO = NOME_RECADO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getOBSERVACAO() {
        return OBSERVACAO;
    }

    public void setOBSERVACAO(String OBSERVACAO) {
        this.OBSERVACAO = OBSERVACAO;
    }

    public String getNUMERO_DE_REFERENCIA() {
        return NUMERO_DE_REFERENCIA;
    }

    public void setNUMERO_DE_REFERENCIA(String NUMERO_DE_REFERENCIA) {
        this.NUMERO_DE_REFERENCIA = NUMERO_DE_REFERENCIA;
    }

    public String getMATRICULA() {
        return MATRICULA;
    }

    public void setMATRICULA(String MATRICULA) {
        this.MATRICULA = MATRICULA;
    }

    public String getCONVENIO() {
        return CONVENIO;
    }

    public void setCONVENIO(String CONVENIO) {
        this.CONVENIO = CONVENIO;
    }

    public String getCOMO_NOS_CONHECEU() {
        return COMO_NOS_CONHECEU;
    }

    public void setCOMO_NOS_CONHECEU(String COMO_NOS_CONHECEU) {
        this.COMO_NOS_CONHECEU = COMO_NOS_CONHECEU;
    }

    public String getOBSERVACAO_COMO_NOS_CONHECEU() {
        return OBSERVACAO_COMO_NOS_CONHECEU;
    }

    public void setOBSERVACAO_COMO_NOS_CONHECEU(String OBSERVACAO_COMO_NOS_CONHECEU) {
        this.OBSERVACAO_COMO_NOS_CONHECEU = OBSERVACAO_COMO_NOS_CONHECEU;
    }

    public String getACEITA_RECEBER_SMS() {
        return ACEITA_RECEBER_SMS;
    }

    public void setACEITA_RECEBER_SMS(String ACEITA_RECEBER_SMS) {
        this.ACEITA_RECEBER_SMS = ACEITA_RECEBER_SMS;
    }

    public String getACEITA_RECEBER_WHATSAPP() {
        return ACEITA_RECEBER_WHATSAPP;
    }

    public void setACEITA_RECEBER_WHATSAPP(String ACEITA_RECEBER_WHATSAPP) {
        this.ACEITA_RECEBER_WHATSAPP = ACEITA_RECEBER_WHATSAPP;
    }

    public String getRELIGIAO() {
        return RELIGIAO;
    }

    public void setRELIGIAO(String RELIGIAO) {
        this.RELIGIAO = RELIGIAO;
    }

    public String getOBITO() {
        return OBITO;
    }

    public void setOBITO(String OBITO) {
        this.OBITO = OBITO;
    }

    public String getDATA_OBITO() {
        return DATA_OBITO;
    }

    public void setDATA_OBITO(String DATA_OBITO) {
        this.DATA_OBITO = DATA_OBITO;
    }

    public String getOBSERVACAO_OBITO() {
        return OBSERVACAO_OBITO;
    }

    public void setOBSERVACAO_OBITO(String OBSERVACAO_OBITO) {
        this.OBSERVACAO_OBITO = OBSERVACAO_OBITO;
    }

    public String getCAUSA_OBITO() {
        return CAUSA_OBITO;
    }

    public void setCAUSA_OBITO(String CAUSA_OBITO) {
        this.CAUSA_OBITO = CAUSA_OBITO;
    }

    public String getDESABILITADO() {
        return DESABILITADO;
    }

    public void setDESABILITADO(String DESABILITADO) {
        this.DESABILITADO = DESABILITADO;
    }

    public String getCODIGO2() {
        return CODIGO2;
    }

    public void setCODIGO2(String CODIGO2) {
        this.CODIGO2 = CODIGO2;
    }

    public String getLOGRADOURO() {
        return LOGRADOURO;
    }

    public void setLOGRADOURO(String LOGRADOURO) {
        this.LOGRADOURO = LOGRADOURO;
    }

    public String getCOMPLEMENTO() {
        return COMPLEMENTO;
    }

    public void setCOMPLEMENTO(String COMPLEMENTO) {
        this.COMPLEMENTO = COMPLEMENTO;
    }

    public String getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(String NUMERO) {
        this.NUMERO = NUMERO;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
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

    public String getPAIS() {
        return PAIS;
    }

    public void setPAIS(String PAIS) {
        this.PAIS = PAIS;
    }

    public String getCODIGOIBGE() {
        return CODIGOIBGE;
    }

    public void setCODIGOIBGE(String CODIGOIBGE) {
        this.CODIGOIBGE = CODIGOIBGE;
    }

    public void ajeitaNasc() {
        if (NASCIMENTO != "NULL" && NASCIMENTO != null) {
            String[] nascimento = NASCIMENTO.split("/");
            if (nascimento.length == 3) {
                String aux = nascimento[0];
                nascimento[0] = nascimento[2];
                nascimento[2] = aux;
                String nascPreFormat = Arrays.toString(nascimento).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("/", "").replaceAll(", ", "");
                NASCIMENTO = nascPreFormat;
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
        String nomePreFormat = Arrays.toString(nomeSobrenome).replaceAll(", ", "^").replaceAll("\\[", "").replaceAll("\\]", "");
        NOME = nomePreFormat;
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
                ORGAO_EMISSOR;
    }
}
