package edu.ifsc.canoinhas.snct.snctifsccanoinhas.IHC.classes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by estagiario on 30/11/17.
 */

public class Atividade {

    private String a_titulo;
    private String a_descricao;
    private String a_local;
    private String a_tipo_atividade;
    private ArrayList <Palestrante> a_palestrantes;
    private Date a_horario;

    public Atividade(String a_titulo, String a_local, Date a_horario) {//Construtor com as informações básico
        this.a_titulo = a_titulo;
        this.a_local = a_local;
        this.a_horario = a_horario;
    }

    public String getA_titulo() {
        return a_titulo;
    }

    public void setA_titulo(String a_titulo) {
        this.a_titulo = a_titulo;
    }

    public String getA_descricao() {
        return a_descricao;
    }

    public void setA_descricao(String a_descricao) {
        this.a_descricao = a_descricao;
    }

    public String getA_local() {
        return a_local;
    }

    public void setA_local(String a_local) {
        this.a_local = a_local;
    }

    public String getA_tipo_atividade() {
        return a_tipo_atividade;
    }

    public void setA_tipo_atividade(String a_tipo_atividade) {
        this.a_tipo_atividade = a_tipo_atividade;
    }

    public ArrayList<Palestrante> getA_palestrantes() {
        return a_palestrantes;
    }

    public void setA_palestrantes(ArrayList<Palestrante> a_palestrantes) {
        this.a_palestrantes = a_palestrantes;
    }

    public Date getA_horario() {
        return a_horario;
    }

    public void setA_horario(Date a_horario) {
        this.a_horario = a_horario;
    }

}
