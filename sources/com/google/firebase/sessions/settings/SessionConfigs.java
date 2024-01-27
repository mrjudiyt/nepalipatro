package com.google.firebase.sessions.settings;

import kotlin.jvm.internal.m;

/* compiled from: SettingsCache.kt */
public final class SessionConfigs {
    private final Integer cacheDuration;
    private final Long cacheUpdatedTime;
    private final Boolean sessionEnabled;
    private final Integer sessionRestartTimeout;
    private final Double sessionSamplingRate;

    public SessionConfigs(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.sessionEnabled = bool;
        this.sessionSamplingRate = d10;
        this.sessionRestartTimeout = num;
        this.cacheDuration = num2;
        this.cacheUpdatedTime = l10;
    }

    public static /* synthetic */ SessionConfigs copy$default(SessionConfigs sessionConfigs, Boolean bool, Double d10, Integer num, Integer num2, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = sessionConfigs.sessionEnabled;
        }
        if ((i10 & 2) != 0) {
            d10 = sessionConfigs.sessionSamplingRate;
        }
        Double d11 = d10;
        if ((i10 & 4) != 0) {
            num = sessionConfigs.sessionRestartTimeout;
        }
        Integer num3 = num;
        if ((i10 & 8) != 0) {
            num2 = sessionConfigs.cacheDuration;
        }
        Integer num4 = num2;
        if ((i10 & 16) != 0) {
            l10 = sessionConfigs.cacheUpdatedTime;
        }
        return sessionConfigs.copy(bool, d11, num3, num4, l10);
    }

    public final Boolean component1() {
        return this.sessionEnabled;
    }

    public final Double component2() {
        return this.sessionSamplingRate;
    }

    public final Integer component3() {
        return this.sessionRestartTimeout;
    }

    public final Integer component4() {
        return this.cacheDuration;
    }

    public final Long component5() {
        return this.cacheUpdatedTime;
    }

    public final SessionConfigs copy(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        return new SessionConfigs(bool, d10, num, num2, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) obj;
        return m.a(this.sessionEnabled, sessionConfigs.sessionEnabled) && m.a(this.sessionSamplingRate, sessionConfigs.sessionSamplingRate) && m.a(this.sessionRestartTimeout, sessionConfigs.sessionRestartTimeout) && m.a(this.cacheDuration, sessionConfigs.cacheDuration) && m.a(this.cacheUpdatedTime, sessionConfigs.cacheUpdatedTime);
    }

    public final Integer getCacheDuration() {
        return this.cacheDuration;
    }

    public final Long getCacheUpdatedTime() {
        return this.cacheUpdatedTime;
    }

    public final Boolean getSessionEnabled() {
        return this.sessionEnabled;
    }

    public final Integer getSessionRestartTimeout() {
        return this.sessionRestartTimeout;
    }

    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public int hashCode() {
        Boolean bool = this.sessionEnabled;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.sessionSamplingRate;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.sessionRestartTimeout;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDuration;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.cacheUpdatedTime;
        if (l10 != null) {
            i10 = l10.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.sessionEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionRestartTimeout=" + this.sessionRestartTimeout + ", cacheDuration=" + this.cacheDuration + ", cacheUpdatedTime=" + this.cacheUpdatedTime + ')';
    }
}
