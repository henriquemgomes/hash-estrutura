/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashp1;

/**
 *
 * @author henrique
 */
public class Hash {
    Lista[] tabEspalha;
    int guardaTamTab;
    
    public Hash(int tamTabela){
        tabEspalha = new Lista[tamTabela];
        guardaTamTab = tamTabela;
        for(int i=0;i<tabEspalha.length;i++){
            tabEspalha[i] = new Lista();
        }
    }
    
    public int getTamTab(){
        return this.guardaTamTab;
    }
    
    public Lista getLista(int i){
        return tabEspalha[i];
    }
    
    public int funcaoHash(int chave){
        return chave % guardaTamTab;
    }
    
    public void insere(int novo){
        int grupo = funcaoHash(novo);
        tabEspalha[grupo].insereNoFinal(novo);
    }
    
    public void remove(int chave){
        int grupo = funcaoHash(chave);
        tabEspalha[grupo].remove(chave);
    }
    
    public int totalElementos(){
        int contador = 0;
        for (int i = 0; i < tabEspalha.length; i++) {
            Lista lista = tabEspalha[i];
            contador += lista.getTamanhoLista();
        }
        return contador;
    }

}
