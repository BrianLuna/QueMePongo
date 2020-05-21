package Negocio;

public class SastreInstitutoJohnson implements Sastre{
    @Override
    public Prenda fabricarPrendaSuperior() {
        PrendaBuilder prendaBuilder = new PrendaBuilder(new TipoDePrenda("Camisa", CategoriaDePrenda.PARTESUPERIOR));
        prendaBuilder.cargarColorPrimario(new Color(5, 6, 7));
        prendaBuilder.cargarMaterial(Material.TELA);
        return prendaBuilder.confirmarPrenda();
    }

    @Override
    public Prenda fabricarPrendaInferior() {
        PrendaBuilder prendaBuilder = new PrendaBuilder(new TipoDePrenda("Pantalon", CategoriaDePrenda.PARTEINFERIOR));
        prendaBuilder.cargarColorPrimario(new Color(5, 6, 7));
        prendaBuilder.cargarMaterial(Material.TELA);
        return prendaBuilder.confirmarPrenda();
    }

    @Override
    public Prenda fabricarCalzado() {
        PrendaBuilder prendaBuilder = new PrendaBuilder(new TipoDePrenda("Zapatos", CategoriaDePrenda.CALZADO));
        prendaBuilder.cargarColorPrimario(new Color(5, 6, 7));
        prendaBuilder.cargarMaterial(Material.CUERO);
        return prendaBuilder.confirmarPrenda();
    }
}
