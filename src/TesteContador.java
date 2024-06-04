public class TesteContador {

    public static void main(String[] args) {
        Contador contador = new Contador();

        // Casos de teste com diferentes entradas
        try {
            contador.contar(10, 20);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            contador.contar(20, 10);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}