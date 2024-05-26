package edu.unisabana.pizzafactory.model;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que representa una pizza y su proceso de preparación.
 * 
 * @author andersonlopez
 */

public class Pizza {
  private Ingrediente[] ingredientes;
  private Tamano tamano;
  private AmasadorPizza amasador;
  private MoldeadorPizza moldeador;
  private HorneadorPizza horneador;

  /**
   * Constructor de la clase Pizza.
   * 
   * @param ingredientes Arreglo de ingredientes que se utilizarán en la pizza.
   * @param tamano       Tamaño de la pizza (mediano o pequeño).
   * @param fabrica      Fábrica de pizza que proporciona los implementadores de
   *                     las interfaces de preparación.
   */

  public Pizza(Ingrediente[] ingredientes, Tamano tamano, FabricaPizza fabrica) {
    this.ingredientes = ingredientes;
    this.tamano = tamano;
    this.amasador = fabrica.crearAmasador();
    this.moldeador = fabrica.crearMoldeador();
    this.horneador = fabrica.crearHorneador();
  }

  /**
   * Método que prepara la pizza, siguiendo los pasos de amasado, moldeado,
   * aplicación de ingredientes y horneado.
   * 
   * @throws ExcepcionParametrosInvalidos Si hay algún problema con los parámetros
   *                                      de entrada.
   * 
   */

  public void preparar() throws ExcepcionParametrosInvalidos {
    amasador.amasar();
    moldeador.moldear(tamano);
    aplicarIngredientes();
    horneador.hornear();
  }

  /**
   * Método privado que aplica los ingredientes a la pizza.
   * 
   * Este método es responsable de llamar al microcontrolador para aplicar los
   * ingredientes.
   */

  private void aplicarIngredientes() {
    Logger.getLogger(Pizza.class.getName())
        .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
    // CODIGO DE LLAMADO AL MICROCONTROLADOR
  }
}
