public class ControlCalidad {
    private int idControlCalidad;
    private String informeFinal;
    private String certificado;

    public ControlCalidad(int idControlCalidad, String informeFinal, String certificado) {
        this.idControlCalidad = idControlCalidad;
        this.informeFinal = informeFinal;
        this.certificado = certificado;
    }

    public int getIdControlCalidad() {
        return idControlCalidad;
    }

    public void setIdControlCalidad(int idControlCalidad) {
        this.idControlCalidad = idControlCalidad;
    }

    public String getInformeFinal() {
        return informeFinal;
    }

    public void setInformeFinal(String informeFinal) {
        this.informeFinal = informeFinal;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }
}
