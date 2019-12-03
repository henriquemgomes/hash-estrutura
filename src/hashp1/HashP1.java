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
public class HashP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hash hash = new Hash(8);
        hash.insere(23);
        hash.insere(123);
        hash.insere(2);
        hash.insere(6);
        hash.insere(231);
        hash.insere(24245);
        hash.insere(545);
        hash.insere(56456);
        hash.insere(564);
        hash.insere(25);
        hash.insere(5671);
        hash.insere(8797);
        hash.insere(233);
        hash.insere(1);
        hash.insere(85);
        hash.insere(934);
        //REMOVE O 231
        hash.remove(231);
        for (int i = 0; i < hash.getTamTab(); i++) {
            System.out.print("Grupo "+i+": ");
            hash.getLista(i).imprimeLista();
        }
        System.out.println("quantidade elementos hash: "+ hash.totalElementos());
        
    }
    
}
