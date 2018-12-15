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
        "responsetype-vs-source",
        "certainty",
        "evidentiality"
})
public class ReplyAnnotation implements Serializable {

    private final static long serialVersionUID = 3870105215280666259L;
    @JsonProperty("event")
    private String event;
    @JsonProperty("threadid")
    private String threadid;
    @JsonProperty("tweetid")
    private String tweetid;
    @JsonProperty("responsetype-vs-source")
    private String responsetypeVsSource;
    @JsonProperty("certainty")
    private String certainty;
    @JsonProperty("evidentiality")
    private String evidentiality;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public ReplyAnnotation() {
    }

    /**
     * @param evidentiality
     * @param certainty
     * @param responsetypeVsSource
     * @param event
     * @param tweetid
     * @param threadid
     */
    public ReplyAnnotation(String event, String threadid, String tweetid, String responsetypeVsSource, String certainty, String evidentiality) {
        super();
        this.event = event;
        this.threadid = threadid;
        this.tweetid = tweetid;
        this.responsetypeVsSource = responsetypeVsSource;
        this.certainty = certainty;
        this.evidentiality = evidentiality;
    }

    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    public ReplyAnnotation withEvent(String event) {
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

    public ReplyAnnotation withThreadid(String threadid) {
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

    public ReplyAnnotation withTweetid(String tweetid) {
        this.tweetid = tweetid;
        return this;
    }

    @JsonProperty("responsetype-vs-source")
    public String getResponsetypeVsSource() {
        return responsetypeVsSource;
    }

    @JsonProperty("responsetype-vs-source")
    public void setResponsetypeVsSource(String responsetypeVsSource) {
        this.responsetypeVsSource = responsetypeVsSource;
    }

    public ReplyAnnotation withResponsetypeVsSource(String responsetypeVsSource) {
        this.responsetypeVsSource = responsetypeVsSource;
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

    public ReplyAnnotation withCertainty(String certainty) {
        this.certainty = certainty;
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

    public ReplyAnnotation withEvidentiality(String evidentiality) {
        this.evidentiality = evidentiality;
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

    public ReplyAnnotation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("event", event).append("threadid", threadid).append("tweetid", tweetid).append("responsetypeVsSource", responsetypeVsSource).append("certainty", certainty).append("evidentiality", evidentiality).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(evidentiality).append(certainty).append(responsetypeVsSource).append(additionalProperties).append(event).append(tweetid).append(threadid).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReplyAnnotation) == false) {
            return false;
        }
        ReplyAnnotation rhs = ((ReplyAnnotation) other);
        return new EqualsBuilder().append(evidentiality, rhs.evidentiality).append(certainty, rhs.certainty).append(responsetypeVsSource, rhs.responsetypeVsSource).append(additionalProperties, rhs.additionalProperties).append(event, rhs.event).append(tweetid, rhs.tweetid).append(threadid, rhs.threadid).isEquals();
    }

}