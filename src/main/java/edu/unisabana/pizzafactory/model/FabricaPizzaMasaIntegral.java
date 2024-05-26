package edu.unisabana.pizzafactory.model;

/**
 *
 * @author andersonlopez
 */
public class FabricaPizzaMasaIntegral implements FabricaPizza {
  public AmasadorPizza crearAmasador() {
    return new AmasadorPizzaIntegral();
  }

  public MoldeadorPizza crearMoldeador() {
    return new MoldeadorPizzaIntegral();
  }

  public HorneadorPizza crearHorneador() {
    return new HorneadorPizzaIntegral();
  }
}
