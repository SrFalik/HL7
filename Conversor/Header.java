package Conversor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Header {
    private static final String inicio = "MSH|^~\\&|";
    private static final String enviante = "FALIK PROGRAM";
    private String locEnvio;
    private String recebedor;
    private String locReceb;

    private static final DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

    private static final String tipo = "ORU^R01";
    private String misterio; // "CNTRL-3456"
    private String misterioDois; // "P"
    private static final String versao = "2.4<cr>";

    public Header(String locEnvio, String recebedor, String locReceb, String misterio, String misterioDois) {
        this.locEnvio = locEnvio;
        this.recebedor = recebedor;
        this.locReceb = locReceb;
        this.misterio = misterio;
        this.misterioDois = misterioDois;
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

    public String getMisterio() {
        return misterio;
    }

    public void setMisterio(String misterio) {
        this.misterio = misterio;
    }

    public String getMisterioDois() {
        return misterioDois;
    }

    public void setMisterioDois(String misterioDois) {
        this.misterioDois = misterioDois;
    }

    public String getVersao() {
        return versao;
    }

    @Override
    public String toString() {
        return inicio +
        enviante + "|" +
        locEnvio + "|" +
        recebedor + "|" +
        locReceb + "|" +
        dateFormat.format(new Date()) + "||" +
        tipo + "|" +
        misterio + "|" +
        misterioDois + "|" +
        versao;
    }
}
