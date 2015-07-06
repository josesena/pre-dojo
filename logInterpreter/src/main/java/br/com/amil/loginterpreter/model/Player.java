package br.com.amil.loginterpreter.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe Player qeu contem o nome do jogador, lista de assassinatos e mortes, metodo que captura
 * arma favorita e compara o maior
 * 
 * @author joserenato
 * @version $Id$
 * 
 */
public class Player implements Comparable<Player> {

    /**
     * Campo name, nome do jogador
     */
    private String name;

    /**
     * Campo killsList lista de assassinatos
     */
    private List<Kill> killsList = new ArrayList<Kill>();

    /**
     * Campo deathsList lista de mortos
     */
    private List<Kill> deathsList = new ArrayList<Kill>();



    /**
     * Método get do atriburo name
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Método set do atributo name
     * 
     * @param name Valor para setar no atributo name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método get do atriburo killsList
     * 
     * @return the killsList
     */
    public List<Kill> getKillsList() {
        return killsList;
    }

    /**
     * Método set do atributo killsList
     * 
     * @param killsList Valor para setar no atributo killsList
     */
    public void setKillsList(List<Kill> killsList) {
        this.killsList = killsList;
    }

    /**
     * Método get do atriburo deathsList
     * 
     * @return the deathsList
     */
    public List<Kill> getDeathsList() {
        return deathsList;
    }

    /**
     * Método set do atributo deathsList
     * 
     * @param deathsList Valor para setar no atributo deathsList
     */
    public void setDeathsList(List<Kill> deathsList) {
        this.deathsList = deathsList;
    }

    /**
     * Método respoável selecionar a arma favorita do jogador
     * 
     * @return
     */
    public String getFavoriteWeapon() {
        List<String> weaponList = new ArrayList<String>();
        for (Kill m : this.killsList) {
            weaponList.add(m.getWeapon());
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < weaponList.size(); i++) {
            Integer count = map.get(weaponList.get(i));
            map.put(weaponList.get(i), count == null ? 1 : count + 1);
        }
        Integer quantity = 0;
        String weapon = "";
        for (String key : map.keySet()) {
            if (map.get(key) > quantity) {
                quantity = map.get(key);
                weapon = key;
            }
        }
        return weapon;
    }

    public Boolean isHighlander() {
        return this.deathsList.isEmpty();
    }

    private Integer totalScore() {
        return this.deathsList.size() - this.killsList.size();
    }

    public int compareTo(Player player) {
        return totalScore().compareTo(player.totalScore());
    }
}
