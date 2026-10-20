public class Main {
    public static void main(String[] args) {
        System.out.println("=== Familia Toyota ===");
        Concessionaria toyota = new Concessionaria(new FabricaToyota());
        toyota.exibirCarros();

        System.out.println("\n=== Familia Honda ===");
        Concessionaria honda = new Concessionaria(new FabricaHonda());
        honda.exibirCarros();
    }
}
