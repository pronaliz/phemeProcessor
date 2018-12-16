package tr.edu.yildiz.phemeProcessing.pojos;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "event",
        "threadid",
        "tweetid",
        "support",
        "evidentiality",
        "certainty"
})
public class Annotations  implements Serializable
{

    @JsonProperty("event")
    private String event;
    @JsonProperty("threadid")
    private String threadid;
    @JsonProperty("tweetid")
    private String tweetid;
    @JsonProperty("support")
    private String support;
    @JsonProperty("evidentiality")
    private String evidentiality;
    @JsonProperty("certainty")
    private String certainty;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1946548778095666557L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Annotations() {
    }

    /**
     *
     * @param support
     * @param certainty
     * @param evidentiality
     * @param event
     * @param tweetid
     * @param threadid
     */
    public Annotations(String event, String threadid, String tweetid, String support, String evidentiality, String certainty) {
        super();
        this.event = event;
        this.threadid = threadid;
        this.tweetid = tweetid;
        this.support = support;
        this.evidentiality = evidentiality;
        this.certainty = certainty;
    }

    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    public Annotations withEvent(String event) {
        this.event = event;
        return this;
    }

    @JsonProperty("threadid")
    public String getThreadid() {
        return threadid;
    }

    @JsonProperty("threadid")
    public void setThreadid(String threadid) {
        this.threadid = threadid;
    }

    public Annotations withThreadid(String threadid) {
        this.threadid = threadid;
        return this;
    }

    @JsonProperty("tweetid")
    public String getTweetid() {
        return tweetid;
    }

    @JsonProperty("tweetid")
    public void setTweetid(String tweetid) {
        this.tweetid = tweetid;
    }

    public Annotations withTweetid(String tweetid) {
        this.tweetid = tweetid;
        return this;
    }

    @JsonProperty("support")
    public String getSupport() {
        return support;
    }

    @JsonProperty("support")
    public void setSupport(String support) {
        this.support = support;
    }

    public Annotations withSupport(String support) {
        this.support = support;
        return this;
    }

    @JsonProperty("evidentiality")
    public String getEvidentiality() {
        return evidentiality;
    }

    @JsonProperty("evidentiality")
    public void setEvidentiality(String evidentiality) {
        this.evidentiality = evidentiality;
    }

    public Annotations withEvidentiality(String evidentiality) {
        this.evidentiality = evidentiality;
        return this;
    }

    @JsonProperty("certainty")
    public String getCertainty() {
        return certainty;
    }

    @JsonProperty("certainty")
    public void setCertainty(String certainty) {
        this.certainty = certainty;
    }

    public Annotations withCertainty(String certainty) {
        this.certainty = certainty;
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

    public Annotations withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("event", event).append("threadid", threadid).append("tweetid", tweetid).append("support", support).append("evidentiality", evidentiality).append("certainty", certainty).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(support).append(certainty).append(evidentiality).append(additionalProperties).append(event).append(tweetid).append(threadid).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Annotations) == false) {
            return false;
        }
        Annotations rhs = ((Annotations) other);
        return new EqualsBuilder().append(support, rhs.support).append(certainty, rhs.certainty).append(evidentiality, rhs.evidentiality).append(additionalProperties, rhs.additionalProperties).append(event, rhs.event).append(tweetid, rhs.tweetid).append(threadid, rhs.threadid).isEquals();
    }

}