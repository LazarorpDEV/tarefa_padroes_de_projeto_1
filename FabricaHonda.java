// Fabrica concreta: cria somente carros da familia Honda.
public class FabricaHonda implements FabricaDeCarros {
    @Override
    public Sedan criarSedan() {
        return new Civic();
    }

    @Override
    public Suv criarSuv() {
        return new Hrv();
    }
}
