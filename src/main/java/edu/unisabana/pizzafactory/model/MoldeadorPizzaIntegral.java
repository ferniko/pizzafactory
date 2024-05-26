package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementación de la interfaz MoldeadorPizza para moldear pizzas de masa
 * integral.
 * 
 * Esta clase se encarga de moldear pizzas de masa integral de diferentes
 * tamaños.
 * 
 * @author andersonlopez
 */
public class MoldeadorPizzaIntegral implements MoldeadorPizza {

  /**
   * Método para moldear una pizza de masa integral según su tamaño.
   * 
   * @param tamano Tamaño de la pizza (pequeño o mediano).
   */

  public void moldear(Tamano tamano) {
    if (tamano == Tamano.PEQUENO) {
      Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
          .log(Level.INFO, "[O] Moldeando pizza pequena de masa integral.");
    } else if (tamano == Tamano.MEDIANO) {
      Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
          .log(Level.INFO, "[O] Moldeando pizza mediana de masa integral.");
    }
    // CODIGO DE LLAMADO AL MICROCONTROLADOR
  }
}