
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
    "follow_request_sent",
    "profile_use_background_image",
    "profile_text_color",
    "default_profile_image",
    "id",
    "profile_background_image_url_https",
    "verified",
    "profile_location",
    "profile_image_url_https",
    "profile_sidebar_fill_color",
    "entities",
    "followers_count",
    "profile_sidebar_border_color",
    "id_str",
    "profile_background_color",
    "listed_count",
    "is_translation_enabled",
    "utc_offset",
    "statuses_count",
    "description",
    "friends_count",
    "location",
    "profile_link_color",
    "profile_image_url",
    "following",
    "geo_enabled",
    "profile_banner_url",
    "profile_background_image_url",
    "name",
    "lang",
    "profile_background_tile",
    "favourites_count",
    "screen_name",
    "notifications",
    "url",
    "created_at",
    "contributors_enabled",
    "time_zone",
    "protected",
    "default_profile",
    "is_translator"
})
public class User implements Serializable
{

    @JsonProperty("follow_request_sent")
    private Boolean followRequestSent;
    @JsonProperty("profile_use_background_image")
    private Boolean profileUseBackgroundImage;
    @JsonProperty("profile_text_color")
    private String profileTextColor;
    @JsonProperty("default_profile_image")
    private Boolean defaultProfileImage;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("profile_background_image_url_https")
    private String profileBackgroundImageUrlHttps;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("profile_location")
    private Object profileLocation;
    @JsonProperty("profile_image_url_https")
    private String profileImageUrlHttps;
    @JsonProperty("profile_sidebar_fill_color")
    private String profileSidebarFillColor;
    @JsonProperty("entities")
    private Entities_ entities;
    @JsonProperty("followers_count")
    private Long followersCount;
    @JsonProperty("profile_sidebar_border_color")
    private String profileSidebarBorderColor;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("profile_background_color")
    private String profileBackgroundColor;
    @JsonProperty("listed_count")
    private Long listedCount;
    @JsonProperty("is_translation_enabled")
    private Boolean isTranslationEnabled;
    @JsonProperty("utc_offset")
    private Long utcOffset;
    @JsonProperty("statuses_count")
    private Long statusesCount;
    @JsonProperty("description")
    private String description;
    @JsonProperty("friends_count")
    private Long friendsCount;
    @JsonProperty("location")
    private String location;
    @JsonProperty("profile_link_color")
    private String profileLinkColor;
    @JsonProperty("profile_image_url")
    private String profileImageUrl;
    @JsonProperty("following")
    private Boolean following;
    @JsonProperty("geo_enabled")
    private Boolean geoEnabled;
    @JsonProperty("profile_banner_url")
    private String profileBannerUrl;
    @JsonProperty("profile_background_image_url")
    private String profileBackgroundImageUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("profile_background_tile")
    private Boolean profileBackgroundTile;
    @JsonProperty("favourites_count")
    private Long favouritesCount;
    @JsonProperty("screen_name")
    private String screenName;
    @JsonProperty("notifications")
    private Boolean notifications;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("contributors_enabled")
    private Boolean contributorsEnabled;
    @JsonProperty("time_zone")
    private String timeZone;
    @JsonProperty("protected")
    private Boolean _protected;
    @JsonProperty("default_profile")
    private Boolean defaultProfile;
    @JsonProperty("is_translator")
    private Boolean isTranslator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3202847025683964224L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

