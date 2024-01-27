package com.google.firebase.dynamiclinks;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl;

public final class DynamicLink {
    private final Bundle builderParameters;

    public static final class AndroidParameters {
        public static final String KEY_ANDROID_FALLBACK_LINK = "afl";
        public static final String KEY_ANDROID_MIN_VERSION_CODE = "amv";
        public static final String KEY_ANDROID_PACKAGE_NAME = "apn";
        final Bundle parameters;

        private AndroidParameters(Bundle bundle) {
            this.parameters = bundle;
        }

        public static final class Builder {
            private final Bundle parameters;

            public Builder() {
                if (FirebaseApp.getInstance() != null) {
                    Bundle bundle = new Bundle();
                    this.parameters = bundle;
                    bundle.putString(AndroidParameters.KEY_ANDROID_PACKAGE_NAME, FirebaseApp.getInstance().getApplicationContext().getPackageName());
                    return;
                }
                throw new IllegalStateException("FirebaseApp not initialized.");
            }

            public AndroidParameters build() {
                return new AndroidParameters(this.parameters);
            }

            public Uri getFallbackUrl() {
                Uri uri = (Uri) this.parameters.getParcelable(AndroidParameters.KEY_ANDROID_FALLBACK_LINK);
                return uri == null ? Uri.EMPTY : uri;
            }

            public int getMinimumVersion() {
                return this.parameters.getInt(AndroidParameters.KEY_ANDROID_MIN_VERSION_CODE);
            }

            public Builder setFallbackUrl(Uri uri) {
                this.parameters.putParcelable(AndroidParameters.KEY_ANDROID_FALLBACK_LINK, uri);
                return this;
            }

            public Builder setMinimumVersion(int i10) {
                this.parameters.putInt(AndroidParameters.KEY_ANDROID_MIN_VERSION_CODE, i10);
                return this;
            }

            public Builder(String str) {
                Bundle bundle = new Bundle();
                this.parameters = bundle;
                bundle.putString(AndroidParameters.KEY_ANDROID_PACKAGE_NAME, str);
            }
        }
    }

    public static final class GoogleAnalyticsParameters {
        public static final String KEY_UTM_CAMPAIGN = "utm_campaign";
        public static final String KEY_UTM_CONTENT = "utm_content";
        public static final String KEY_UTM_MEDIUM = "utm_medium";
        public static final String KEY_UTM_SOURCE = "utm_source";
        public static final String KEY_UTM_TERM = "utm_term";
        Bundle parameters;

        public static final class Builder {
            private final Bundle parameters;

            public Builder() {
                this.parameters = new Bundle();
            }

            public GoogleAnalyticsParameters build() {
                return new GoogleAnalyticsParameters(this.parameters);
            }

            public String getCampaign() {
                return this.parameters.getString("utm_campaign", "");
            }

            public String getContent() {
                return this.parameters.getString(GoogleAnalyticsParameters.KEY_UTM_CONTENT, "");
            }

            public String getMedium() {
                return this.parameters.getString("utm_medium", "");
            }

            public String getSource() {
                return this.parameters.getString("utm_source", "");
            }

            public String getTerm() {
                return this.parameters.getString(GoogleAnalyticsParameters.KEY_UTM_TERM, "");
            }

            public Builder setCampaign(String str) {
                this.parameters.putString("utm_campaign", str);
                return this;
            }

            public Builder setContent(String str) {
                this.parameters.putString(GoogleAnalyticsParameters.KEY_UTM_CONTENT, str);
                return this;
            }

            public Builder setMedium(String str) {
                this.parameters.putString("utm_medium", str);
                return this;
            }

            public Builder setSource(String str) {
                this.parameters.putString("utm_source", str);
                return this;
            }

            public Builder setTerm(String str) {
                this.parameters.putString(GoogleAnalyticsParameters.KEY_UTM_TERM, str);
                return this;
            }

            public Builder(String str, String str2, String str3) {
                Bundle bundle = new Bundle();
                this.parameters = bundle;
                bundle.putString("utm_source", str);
                bundle.putString("utm_medium", str2);
                bundle.putString("utm_campaign", str3);
            }
        }

