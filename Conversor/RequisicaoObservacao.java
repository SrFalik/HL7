package Conversor;

import java.util.Date;

public class RequisicaoObservacao {
    private final static String inicio = "OBR|1|";
    private final static String inicioDois = "OBX|1|";
    private final static String finalmente = "<cr>";
    private String codigo;
    private String data;
    private String queixa;
    private String hda;
    private String hipotese;

    public RequisicaoObservacao(String codigo, String data, String queixa, String hda, String hipotese) {
        this.codigo = codigo;
        this.data = data;
        this.queixa = queixa;
        this.hda = hda;
        this.hipotese = hipotese;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getQueixa() {
        return queixa;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public String getHda() {
        return hda;
    }

    public void setHda(String hda) {
        this.hda = hda;
    }

    public String getHipotese() {
        return hipotese;
    }

    public void setHipotese(String hipotese) {
        this.hipotese = hipotese;
    }

    @Override
    public String toString() {
        return  inicio +
                queixa + "|" +
                data + "|" +
                queixa + "|" +
                hda +
                hipotese;
    }
}

