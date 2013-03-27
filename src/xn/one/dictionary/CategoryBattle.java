package xn.one.dictionary;

import xn.core.Entity;

/**
 * User: 潘智峰
 * Date: 13-3-21
 */
public class CategoryBattle extends Entity {

    private String name;

    private String bgimage;

    private String points;

    private String prizeGate;

    private String prizeBattle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBgimage() {
        return bgimage;
    }

    public void setBgimage(String bgimage) {
        this.bgimage = bgimage;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getPrizeGate() {
        return prizeGate;
    }

    public void setPrizeGate(String prizeGate) {
        this.prizeGate = prizeGate;
    }

    public String getPrizeBattle() {
        return prizeBattle;
    }

    public void setPrizeBattle(String prizeBattle) {
        this.prizeBattle = prizeBattle;
    }
}