    /**
     * 
     * @param isTranslator
     * @param isTranslationEnabled
     * @param friendsCount
     * @param profileUseBackgroundImage
     * @param profileBackgroundColor
     * @param followRequestSent
     * @param location
     * @param profileBannerUrl
     * @param favouritesCount
     * @param screenName
     * @param timeZone
     * @param profileImageUrl
     * @param profileSidebarBorderColor
     * @param lang
     * @param defaultProfileImage
     * @param id
     * @param following
     * @param profileSidebarFillColor
     * @param createdAt
     * @param profileLocation
     * @param verified
     * @param description
     * @param name
     * @param contributorsEnabled
     * @param profileBackgroundImageUrlHttps
     * @param geoEnabled
     * @param profileImageUrlHttps
     * @param listedCount
     * @param entities
     * @param _protected
     * @param url
     * @param idStr
     * @param profileBackgroundTile
     * @param profileLinkColor
     * @param notifications
     * @param followersCount
     * @param utcOffset
     * @param profileTextColor
     * @param profileBackgroundImageUrl
     * @param statusesCount
     * @param defaultProfile
     */
    public User(Boolean followRequestSent, Boolean profileUseBackgroundImage, String profileTextColor, Boolean defaultProfileImage, Long id, String profileBackgroundImageUrlHttps, Boolean verified, Object profileLocation, String profileImageUrlHttps, String profileSidebarFillColor, Entities_ entities, Long followersCount, String profileSidebarBorderColor, String idStr, String profileBackgroundColor, Long listedCount, Boolean isTranslationEnabled, Long utcOffset, Long statusesCount, String description, Long friendsCount, String location, String profileLinkColor, String profileImageUrl, Boolean following, Boolean geoEnabled, String profileBannerUrl, String profileBackgroundImageUrl, String name, String lang, Boolean profileBackgroundTile, Long favouritesCount, String screenName, Boolean notifications, Object url, String createdAt, Boolean contributorsEnabled, String timeZone, Boolean _protected, Boolean defaultProfile, Boolean isTranslator) {
        super();
        this.followRequestSent = followRequestSent;
        this.profileUseBackgroundImage = profileUseBackgroundImage;
        this.profileTextColor = profileTextColor;
        this.defaultProfileImage = defaultProfileImage;
        this.id = id;
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
        this.verified = verified;
        this.profileLocation = profileLocation;
        this.profileImageUrlHttps = profileImageUrlHttps;
        this.profileSidebarFillColor = profileSidebarFillColor;
        this.entities = entities;
        this.followersCount = followersCount;
        this.profileSidebarBorderColor = profileSidebarBorderColor;
        this.idStr = idStr;
        this.profileBackgroundColor = profileBackgroundColor;
        this.listedCount = listedCount;
        this.isTranslationEnabled = isTranslationEnabled;
        this.utcOffset = utcOffset;
        this.statusesCount = statusesCount;
        this.description = description;
        this.friendsCount = friendsCount;
        this.location = location;
        this.profileLinkColor = profileLinkColor;
        this.profileImageUrl = profileImageUrl;
        this.following = following;
        this.geoEnabled = geoEnabled;
        this.profileBannerUrl = profileBannerUrl;
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
        this.name = name;
        this.lang = lang;
        this.profileBackgroundTile = profileBackgroundTile;
        this.favouritesCount = favouritesCount;
        this.screenName = screenName;
        this.notifications = notifications;
        this.url = url;
        this.createdAt = createdAt;
        this.contributorsEnabled = contributorsEnabled;
        this.timeZone = timeZone;
        this._protected = _protected;
        this.defaultProfile = defaultProfile;
        this.isTranslator = isTranslator;
    }

    @JsonProperty("follow_request_sent")
    public Boolean getFollowRequestSent() {
        return followRequestSent;
    }

    @JsonProperty("follow_request_sent")
    public void setFollowRequestSent(Boolean followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    public User withFollowRequestSent(Boolean followRequestSent) {
        this.followRequestSent = followRequestSent;
        return this;
    }

    @JsonProperty("profile_use_background_image")
    public Boolean getProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    @JsonProperty("profile_use_background_image")
    public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    public User withProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
        return this;
    }

    @JsonProperty("profile_text_color")
    public String getProfileTextColor() {
        return profileTextColor;
    }

