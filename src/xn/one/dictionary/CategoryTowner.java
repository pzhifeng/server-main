package xn.one.dictionary;

import xn.core.Entity;

/**
 * User: 潘智峰
 * Date: 13-3-21
 */
public class CategoryTowner extends Entity {

    private int npcId;

    private String rule;

    private int prizeGold;

    private int prizeSoul;

    private String prizeEquip;

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

    public int getPrizeGold() {
        return prizeGold;
    }

    public void setPrizeGold(int prizeGold) {
        this.prizeGold = prizeGold;
    }

    public int getPrizeSoul() {
        return prizeSoul;
    }

    public void setPrizeSoul(int prizeSoul) {
        this.prizeSoul = prizeSoul;
    }

    public String getPrizeEquip() {
        return prizeEquip;
    }

    public void setPrizeEquip(String prizeEquip) {
        this.prizeEquip = prizeEquip;
    }
}
