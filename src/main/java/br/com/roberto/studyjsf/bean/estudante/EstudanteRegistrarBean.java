package br.com.roberto.studyjsf.bean.estudante;/*
 *  @criado em: 20/11/2020 - {22:10}
 *  @projeto  : study-jsf
 *  @autor    : roberto
 */

import br.com.roberto.studyjsf.model.Estudante;

import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {


    private Estudante estudante = new Estudante();
    private String[] nomes = {"Carlos", "Roberto", "Medeiros"};
    private List<String> nomesFemininos = Arrays.asList("Luciene", "Alves", "Medeiros");
    private Set<String> nomesSet = new HashSet<>(Arrays.asList("Francisco", "Assis", "Lima"));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotas = false;
    private boolean mostrarLink = false;

    {
        nomesMap.put("Goku", "Mais Forte");
        nomesMap.put("One Piece", "O mais longo");
        nomesMap.put("Naruto", "Mais Lenga Lenga");

//        for(Map.Entry<String,String> entry: nomesMap.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

    }

    public void executar() {
        System.out.println("Fazendo uma Busca no BD");
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    public void executar(String parametro) {
        System.out.println("Fazendo uma Busca no BD " + parametro);
        System.out.println("Processando os dados" + parametro);
        System.out.println("Exibindo os dados" + parametro);
    }

    public String executarRetorno(String parametro) {
        return "Apenas um teste " + parametro;
    }

    public String irParaIndex2() {
        return "index2?faces-redirect=true";
    }

    public void exibirNotas() {
        this.mostrarNotas = true;
    }

    public void esconderNotas() {
        this.mostrarNotas = false;
    }

    public void exibirLink() {
        this.mostrarLink = true;
    }

    public void esconderLink() {
        this.mostrarLink = false;
    }

    public void
    calcularCubo(LambdaExpression le, long value){
        long result = (long) le.invoke(FacesContext.getCurrentInstance().getELContext(),value);
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    public List<String> getNomesFemininos() {
        return nomesFemininos;
    }

    public void setNomesFemininos(List<String> nomesFemininos) {
        this.nomesFemininos = nomesFemininos;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }
}
