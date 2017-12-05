package edu.ifsc.canoinhas.snct.snctifsccanoinhas.IHC.classes;

/**
 * Created by estagiario on 30/11/17.
 */

public class Palestrante {

    private String p_nome;
    private String p_descricao;

    public Palestrante(String p_nome) {
        this.p_nome = p_nome;
    }

    public String getP_nome() {
        return p_nome;
    }

    public void setP_nome(String p_nome) {
        this.p_nome = p_nome;
    }

    public String getP_descricao() {
        return p_descricao;
    }

    public void setP_descricao(String p_descricao) {
        this.p_descricao = p_descricao;
    }

    @Override
    public String toString(){
        return "Palestrante "+p_nome;
    }
}
