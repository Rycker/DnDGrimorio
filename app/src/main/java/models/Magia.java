package models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by ricardo.diego on 06/07/2017.
 */

public class Magia extends RealmObject{

    @PrimaryKey
    private int id;
    private boolean ritual;
    private String nome;
    private String distancia;
    private String duracao;
    private String componentes;
    private String descricao;
    private String tempo_conjuracao;
    private String escola;
    private int circulo;

    public void Magia(){

    }
    public void Magia(int ritual, String nome, String duracao, String componentes, String descricao, int escola, int circulo, String tempo_conjuracao){

    }



}
