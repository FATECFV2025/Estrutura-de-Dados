import java.util.*;

// T: É um indicativo de Generics, ou seja, permite que o nó armazene
// qualquer tipo de dado (String, Integer, Objetos e etc)
public class No<T>{
    private T valor;
    // List: Lista de nós filhos 
    private List<No<T>> filho;

    public No(){

    }

    public No(T valor) {
        this.valor = valor;
        this.filho = new ArrayList<>();
    }
    public T getValor() {
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }
    public List<No<T>> getFilho() {
        return filho;
    }
    public void setFilho(List<No<T>> filho) {
        this.filho = filho;
    }

    public void add (No<T> filho){
        this.filho.add(filho);
    }


    

    
}