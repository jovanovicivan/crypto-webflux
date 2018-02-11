package rs.ivan.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "tickers")
public class Ticker {

    @Field("last_updated")
    @JsonProperty("last_updated")
    @Id
    private Long lastUpdatedTimestamp;
    @JsonProperty
    private String name;
    @JsonProperty
    private String symbol;
    @JsonProperty
    private Integer rank;
    @JsonProperty("price_usd")
    @Field("price_usd")
    private Double priceUsd;
    @JsonProperty("price_btc")
    @Field("price_btc")
    private Double priceBtc;
    @JsonProperty("24h_volume_usd")
    @Field("24h_volume_usd")
    private Double dayVolumeUsd;
    @JsonProperty("market_cap_usd")
    @Field("market_cap_usd")
    private Double marketCapUsd;
    @JsonProperty("available_supply")
    @Field("available_supply")
    private Double availableSupply;
    @Field("total_supply")
    @JsonProperty("total_supply")
    private Double totalSupply;
    @Field("max_supply")
    @JsonProperty("max_supply")
    private Double maxSupply;
    @Field("percent_change_1h")
    @JsonProperty("percent_change_1h")
    private Double percentChangeHour;
    @Field("percent_change_24h")
    @JsonProperty("percent_change_24h")
    private Double percentChangeDay;
    @Field("percent_change_7d")
    @JsonProperty("percent_change_7d")
    private Double percentChangeWeek;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Double getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(Double priceUsd) {
        this.priceUsd = priceUsd;
    }

    public Double getPriceBtc() {
        return priceBtc;
    }

    public void setPriceBtc(Double priceBtc) {
        this.priceBtc = priceBtc;
    }

    public Double getDayVolumeUsd() {
        return dayVolumeUsd;
    }

    public void setDayVolumeUsd(Double dayVolumeUsd) {
        this.dayVolumeUsd = dayVolumeUsd;
    }

    public Double getMarketCapUsd() {
        return marketCapUsd;
    }

    public void setMarketCapUsd(Double marketCapUsd) {
        this.marketCapUsd = marketCapUsd;
    }

    public Double getAvailableSupply() {
        return availableSupply;
    }

    public void setAvailableSupply(Double availableSupply) {
        this.availableSupply = availableSupply;
    }

    public Double getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(Double totalSupply) {
        this.totalSupply = totalSupply;
    }

    public Double getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(Double maxSupply) {
        this.maxSupply = maxSupply;
    }

    public Double getPercentChangeHour() {
        return percentChangeHour;
    }

    public void setPercentChangeHour(Double percentChangeHour) {
        this.percentChangeHour = percentChangeHour;
    }

    public Double getPercentChangeDay() {
        return percentChangeDay;
    }

    public void setPercentChangeDay(Double percentChangeDay) {
        this.percentChangeDay = percentChangeDay;
    }

    public Double getPercentChangeWeek() {
        return percentChangeWeek;
    }

    public void setPercentChangeWeek(Double percentChangeWeek) {
        this.percentChangeWeek = percentChangeWeek;
    }

    public Long getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    public void setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }
}
