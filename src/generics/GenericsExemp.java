void main() {


    System.out.println("=== 1. CLASSE GENÉRICA SIMPLES <T> ===");
    Caixa<String> caixaTexto = new Caixa<>();
    caixaTexto.guardar("Minha Anotação de Estudo");
    System.out.println("Conteúdo da Caixa: " + caixaTexto.retirar());

    System.out.println("\n=== 2. CLASSE GENÉRICA DUPLA <K, V> ===");
    Par<Integer, String> aluno = new Par<>(101, "Carlos Eduardo");
    System.out.println("ID (K): " + aluno.getChave() + " | Nome (V): " + aluno.getValor());

    System.out.println("\n=== 3. MÉTODOS GENÉRICOS ===");
    String[] nomes = {"Ana", "Bruno", "Carla"};
    imprimirArray(nomes); // O compilador infere o tipo T como String

    System.out.println("\n=== 4. WILDCARD NÃO DELIMITADO <?> ===");
    List<Integer> listaInt = Arrays.asList(1, 2, 3);
    List<String> listaStr = Arrays.asList("Java", "Generics", "PECS");
    imprimirTamanhoDaLista(listaInt);
    imprimirTamanhoDaLista(listaStr);

    System.out.println("\n=== 5. COVARIÂNCIA: <? extends T> (PRODUTOR) ===");
    List<Double> doubles = Arrays.asList(1.5, 2.5, 3.0);
    // Aceita List<Double>, List<Integer>, etc., pois herdam de Number
    double soma = somarValores(doubles);
    System.out.println("Soma dos valores: " + soma);

    System.out.println("\n=== 6. CONTRAVARIÂNCIA: <? super T> (CONSUMIDOR) ===");
    List<Number> listaNumeros = new ArrayList<>();
    // Aceita List<Number> ou List<Object>, pois são superclasses de Integer
    adicionarNumerosInteiros(listaNumeros);
    System.out.println("Lista de números após inserção: " + listaNumeros);

    System.out.println("\n=== 7. APLICANDO O PRINCÍPIO PECS (Collection Copy) ===");
    List<Integer> origem = Arrays.asList(10, 20, 30);
    List<Number> destino = Arrays.asList(0, 0, 0); // Deve ter tamanho suficiente

    copiarPecs(destino, origem);
    System.out.println("Destino após cópia com PECS: " + destino);
}

// ------------------------------------------------------------------------
// 1. ESTRUTURA COM <T> (Tipo Generico Generico)
// ------------------------------------------------------------------------
public static class Caixa<T> {
    private T conteudo;

    public void guardar(T conteudo) {
        this.conteudo = conteudo;
    }

    public T retirar() {
        return conteudo;
    }
}

// ------------------------------------------------------------------------
// 2. ESTRUTURA COM <K, V> (Chave e Valor)
// ------------------------------------------------------------------------
public static class Par<K, V> {
    private final K chave;
    private final V valor;

    public Par(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() { return chave; }
    public V getValor() { return valor; }
}

// ------------------------------------------------------------------------
// 3. MÉTODO GENÉRICO
// ------------------------------------------------------------------------
// O <E> antes do retorno indica que este é um método genérico estático

public static <E> void imprimirArray(E[] array) {
    for (E elemento : array) {
        System.out.print(elemento + " ");
    }
    System.out.println();
}

// ------------------------------------------------------------------------
// 4. WILDCARD NÃO DELIMITADO <?>
// ------------------------------------------------------------------------
// Útil quando o método utiliza apenas funcionalidades da classe Object ou da List

public static void imprimirTamanhoDaLista(List<?> lista) {
    // LEITURA: Retorna apenas Object, pois o tipo exato é desconhecido
    System.out.println("Tamanho da lista: " + lista.size());

    // ESCRITA: Bloqueado pelo compilador!
    // lista.add("teste"); // ERRO DE COMPILAÇÃO!
}

// ------------------------------------------------------------------------
// 5. UPPER BOUNDED WILDCARD <? extends T> - COVARIÂNCIA
// ------------------------------------------------------------------------
// Lê elementos de uma coleção de T ou de qualquer SUBCLASSE de T.
// REGRA: Usado para PRODUTORES (Você apenas LÊ/PRODUZ dados da lista).
public static double somarValores(List<? extends Number> lista) {
    double total = 0.0;
    for (Number numero : lista) {
        total += numero.doubleValue(); // LEITURA É SEGURA (Garante que é ao menos Number)
    }

    // ESCRITA É PROIBIDA:
    // lista.add(10); // ERRO! O compilador não sabe se a lista é de Double, Float ou Integer.
    return total;
}

// ------------------------------------------------------------------------
// 6. LOWER BOUNDED WILDCARD <? super T> - CONTRAVARIÂNCIA
// ------------------------------------------------------------------------
// Insere elementos em uma coleção de T ou de qualquer SUPERCLASSE de T.
// REGRA: Usado para CONSUMIDORES (Você apenas ESCREVE/CONSUME dados na lista).
public static void adicionarNumerosInteiros(List<? super Integer> lista) {
    lista.add(100); // ESCRITA É SEGURA (Qualquer superclasse de Integer aceita um Integer)
    lista.add(200);

    // LEITURA É RESTRITA:
    // Integer item = lista.get(0); // ERRO! A lista pode ser de Object, então só garante retorno Object.
    // Object item = lista.get(0); // Válido
}

// ------------------------------------------------------------------------
// 7. DEMONSTRAÇÃO PRÁTICA DO PECS (Producer Extends, Consumer Super)
// ------------------------------------------------------------------------
/**
 * Copia elementos da lista de origem para a lista de destino.
 *
 * @param dest Lista de DESTINO -> CONSUMIDORA de dados -> usa <? super T>
 * @param src  Lista de ORIGEM  -> PRODUTORA de dados   -> usa <? extends T>
 */
public static <T> void copiarPecs(List<? super T> dest, List<? extends T> src) {
    for (int i = 0; i < src.size(); i++) {
        dest.set(i, src.get(i)); // Lê de 'src' (extends) e escreve em 'dest' (super)
    }
}
