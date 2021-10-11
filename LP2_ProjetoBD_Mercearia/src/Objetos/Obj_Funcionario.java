package Objetos;

/**
 * @author gabri
 */
public class Obj_Funcionario {
    //private Calendar data_atual = Calendar.getInstance();
    //private Date data = new Date(System.currentTimeMillis()); 
    //private SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-MM-dd"); 
    private int cd_Func;
    private String nome_Func;
    private int ddd_Func;
    private int tel_Func;
    private String email_Func;
    private String data_Nasc;
    private String sexo_Func;
    private String endereco_Func;
    private String estado_Func;
    private String cidade_Func;
    private String data_adm;
    private int cd_cidade;
    private int cd_uf;
    
    public int getCd_cidade(){
        return cd_cidade;
    }
    
    public void setCd_cidade(int cd){
        this.cd_cidade = cd;
    }
    
    public int getCd_uf(){
        return cd_uf;
    }
    
    public void setCd_uf(int cd){
        this.cd_uf = cd;
    }    

    public int getCd_Usuario() {
        return cd_Func;
    }

    public void setCd_Usuario(int cd_Func) {
        this.cd_Func = cd_Func;
    }

    public String getNome_Usuario() {
        return nome_Func;
    }

    public void setNome_Usuario(String nome_Func) {
        this.nome_Func = nome_Func;
    }

    public String getEmail_Func() {
        return email_Func;
    }

    public void setEmail_Func(String email_Func) {
        this.email_Func = email_Func;
    }

    public int getDdd_Func() {
        return ddd_Func;
    }

    public void setDdd_Func(int dd_Func) {
        this.ddd_Func = dd_Func;
    }

    public int getTel_Func() {
        return tel_Func;
    }

    public void setTel_Func(int tel_Func) {
        this.tel_Func = tel_Func;
    }

    public String getData_Nasc() {
        return data_Nasc;
    }

    public void setData_Nasc(String data_Nasc) {
        this.data_Nasc = data_Nasc;
    }

    public String getSexo_Func() {
        return sexo_Func;
    }

    public void setSexo_Func(String sexo_Func) {
        this.sexo_Func = sexo_Func;
    }

    public String getEstado_Func() {
        return estado_Func;
    }

    public void setEstado_Func(String estado_Func) {
        this.estado_Func = estado_Func;
    }

    public String getCidade_Func() {
        return cidade_Func;
    }

    public void setCidade_Func(String cidade_Func) {
        this.cidade_Func = cidade_Func;
    }

    public String getEndereco_Func() {
        return endereco_Func;
    }

    public void setEndereco_Func(String endereco_Func) {
        this.endereco_Func = endereco_Func;
    }
    
    public String getData_adm(){
        return data_adm;
    }
    
    public void setData_adm(String data_adm){
        this.data_adm = data_adm;
    }

    public boolean isEmailValido_Dominio() {
        boolean saida = true;
        if (!email_Func.endsWith(".com.br") && (!email_Func.endsWith(".com")) && (!email_Func.endsWith(".net"))) {
            saida = false;
        }
        return saida;
    }
    
    public boolean isEmailValido_Arroba() {
        boolean saida = true;
        if (!email_Func.contains("@")) {
            saida = false;
        }
        return saida;
    }
}
