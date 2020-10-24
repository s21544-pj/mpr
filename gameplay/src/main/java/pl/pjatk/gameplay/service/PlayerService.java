package pl.pjatk.gameplay.service;

import org.springframework.stereotype.Service;
import pl.pjatk.gameplay.model.Player;

import java.util.List;

@Service
public class PlayerService {
    public List<Player> findall(){
        return List.of(new Player("test", 1,10,20,30));
    }
}
