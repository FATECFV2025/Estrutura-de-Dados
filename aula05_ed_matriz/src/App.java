public class App {
    public static void main(String[] args) throws Exception {
        int[][] matriz = new int[3][2];

        // acesso direto: linha e coluna
        // hard code ou código engessado
        matriz[0][0] = 1;
        matriz[0][1] = 2;

        matriz[1][0] = 3;
        matriz[1][1] = 4;

        matriz[2][0] = 5;
        matriz[2][1] = 6;

        // tipagem incorreta

        // matriz[2][1] = "7";

        // estourando a matriz: informar uma linha ou coluna inexistente
        // matriz[2][2] = 7;

        // percorrendo uma matriz
        // consultar elementos
        // inserir elementos
        // remover elementos
        // for (int linha = 0; linha < matriz.length; linha++) {
        //     for (int col = 0; col < matriz[linha].length; col++) {
        //         System.out.print(matriz[linha][col] + " ");
        //     }
        //     System.out.println("");
        // }

        // vetor: com valores inteiros
        int[] idade = new int[2];

        // vetor sobre a Classe aluno;
        Aluno[] alunos = new Aluno[3];

        // instanciando a classe e preenchendo valores
        Aluno a = new Aluno("Kauê", "ADS", 12345);
        Aluno a1 = new Aluno("João", "ADS", 56789);
        Aluno a2 = new Aluno("Ana", "ADS", 98710);

        // guardando o aluno dentro do vetor
        alunos[0] = a;
        alunos[1] = a1;
        alunos[2] = a2;
        //ou
        alunos[0] = new Aluno("Kauê", "ADS", 12345);
        alunos[1] = new Aluno("João", "ADS", 56789);
        alunos[2] = new Aluno("Ana", "ADS", 98710);
        System.out.println(alunos[0].getNome());
        for(int i=0; i<alunos.length;i++){
            System.out.println(alunos[i].getNome());
            System.out.println(alunos[i].getRa());
        }
    }
}
