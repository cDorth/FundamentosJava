import maps.Pessoa;

void main() {

//    HASHMAP - muito preciso, rapido, mas não garante a ordem
    // LINKEDHASHMAP - replica do hashmap, porem mapeia de acordo com a ordem de inserção

    Map<Integer,String> pessoasHash = new HashMap<>();
    pessoasHash.put(1,"carlos");
    pessoasHash.put(1,"Pedro");
    pessoasHash.put(2,"teste");

    System.out.println(pessoasHash);
    System.out.println(pessoasHash.get(2));

//    ----------------------------------------------------------------

    Map<Integer, Pessoa> users = new HashMap<>();

    users.put(12, new Pessoa(12, "Carlos"));
    users.put(123, new Pessoa(123, "Ana"));
    users.put(1234, new Pessoa(1234, "João"));

    if (users.containsKey(123)) {
        System.out.println("Usuário existe");
    }

    users.remove(123);
    System.out.println("---------------------------");
    System.out.println(users.size());

    for (Map.Entry<Integer, Pessoa> entry : users.entrySet()) {

        System.out.println(entry.getKey());
        System.out.println(entry.getValue());

    }

//    Agrupamento -

    Map<String, List<String>> usersByState = new HashMap<>();

    usersByState
            .computeIfAbsent("SP", key -> new ArrayList<>())
            .add("Carlos");

    usersByState
            .computeIfAbsent("RJ", key -> new ArrayList<>())
            .add("Ana");

    usersByState
            .computeIfAbsent("SP", key -> new ArrayList<>())
            .add("João");

    usersByState
            .computeIfAbsent("MG", key -> new ArrayList<>())
            .add("Pedro");

    usersByState
            .computeIfAbsent("SP", key -> new ArrayList<>())
            .add("Maria");

    System.out.println(usersByState);
}