package Objetos;

/**
 * @author gabri
 */
public class Obj_Fornecedor {

    private int cd_Fornecedor;
    private String nome_Fornecedo;
    private int ddd_Fornecedor;
    private int tel_Fornecedor;
    private String email_Fornecedor;
    private String endereco_Fornecedor;
    private String estado_Fornecedor;
    private String cidade_Fornecedor;
    private int cd_cidade;
    private int cd_estado;
    
    public int getCd_cidade(){
        return cd_cidade;
    }
    
    public void setCd_cidade(int cd){
        this.cd_cidade = cd;
    }
    
    public int getCd_uf(){
        return cd_estado;
    }
    
    public void setCd_uf(int cd){
        this.cd_estado = cd;
    }
    

    public int getCd_Fornecedor() {
        return cd_Fornecedor;
    }

    public void setCd_Fornecedor(int cd_Fornecedor) {
        this.cd_Fornecedor = cd_Fornecedor;
    }

    public String getNome_Fornecedor() {
        return nome_Fornecedo;
    }

    public void setNome_Fornecedor(String nome_Fornecedo) {
        this.nome_Fornecedo = nome_Fornecedo;
    }

    public String getEmail_Fornecedor() {
        return email_Fornecedor;
    }

    public void setEmail_Fornecedor(String email_Fornecedor) {
        this.email_Fornecedor = email_Fornecedor;
    }

    public int getDdd_Fornecedor() {
        return ddd_Fornecedor;
    }

    public void setDdd_Fornecedor(int ddd_Fornecedor) {
        this.ddd_Fornecedor = ddd_Fornecedor;
    }

    public int getTel_Fornecedor() {
        return tel_Fornecedor;
    }

    public void setTel_Fornecedor(int tel_Fornecedor) {
        this.tel_Fornecedor = tel_Fornecedor;
    }

    public String getEstado_Fornecedor() {
        return estado_Fornecedor;
    }

    public void setEstado_Fornecedor(String estado_Fornecedor) {
        this.estado_Fornecedor = estado_Fornecedor;
    }

    public String getCidade_Fornecedor() {
        return cidade_Fornecedor;
    }

    public void setCidade_Fornecedor(String cidade_Fornecedor) {
        this.cidade_Fornecedor = cidade_Fornecedor;
    }

    public String getEndereco_Fornecedor() {
        return endereco_Fornecedor;
    }

    public void setEndereco_Fornecedor(String endereco_Fornecedor) {
        this.endereco_Fornecedor = endereco_Fornecedor;
    }

    public boolean isEmailValido_Dominio() {
        boolean saida = true;
        if (!email_Fornecedor.endsWith(".com.br") && (!email_Fornecedor.endsWith(".com")) && (!email_Fornecedor.endsWith(".net"))) {
            saida = false;
        }
        return saida;
    }

    public boolean isEmailValido_Arroba() {
        boolean saida = true;
        if (!email_Fornecedor.contains("@")) {
            saida = false;
        }
        return saida;
    }
}
