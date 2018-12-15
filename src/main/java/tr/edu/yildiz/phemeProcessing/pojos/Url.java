
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
    "url",
    "indices",
    "expanded_url",
    "display_url"
})
public class Url implements Serializable
{

    @JsonProperty("url")
    private String url;
    @JsonProperty("indices")
    private List<Long> indices = new ArrayList<Long>();
    @JsonProperty("expanded_url")
    private String expandedUrl;
    @JsonProperty("display_url")
    private String displayUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4456999010347502903L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Url() {
    }

    /**
     * 
     * @param displayUrl
     * @param indices
     * @param expandedUrl
     * @param url
     */
    public Url(String url, List<Long> indices, String expandedUrl, String displayUrl) {
        super();
        this.url = url;
        this.indices = indices;
        this.expandedUrl = expandedUrl;
        this.displayUrl = displayUrl;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Url withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("indices")
    public List<Long> getIndices() {
        return indices;
    }

    @JsonProperty("indices")
    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    public Url withIndices(List<Long> indices) {
        this.indices = indices;
        return this;
    }

    @JsonProperty("expanded_url")
    public String getExpandedUrl() {
        return expandedUrl;
    }

    @JsonProperty("expanded_url")
    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    public Url withExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
        return this;
    }

    @JsonProperty("display_url")
    public String getDisplayUrl() {
        return displayUrl;
    }

    @JsonProperty("display_url")
    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public Url withDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
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

    public Url withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("url", url).append("indices", indices).append("expandedUrl", expandedUrl).append("displayUrl", displayUrl).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(displayUrl).append(additionalProperties).append(indices).append(expandedUrl).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Url) == false) {
            return false;
        }
        Url rhs = ((Url) other);
        return new EqualsBuilder().append(displayUrl, rhs.displayUrl).append(additionalProperties, rhs.additionalProperties).append(indices, rhs.indices).append(expandedUrl, rhs.expandedUrl).append(url, rhs.url).isEquals();
    }

}
