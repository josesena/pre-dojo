package br.com.amil.loginterpreter.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Classe Game
 * 
 * @author joserenato
 * @version $Id$
 * 
 */
public class Game {

    /**
     * Campo name, nome do jogo
     */
    private String name = "";

    /**
     * Campo playerList, lista do objeto Player
     */
    private HashMap<String, Player> playerList = new HashMap<String, Player>();



    public void addPlayer(Player player) {
        playerList.put(player.getName(), player);
    }

    /**
     * FIXME Inserir comentário para o Método
     * @return
     */
    public ArrayList<Player> getPlayerSortedList() {
        ArrayList<Player> sortedPlayersList = new ArrayList<Player>(playerList.values());
        Collections.sort(sortedPlayersList);
        return sortedPlayersList;
    }


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
     * Método get do atriburo playerList
     * 
     * @return the playerList
     */
    public HashMap<String, Player> getPlayerList() {
        return playerList;
    }

    /**
     * Método set do atributo playerList
     * 
     * @param playerList Valor para setar no atributo playerList
     */
    public void setPlayerList(HashMap<String, Player> playerList) {
        this.playerList = playerList;
    }


}
