package br.com.amil.loginterpreter.business.api;

import java.util.ArrayList;
import java.util.List;

import br.com.amil.loginterpreter.business.LogInterpreterProcessor;
import br.com.amil.loginterpreter.model.Game;


/**
 * Classe abstrata 
 * @author joserenato
 * @version $Id$
 *
 */
public abstract class LogInterpreterRoundProcessor {

	/**
	 * FIXME Inserir Comentário do Campo.
	 */
	List<LogInterpreterProcessor> processorList = new ArrayList<LogInterpreterProcessor>();
	
	/**
	 * Método 
	 * @param processor
	 */
	public abstract void addProcessor(LogInterpreterProcessor processor);
	
	/**
	 * FIXME Inserir comentário para o Método
	 * @param line
	 * @param game
	 * @return
	 */
	public abstract Game process(String line, Game game);

    /**
     * Método get do atriburo processorList
     * @return the processorList
     */
    public List<LogInterpreterProcessor> getProcessorList() {
        return processorList;
    }

    /**
     * Método set do atributo processorList
     * @param processorList Valor para setar no atributo processorList
     */
    public void setProcessorList(List<LogInterpreterProcessor> processorList) {
        this.processorList = processorList;
    }
	
	
	
}
