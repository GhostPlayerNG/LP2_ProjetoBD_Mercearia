package Objetos;

/**
 * @author gabri
 */
public class Obj_Cidade {
    int cod;
    int cod_uf;
    String nome;
    String abrv;
    String fk_abrv;
    
    public int getCod_uf(){
        return cod_uf;
    }
    
    public void setCod_uf(int cod){
        this.cod_uf = cod;
    }
    
    public String getFk_abrv(){
        return fk_abrv;
    }
    
    public void setFk_abrv(String fk){
        this.fk_abrv = fk;
    }
    
    public int getcod(){
        return cod;
    }
    
    public void setcod(int c){
        this.cod = c;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public String getAbrev(){
        return abrv;
    }
    
    public void setAbrev(String a){
        this.abrv = a;
    }
    
    public boolean isAbrv_Cidade_Valida() {
       boolean saida=false;
       if(this.abrv.length()==3) {
           saida=true;
       }
       return saida;
   }
      
   public boolean isNome_Cidade_Valida() {
       boolean saida=false;
       if(this.nome.length()<=25) {
           saida=true;
       }
       return saida;
   }
}
