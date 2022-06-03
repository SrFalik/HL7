package Conversor;

import java.util.Arrays;

public class RequisicaoObservacao {
    private final static String inicio = "OBR|1|";
    private final static String inicioDois = "OBX|1|SN|";
    private final static String finalmente = "<cr>";

    private String locEnvio;
    private String recebedor;
    private String locReceb;
    private String codigo;
    private String data;
    private String queixa;
    private String hda;
    private String hipotese;

    public RequisicaoObservacao(String locEnvio, String recebedor, String locReceb, String codigo, String data, String queixa, String hda, String hipotese) {
        this.locEnvio = locEnvio;
        this.recebedor = recebedor;
        this.locReceb = locReceb;
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

    public String getLocEnvio() {
        return locEnvio;
    }

    public void setLocEnvio(String locEnvio) {
        this.locEnvio = locEnvio;
    }

    public String getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(String recebedor) {
        this.recebedor = recebedor;
    }

    public String getLocReceb() {
        return locReceb;
    }

    public void setLocReceb(String locReceb) {
        this.locReceb = locReceb;
    }
    public void ajeitaData() {
        if (!data.equals("NULL")) {
            String[] date = data.split("/");
            if (date.length == 3) {
                String aux = date[0];
                date[0] = date[2];
                date[2] = aux;
                data = Arrays.toString(date).replaceAll("\\[", "").replaceAll("]", "").replaceAll("/", "").replaceAll(", ", "");
            }
            else {
                data = "NULL";
            }
        }
    }
    @Override
    public String toString() {
        return  inicio +
                (int) (Math.random() * 1000000) + "ˆ" + locReceb +
                "|" + (int) (Math.random() * 100000) + "ˆ" + locEnvio +
                "|||" + hda + "||" + data + "|||||||||" + finalmente;
    }

    public String toStringObx() {
        return inicioDois + hipotese + "|H|||F" + finalmente;
    }

}

