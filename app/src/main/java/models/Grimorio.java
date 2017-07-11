package models;

import java.util.ArrayList;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by ricardo.diego on 03/07/2017.
 */

public class Grimorio {

    private int id;
    private String nome;
    private int modificadorHabilidade;
    private int proeficiencia;
    private String classe;
    private int nivel;
    private int[] magias;

    public void Grimorio(){

    }

    public void Grimorio(int id, String nome, int ModHab, int proeficiencia, int classe, int nivel){

    }

    public void Grimorio(Grimorio grimorio){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getModificadorHabilidade() {
        return modificadorHabilidade;
    }

    public void setModificadorHabilidade(int modificadorHabilidade) {
        this.modificadorHabilidade = modificadorHabilidade;
    }

    public int getProeficiencia() {
        return proeficiencia;
    }

    public void setProeficiencia(int proeficiencia) {
        this.proeficiencia = proeficiencia;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int[] getMagias() {
        return magias;
    }

    public void setMagias(int[] magias) {
        this.magias = magias;
    }
}
