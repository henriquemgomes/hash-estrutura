/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashp1;

/**
 *
 * @author 13705635662
 */
class Bloco {
    private int valor;
    private Bloco proximo;
    
    public Bloco(int valor, Bloco proximo){
        this.valor = valor;
        this.proximo = proximo;
    }
    
    public Bloco(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Bloco getProximo() {
        return proximo;
    }

    public void setProximo(Bloco proximo) {
        this.proximo = proximo;
    }
    
    
}
