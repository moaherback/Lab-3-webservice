
package com.example.weatherapp.met;

import java.util.LinkedHashMap;
import java.util.Map;


// @Generated("jsonschema2pojo")
public class Summary__2 {

    private String symbolCode;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getSymbolCode() {
        return symbolCode;
    }

    public void setSymbolCode(String symbolCode) {
        this.symbolCode = symbolCode;
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
        sb.append(Summary__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("symbolCode");
        sb.append('=');
        sb.append(((this.symbolCode == null)?"<null>":this.symbolCode));
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
        result = ((result* 31)+((this.symbolCode == null)? 0 :this.symbolCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Summary__2) == false) {
            return false;
        }
        Summary__2 rhs = ((Summary__2) other);
        return (((this.symbolCode == rhs.symbolCode)||((this.symbolCode!= null)&&this.symbolCode.equals(rhs.symbolCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
