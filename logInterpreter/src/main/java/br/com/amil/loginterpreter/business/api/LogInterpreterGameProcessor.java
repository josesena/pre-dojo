package br.com.amil.loginterpreter.business.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import br.com.amil.loginterpreter.model.Game;


/**
 * Classe abstrata para implementacao dos metodos de entrada, processamento de arquivo e saida de resultado
 * @author joserenato
 * @version $Id$
 *
 */
public abstract class LogInterpreterGameProcessor {
	
	/**
	 * Campo MATCH_STARTED_PATTERN que inicia o jogo
	 */
	protected static String MATCH_STARTED_PATTERN = ".[^-]+- New match (.*.) has started";
	
	/**
	 * Método de entrada de entrada do arquivo log 
	 * @param file
	 * @return Scanner
	 * @throws FileNotFoundException
	 */
	public abstract Scanner prepareGame(File file) throws FileNotFoundException;
	
	/**
	 * Método responsável por ler cada linha do arquivo e retornar uma lista de games
	 * @param sc
	 * @return List<Game>
	 * @throws ParseException
	 */
	public abstract List<Game> processGame(Scanner sc) throws ParseException;
	
	/**
	 * Método reponsável pela saida do processo
	 * @param games
	 * @return
	 */
	public abstract String outputGames(List<Game> games);
	
}
