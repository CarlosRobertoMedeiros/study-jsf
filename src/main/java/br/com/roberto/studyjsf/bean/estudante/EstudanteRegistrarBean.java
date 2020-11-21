package br.com.roberto.studyjsf.bean.estudante;/*
 *  @criado em: 20/11/2020 - {22:10}
 *  @projeto  : study-jsf
 *  @autor    : roberto
 */

import br.com.roberto.studyjsf.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;

@Named
public class EstudanteRegistrarBean implements Serializable {


    private Estudante estudante = new Estudante();

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
