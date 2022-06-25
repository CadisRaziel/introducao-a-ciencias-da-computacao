import java.util.*;
public class Main{
    public static void main(String[] args) {
        //Priority Queues -> é um FIFO, porém os elementos no topo são de prioridade alta e são lidos primeiro e os que estão abaixo são lidos depois

        Queue<Double> queue = new LinkedList<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        System.out.println("Sem prioridade");
        while(!queue.isEmpty()) {
            //poll -> se não fica monstrando a mesma lista uma infinidade de vezes (exibe e remove cada element)
            System.out.println(queue.poll());
        }

        System.out.println("==================================================");

        //Pelo entendimento ele organiza do menor para o maior PriorityQueue
        Queue<Double> queue2 = new PriorityQueue<Double>();

        queue2.offer(3.0);
        queue2.offer(2.5);
        queue2.offer(4.0);
        queue2.offer(1.5);
        queue2.offer(2.0);

        System.out.println("Com prioridade");
        while(!queue2.isEmpty()) {
            //poll -> se não fica monstrando a mesma lista uma infinidade de vezes (exibe e remove cada elemento)
            System.out.println(queue2.poll());
        }
        System.out.println("==================================================");

        //Pelo entendimento ele organiza do menor para o maior PriorityQueue
        Queue<Double> queue3 = new PriorityQueue<Double>(Collections.reverseOrder());

        queue3.offer(3.0);
        queue3.offer(2.5);
        queue3.offer(4.0);
        queue3.offer(1.5);
        queue3.offer(2.0);

        System.out.println("Com prioridade revertido a ordem");
        while(!queue3.isEmpty()) {
            //poll -> se não fica monstrando a mesma lista uma infinidade de vezes (exibe e remove cada elemento)
            System.out.println(queue3.poll());
        }
        System.out.println("==================================================");

        //Pelo entendimento ele organiza do menor para o maior PriorityQueue
        Queue<String> queue4 = new PriorityQueue<String>();

        queue4.offer("B");
        queue4.offer("C");
        queue4.offer("A");
        queue4.offer("F");
        queue4.offer("D");

        System.out.println("Com prioridade Strings");
        while(!queue4.isEmpty()) {
            //poll -> se não fica monstrando a mesma lista uma infinidade de vezes (exibe e remove cada elemento)
            System.out.println(queue4.poll());
        }
        //Pelo entendimento ele organiza do menor para o maior PriorityQueue
        Queue<String> queue5 = new PriorityQueue<String>(Collections.reverseOrder());

        queue5.offer("B");
        queue5.offer("C");
        queue5.offer("A");
        queue5.offer("F");
        queue5.offer("D");

        System.out.println("Com prioridade Strings revertido a ordem");
        while(!queue5.isEmpty()) {
            //poll -> se não fica monstrando a mesma lista uma infinidade de vezes (exibe e remove cada elemento)
            System.out.println(queue5.poll());
        }

    }
}