        private GoogleAnalyticsParameters(Bundle bundle) {
            this.parameters = bundle;
        }
    }

    public static final class IosParameters {
        public static final String KEY_IOS_APP_STORE_ID = "isi";
        public static final String KEY_IOS_BUNDLE_ID = "ibi";
        public static final String KEY_IOS_CUSTOM_SCHEME = "ius";
        public static final String KEY_IOS_FALLBACK_LINK = "ifl";
        public static final String KEY_IOS_MINIMUM_VERSION = "imv";
        public static final String KEY_IPAD_BUNDLE_ID = "ipbi";
        public static final String KEY_IPAD_FALLBACK_LINK = "ipfl";
        final Bundle parameters;

        public static final class Builder {
            private final Bundle parameters;

            public Builder(String str) {
                Bundle bundle = new Bundle();
                this.parameters = bundle;
                bundle.putString(IosParameters.KEY_IOS_BUNDLE_ID, str);
            }

            public IosParameters build() {
                return new IosParameters(this.parameters);
            }

            public String getAppStoreId() {
                return this.parameters.getString(IosParameters.KEY_IOS_APP_STORE_ID, "");
            }

            public String getCustomScheme() {
                return this.parameters.getString(IosParameters.KEY_IOS_CUSTOM_SCHEME, "");
            }

            public String getIpadBundleId() {
                return this.parameters.getString(IosParameters.KEY_IPAD_BUNDLE_ID, "");
            }

            public Uri getIpadFallbackUrl() {
                Uri uri = (Uri) this.parameters.getParcelable(IosParameters.KEY_IPAD_FALLBACK_LINK);
                return uri == null ? Uri.EMPTY : uri;
            }

            public String getMinimumVersion() {
                return this.parameters.getString(IosParameters.KEY_IOS_MINIMUM_VERSION, "");
            }

            public Builder setAppStoreId(String str) {
                this.parameters.putString(IosParameters.KEY_IOS_APP_STORE_ID, str);
                return this;
            }

            public Builder setCustomScheme(String str) {
                this.parameters.putString(IosParameters.KEY_IOS_CUSTOM_SCHEME, str);
                return this;
            }

            public Builder setFallbackUrl(Uri uri) {
                this.parameters.putParcelable(IosParameters.KEY_IOS_FALLBACK_LINK, uri);
                return this;
            }

            public Builder setIpadBundleId(String str) {
                this.parameters.putString(IosParameters.KEY_IPAD_BUNDLE_ID, str);
                return this;
            }

            public Builder setIpadFallbackUrl(Uri uri) {
                this.parameters.putParcelable(IosParameters.KEY_IPAD_FALLBACK_LINK, uri);
                return this;
            }

            public Builder setMinimumVersion(String str) {
                this.parameters.putString(IosParameters.KEY_IOS_MINIMUM_VERSION, str);
                return this;
            }
        }

        private IosParameters(Bundle bundle) {
            this.parameters = bundle;
        }
    }

    public static final class ItunesConnectAnalyticsParameters {
        public static final String KEY_ITUNES_CONNECT_AT = "at";
        public static final String KEY_ITUNES_CONNECT_CT = "ct";
        public static final String KEY_ITUNES_CONNECT_PT = "pt";
        final Bundle parameters;

        public static final class Builder {
            private final Bundle parameters = new Bundle();

            public ItunesConnectAnalyticsParameters build() {
                return new ItunesConnectAnalyticsParameters(this.parameters);
            }

            public String getAffiliateToken() {
                return this.parameters.getString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_AT, "");
            }

            public String getCampaignToken() {
                return this.parameters.getString("ct", "");
            }

            public String getProviderToken() {
                return this.parameters.getString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, "");
            }

