package Objetos;

/**
 * @author gabri
 */
public class Obj_Estado {
    int cod;
    String nome;
    String abrv;
    
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
    
    public boolean isAbrv_UF_Valida() {
       boolean saida=false;
       if(this.abrv.length()==2) {
           saida=true;
       }
       return saida;
   }
      
   public boolean isNome_UF_Valida() {
       boolean saida=false;
       if(this.nome.length()<=25) {
           saida=true;
       }
       return saida;
   }
}
