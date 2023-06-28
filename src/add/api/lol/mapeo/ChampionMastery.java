
package add.api.lol.mapeo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ChampionMastery {

    @SerializedName("championId")
    @Expose
    private Long championId;
    @SerializedName("championLevel")
    @Expose
    private Integer championLevel;
    @SerializedName("championPoints")
    @Expose
    private Integer championPoints;
    @SerializedName("lastPlayTime")
    @Expose
    private Long lastPlayTime;
    @SerializedName("championPointsSinceLastLevel")
    @Expose
    private Long championPointsSinceLastLevel;
    @SerializedName("championPointsUntilNextLevel")
    @Expose
    private Long championPointsUntilNextLevel;
    @SerializedName("chestGranted")
    @Expose
    private Boolean chestGranted;
    @SerializedName("tokensEarned")
    @Expose
    private Integer tokensEarned;
    @SerializedName("summonerId")
    @Expose
    private String summonerId;

    public Long getChampionId() {
        return championId;
    }

    public void setChampionId(Long championId) {
        this.championId = championId;
    }

    public Integer getChampionLevel() {
        return championLevel;
    }

    public void setChampionLevel(Integer championLevel) {
        this.championLevel = championLevel;
    }

    public Integer getChampionPoints() {
        return championPoints;
    }

    public void setChampionPoints(Integer championPoints) {
        this.championPoints = championPoints;
    }

    public Long getLastPlayTime() {
        return lastPlayTime;
    }

    public void setLastPlayTime(Long lastPlayTime) {
        this.lastPlayTime = lastPlayTime;
    }

    public Long getChampionPointsSinceLastLevel() {
        return championPointsSinceLastLevel;
    }

    public void setChampionPointsSinceLastLevel(Long championPointsSinceLastLevel) {
        this.championPointsSinceLastLevel = championPointsSinceLastLevel;
    }

    public Long getChampionPointsUntilNextLevel() {
        return championPointsUntilNextLevel;
    }

    public void setChampionPointsUntilNextLevel(Long championPointsUntilNextLevel) {
        this.championPointsUntilNextLevel = championPointsUntilNextLevel;
    }

    public Boolean getChestGranted() {
        return chestGranted;
    }

    public void setChestGranted(Boolean chestGranted) {
        this.chestGranted = chestGranted;
    }

    public Integer getTokensEarned() {
        return tokensEarned;
    }

    public void setTokensEarned(Integer tokensEarned) {
        this.tokensEarned = tokensEarned;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

}
