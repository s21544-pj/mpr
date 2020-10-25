package pl.pjatk.gameplay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {



    public Player(String nickname, Long id, int attack, int health, int mana) {
        this.nickname = nickname;
        this.id = id;
        this.attack = attack;
        this.health = health;
        this.mana = mana;
    }

    public Player() {

    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Id
    @GeneratedValue
    private String nickname;
    private Long id;
    private int attack;
    private int health;
    private int mana;
}
