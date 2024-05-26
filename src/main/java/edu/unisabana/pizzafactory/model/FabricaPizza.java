package edu.unisabana.pizzafactory.model;

/**
 *
 * @author andersonlopez
 */
public interface FabricaPizza {
	AmasadorPizza crearAmasador();
	MoldeadorPizza crearMoldeador();
	HorneadorPizza crearHorneador();
}
