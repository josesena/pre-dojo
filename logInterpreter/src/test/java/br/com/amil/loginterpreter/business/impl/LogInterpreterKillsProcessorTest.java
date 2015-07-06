package br.com.amil.loginterpreter.business.impl;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.amil.loginterpreter.model.Game;
import br.com.amil.loginterpreter.model.Player;

public class LogInterpreterKillsProcessorTest {
    
    @Mock
    private LogInterpreterKillsProcessor interpreterKillsProcessor;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        interpreterKillsProcessor = new LogInterpreterKillsProcessor();
    }

    @Test
    public void processKillsTest(){
        Game game = new Game();
        String line =  "30/07/2013 15:36:04 - Roman killed Nick using M4a1";
        game = this.interpreterKillsProcessor.process(line, game);
        Assert.assertNotNull(game);
    }
    
    @Test
    public void processKillsIfPlayListTest(){
        Game game = new Game();
        String line =  "30/07/2013 15:36:04 - Roman killed Nick using M4a1";
        Player player = new Player();
        HashMap<String, Player> map = new HashMap<String, Player>();
        map.put("Roman", player);
        game.setPlayerList(map);
        game = this.interpreterKillsProcessor.process(line, game);
        Assert.assertNotNull(game);
        
    }
    
}
