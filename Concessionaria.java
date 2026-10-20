// Cliente: trabalha com as interfaces, sem escolher classes de carros.
public class Concessionaria {
    private final Sedan sedan;
    private final Suv suv;

    public Concessionaria(FabricaDeCarros fabrica) {
        this.sedan = fabrica.criarSedan();
        this.suv = fabrica.criarSuv();
    }

    public void exibirCarros() {
        sedan.exibirDetalhes();
        suv.exibirDetalhes();
    }
}
