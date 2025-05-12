
package com.example.weatherapp.met;

import java.util.LinkedHashMap;
import java.util.Map;


// @Generated("jsonschema2pojo")
public class Data {

    private Instant instant;
    private Next12Hours next12Hours;
    private Next1Hours next1Hours;
    private Next6Hours next6Hours;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public Next12Hours getNext12Hours() {
        return next12Hours;
    }

    public void setNext12Hours(Next12Hours next12Hours) {
        this.next12Hours = next12Hours;
    }

    public Next1Hours getNext1Hours() {
        return next1Hours;
    }

    public void setNext1Hours(Next1Hours next1Hours) {
        this.next1Hours = next1Hours;
    }

    public Next6Hours getNext6Hours() {
        return next6Hours;
    }

    public void setNext6Hours(Next6Hours next6Hours) {
        this.next6Hours = next6Hours;
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
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("instant");
        sb.append('=');
        sb.append(((this.instant == null)?"<null>":this.instant));
        sb.append(',');
        sb.append("next12Hours");
        sb.append('=');
        sb.append(((this.next12Hours == null)?"<null>":this.next12Hours));
        sb.append(',');
        sb.append("next1Hours");
        sb.append('=');
        sb.append(((this.next1Hours == null)?"<null>":this.next1Hours));
        sb.append(',');
        sb.append("next6Hours");
        sb.append('=');
        sb.append(((this.next6Hours == null)?"<null>":this.next6Hours));
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
        result = ((result* 31)+((this.next12Hours == null)? 0 :this.next12Hours.hashCode()));
        result = ((result* 31)+((this.next6Hours == null)? 0 :this.next6Hours.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.instant == null)? 0 :this.instant.hashCode()));
        result = ((result* 31)+((this.next1Hours == null)? 0 :this.next1Hours.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return ((((((this.next12Hours == rhs.next12Hours)||((this.next12Hours!= null)&&this.next12Hours.equals(rhs.next12Hours)))&&((this.next6Hours == rhs.next6Hours)||((this.next6Hours!= null)&&this.next6Hours.equals(rhs.next6Hours))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.instant == rhs.instant)||((this.instant!= null)&&this.instant.equals(rhs.instant))))&&((this.next1Hours == rhs.next1Hours)||((this.next1Hours!= null)&&this.next1Hours.equals(rhs.next1Hours))));
    }

}
