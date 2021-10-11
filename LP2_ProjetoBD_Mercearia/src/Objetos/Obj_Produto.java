package Objetos;

/**
 * @author gabri
 */
public class Obj_Produto {

    int cd_produto;
    String marca;
    String tipo;
    String descricao;
    float val_desconto;
    float val_unitario;
    int cd_marca;

    public int getCDProduto() {
        return cd_produto;
    }

    public void setCDProduto(int cd) {
        this.cd_produto = cd;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValDesconto() {
        return val_desconto;
    }

    public void setValDesconto(float val_desconto) {
        this.val_desconto = val_desconto;
    }

    public float getValUnitario() {
        return val_unitario;
    }

    public void setValUnitario(float val_unitario) {
        this.val_unitario = val_unitario;
    }

    public int getCdMarca() {
        return cd_marca;
    }

    public void setCdMarca(int cd) {
        this.cd_marca = cd;
    }
}
