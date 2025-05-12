
package com.example.weatherapp.met;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedHashMap;
import java.util.Map;


// @Generated("jsonschema2pojo")
public class Details {

    @JsonProperty("air_pressure_at_sea_level")
    private Double airPressureAtSeaLevel;
    @JsonProperty("air_temperature")
    private Double airTemperature;
    @JsonProperty("cloud_area_fraction")
    private Double cloudAreaFraction;
    @JsonProperty("relative_humidity")
    private Double relativeHumidity;
    @JsonProperty("wind_from_direction")
    private Double windFromDirection;
    @JsonProperty("wind_speed")
    private Double windSpeed;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Double getAirPressureAtSeaLevel() {
        return airPressureAtSeaLevel;
    }

    public void setAirPressureAtSeaLevel(Double airPressureAtSeaLevel) {
        this.airPressureAtSeaLevel = airPressureAtSeaLevel;
    }

    public Double getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(Double airTemperature) {
        this.airTemperature = airTemperature;
    }

    public Double getCloudAreaFraction() {
        return cloudAreaFraction;
    }

    public void setCloudAreaFraction(Double cloudAreaFraction) {
        this.cloudAreaFraction = cloudAreaFraction;
    }

    public Double getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(Double relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public Double getWindFromDirection() {
        return windFromDirection;
    }

    public void setWindFromDirection(Double windFromDirection) {
        this.windFromDirection = windFromDirection;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
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
        sb.append(Details.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Details) == false) {
            return false;
        }
        Details rhs = ((Details) other);
        return ((((((((this.airTemperature == rhs.airTemperature)||((this.airTemperature!= null)&&this.airTemperature.equals(rhs.airTemperature)))&&((this.relativeHumidity == rhs.relativeHumidity)||((this.relativeHumidity!= null)&&this.relativeHumidity.equals(rhs.relativeHumidity))))&&((this.windFromDirection == rhs.windFromDirection)||((this.windFromDirection!= null)&&this.windFromDirection.equals(rhs.windFromDirection))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.airPressureAtSeaLevel == rhs.airPressureAtSeaLevel)||((this.airPressureAtSeaLevel!= null)&&this.airPressureAtSeaLevel.equals(rhs.airPressureAtSeaLevel))))&&((this.windSpeed == rhs.windSpeed)||((this.windSpeed!= null)&&this.windSpeed.equals(rhs.windSpeed))))&&((this.cloudAreaFraction == rhs.cloudAreaFraction)||((this.cloudAreaFraction!= null)&&this.cloudAreaFraction.equals(rhs.cloudAreaFraction))));
    }

}
