// Abstract Factory: define a criacao de uma familia de carros.
public interface FabricaDeCarros {
    Sedan criarSedan();
    Suv criarSuv();
}
