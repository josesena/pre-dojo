package br.com.amil.loginterpreter.business;

import br.com.amil.loginterpreter.model.Game;

/**
 * Interface com parametors de padrao de entrada e metodo processor
 * @author joserenato
 * @version $Id$
 *
 */
public interface LogInterpreterProcessor {

	String MATCH_STARTED_PATTERN = ".[^-]+- New match (.*.) has started";
	String DEAD_PLAYER_PATTERN = "killed (.*.) [using|by]";
	String KILLER_PLAYER_PATTERN = "\\- (.*.) killed";
	String WEAPON_PATTERN = "(using|by) (.*.)";
	String IGNORED_PLAYER = "<WORLD>";
	
	/**
	 * Método responsável pela operacao de solicitacao
	 * @param line
	 * @param game
	 * @return
	 */
	Game process(String line, Game game);
	
}
