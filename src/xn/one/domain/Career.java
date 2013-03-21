package xn.one.domain;

import xn.core.Entity;

/**
 * User: 潘智峰
 * Date: 13-3-21
 */
public class Career extends Entity {

    private int uid;

    private int lv;

    private int exp;

    private int category;

    private int hpMax;

    private int hp;

    private int shieldMax;

    private int shield;

    private int magicMax;

    private int magic;

    private int actionMax;

    private int action;

    private int atk;

    private int def;

    private int imt;

    private int res;

    private float knock;

    private float avoid;


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getShieldMax() {
        return shieldMax;
    }

    public void setShieldMax(int shieldMax) {
        this.shieldMax = shieldMax;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getMagicMax() {
        return magicMax;
    }

    public void setMagicMax(int magicMax) {
        this.magicMax = magicMax;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getActionMax() {
        return actionMax;
    }

    public void setActionMax(int actionMax) {
        this.actionMax = actionMax;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
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

    public float getAvoid() {
        return avoid;
    }

    public void setAvoid(float avoid) {
        this.avoid = avoid;
    }
}
