package br.com.roberto.studyjsf.bean.application;/*
 *  @criado em: 25/11/2020 - {17:23}
 *  @projeto  : study-jsf
 *  @autor    : roberto
 */

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable {

    private List<String> categoriaList;

    @PostConstruct
    public void init() {
        categoriaList = Arrays.asList("RPG", "SciFi", "Terror");

    }

    public void mudarLista(){
        categoriaList = Arrays.asList("Cinema", "Parque", "Danceteria");
    }

    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }
}
