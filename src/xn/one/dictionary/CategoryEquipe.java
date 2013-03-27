package xn.one.dictionary;

import xn.core.Entity;

/**
 * User: 潘智峰
 * Date: 13-3-21
 */
public class CategoryEquipe extends Entity {

    private int cagegory;

    private int subCategory;

    private int careerId;

    private int quality;

    private String name;

    private String image;

    private int minBase;

    private int maxBase;

    private String additions;

    private int addCount;

    private String formulaEnhance;

    private int coins;


    public int getCagegory() {
        return cagegory;
    }

    public void setCagegory(int cagegory) {
        this.cagegory = cagegory;
    }

    public int getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(int subCategory) {
        this.subCategory = subCategory;
    }

    public int getCareerId() {
        return careerId;
    }

    public void setCareerId(int careerId) {
        this.careerId = careerId;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getMinBase() {
        return minBase;
    }

    public void setMinBase(int minBase) {
        this.minBase = minBase;
    }

    public int getMaxBase() {
        return maxBase;
    }

    public void setMaxBase(int maxBase) {
        this.maxBase = maxBase;
    }

    public String getAdditions() {
        return additions;
    }

    public void setAdditions(String additions) {
        this.additions = additions;
    }

    public int getAddCount() {
        return addCount;
    }

    public void setAddCount(int addCount) {
        this.addCount = addCount;
    }

    public String getFormulaEnhance() {
        return formulaEnhance;
    }

    public void setFormulaEnhance(String formulaEnhance) {
        this.formulaEnhance = formulaEnhance;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
