import java.util.Stack;
public class Main{
    public static void main(String[] args) {
        //Stack -> LIFO (First IN First OUT, como uma pilha de livros ou pratos)

        //Stack seria igual uma List
        Stack<String> stack = new Stack<String>();
        // System.out.println(stack.empty());
        stack.push("Minecraf");
        stack.push("LOL");
        stack.push("DOTA");
        
        System.out.println(stack);
        
        //apresenta o ultimo elemento da a entrar na pilha
        System.out.println(stack.peek());

        //para procurar um objeto na pilha (em indice)
        System.out.println(stack.search("LOL"));
        
        //pop -> remove o ultimo item da lista
        stack.pop();
        System.out.println(stack);
        //Como dota foi o ultimo a entrar, ele é o primeiro a sair
        
        
        for(int i = 0; i < 10000000; i++){
            //Cuidado ao adicionar muitos itens na lista e faltar memoria no computador
            //ele vai nos mostrar um erro de heap que a memoria da lista vazou pra onde nao deveria !!
            //como o C aqui tambem parece ter gerencia de memoria
            stack.push("heap");
        } 


            //? usos de pilhas
            // recursos de desfazer/refazer em edições de texto
            // retroceder/avançar no histórico do navegador
            // algoritmos de retrocesso (diretórios de arquivos)
            // funções de chamada (pilha de chamadas)
    }
}
