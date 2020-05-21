package Negocio;

public class SastreSanJuan implements Sastre{

    @Override
    public Prenda fabricarPrendaSuperior() {
        PrendaBuilder prendaBuilder = new PrendaBuilder(new TipoDePrenda("Chomba", CategoriaDePrenda.PARTESUPERIOR));
        prendaBuilder.cargarColorPrimario(new Color(5, 6, 7));
        prendaBuilder.cargarMaterial(Material.PIQUE);
        return prendaBuilder.confirmarPrenda();
    }

    @Override
    public Prenda fabricarPrendaInferior() {
        PrendaBuilder prendaBuilder = new PrendaBuilder(new TipoDePrenda("Pantalon", CategoriaDePrenda.PARTEINFERIOR));
        prendaBuilder.cargarColorPrimario(new Color(5, 6, 7));
        prendaBuilder.cargarMaterial(Material.ACETATO);
        return prendaBuilder.confirmarPrenda();
    }

    @Override
    public Prenda fabricarCalzado() {
        PrendaBuilder prendaBuilder = new PrendaBuilder(new TipoDePrenda("Zapatillas", CategoriaDePrenda.CALZADO));
        prendaBuilder.cargarColorPrimario(new Color(5, 6, 7));
        prendaBuilder.cargarMaterial(Material.LONA);
        return prendaBuilder.confirmarPrenda();
    }
}
