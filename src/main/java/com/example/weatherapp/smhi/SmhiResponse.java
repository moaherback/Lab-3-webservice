
package com.example.weatherapp.smhi;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//@Generated("jsonschema2pojo")
public class SmhiResponse {

    private String approvedTime;
    private String referenceTime;
    private Geometry geometry;
    private List<TimeSeries> timeSeries;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(String approvedTime) {
        this.approvedTime = approvedTime;
    }

    public String getReferenceTime() {
        return referenceTime;
    }

    public void setReferenceTime(String referenceTime) {
        this.referenceTime = referenceTime;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public List<TimeSeries> getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(List<TimeSeries> timeSeries) {
        this.timeSeries = timeSeries;
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
        sb.append(SmhiResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("approvedTime");
        sb.append('=');
        sb.append(((this.approvedTime == null)?"<null>":this.approvedTime));
        sb.append(',');
        sb.append("referenceTime");
        sb.append('=');
        sb.append(((this.referenceTime == null)?"<null>":this.referenceTime));
        sb.append(',');
        sb.append("geometry");
        sb.append('=');
        sb.append(((this.geometry == null)?"<null>":this.geometry));
        sb.append(',');
        sb.append("timeSeries");
        sb.append('=');
        sb.append(((this.timeSeries == null)?"<null>":this.timeSeries));
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
        result = ((result* 31)+((this.approvedTime == null)? 0 :this.approvedTime.hashCode()));
        result = ((result* 31)+((this.timeSeries == null)? 0 :this.timeSeries.hashCode()));
        result = ((result* 31)+((this.geometry == null)? 0 :this.geometry.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.referenceTime == null)? 0 :this.referenceTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SmhiResponse) == false) {
            return false;
        }
        SmhiResponse rhs = ((SmhiResponse) other);
        return ((((((this.approvedTime == rhs.approvedTime)||((this.approvedTime!= null)&&this.approvedTime.equals(rhs.approvedTime)))&&((this.timeSeries == rhs.timeSeries)||((this.timeSeries!= null)&&this.timeSeries.equals(rhs.timeSeries))))&&((this.geometry == rhs.geometry)||((this.geometry!= null)&&this.geometry.equals(rhs.geometry))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.referenceTime == rhs.referenceTime)||((this.referenceTime!= null)&&this.referenceTime.equals(rhs.referenceTime))));
    }

}
