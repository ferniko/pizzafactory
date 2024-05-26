package edu.unisabana.pizzafactory.model;

/**
 * Interfaz para moldear pizzas de diferentes tamaños.
 * 
 * Esta interfaz define el método para moldear una pizza según su tamaño.
 * Las clases que implementen esta interfaz deben proporcionar una
 * implementación
 * del método moldear que especifique cómo se debe moldear la pizza.
 * 
 * @author andersonlopez
 */
public interface MoldeadorPizza {

  /**
   * Método para moldear una pizza según su tamaño.
   * 
   * @param tamano Tamaño de la pizza (pequeño o mediano).
   */
  void moldear(Tamano tamano);
}
