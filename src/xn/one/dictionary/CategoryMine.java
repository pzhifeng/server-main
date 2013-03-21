package xn.one.dictionary;

import xn.core.Entity;

import java.util.Date;

/**
 * User: 潘智峰
 * Date: 13-3-21
 */
public class CategoryMine extends Entity {

    private int copper;

    private float silver;

    private float gold;

    private int ownerUid;

    private Date ownAt;


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

    public int getOwnerUid() {
        return ownerUid;
    }

    public void setOwnerUid(int ownerUid) {
        this.ownerUid = ownerUid;
    }

    public Date getOwnAt() {
        return ownAt;
    }

    public void setOwnAt(Date ownAt) {
        this.ownAt = ownAt;
    }
}
