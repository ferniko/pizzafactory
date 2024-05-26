
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.FabricaPizza;
import edu.unisabana.pizzafactory.model.FabricaPizzaMasaGruesa;
import edu.unisabana.pizzafactory.model.FabricaPizzaMasaIntegral;
import edu.unisabana.pizzafactory.model.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Pizza;
import edu.unisabana.pizzafactory.model.Tamano;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Clase para probar la preparación de pizzas con diferentes fábricas.
 * 
 * @author cesarvefe, andersonlopez
 */
public class PreparadorPizza {

  /**
     * Método principal que ejecuta los ejemplos de preparación de pizza.
     * @param args Argumentos de línea de comando.
     */
  public static void main(String[] args) {
    try {
      Ingrediente[] ingredientes = new Ingrediente[] {
          new Ingrediente("queso", 1),
          new Ingrediente("jamon", 2)
      };

      // Ejemplo con masa gruesa
      System.out.println();
      System.out.println("**********EJEMPLO CON MASA GRUESA**********");
      FabricaPizza fabrica = new FabricaPizzaMasaGruesa();
      Pizza pizza = new Pizza(ingredientes, Tamano.MEDIANO, fabrica);
      pizza.preparar();

      // Ejemplo con masa integral
      System.out.println();
      System.out.println("**********EJEMPLO CON MASA INTEGRAL**********");
      FabricaPizza fabricaIntegral = new FabricaPizzaMasaIntegral();
      Pizza pizzaIntegral = new Pizza(ingredientes, Tamano.PEQUENO, fabricaIntegral);
      pizzaIntegral.preparar();

    } catch (ExcepcionParametrosInvalidos ex) {
      Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE,
          "Problema en la preparacion de la Pizza", ex);
    }
  }

}
