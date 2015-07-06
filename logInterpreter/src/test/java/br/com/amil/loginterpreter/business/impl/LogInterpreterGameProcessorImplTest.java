package br.com.amil.loginterpreter.business.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.amil.loginterpreter.model.Game;

public class LogInterpreterGameProcessorImplTest {

    @Mock
    private LogInterpreterGameProcessorImpl gameProcessorImpl;
    
    public void init(){
        MockitoAnnotations.initMocks(this);
        this.gameProcessorImpl = new LogInterpreterGameProcessorImpl();
    }
    
  
    @SuppressWarnings("static-access")
    @Test
    public void processStartTest() throws ParseException{
        String line = "30/07/2013 15:34:22 - New match 11348965 has started";
        Game game = new Game();
        List<Game> gameList = new ArrayList<Game>();
        game = this.gameProcessorImpl.process(line, game, gameList);
        Assert.assertNotNull(game);
    }
    
    @SuppressWarnings("static-access")
    @Test
    public void processRoundTest() throws ParseException{
        String line = "30/07/2013 15:36:04 - Roman killed Nick using M4a1";
        Game game = new Game();
        List<Game> gamesList = new ArrayList<Game>();
        game = this.gameProcessorImpl.process(line, game, gamesList);
        Assert.assertNotNull(game);
    }
}
