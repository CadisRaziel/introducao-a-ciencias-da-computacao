import java.util.Queue;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        //Queue -> First IN First OUT, como uma fila de pessoas (linear data struct)
        //Porém a fila pode demorar, ou seja imagina uma fila de pessoas e a primeira pessoa a entrar que é a primeira a sair decide enrolar
        
        //Queue seria igual uma list (porém nao podemos instanciar uma Queue como stack porque é uma interface, por isso precisamos usar o LinkedList)
        Queue<String> queue = new LinkedList<String>();
        
        System.out.println(queue.isEmpty());

        //offer = add
        queue.offer("Vitor");
        queue.offer("Giovanna");
        queue.offer("Ariella");
        queue.offer("Rosana");
        queue.offer("Monique");
        queue.offer("Michele");
      
        System.out.println(queue);
        
        //poll = remove (1 item da lista)
        queue.poll();
        System.out.println(queue);


        //peek -> vai ver o 1 item da lista
        System.out.println(queue.peek());

        //size -> quantos objetos tem na lista
        System.out.println(queue.size());


        //? onde as filas são úteis?
        //buffer de teclas (as letras devem aparecer na tela na ordem em que são pressionadas
        //fila da impressora (os trabalhos de impressão devem ser concluídos em ordem)
        //Usado em LinkedLists, PriorityQueues, Breadth-first search
    }
}

