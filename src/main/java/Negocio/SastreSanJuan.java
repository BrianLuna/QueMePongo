package Negocio;

public class SastreSanJuan implements Sastre{
    private final TipoDePrenda CHOMBA = new TipoDePrenda(CategoriaDePrenda.PARTESUPERIOR);
    private final TipoDePrenda PANTALON = new TipoDePrenda(CategoriaDePrenda.PARTEINFERIOR);
    private final TipoDePrenda ZAPATILLAS = new TipoDePrenda(CategoriaDePrenda.CALZADO);

    @Override
    public Prenda fabricarPrendaSuperior() {
        PrendaBuilder prendaBuilder = new PrendaBuilder(this.CHOMBA);
        prendaBuilder.cargarColorPrimario(new Color(5, 6, 7));
        prendaBuilder.cargarMaterial(Material.PIQUE);
        return prendaBuilder.confirmarPrenda();
    }

    @Override
    public Prenda fabricarPrendaInferior() {
        PrendaBuilder prendaBuilder = new PrendaBuilder(this.PANTALON);
        prendaBuilder.cargarColorPrimario(new Color(5, 6, 7));
        prendaBuilder.cargarMaterial(Material.ACETATO);
        return prendaBuilder.confirmarPrenda();
    }

    @Override
    public Prenda fabricarCalzado() {
        PrendaBuilder prendaBuilder = new PrendaBuilder(this.ZAPATILLAS);
        prendaBuilder.cargarColorPrimario(new Color(5, 6, 7));
        prendaBuilder.cargarMaterial(Material.LONA);
        return prendaBuilder.confirmarPrenda();
    }
}
