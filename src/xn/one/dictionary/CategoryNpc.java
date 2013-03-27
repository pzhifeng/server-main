package xn.one.dictionary;

import xn.core.Entity;

/**
 * User: 潘智峰
 * Date: 13-3-21
 */
public class CategoryNpc extends Entity {

    private String name;

    private String resource;

    private int lv;

    private int hp;

    private int atk;

    private int def;

    private int imt;

    private int res;

    private float knock;

    private String skill1;

    private String skill2;

    private String skill3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getImt() {
        return imt;
    }

    public void setImt(int imt) {
        this.imt = imt;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public float getKnock() {
        return knock;
    }

    public void setKnock(float knock) {
        this.knock = knock;
    }

    public String getSkill1() {
        return skill1;
    }

    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    public String getSkill2() {
        return skill2;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public String getSkill3() {
        return skill3;
    }

    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }
}
