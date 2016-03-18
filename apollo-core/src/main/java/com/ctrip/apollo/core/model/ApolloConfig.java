package com.ctrip.apollo.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

import java.util.Map;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public class ApolloConfig {

    private long appId;

    private String cluster;

    private String version;

    private Map<String, Object> configurations;

    private long releaseId;

    @JsonCreator
    public ApolloConfig(@JsonProperty("appId") long appId,
                        @JsonProperty("cluster") String cluster,
                        @JsonProperty("version") String version,
                        @JsonProperty("releaseId") long releaseId) {
        super();
        this.appId = appId;
        this.cluster = cluster;
        this.version = version;
        this.releaseId = releaseId;
    }

    public Map<String, Object> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(Map<String, Object> configurations) {
        this.configurations = configurations;
    }

    public long getAppId() {
        return appId;
    }

    public String getCluster() {
        return cluster;
    }

    public String getVersion() {
        return version;
    }

    public long getReleaseId() {
        return releaseId;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .omitNullValues()
                .add("appId", appId)
                .add("cluster", cluster)
                .add("version", version)
                .add("releaseId", releaseId)
                .add("configurations", configurations)
                .toString();
    }
}