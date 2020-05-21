package Negocio;

public class SastreInstitutoJohnson implements Sastre{
    private final TipoDePrenda CAMISA = new TipoDePrenda(CategoriaDePrenda.PARTESUPERIOR);
    private final TipoDePrenda PANTALON = new TipoDePrenda(CategoriaDePrenda.PARTEINFERIOR);
    private final TipoDePrenda ZAPATOS = new TipoDePrenda(CategoriaDePrenda.CALZADO);

    @Override
    public Prenda fabricarPrendaSuperior() {
        PrendaBuilder prendaBuilder = new PrendaBuilder(this.CAMISA);
        prendaBuilder.cargarColorPrimario(new Color(5, 6, 7));
        prendaBuilder.cargarMaterial(Material.TELA);
        return prendaBuilder.confirmarPrenda();
    }

    @Override
    public Prenda fabricarPrendaInferior() {
        PrendaBuilder prendaBuilder = new PrendaBuilder(this.PANTALON);
        prendaBuilder.cargarColorPrimario(new Color(5, 6, 7));
        prendaBuilder.cargarMaterial(Material.TELA);
        return prendaBuilder.confirmarPrenda();
    }

    @Override
    public Prenda fabricarCalzado() {
        PrendaBuilder prendaBuilder = new PrendaBuilder(this.ZAPATOS);
        prendaBuilder.cargarColorPrimario(new Color(5, 6, 7));
        prendaBuilder.cargarMaterial(Material.CUERO);
        return prendaBuilder.confirmarPrenda();
    }
}
