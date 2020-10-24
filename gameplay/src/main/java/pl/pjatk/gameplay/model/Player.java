package pl.pjatk.gameplay.model;

public class Player {
    public Player(String nickname, int id, int attack, int health, int mana) {
        this.nickname = nickname;
        this.id = id;
        this.attack = attack;
        this.health = health;
        this.mana = mana;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    private String nickname;
    private int id;
    private int attack;
    private int health;
    private int mana;
}
