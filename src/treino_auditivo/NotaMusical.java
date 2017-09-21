/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treino_auditivo;

/**
 *
 * @author Humberto
 */
public class NotaMusical {
    
    private String nome;
    private String caminho;
    private String respostaCorreta;
    private Player player;
    
    public NotaMusical(String nome, String caminho, String respostaCorreta, Player player){
        this.nome = nome;
        this.caminho = caminho;
        this.respostaCorreta = respostaCorreta;
        this.player = player;
    }

    public String getNome() {
        return nome;
    }

    public String getCaminho() {
        return caminho;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }
    
    public void tocarSom(){
        player.play(caminho);
    }
    
}
