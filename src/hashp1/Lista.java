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
public class Lista {
    private Bloco cabeca;
    private Bloco cursor;
    
    public Lista(){
   
    }

    public Bloco getCabeca() {
        return cabeca;
    }
    
    
    
    public void insereNaFrente(int valor){
        Bloco nova = new Bloco(valor);
        if(cabeca == null){
            cabeca = nova;
        }else{
            Bloco aux = cabeca;
            cabeca = nova;
            nova.setProximo(aux);
        }
    }
    
    public void insereNoFinal(int valor){
        Bloco nova = new Bloco(valor);
        if(cabeca == null){
            cabeca = nova;
        }else{
            this.cursor = cabeca;        
            while(cursor.getProximo() != null){
                cursor = cursor.getProximo();
            }
            cursor.setProximo(nova);
        }
    }
    
    public void insereDepoisDe(int ref, int valor){
            Bloco nova = new Bloco(valor);
            this.cursor = cabeca;        
            while(cursor.getProximo().getValor() != ref){
                cursor = cursor.getProximo();
            }
            Bloco auxAnterior = cursor.getProximo();
            Bloco auxPosterior = auxAnterior.getProximo();
            auxAnterior.setProximo(nova);
            nova.setProximo(auxPosterior);
    }
    
    public void insereAntesDe(int ref, int valor){
        Bloco nova = new Bloco(valor);
        this.cursor = cabeca;        
        while(cursor.getProximo().getValor() != ref){
            cursor = cursor.getProximo();
        } 
        Bloco auxAnterior = cursor;
        Bloco auxPosterior = auxAnterior.getProximo();
        auxAnterior.setProximo(nova);
        nova.setProximo(auxPosterior);
    }
    
    public Bloco removeNaFrente(){
        Bloco bloco = cabeca;
        cabeca = cabeca.getProximo();
        return bloco;
        
    }
    
    public Bloco removeNoFinal(){
        Bloco bloco = getPenultimo();
        bloco.setProximo(null);
        return bloco;
    }
    
    public Bloco getUltimo(){
        cursor = cabeca;
        while(cursor.getProximo() != null){
            if(cursor.getProximo() != null){
                cursor = cursor.getProximo();
            }
        }
        return cursor;
    }
    
    public Bloco getPenultimo(){
        cursor = cabeca;
        while(cursor.getProximo().getProximo() != null){
            if(cursor.getProximo() != null){
                cursor = cursor.getProximo();
            }
        }
        return cursor;
    }
    
    public void imprimeLista(){
        cursor = cabeca;
        while(cursor.getProximo() != null){
            System.out.print(cursor.getValor()+", ");
            cursor = cursor.getProximo();
        }
        System.out.println(cursor.getValor());

    }
    
    public int getTamanhoLista(){
        int cont = 0;
        cursor = cabeca;
        if(cabeca == null){
            return 0;
        }
        while(cursor.getProximo() != null){
            cursor = cursor.getProximo();
            cont++;
        }
        cont++;
        return cont;
        
    }
    
       public boolean busca(int valor){
        cursor = cabeca;
        while(cursor.getProximo() != null){
            if(cursor.getValor() == valor){
                return true;
            }
            cursor = cursor.getProximo();
        }
        return false;
    }

    void remove(int chave) {
            this.cursor = cabeca;        
            while(cursor.getProximo().getValor() != chave){
                cursor = cursor.getProximo();
            }
            Bloco auxAnterior = cursor;
            System.out.println("anterior"+auxAnterior.getValor());
            Bloco excluido = cursor.getProximo();
            System.out.println("exc"+excluido.getValor());
            Bloco auxPosterior = excluido.getProximo();
            System.out.println("auxP"+auxPosterior.getValor());
            auxAnterior.setProximo(auxPosterior);
            excluido.setProximo(null);
    }
    
}
