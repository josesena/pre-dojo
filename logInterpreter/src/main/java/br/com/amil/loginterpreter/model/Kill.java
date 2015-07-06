package br.com.amil.loginterpreter.model;

/**
 * Classe Kill, que guarda o nome das armas
 * @author joserenato
 * @version $Id$
 *
 */
public class Kill {

	/**
	 * Campo weapon, nome da arma
	 */
	private String weapon;

    /**
     * Método get do atriburo weapon
     * @return the weapon
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * Método set do atributo weapon
     * @param weapon Valor para setar no atributo weapon
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
	
}
