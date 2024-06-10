package parte1.estruturasrepeticao;

public class DecrementoFor {
    public static void main(String[] args) {
        String[] alunos = {"FELIPE", "JONAS", "JULIA", "MARCOS", "ANA", "PAULO"};
        
        for (int i = alunos.length - 1; i >= 0; i--) {
            System.out.println("Alunos em forma decrescente  começando no índice "+ i +"="+ alunos[i]);
        }
    }
}

