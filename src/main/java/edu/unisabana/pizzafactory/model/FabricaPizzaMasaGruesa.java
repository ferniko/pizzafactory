package edu.unisabana.pizzafactory.model;

/**
 *
 * @author andersonlopez
 */
public class FabricaPizzaMasaGruesa implements FabricaPizza {
  public AmasadorPizza crearAmasador() {
    return new AmasadorPizzaGruesa();
  }

  public MoldeadorPizza crearMoldeador() {
    return new MoldeadorPizzaGruesa();
  }

  public HorneadorPizza crearHorneador() {
    return new HorneadorPizzaGruesa();
  }
}
