package xn.one.domain;

import xn.core.Entity;

/**
 * User: 潘智峰
 * Date: 13-3-21
 */
public class Skill extends Entity {

    private int uid;

    private int category;

    private int lv;

    private String values;

    private int soul;

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

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public int getSoul() {
        return soul;
    }

    public void setSoul(int soul) {
        this.soul = soul;
    }
}
