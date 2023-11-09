public class Main {
    public static void main(String[] args) {

        //Exemplo de uma condicao de ir a praia quando for final de semana e estiver fazendo sol.

        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        // Tabela verdade

        // Operador && (AND)
        // true && true = true
        // false && true = false
        // false && true = false
        // false && false false

        // Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana;";
        System.out.println(mensagem);
    }
}
