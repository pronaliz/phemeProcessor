
package tr.edu.yildiz.phemeProcessing.pojos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "indices",
    "text"
})
public class Hashtag implements Serializable
{

    @JsonProperty("indices")
    private List<Long> indices = new ArrayList<Long>();
    @JsonProperty("text")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3430159285847461166L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hashtag() {
    }

    /**
     * 
     * @param text
     * @param indices
     */
    public Hashtag(List<Long> indices, String text) {
        super();
        this.indices = indices;
        this.text = text;
    }

    @JsonProperty("indices")
    public List<Long> getIndices() {
        return indices;
    }

    @JsonProperty("indices")
    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    public Hashtag withIndices(List<Long> indices) {
        this.indices = indices;
        return this;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public Hashtag withText(String text) {
        this.text = text;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Hashtag withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("indices", indices).append("text", text).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(text).append(additionalProperties).append(indices).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hashtag) == false) {
            return false;
        }
        Hashtag rhs = ((Hashtag) other);
        return new EqualsBuilder().append(text, rhs.text).append(additionalProperties, rhs.additionalProperties).append(indices, rhs.indices).isEquals();
    }

}
