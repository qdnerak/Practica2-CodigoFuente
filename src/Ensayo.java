public class Ensayo {
    private String codigoEnsayo;
   private String medidas;
    private String tipo1;
    private String tipo2;
    private String tipo3;

    public Ensayo(String codigoEnsayo, String medidas, String tipo1, String tipo2, String tipo3) {
        this.codigoEnsayo = codigoEnsayo;
        this.medidas = medidas;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.tipo3 = tipo3;
    }

    public String getCodigoEnsayo() {
        return codigoEnsayo;
    }

    public void setCodigoEnsayo(String codigoEnsayo) {
        this.codigoEnsayo = codigoEnsayo;
    }

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getTipo3() {
        return tipo3;
    }

    public void setTipo3(String tipo3) {
        this.tipo3 = tipo3;
    }
}
