
package com.example.weatherapp.met;

import java.util.LinkedHashMap;
import java.util.Map;


// @Generated("jsonschema2pojo")
public class Units {

    private String airPressureAtSeaLevel;
    private String airTemperature;
    private String cloudAreaFraction;
    private String precipitationAmount;
    private String relativeHumidity;
    private String windFromDirection;
    private String windSpeed;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getAirPressureAtSeaLevel() {
        return airPressureAtSeaLevel;
    }

    public void setAirPressureAtSeaLevel(String airPressureAtSeaLevel) {
        this.airPressureAtSeaLevel = airPressureAtSeaLevel;
    }

    public String getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(String airTemperature) {
        this.airTemperature = airTemperature;
    }

    public String getCloudAreaFraction() {
        return cloudAreaFraction;
    }

    public void setCloudAreaFraction(String cloudAreaFraction) {
        this.cloudAreaFraction = cloudAreaFraction;
    }

    public String getPrecipitationAmount() {
        return precipitationAmount;
    }

    public void setPrecipitationAmount(String precipitationAmount) {
        this.precipitationAmount = precipitationAmount;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getWindFromDirection() {
        return windFromDirection;
    }

    public void setWindFromDirection(String windFromDirection) {
        this.windFromDirection = windFromDirection;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Units.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("airPressureAtSeaLevel");
        sb.append('=');
        sb.append(((this.airPressureAtSeaLevel == null)?"<null>":this.airPressureAtSeaLevel));
        sb.append(',');
        sb.append("airTemperature");
        sb.append('=');
        sb.append(((this.airTemperature == null)?"<null>":this.airTemperature));
        sb.append(',');
        sb.append("cloudAreaFraction");
        sb.append('=');
        sb.append(((this.cloudAreaFraction == null)?"<null>":this.cloudAreaFraction));
        sb.append(',');
        sb.append("precipitationAmount");
        sb.append('=');
        sb.append(((this.precipitationAmount == null)?"<null>":this.precipitationAmount));
        sb.append(',');
        sb.append("relativeHumidity");
        sb.append('=');
        sb.append(((this.relativeHumidity == null)?"<null>":this.relativeHumidity));
        sb.append(',');
        sb.append("windFromDirection");
        sb.append('=');
        sb.append(((this.windFromDirection == null)?"<null>":this.windFromDirection));
        sb.append(',');
        sb.append("windSpeed");
        sb.append('=');
        sb.append(((this.windSpeed == null)?"<null>":this.windSpeed));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.airTemperature == null)? 0 :this.airTemperature.hashCode()));
        result = ((result* 31)+((this.relativeHumidity == null)? 0 :this.relativeHumidity.hashCode()));
        result = ((result* 31)+((this.windFromDirection == null)? 0 :this.windFromDirection.hashCode()));
        result = ((result* 31)+((this.precipitationAmount == null)? 0 :this.precipitationAmount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.airPressureAtSeaLevel == null)? 0 :this.airPressureAtSeaLevel.hashCode()));
        result = ((result* 31)+((this.windSpeed == null)? 0 :this.windSpeed.hashCode()));
        result = ((result* 31)+((this.cloudAreaFraction == null)? 0 :this.cloudAreaFraction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Units) == false) {
            return false;
        }
        Units rhs = ((Units) other);
        return (((((((((this.airTemperature == rhs.airTemperature)||((this.airTemperature!= null)&&this.airTemperature.equals(rhs.airTemperature)))&&((this.relativeHumidity == rhs.relativeHumidity)||((this.relativeHumidity!= null)&&this.relativeHumidity.equals(rhs.relativeHumidity))))&&((this.windFromDirection == rhs.windFromDirection)||((this.windFromDirection!= null)&&this.windFromDirection.equals(rhs.windFromDirection))))&&((this.precipitationAmount == rhs.precipitationAmount)||((this.precipitationAmount!= null)&&this.precipitationAmount.equals(rhs.precipitationAmount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.airPressureAtSeaLevel == rhs.airPressureAtSeaLevel)||((this.airPressureAtSeaLevel!= null)&&this.airPressureAtSeaLevel.equals(rhs.airPressureAtSeaLevel))))&&((this.windSpeed == rhs.windSpeed)||((this.windSpeed!= null)&&this.windSpeed.equals(rhs.windSpeed))))&&((this.cloudAreaFraction == rhs.cloudAreaFraction)||((this.cloudAreaFraction!= null)&&this.cloudAreaFraction.equals(rhs.cloudAreaFraction))));
    }

}
