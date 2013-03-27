package xn.one.domain;

import xn.core.Entity;

import java.util.Date;

/**
 * User: 潘智峰
 * Date: 13-3-21
 */
public class Equipe extends Entity {

    private int uid;

    private int category;

    private int status;

    private int base;

    private int lv;

    private String addition1;
    private String addition2;
    private String addition3;

    private int enhanceCount;

    private int rebuildCount;

    private int washCount;

    private int coins;

    private Date createAt;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public String getAddition1() {
        return addition1;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }


    public int getEnhanceCount() {
        return enhanceCount;
    }

    public void setEnhanceCount(int enhanceCount) {
        this.enhanceCount = enhanceCount;
    }

    public int getRebuildCount() {
        return rebuildCount;
    }

    public void setRebuildCount(int rebuildCount) {
        this.rebuildCount = rebuildCount;
    }

    public int getWashCount() {
        return washCount;
    }

    public void setWashCount(int washCount) {
        this.washCount = washCount;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
