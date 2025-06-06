public class App {
    public static void main(String[] args) throws Exception {
        Arvore<String> familia = new Arvore<>("José");

        No<String> filho1 = new No<>("Fernando");
        No<String> filho2 = new No<>("Maria");

        familia.getRaiz().add(filho1);
        familia.getRaiz().add(filho2);

        No<String> filho1_1 = new No<>("Enzo");
        No<String> filho1_2 = new No<>("Leticia");
        No<String> filho1_3 = new No<>("Paloma");

        // adicionando filhos a um nó filho
        filho1.add(filho1_1);
        filho1.add(filho1_2);
        filho1.add(filho1_3);

        No<String> filho2_1 = new No<>("Erick");
        No<String> filho2_2 = new No<>("Fernanda");

        // adicionando filhos a um nó filho
        filho2.add(filho2_1);
        filho2.add(filho2_2);

        No<String> filho1_1_1 = new No<>("Amanda");
        filho1_1.add(filho1_1_1);

    }
}
