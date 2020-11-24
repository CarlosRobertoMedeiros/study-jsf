package br.com.roberto.studyjsf.bean.request;
/*
 *  @criado em: 23/11/2020 - {22:58}
 *  @projeto  : study-jsf
 *  @autor    : roberto
 */


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@RequestScoped
public class TesteRequestBean implements Serializable {

    private List<String> personagens = Arrays.asList("Seiya","Ikki","Shum","Yoga","Shyriu");
    private List<String> personagemSelecionado = new ArrayList<>();

    public void selecionarPersonagem(){
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
    }

}
