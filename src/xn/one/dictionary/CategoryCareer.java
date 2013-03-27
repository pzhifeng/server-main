package xn.one.dictionary;

import xn.core.Entity;

/**
 * User: 潘智峰
 * Date: 13-3-21
 */
public class CategoryCareer extends Entity {

    private String name;

    private String resource;

    private int weapon;

    private int hpMax;

    private int shieldMax;

    private int magicMax;

    private int actionMax;

    private int atk;

    private int def;

    private int imt;

    private int res;

    private float knock;

    private int skillId;

    private String desc;

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

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public int getShieldMax() {
        return shieldMax;
    }

    public void setShieldMax(int shieldMax) {
        this.shieldMax = shieldMax;
    }

    public int getMagicMax() {
        return magicMax;
    }

    public void setMagicMax(int magicMax) {
        this.magicMax = magicMax;
    }

    public int getActionMax() {
        return actionMax;
    }

    public void setActionMax(int actionMax) {
        this.actionMax = actionMax;
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

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
