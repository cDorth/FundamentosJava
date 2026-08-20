void main() {
    Queue<String> filaAtendimento = new LinkedList<>();
    filaAtendimento.offer("Ana");
    filaAtendimento.offer("Bruno");
    filaAtendimento.offer("Carla");

    System.out.println("Próximo da fila: " + filaAtendimento.peek()); // Ana
    System.out.println("Atendido: " + filaAtendimento.poll());       // Remove Ana
    System.out.println("Novo próximo: " + filaAtendimento.peek());    // Bruno

    // --- Uso de Deque como Pilha (LIFO) ---
    Deque<String> pilhaNavegacao = new ArrayDeque<>();
    pilhaNavegacao.push("Pagina 1"); // Adiciona no topo
    pilhaNavegacao.push("Pagina 2");
    pilhaNavegacao.push("Pagina 3");

    System.out.println("Página atual: " + pilhaNavegacao.peek());  // Pagina 3
    System.out.println("Voltando de: " + pilhaNavegacao.pop());     // Remove Pagina 3
    System.out.println("Página atual: " + pilhaNavegacao.peek());  // Pagina 2

}