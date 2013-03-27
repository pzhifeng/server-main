package xn.one.dictionary;

import xn.core.Entity;

/**
 * User: 潘智峰
 * Date: 13-3-21
 */
public class CategoryGate extends Entity {

    private int battleId;

    private int category;

    private int npcId;

    private String rule;

    private String prize;


    public int getBattleId() {
        return battleId;
    }

    public void setBattleId(int battleId) {
        this.battleId = battleId;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getNpcId() {
        return npcId;
    }

    public void setNpcId(int npcId) {
        this.npcId = npcId;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }
}
