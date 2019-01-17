package satedshark.com.vk.minorityopinion;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class PlayerLabTest {

    private PlayerLab mSubject;

    @Before
    public void setUp() throws Exception {
        mSubject = PlayerLab.get();
    }

    @Test
    public void newPassTest(){
         List<Player> playerList = mSubject.getPlayers();
         for (int i = 0; i < playerList.size(); i++){
             Player player = playerList.get(i);
             System.out.println(player.getPlayerName() + " "
                     + player.getPlayerAccount() + " "
                     + mSubject.newPass(5));
         }
    }

}