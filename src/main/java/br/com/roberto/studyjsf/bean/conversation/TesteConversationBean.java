package br.com.roberto.studyjsf.bean.conversation;/*
 *  @criado em: 25/11/2020 - {17:35}
 *  @projeto  : study-jsf
 *  @autor    : roberto
 */


import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@ConversationScoped
public class TesteConversationBean implements Serializable {

    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();
    @Inject
    private Conversation conversation;

    public void init(){
        personagens = Arrays.asList("Seiya","Ikki","Shum","Yoga","Shyriu");
        System.out.println("Entrou no PostConstructor do ConversationBean");
        if(conversation.isTransient()){
            conversation.begin();
            System.out.println("Iniciando ConversationScoped, Id="+conversation.getId());
        }
    }

    public void endConversation(){
        if (!conversation.isTransient()){
            conversation.end();
        }
    }

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
