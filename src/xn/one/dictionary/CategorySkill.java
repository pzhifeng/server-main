package xn.one.dictionary;

import xn.core.Entity;

/**
 * User: 潘智峰
 * Date: 13-3-21
 */
public class CategorySkill extends Entity {

    private int careerId;

    private String name;

    private String image;

    private String effect;

    private String values;

    private String desc;

    private int soul;

    private int category;

    private float value;

    private String formulaLv;

    private String formulaValues;

    private String formulaSoul;


    public int getCareerId() {
        return careerId;
    }

    public void setCareerId(int careerId) {
        this.careerId = careerId;
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

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getSoul() {
        return soul;
    }

    public void setSoul(int soul) {
        this.soul = soul;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getFormulaLv() {
        return formulaLv;
    }

    public void setFormulaLv(String formulaLv) {
        this.formulaLv = formulaLv;
    }

    public String getFormulaValues() {
        return formulaValues;
    }

    public void setFormulaValues(String formulaValues) {
        this.formulaValues = formulaValues;
    }

    public String getFormulaSoul() {
        return formulaSoul;
    }

    public void setFormulaSoul(String formulaSoul) {
        this.formulaSoul = formulaSoul;
    }
}
