package xn.one.dictionary;

import xn.core.Entity;

import java.util.Date;

/**
 * User: 潘智峰
 * Date: 13-3-21
 */
public class CategoryMine extends Entity {

    private String image;

    private int copper;

    private float silver;

    private float gold;

    private int npcId;


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCopper() {
        return copper;
    }

    public void setCopper(int copper) {
        this.copper = copper;
    }

    public float getSilver() {
        return silver;
    }

    public void setSilver(float silver) {
        this.silver = silver;
    }

    public float getGold() {
        return gold;
    }

    public void setGold(float gold) {
        this.gold = gold;
    }

    public int getNpcId() {
        return npcId;
    }

    public void setNpcId(int npcId) {
        this.npcId = npcId;
    }
}
