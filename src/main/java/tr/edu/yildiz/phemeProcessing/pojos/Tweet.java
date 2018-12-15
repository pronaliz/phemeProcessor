
package tr.edu.yildiz.phemeProcessing.pojos;

import java.io.Serializable;
import java.util.HashMap;
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
    "contributors",
    "truncated",
    "text",
    "in_reply_to_status_id",
    "id",
    "favorite_count",
    "source",
    "retweeted",
    "coordinates",
    "entities",
    "in_reply_to_screen_name",
    "id_str",
    "retweet_count",
    "in_reply_to_user_id",
    "favorited",
    "user",
    "geo",
    "in_reply_to_user_id_str",
    "possibly_sensitive",
    "lang",
    "created_at",
    "in_reply_to_status_id_str",
    "place"
})
public class Tweet implements Serializable
{

    @JsonProperty("contributors")
    private Object contributors;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("text")
    private String text;
    @JsonProperty("in_reply_to_status_id")
    private Object inReplyToStatusId;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("favorite_count")
    private Long favoriteCount;
    @JsonProperty("source")
    private String source;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("coordinates")
    private Object coordinates;
    @JsonProperty("entities")
    private Entities entities;
    @JsonProperty("in_reply_to_screen_name")
    private Object inReplyToScreenName;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("retweet_count")
    private Long retweetCount;
    @JsonProperty("in_reply_to_user_id")
    private Object inReplyToUserId;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("user")
    private User user;
    @JsonProperty("geo")
    private Object geo;
    @JsonProperty("in_reply_to_user_id_str")
    private Object inReplyToUserIdStr;
    @JsonProperty("possibly_sensitive")
    private Boolean possiblySensitive;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("in_reply_to_status_id_str")
    private Object inReplyToStatusIdStr;
    @JsonProperty("place")
    private Object place;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3942418562524754126L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tweet() {
    }

    /**
     * 
     * @param contributors
     * @param text
     * @param geo
     * @param inReplyToUserIdStr
     * @param retweeted
     * @param retweetCount
     * @param inReplyToScreenName
     * @param truncated
     * @param lang
     * @param entities
     * @param possiblySensitive
     * @param idStr
     * @param inReplyToStatusId
     * @param id
     * @param favoriteCount
     * @param source
     * @param inReplyToStatusIdStr
     * @param favorited
     * @param createdAt
     * @param inReplyToUserId
     * @param place
     * @param user
     * @param coordinates
     */
    public Tweet(Object contributors, Boolean truncated, String text, Object inReplyToStatusId, Long id, Long favoriteCount, String source, Boolean retweeted, Object coordinates, Entities entities, Object inReplyToScreenName, String idStr, Long retweetCount, Object inReplyToUserId, Boolean favorited, User user, Object geo, Object inReplyToUserIdStr, Boolean possiblySensitive, String lang, String createdAt, Object inReplyToStatusIdStr, Object place) {
        super();
        this.contributors = contributors;
        this.truncated = truncated;
        this.text = text;
        this.inReplyToStatusId = inReplyToStatusId;
        this.id = id;
        this.favoriteCount = favoriteCount;
        this.source = source;
        this.retweeted = retweeted;
        this.coordinates = coordinates;
        this.entities = entities;
        this.inReplyToScreenName = inReplyToScreenName;
        this.idStr = idStr;
        this.retweetCount = retweetCount;
        this.inReplyToUserId = inReplyToUserId;
        this.favorited = favorited;
        this.user = user;
        this.geo = geo;
        this.inReplyToUserIdStr = inReplyToUserIdStr;
        this.possiblySensitive = possiblySensitive;
        this.lang = lang;
        this.createdAt = createdAt;
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
        this.place = place;
    }

    @JsonProperty("contributors")
    public Object getContributors() {
        return contributors;
    }