    @JsonProperty("profile_text_color")
    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    public User withProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
        return this;
    }

    @JsonProperty("default_profile_image")
    public Boolean getDefaultProfileImage() {
        return defaultProfileImage;
    }

    @JsonProperty("default_profile_image")
    public void setDefaultProfileImage(Boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    public User withDefaultProfileImage(Boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
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

    public User withId(Long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("profile_background_image_url_https")
    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    @JsonProperty("profile_background_image_url_https")
    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    public User withProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
        return this;
    }

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public User withVerified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    @JsonProperty("profile_location")
    public Object getProfileLocation() {
        return profileLocation;
    }

    @JsonProperty("profile_location")
    public void setProfileLocation(Object profileLocation) {
        this.profileLocation = profileLocation;
    }

    public User withProfileLocation(Object profileLocation) {
        this.profileLocation = profileLocation;
        return this;
    }

    @JsonProperty("profile_image_url_https")
    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    @JsonProperty("profile_image_url_https")
    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    public User withProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
        return this;
    }

    @JsonProperty("profile_sidebar_fill_color")
    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    @JsonProperty("profile_sidebar_fill_color")
    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    public User withProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
        return this;
    }

    @JsonProperty("entities")
    public Entities_ getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(Entities_ entities) {
        this.entities = entities;
    }

    public User withEntities(Entities_ entities) {
        this.entities = entities;
        return this;
    }

    @JsonProperty("followers_count")
    public Long getFollowersCount() {
        return followersCount;
    }

    @JsonProperty("followers_count")
    public void setFollowersCount(Long followersCount) {
        this.followersCount = followersCount;
    }

    public User withFollowersCount(Long followersCount) {
        this.followersCount = followersCount;
        return this;
    }

    @JsonProperty("profile_sidebar_border_color")
    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    @JsonProperty("profile_sidebar_border_color")
    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    public User withProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
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

    public User withIdStr(String idStr) {
        this.idStr = idStr;
        return this;
    }

    @JsonProperty("profile_background_color")
    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    @JsonProperty("profile_background_color")
    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    public User withProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
        return this;
    }

    @JsonProperty("listed_count")
    public Long getListedCount() {
        return listedCount;
    }

    @JsonProperty("listed_count")
    public void setListedCount(Long listedCount) {
        this.listedCount = listedCount;
    }

    public User withListedCount(Long listedCount) {
        this.listedCount = listedCount;
        return this;
    }

    @JsonProperty("is_translation_enabled")
    public Boolean getIsTranslationEnabled() {
        return isTranslationEnabled;
    }

    @JsonProperty("is_translation_enabled")
    public void setIsTranslationEnabled(Boolean isTranslationEnabled) {
        this.isTranslationEnabled = isTranslationEnabled;
    }

    public User withIsTranslationEnabled(Boolean isTranslationEnabled) {
        this.isTranslationEnabled = isTranslationEnabled;
        return this;
    }

    @JsonProperty("utc_offset")
    public Long getUtcOffset() {
        return utcOffset;
    }

    @JsonProperty("utc_offset")
    public void setUtcOffset(Long utcOffset) {
        this.utcOffset = utcOffset;
    }

    public User withUtcOffset(Long utcOffset) {
        this.utcOffset = utcOffset;
        return this;
    }

    @JsonProperty("statuses_count")
    public Long getStatusesCount() {
        return statusesCount;
    }

    @JsonProperty("statuses_count")
    public void setStatusesCount(Long statusesCount) {
        this.statusesCount = statusesCount;
    }

    public User withStatusesCount(Long statusesCount) {
        this.statusesCount = statusesCount;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public User withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("friends_count")
    public Long getFriendsCount() {
        return friendsCount;
    }

    @JsonProperty("friends_count")
    public void setFriendsCount(Long friendsCount) {
        this.friendsCount = friendsCount;
    }

    public User withFriendsCount(Long friendsCount) {
        this.friendsCount = friendsCount;
        return this;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public User withLocation(String location) {
        this.location = location;
        return this;
    }

    @JsonProperty("profile_link_color")
    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    @JsonProperty("profile_link_color")
    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    public User withProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
        return this;
    }

    @JsonProperty("profile_image_url")
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    @JsonProperty("profile_image_url")
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public User withProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
        return this;
    }

    @JsonProperty("following")
    public Boolean getFollowing() {
        return following;
    }

    @JsonProperty("following")
    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public User withFollowing(Boolean following) {
        this.following = following;
        return this;
    }

    @JsonProperty("geo_enabled")
    public Boolean getGeoEnabled() {
        return geoEnabled;
    }

    @JsonProperty("geo_enabled")
    public void setGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    public User withGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
        return this;
    }

    @JsonProperty("profile_banner_url")
    public String getProfileBannerUrl() {
        return profileBannerUrl;
    }

    @JsonProperty("profile_banner_url")
    public void setProfileBannerUrl(String profileBannerUrl) {
        this.profileBannerUrl = profileBannerUrl;
    }

    public User withProfileBannerUrl(String profileBannerUrl) {
        this.profileBannerUrl = profileBannerUrl;
        return this;
    }

    @JsonProperty("profile_background_image_url")
    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    @JsonProperty("profile_background_image_url")
    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    public User withProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public User withName(String name) {
        this.name = name;
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

    public User withLang(String lang) {
        this.lang = lang;
        return this;
    }

    @JsonProperty("profile_background_tile")
    public Boolean getProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    @JsonProperty("profile_background_tile")
    public void setProfileBackgroundTile(Boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    public User withProfileBackgroundTile(Boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
        return this;
    }

    @JsonProperty("favourites_count")
    public Long getFavouritesCount() {
        return favouritesCount;
    }

    @JsonProperty("favourites_count")
    public void setFavouritesCount(Long favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public User withFavouritesCount(Long favouritesCount) {
        this.favouritesCount = favouritesCount;
        return this;
    }

    @JsonProperty("screen_name")
    public String getScreenName() {
        return screenName;
    }

    @JsonProperty("screen_name")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public User withScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    @JsonProperty("notifications")
    public Boolean getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(Boolean notifications) {
        this.notifications = notifications;
    }

    public User withNotifications(Boolean notifications) {
        this.notifications = notifications;
        return this;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    public User withUrl(Object url) {
        this.url = url;
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

    public User withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("contributors_enabled")
    public Boolean getContributorsEnabled() {
        return contributorsEnabled;
    }

    @JsonProperty("contributors_enabled")
    public void setContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    public User withContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
        return this;
    }

    @JsonProperty("time_zone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("time_zone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public User withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    @JsonProperty("protected")
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public User withProtected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    @JsonProperty("default_profile")
    public Boolean getDefaultProfile() {
        return defaultProfile;
    }

    @JsonProperty("default_profile")
    public void setDefaultProfile(Boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    public User withDefaultProfile(Boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
        return this;
    }

    @JsonProperty("is_translator")
    public Boolean getIsTranslator() {
        return isTranslator;
    }

    @JsonProperty("is_translator")
    public void setIsTranslator(Boolean isTranslator) {
        this.isTranslator = isTranslator;
    }

    public User withIsTranslator(Boolean isTranslator) {
        this.isTranslator = isTranslator;
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

    public User withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("followRequestSent", followRequestSent).append("profileUseBackgroundImage", profileUseBackgroundImage).append("profileTextColor", profileTextColor).append("defaultProfileImage", defaultProfileImage).append("id", id).append("profileBackgroundImageUrlHttps", profileBackgroundImageUrlHttps).append("verified", verified).append("profileLocation", profileLocation).append("profileImageUrlHttps", profileImageUrlHttps).append("profileSidebarFillColor", profileSidebarFillColor).append("entities", entities).append("followersCount", followersCount).append("profileSidebarBorderColor", profileSidebarBorderColor).append("idStr", idStr).append("profileBackgroundColor", profileBackgroundColor).append("listedCount", listedCount).append("isTranslationEnabled", isTranslationEnabled).append("utcOffset", utcOffset).append("statusesCount", statusesCount).append("description", description).append("friendsCount", friendsCount).append("location", location).append("profileLinkColor", profileLinkColor).append("profileImageUrl", profileImageUrl).append("following", following).append("geoEnabled", geoEnabled).append("profileBannerUrl", profileBannerUrl).append("profileBackgroundImageUrl", profileBackgroundImageUrl).append("name", name).append("lang", lang).append("profileBackgroundTile", profileBackgroundTile).append("favouritesCount", favouritesCount).append("screenName", screenName).append("notifications", notifications).append("url", url).append("createdAt", createdAt).append("contributorsEnabled", contributorsEnabled).append("timeZone", timeZone).append("_protected", _protected).append("defaultProfile", defaultProfile).append("isTranslator", isTranslator).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isTranslator).append(isTranslationEnabled).append(friendsCount).append(profileBackgroundColor).append(profileUseBackgroundImage).append(location).append(followRequestSent).append(profileBannerUrl).append(favouritesCount).append(screenName).append(timeZone).append(profileImageUrl).append(profileSidebarBorderColor).append(lang).append(defaultProfileImage).append(id).append(following).append(profileSidebarFillColor).append(createdAt).append(description).append(profileLocation).append(verified).append(name).append(contributorsEnabled).append(profileBackgroundImageUrlHttps).append(geoEnabled).append(listedCount).append(profileImageUrlHttps).append(entities).append(_protected).append(url).append(idStr).append(profileBackgroundTile).append(profileLinkColor).append(notifications).append(additionalProperties).append(utcOffset).append(followersCount).append(profileTextColor).append(profileBackgroundImageUrl).append(statusesCount).append(defaultProfile).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return new EqualsBuilder().append(isTranslator, rhs.isTranslator).append(isTranslationEnabled, rhs.isTranslationEnabled).append(friendsCount, rhs.friendsCount).append(profileBackgroundColor, rhs.profileBackgroundColor).append(profileUseBackgroundImage, rhs.profileUseBackgroundImage).append(location, rhs.location).append(followRequestSent, rhs.followRequestSent).append(profileBannerUrl, rhs.profileBannerUrl).append(favouritesCount, rhs.favouritesCount).append(screenName, rhs.screenName).append(timeZone, rhs.timeZone).append(profileImageUrl, rhs.profileImageUrl).append(profileSidebarBorderColor, rhs.profileSidebarBorderColor).append(lang, rhs.lang).append(defaultProfileImage, rhs.defaultProfileImage).append(id, rhs.id).append(following, rhs.following).append(profileSidebarFillColor, rhs.profileSidebarFillColor).append(createdAt, rhs.createdAt).append(description, rhs.description).append(profileLocation, rhs.profileLocation).append(verified, rhs.verified).append(name, rhs.name).append(contributorsEnabled, rhs.contributorsEnabled).append(profileBackgroundImageUrlHttps, rhs.profileBackgroundImageUrlHttps).append(geoEnabled, rhs.geoEnabled).append(listedCount, rhs.listedCount).append(profileImageUrlHttps, rhs.profileImageUrlHttps).append(entities, rhs.entities).append(_protected, rhs._protected).append(url, rhs.url).append(idStr, rhs.idStr).append(profileBackgroundTile, rhs.profileBackgroundTile).append(profileLinkColor, rhs.profileLinkColor).append(notifications, rhs.notifications).append(additionalProperties, rhs.additionalProperties).append(utcOffset, rhs.utcOffset).append(followersCount, rhs.followersCount).append(profileTextColor, rhs.profileTextColor).append(profileBackgroundImageUrl, rhs.profileBackgroundImageUrl).append(statusesCount, rhs.statusesCount).append(defaultProfile, rhs.defaultProfile).isEquals();
    }

}
