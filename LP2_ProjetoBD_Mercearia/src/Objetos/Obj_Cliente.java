package Objetos;

/**
 * @author gabri
 */
public class Obj_Cliente {

    private int cd_Cliente;
    private String nome_Cliente;
    private int ddd_Cliente;
    private int tel_Cliente;
    private String email_Cliente;
    private String data_Nasc;
    private String sexo_Cliente;
    private String endereco_Cliente;
    private String estado_Cliente;
    private String cidade_Cliente;
    private int cd_uf;
    private int cd_cidade;

    public int getCd_Cliente() {
        return cd_Cliente;
    }

    public void setCd_Cliente(int cd_Cliente) {
        this.cd_Cliente = cd_Cliente;
    }

    public String getNome_Cliente() {
        return nome_Cliente;
    }

    public void setNome_Cliente(String nome_Cliente) {
        this.nome_Cliente = nome_Cliente;
    }

    public String getEmail_Cliente() {
        return email_Cliente;
    }

    public void setEmail_Cliente(String email_Cliente) {
        this.email_Cliente = email_Cliente;
    }

    public int getDdd_Cliente() {
        return ddd_Cliente;
    }

    public void setDdd_Cliente(int dd_Func) {
        this.ddd_Cliente = dd_Func;
    }

    public int getTel_Cliente() {
        return tel_Cliente;
    }

    public void setTel_Cliente(int tel_Cliente) {
        this.tel_Cliente = tel_Cliente;
    }

    public String getData_Nasc() {
        return data_Nasc;
    }

    public void setData_Nasc(String dataString) {
        this.data_Nasc = dataString;
    }

    public String getSexo_Cliente() {
        return sexo_Cliente;
    }

    public void setSexo_Cliente(String sexo_Cliente) {
        this.sexo_Cliente = sexo_Cliente;
    }

    public String getEstado_Cliente() {
        return estado_Cliente;
    }

    public void setEstado_Cliente(String estado_Cliente) {
        this.estado_Cliente = estado_Cliente;
    }

    public String getCidade_Cliente() {
        return cidade_Cliente;
    }

    public void setCidade_Cliente(String cidade_Cliente) {
        this.cidade_Cliente = cidade_Cliente;
    }

    public String getEndereco_Cliente() {
        return endereco_Cliente;
    }

    public void setEndereco_Cliente(String endereco_Cliente) {
        this.endereco_Cliente = endereco_Cliente;
    }

    public int get_cd_uf() {
        return cd_uf;
    }

    public void set_cd_uf(int cd) {
        this.cd_uf = cd;
    }

    public int get_cd_cidade() {
        return cd_cidade;
    }

    public void set_cd_cidade(int cd) {
        this.cd_cidade = cd;
    }

    public boolean isEmailValido_Dominio() {
        boolean saida = true;
        if (!email_Cliente.endsWith(".com.br") && (!email_Cliente.endsWith(".com")) && (!email_Cliente.endsWith(".net"))) {
            saida = false;
        }
        return saida;
    }

    public boolean isEmailValido_Arroba() {
        boolean saida = true;
        if (!email_Cliente.contains("@")) {
            saida = false;
        }
        return saida;
    }
}