            public Builder setAffiliateToken(String str) {
                this.parameters.putString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_AT, str);
                return this;
            }

            public Builder setCampaignToken(String str) {
                this.parameters.putString("ct", str);
                return this;
            }

            public Builder setProviderToken(String str) {
                this.parameters.putString(ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, str);
                return this;
            }
        }

        private ItunesConnectAnalyticsParameters(Bundle bundle) {
            this.parameters = bundle;
        }
    }

    public static final class NavigationInfoParameters {
        public static final String KEY_FORCED_REDIRECT = "efr";
        final Bundle parameters;

        public static final class Builder {
            private final Bundle parameters = new Bundle();

            public NavigationInfoParameters build() {
                return new NavigationInfoParameters(this.parameters);
            }

            public boolean getForcedRedirectEnabled() {
                return this.parameters.getInt(NavigationInfoParameters.KEY_FORCED_REDIRECT) == 1;
            }

            public Builder setForcedRedirectEnabled(boolean z10) {
                this.parameters.putInt(NavigationInfoParameters.KEY_FORCED_REDIRECT, z10 ? 1 : 0);
                return this;
            }
        }

        private NavigationInfoParameters(Bundle bundle) {
            this.parameters = bundle;
        }
    }

    public static final class SocialMetaTagParameters {
        public static final String KEY_SOCIAL_DESCRIPTION = "sd";
        public static final String KEY_SOCIAL_IMAGE_LINK = "si";
        public static final String KEY_SOCIAL_TITLE = "st";
        final Bundle parameters;

        public static final class Builder {
            private final Bundle parameters = new Bundle();

            public SocialMetaTagParameters build() {
                return new SocialMetaTagParameters(this.parameters);
            }

            public String getDescription() {
                return this.parameters.getString(SocialMetaTagParameters.KEY_SOCIAL_DESCRIPTION, "");
            }

            public Uri getImageUrl() {
                Uri uri = (Uri) this.parameters.getParcelable(SocialMetaTagParameters.KEY_SOCIAL_IMAGE_LINK);
                return uri == null ? Uri.EMPTY : uri;
            }

            public String getTitle() {
                return this.parameters.getString("st", "");
            }

            public Builder setDescription(String str) {
                this.parameters.putString(SocialMetaTagParameters.KEY_SOCIAL_DESCRIPTION, str);
                return this;
            }

            public Builder setImageUrl(Uri uri) {
                this.parameters.putParcelable(SocialMetaTagParameters.KEY_SOCIAL_IMAGE_LINK, uri);
                return this;
            }

            public Builder setTitle(String str) {
                this.parameters.putString("st", str);
                return this;
            }
        }

        private SocialMetaTagParameters(Bundle bundle) {
            this.parameters = bundle;
        }
    }

    DynamicLink(Bundle bundle) {
        this.builderParameters = bundle;
    }

    public Uri getUri() {
        return FirebaseDynamicLinksImpl.createDynamicLink(this.builderParameters);
    }

    public static final class Builder {
        private static final String APP_GOO_GL_PATTERN = "(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$";
        public static final String KEY_API_KEY = "apiKey";
        public static final String KEY_DOMAIN = "domain";
        public static final String KEY_DOMAIN_URI_PREFIX = "domainUriPrefix";
        public static final String KEY_DYNAMIC_LINK = "dynamicLink";
        public static final String KEY_DYNAMIC_LINK_PARAMETERS = "parameters";
        public static final String KEY_LINK = "link";
        public static final String KEY_SUFFIX = "suffix";
        private static final String PAGE_LINK_PATTERN = "(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$";
        private static final String SCHEME_PREFIX = "https://";
        private final Bundle builderParameters;
        private final Bundle fdlParameters;
        private final FirebaseDynamicLinksImpl firebaseDynamicLinksImpl;

        public Builder(FirebaseDynamicLinksImpl firebaseDynamicLinksImpl2) {
            this.firebaseDynamicLinksImpl = firebaseDynamicLinksImpl2;
            Bundle bundle = new Bundle();
            this.builderParameters = bundle;
            bundle.putString(KEY_API_KEY, firebaseDynamicLinksImpl2.getFirebaseApp().getOptions().getApiKey());
            Bundle bundle2 = new Bundle();
            this.fdlParameters = bundle2;
            bundle.putBundle("parameters", bundle2);
        }

        private void verifyApiKey() {
            if (this.builderParameters.getString(KEY_API_KEY) == null) {
                throw new IllegalArgumentException("Missing API key. Set with setApiKey().");
            }
        }

        public DynamicLink buildDynamicLink() {
            FirebaseDynamicLinksImpl.verifyDomainUriPrefix(this.builderParameters);
            return new DynamicLink(this.builderParameters);
        }

        public Task<ShortDynamicLink> buildShortDynamicLink() {
            verifyApiKey();
            return this.firebaseDynamicLinksImpl.createShortDynamicLink(this.builderParameters);
        }

        public String getDomainUriPrefix() {
            return this.builderParameters.getString(KEY_DOMAIN_URI_PREFIX, "");
        }

        public Uri getLink() {
            Uri uri = (Uri) this.fdlParameters.getParcelable("link");
            return uri == null ? Uri.EMPTY : uri;
        }

        public Uri getLongLink() {
            Uri uri = (Uri) this.fdlParameters.getParcelable(KEY_DYNAMIC_LINK);
            return uri == null ? Uri.EMPTY : uri;
        }

        public Builder setAndroidParameters(AndroidParameters androidParameters) {
            this.fdlParameters.putAll(androidParameters.parameters);
            return this;
        }

        public Builder setDomainUriPrefix(String str) {
            if (str.matches(APP_GOO_GL_PATTERN) || str.matches(PAGE_LINK_PATTERN)) {
                this.builderParameters.putString(KEY_DOMAIN, str.replace(SCHEME_PREFIX, ""));
            }
            this.builderParameters.putString(KEY_DOMAIN_URI_PREFIX, str);
            return this;
        }

        @Deprecated
        public Builder setDynamicLinkDomain(String str) {
            if (str.matches(APP_GOO_GL_PATTERN) || str.matches(PAGE_LINK_PATTERN)) {
                this.builderParameters.putString(KEY_DOMAIN, str);
                Bundle bundle = this.builderParameters;
                bundle.putString(KEY_DOMAIN_URI_PREFIX, SCHEME_PREFIX + str);
                return this;
            }
            throw new IllegalArgumentException("Use setDomainUriPrefix() instead, setDynamicLinkDomain() is only applicable for *.page.link and *.app.goo.gl domains.");
        }

        public Builder setGoogleAnalyticsParameters(GoogleAnalyticsParameters googleAnalyticsParameters) {
            this.fdlParameters.putAll(googleAnalyticsParameters.parameters);
            return this;
        }

        public Builder setIosParameters(IosParameters iosParameters) {
            this.fdlParameters.putAll(iosParameters.parameters);
            return this;
        }

        public Builder setItunesConnectAnalyticsParameters(ItunesConnectAnalyticsParameters itunesConnectAnalyticsParameters) {
            this.fdlParameters.putAll(itunesConnectAnalyticsParameters.parameters);
            return this;
        }

        public Builder setLink(Uri uri) {
            this.fdlParameters.putParcelable("link", uri);
            return this;
        }

        public Builder setLongLink(Uri uri) {
            this.builderParameters.putParcelable(KEY_DYNAMIC_LINK, uri);
            return this;
        }

        public Builder setNavigationInfoParameters(NavigationInfoParameters navigationInfoParameters) {
            this.fdlParameters.putAll(navigationInfoParameters.parameters);
            return this;
        }

        public Builder setSocialMetaTagParameters(SocialMetaTagParameters socialMetaTagParameters) {
            this.fdlParameters.putAll(socialMetaTagParameters.parameters);
            return this;
        }

        public Task<ShortDynamicLink> buildShortDynamicLink(int i10) {
            verifyApiKey();
            this.builderParameters.putInt(KEY_SUFFIX, i10);
            return this.firebaseDynamicLinksImpl.createShortDynamicLink(this.builderParameters);
        }
    }
}
