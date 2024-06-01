
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementación de la interfaz MoldeadorPizza para moldear pizzas de masa
 * delgada.
 * 
 * Esta clase se encarga de moldear pizzas de masa delgada de diferentes
 * tamaños.
 * 
 * @author cesarvefe, andersonlopez
 */
public class MoldeadorPizzaDelgada implements MoldeadorPizza {

  /**
   * Método para moldear una pizza de masa delgada según su tamaño.
   * 
   * @param tamano Tamaño de la pizza (pequeño o mediano).
   */

  public void moldear(Tamano tamano) {
    if (tamano == Tamano.PEQUENO) {
      Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
          .log(Level.INFO, "[O] Moldeando pizza pequena de masa convencional.");
    } else if (tamano == Tamano.MEDIANO) {
      Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
          .log(Level.INFO, "[O] Moldeando pizza mediana de masa convencional.");
    }  else if (tamano == Tamano.GRUESA) {
      Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
          .log(Level.INFO, "[O] Moldeando pizza mediana de masa convencional.");
    }




    // CODIGO DE LLAMADO AL MICROCONTROLADOR
  }
}