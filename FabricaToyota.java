// Fabrica concreta: cria somente carros da familia Toyota.
public class FabricaToyota implements FabricaDeCarros {
    @Override
    public Sedan criarSedan() {
        return new Corolla();
    }

    @Override
    public Suv criarSuv() {
        return new CorollaCross();
    }
}
