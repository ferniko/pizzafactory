package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementación de la interfaz MoldeadorPizza para moldear pizzas de masa
 * gruesa.
 * 
 * Esta clase se encarga de moldear pizzas de masa gruesa de diferentes tamaños.
 * 
 * @author andersonlopez
 */
public class MoldeadorPizzaGruesa implements MoldeadorPizza {

  /**
   * Método para moldear una pizza de masa gruesa según su tamaño.
   * 
   * @param tamano Tamaño de la pizza (pequeño o mediano).
   */

  public void moldear(Tamano tamano) {
    if (tamano == Tamano.PEQUENO) {
      Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
          .log(Level.INFO, "[O] Moldeando pizza pequena de masa gruesa.");
    } else if (tamano == Tamano.MEDIANO) {
      Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
          .log(Level.INFO, "[O] Moldeando pizza mediana de masa gruesa.");
    }else if (tamano == Tamano.GRUESA) {
      Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
          .log(Level.INFO, "[O] Moldeando pizza gruesa de masa gruesa.");
    }else if (tamano == Tamano.GRUESA) {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
            .log(Level.INFO, "[O] Moldeando pizza gruesa de masa gruesa.>>>>>>>>");
        }
      }
}
