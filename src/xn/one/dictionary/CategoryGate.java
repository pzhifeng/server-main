package xn.one.dictionary;

import xn.core.Entity;

/**
 * User: 潘智峰
 * Date: 13-3-21
 */
public class CategoryGate extends Entity {

    private int battleId;

    private int category;

    private int npc1Id;

    private int npc2Id;

    private int npc3Id;

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

    public int getNpc1Id() {
        return npc1Id;
    }

    public void setNpc1Id(int npc1Id) {
        this.npc1Id = npc1Id;
    }

    public int getNpc2Id() {
        return npc2Id;
    }

    public void setNpc2Id(int npc2Id) {
        this.npc2Id = npc2Id;
    }

    public int getNpc3Id() {
        return npc3Id;
    }

    public void setNpc3Id(int npc3Id) {
        this.npc3Id = npc3Id;
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
