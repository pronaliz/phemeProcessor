
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
    "symbols",
    "user_mentions",
    "hashtags",
    "urls"
})
public class Entities implements Serializable
{

    @JsonProperty("symbols")
    private List<Object> symbols = new ArrayList<Object>();
    @JsonProperty("user_mentions")
    private List<Object> userMentions = new ArrayList<Object>();
    @JsonProperty("hashtags")
    private List<Hashtag> hashtags = new ArrayList<Hashtag>();
    @JsonProperty("urls")
    private List<Url> urls = new ArrayList<Url>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3715971309689945118L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Entities() {
    }

    /**
     * 
     * @param symbols
     * @param urls
     * @param hashtags
     * @param userMentions
     */
    public Entities(List<Object> symbols, List<Object> userMentions, List<Hashtag> hashtags, List<Url> urls) {
        super();
        this.symbols = symbols;
        this.userMentions = userMentions;
        this.hashtags = hashtags;
        this.urls = urls;
    }

    @JsonProperty("symbols")
    public List<Object> getSymbols() {
        return symbols;
    }

    @JsonProperty("symbols")
    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    public Entities withSymbols(List<Object> symbols) {
        this.symbols = symbols;
        return this;
    }

    @JsonProperty("user_mentions")
    public List<Object> getUserMentions() {
        return userMentions;
    }

    @JsonProperty("user_mentions")
    public void setUserMentions(List<Object> userMentions) {
        this.userMentions = userMentions;
    }

    public Entities withUserMentions(List<Object> userMentions) {
        this.userMentions = userMentions;
        return this;
    }

    @JsonProperty("hashtags")
    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    @JsonProperty("hashtags")
    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    public Entities withHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
        return this;
    }

    @JsonProperty("urls")
    public List<Url> getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public Entities withUrls(List<Url> urls) {
        this.urls = urls;
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

    public Entities withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("symbols", symbols).append("userMentions", userMentions).append("hashtags", hashtags).append("urls", urls).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(symbols).append(additionalProperties).append(urls).append(hashtags).append(userMentions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entities) == false) {
            return false;
        }
        Entities rhs = ((Entities) other);
        return new EqualsBuilder().append(symbols, rhs.symbols).append(additionalProperties, rhs.additionalProperties).append(urls, rhs.urls).append(hashtags, rhs.hashtags).append(userMentions, rhs.userMentions).isEquals();
    }

}
