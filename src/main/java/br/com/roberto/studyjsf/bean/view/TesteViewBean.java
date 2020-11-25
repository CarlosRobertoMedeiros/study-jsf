package br.com.roberto.studyjsf.bean.view;
/*
 *  @criado em: 25/11/2020 - {15:51}
 *  @projeto  : study-jsf
 *  @autor    : roberto
 */

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@ViewScoped
public class TesteViewBean implements Serializable {

    private List<String> personagens = Arrays.asList("Seiya","Ikki","Shum","Yoga","Shyriu");
    private List<String> personagemSelecionado = new ArrayList<>();

    public void selecionarPersonagem(){
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

}
