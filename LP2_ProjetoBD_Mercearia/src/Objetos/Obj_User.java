package Objetos;

/**
 * @author gabri
 */
public class Obj_User {
    private int cd_user;
    private String user;
    private String senha;
    private String Login_user;
    private String Login_senha;
    
    public int getCd(){
        return cd_user;
    }
    
    public void setCd(int cd){
        this.cd_user = cd;
    }
    
    public String getUser(){
        return user;
    }
    
    public void setUser(String u){
        this.user = u;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String s){
        this.senha = s;
    }
    
    public String getLoginUser(){
        return Login_user;
    }
    
    public void setLoginUser(String u){
        this.Login_user = u;
    }
    
    public String getLoginSenha(){
        return Login_senha;
    }
    
    public void setLoginSenha(String s){
        this.Login_senha = s;
    }
    
    public boolean isSenhaValida(){
        boolean saida = false; 
        if(this.senha.length()>4 && this.senha.length() <=15){
            saida = true;
        }
        if(this.senha.contains("0")| this.senha.contains("1") | this.senha.contains("2") | this.senha.contains("3") | this.senha.contains("4") | this.senha.contains("5")
                | this.senha.contains("6") | this.senha.contains("7") | this.senha.contains("8") | this.senha.contains("9")){
            saida = true;
        }
        return saida;        
    }
    
    public boolean isSenhaIgual(){
        boolean saida = false;
        if(this.Login_senha.equals(this.senha)){
            saida = true;
        }
        return saida;
    }
}
