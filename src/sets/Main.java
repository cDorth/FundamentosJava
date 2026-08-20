import sets.Pessoa;

void main() {

//    TREESET - organiza os elementos automaticamente(CompareTo),evita duplicata e se contenta apenas com o compareTo, utiliza organização de arvore de dados

    TreeSet<Pessoa> pessoasTree = new TreeSet<>();
    pessoasTree.add(new Pessoa(1, "carlos"));
    pessoasTree.add(new Pessoa(7, "carlos5"));
    pessoasTree.add(new Pessoa(1, "carlos"));
    pessoasTree.add(new Pessoa(2, "carlos2"));
    pessoasTree.add(new Pessoa(5, "carlos5"));

    System.out.println(pessoasTree);

//    HASHSET - não organiza os elementos, embaralha a ordem, porem muito mais rapido, necessita implementar equals e hashCode

    HashSet<Pessoa> pessoasHash = new HashSet<>();
    pessoasHash.add(new Pessoa(1, "carlos"));
    pessoasHash.add(new Pessoa(1, "carlos"));
    pessoasHash.add(new Pessoa(6, "carlos5"));
    pessoasHash.add(new Pessoa(2, "carlos2"));
    pessoasHash.add(new Pessoa(5, "carlos5"));

    System.out.println(pessoasHash);

//    LINKEDHASHSET - similar ao hashset, porem armazena e organiza em ordem de inserção

    LinkedHashSet<Pessoa> pessoasLinked = new LinkedHashSet<>();
    pessoasLinked.add(new Pessoa(1, "carlos"));
    pessoasLinked.add(new Pessoa(6, "carlos5"));
    pessoasLinked.add(new Pessoa(1, "carlos"));
    pessoasLinked.add(new Pessoa(2, "carlos2"));
    pessoasLinked.add(new Pessoa(5, "carlos5"));

    System.out.println(pessoasLinked);
}