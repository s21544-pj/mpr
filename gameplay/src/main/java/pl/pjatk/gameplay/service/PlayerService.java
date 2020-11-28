package pl.pjatk.gameplay.service;

import org.springframework.stereotype.Service;
import pl.pjatk.gameplay.model.Player;
import pl.pjatk.gameplay.repository.PlayerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    private PlayerRepository playerRepository;

    public List<Player> findall(){
        return playerRepository.findAll();
    }

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

//    public Optional<Player> findById(long id){
//        List<Player> players = new ArrayList<>();
//        players.add(new Player("test", 1L,10,20,30));
//        players.add(new Player("test 2", 2L,100,24,32));
//        players.add(new Player("test 3", 3L,1000,26,34));
//        return players.stream().filter(player -> player.getId() == id).findFirst();
//       /* for (Player player: players){
//            if(player.get_id()==id) {
//                return player;
//            }
//        }
//        return new Player();*/
//        return playerRepository.findById(id);
//    }
//    public Optional<Player> findById(int id) {
//        List<Player> players = new ArrayList<>();
//        players.add(new Player(1, "Tank", 15, 5, 5));
//        players.add(new Player(2, "Mag", 10, 10, 5));
//        players.add(new Player(3, "DPS", 10, 5, 10));
//
//        return players.stream().filter(player -> player.getId() == id).findFirst();
//    }
public Optional<Player> findById(Long id) {
    return playerRepository.findById(id);
}

public void delete(Long id) {
        playerRepository.deleteById(id);
    }

    public Player save(Player player) {
        return playerRepository.save(player);
    }
}
