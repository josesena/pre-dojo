package br.com.amil.loginterpreter.business.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.amil.loginterpreter.model.Game;
import br.com.amil.loginterpreter.model.Player;

public class LogInterpreterDeathsProcessorTest {
    
    @Mock
    private LogInterpreterDeathsProcessor deathsProcessor;
    

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        deathsProcessor = new LogInterpreterDeathsProcessor();
    }
    
    @Test
    public void processDeathsTest(){
        Game game = new Game();
        String line = "30/07/2013 15:36:04 - Roman killed Nick using M4a1";
        game = this.deathsProcessor.process(line, game);
        Assert.assertNotNull(game);
    }
    
    @Test
    public void processDeathsIfPlayListTest(){
        Game game = new Game();
        Player player = new Player();
        HashMap<String, Player> mp = new HashMap<String, Player>();
        mp.put("Nick", player);
        game.setPlayerList(mp);
        String line = "30/07/2013 15:36:04 - Roman killed Nick using M4a1";
        game = this.deathsProcessor.process(line, game);
        Assert.assertNotNull(game);
    }
}