    @JsonProperty("contributors")
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    public Tweet withContributors(Object contributors) {
        this.contributors = contributors;
        return this;
    }

    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    @JsonProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public Tweet withTruncated(Boolean truncated) {
        this.truncated = truncated;
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

    public Tweet withText(String text) {
        this.text = text;
        return this;
    }

    @JsonProperty("in_reply_to_status_id")
    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    @JsonProperty("in_reply_to_status_id")
    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public Tweet withInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
        return this;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public Tweet withId(Long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("favorite_count")
    public Long getFavoriteCount() {
        return favoriteCount;
    }

    @JsonProperty("favorite_count")
    public void setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Tweet withFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
        return this;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public Tweet withSource(String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("retweeted")
    public Boolean getRetweeted() {
        return retweeted;
    }

    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    public Tweet withRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
        return this;
    }

    @JsonProperty("coordinates")
    public Object getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    public Tweet withCoordinates(Object coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    @JsonProperty("entities")
    public Entities getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public Tweet withEntities(Entities entities) {
        this.entities = entities;
        return this;
    }

    @JsonProperty("in_reply_to_screen_name")
    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    @JsonProperty("in_reply_to_screen_name")
    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public Tweet withInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
        return this;
    }

    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public Tweet withIdStr(String idStr) {
        this.idStr = idStr;
        return this;
    }

    @JsonProperty("retweet_count")
    public Long getRetweetCount() {
        return retweetCount;
    }

    @JsonProperty("retweet_count")
    public void setRetweetCount(Long retweetCount) {
        this.retweetCount = retweetCount;
    }

    public Tweet withRetweetCount(Long retweetCount) {
        this.retweetCount = retweetCount;
        return this;
    }

    @JsonProperty("in_reply_to_user_id")
    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    @JsonProperty("in_reply_to_user_id")
    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public Tweet withInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
        return this;
    }

    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public Tweet withFavorited(Boolean favorited) {
        this.favorited = favorited;
        return this;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    public Tweet withUser(User user) {
        this.user = user;
        return this;
    }

    @JsonProperty("geo")
    public Object getGeo() {
        return geo;
    }

    @JsonProperty("geo")
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public Tweet withGeo(Object geo) {
        this.geo = geo;
        return this;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    public Tweet withInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
        return this;
    }

    @JsonProperty("possibly_sensitive")
    public Boolean getPossiblySensitive() {
        return possiblySensitive;
    }

    @JsonProperty("possibly_sensitive")
    public void setPossiblySensitive(Boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    public Tweet withPossiblySensitive(Boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
        return this;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    public Tweet withLang(String lang) {
        this.lang = lang;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Tweet withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    public Tweet withInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
        return this;
    }

    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    public Tweet withPlace(Object place) {
        this.place = place;
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

    public Tweet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("contributors", contributors).append("truncated", truncated).append("text", text).append("inReplyToStatusId", inReplyToStatusId).append("id", id).append("favoriteCount", favoriteCount).append("source", source).append("retweeted", retweeted).append("coordinates", coordinates).append("entities", entities).append("inReplyToScreenName", inReplyToScreenName).append("idStr", idStr).append("retweetCount", retweetCount).append("inReplyToUserId", inReplyToUserId).append("favorited", favorited).append("user", user).append("geo", geo).append("inReplyToUserIdStr", inReplyToUserIdStr).append("possiblySensitive", possiblySensitive).append("lang", lang).append("createdAt", createdAt).append("inReplyToStatusIdStr", inReplyToStatusIdStr).append("place", place).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(inReplyToUserIdStr).append(retweeted).append(retweetCount).append(truncated).append(lang).append(id).append(inReplyToStatusIdStr).append(createdAt).append(place).append(coordinates).append(text).append(contributors).append(geo).append(inReplyToScreenName).append(entities).append(possiblySensitive).append(idStr).append(inReplyToStatusId).append(source).append(favoriteCount).append(favorited).append(additionalProperties).append(inReplyToUserId).append(user).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tweet) == false) {
            return false;
        }
        Tweet rhs = ((Tweet) other);
        return new EqualsBuilder().append(inReplyToUserIdStr, rhs.inReplyToUserIdStr).append(retweeted, rhs.retweeted).append(retweetCount, rhs.retweetCount).append(truncated, rhs.truncated).append(lang, rhs.lang).append(id, rhs.id).append(inReplyToStatusIdStr, rhs.inReplyToStatusIdStr).append(createdAt, rhs.createdAt).append(place, rhs.place).append(coordinates, rhs.coordinates).append(text, rhs.text).append(contributors, rhs.contributors).append(geo, rhs.geo).append(inReplyToScreenName, rhs.inReplyToScreenName).append(entities, rhs.entities).append(possiblySensitive, rhs.possiblySensitive).append(idStr, rhs.idStr).append(inReplyToStatusId, rhs.inReplyToStatusId).append(source, rhs.source).append(favoriteCount, rhs.favoriteCount).append(favorited, rhs.favorited).append(additionalProperties, rhs.additionalProperties).append(inReplyToUserId, rhs.inReplyToUserId).append(user, rhs.user).isEquals();
    }

}
