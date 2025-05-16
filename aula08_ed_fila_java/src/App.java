import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {

        // pedagio();
        PriorityQueue<Carro> fila = new PriorityQueue<>();
        fila.add(new Carro("Uno", 2));
        fila.add(new Carro("Gol", 2));
        fila.add(new Carro("Ambulancia", 1));
        fila.add(new Carro("Policia", 1));

        // System.out.println(fila);

        //percorrer a fila de prioridade
        while(!fila.isEmpty()){
           Carro carro_removido = fila.poll(); //removendo alguém da fila
           System.out.println("Carro removido: "+carro_removido.getModelo());
        }

    }


    public static void pedagio(){
        //CRIAR UMA FILA TRADICIONAL
        
        Queue<String> fila_carros = new LinkedList<>();
        //Carros chegando na fila
        fila_carros.offer("Uno");
        fila_carros.offer("Santana");
        fila_carros.offer("Fusca");
        fila_carros.offer("Gol G1");
        fila_carros.offer("Corsa");

        System.out.println("Situação da Fila:" + fila_carros);

        //Realizando o atendimento no pedágio

        while(!fila_carros.isEmpty()){
            String carro_removido = fila_carros.poll();
            System.out.println("Carro "+carro_removido+ " liberado no pedágio");
        }


    }



    public static void testeFila(){
        //CRIAR UMA FILA DE VEÍCULOS PARA O PEDÁGIO
       // FILA COMÚM: FIFO
       Queue<String> fila_carros = new LinkedList<>();

       //adicionando elementos
       //offer: ao inserir é consultado a capacidade da fila. Caso a fila esteja cheia, não é inserido

       fila_carros.offer("Uno");
       fila_carros.offer("Santana");
       fila_carros.offer("Fusca");
        
       //add: não consulta o tamanho da fila, em razão disso, poderá causar o overflow
        fila_carros.add("Gol G1");
        fila_carros.add("Corsa");

       //Quantos carros há na fila?
       System.out.println("Existe "+fila_carros.size() + " Carro(s)");

    
       //Percorrendo uma fila
       for (String carro: fila_carros){
            System.out.println(carro);
       }

       //Primeiro da Fila
       System.out.println("Inicio: "+fila_carros.peek());

       //Ver todos
       System.out.println("Situacao: "+fila_carros);

       //Remover o 1º Veículo
       String car = fila_carros.poll();
       System.out.println("Carro removido: "+ car);

       System.out.println("Situacao: "+fila_carros);
    }
}
