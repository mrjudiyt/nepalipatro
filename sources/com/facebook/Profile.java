package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessToken;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Profile.kt */
public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new Profile$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private static final String FIRST_NAME_KEY = "first_name";
    private static final String ID_KEY = "id";
    private static final String LAST_NAME_KEY = "last_name";
    private static final String LINK_URI_KEY = "link_uri";
    private static final String MIDDLE_NAME_KEY = "middle_name";
    private static final String NAME_KEY = "name";
    private static final String PICTURE_URI_KEY = "picture_uri";
    /* access modifiers changed from: private */
    public static final String TAG = Profile.class.getSimpleName();
    private final String firstName;
    private final String id;
    private final String lastName;
    private final Uri linkUri;
    private final String middleName;
    private final String name;
    private final Uri pictureUri;

    /* compiled from: Profile.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void fetchProfileForCurrentAccessToken() {
            AccessToken.Companion companion = AccessToken.Companion;
            AccessToken currentAccessToken = companion.getCurrentAccessToken();
            if (currentAccessToken != null) {
                if (!companion.isCurrentAccessTokenActive()) {
                    setCurrentProfile((Profile) null);
                    return;
                }
                Utility utility = Utility.INSTANCE;
                Utility.getGraphMeRequestWithCacheAsync(currentAccessToken.getToken(), new Profile$Companion$fetchProfileForCurrentAccessToken$1());
            }
        }

        public final Profile getCurrentProfile() {
            return ProfileManager.Companion.getInstance().getCurrentProfile();
        }

        public final void setCurrentProfile(Profile profile) {
            ProfileManager.Companion.getInstance().setCurrentProfile(profile);
        }
    }

    public /* synthetic */ Profile(Parcel parcel, g gVar) {
        this(parcel);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        this(str, str2, str3, str4, str5, uri, (Uri) null, 64, (g) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, int i10, g gVar) {
        this(str, str2, str3, str4, str5, uri, (i10 & 64) != 0 ? null : uri2);
    }

    public static final void fetchProfileForCurrentAccessToken() {
        Companion.fetchProfileForCurrentAccessToken();
    }

    public static final Profile getCurrentProfile() {
        return Companion.getCurrentProfile();
    }

    public static final void setCurrentProfile(Profile profile) {
        Companion.setCurrentProfile(profile);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str5 = this.id;
        if (((str5 != null || ((Profile) obj).id != null) && !m.a(str5, ((Profile) obj).id)) || ((((str = this.firstName) != null || ((Profile) obj).firstName != null) && !m.a(str, ((Profile) obj).firstName)) || ((((str2 = this.middleName) != null || ((Profile) obj).middleName != null) && !m.a(str2, ((Profile) obj).middleName)) || ((((str3 = this.lastName) != null || ((Profile) obj).lastName != null) && !m.a(str3, ((Profile) obj).lastName)) || ((((str4 = this.name) != null || ((Profile) obj).name != null) && !m.a(str4, ((Profile) obj).name)) || ((((uri = this.linkUri) != null || ((Profile) obj).linkUri != null) && !m.a(uri, ((Profile) obj).linkUri)) || (((uri2 = this.pictureUri) != null || ((Profile) obj).pictureUri != null) && !m.a(uri2, ((Profile) obj).pictureUri)))))))) {
            return false;
        }
        return true;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final Uri getLinkUri() {
        return this.linkUri;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getName() {
        return this.name;
    }

    public final Uri getPictureUri() {
        return this.pictureUri;
    }

    public final Uri getProfilePictureUri(int i10, int i11) {
        String str;
        Uri uri = this.pictureUri;
        if (uri != null) {
            return uri;
        }
        AccessToken.Companion companion = AccessToken.Companion;
        if (companion.isCurrentAccessTokenActive()) {
            AccessToken currentAccessToken = companion.getCurrentAccessToken();
            str = currentAccessToken == null ? null : currentAccessToken.getToken();
        } else {
            str = "";
        }
        return ImageRequest.Companion.getProfilePictureUri(this.id, i10, i11, str);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.firstName;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.middleName;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.lastName;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.name;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.linkUri;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.pictureUri;
        return uri2 != null ? (hashCode * 31) + uri2.hashCode() : hashCode;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put(FIRST_NAME_KEY, this.firstName);
            jSONObject.put("middle_name", this.middleName);
            jSONObject.put(LAST_NAME_KEY, this.lastName);
            jSONObject.put("name", this.name);
            Uri uri = this.linkUri;
            if (uri != null) {
                jSONObject.put(LINK_URI_KEY, uri.toString());
            }
            Uri uri2 = this.pictureUri;
            if (uri2 != null) {
                jSONObject.put(PICTURE_URI_KEY, uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.f(parcel, "dest");
        parcel.writeString(this.id);
        parcel.writeString(this.firstName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.name);
        Uri uri = this.linkUri;
        String str = null;
        parcel.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.pictureUri;
        if (uri2 != null) {
            str = uri2.toString();
        }
        parcel.writeString(str);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        Validate validate = Validate.INSTANCE;
        Validate.notNullOrEmpty(str, "id");
        this.id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.name = str5;
        this.linkUri = uri;
        this.pictureUri = uri2;
    }

    public Profile(JSONObject jSONObject) {
        Uri uri;
        m.f(jSONObject, "jsonObject");
        Uri uri2 = null;
        this.id = jSONObject.optString("id", (String) null);
        this.firstName = jSONObject.optString(FIRST_NAME_KEY, (String) null);
        this.middleName = jSONObject.optString("middle_name", (String) null);
        this.lastName = jSONObject.optString(LAST_NAME_KEY, (String) null);
        this.name = jSONObject.optString("name", (String) null);
        String optString = jSONObject.optString(LINK_URI_KEY, (String) null);
        if (optString == null) {
            uri = null;
        } else {
            uri = Uri.parse(optString);
        }
        this.linkUri = uri;
        String optString2 = jSONObject.optString(PICTURE_URI_KEY, (String) null);
        this.pictureUri = optString2 != null ? Uri.parse(optString2) : uri2;
    }

    private Profile(Parcel parcel) {
        Uri uri;
        this.id = parcel.readString();
        this.firstName = parcel.readString();
        this.middleName = parcel.readString();
        this.lastName = parcel.readString();
        this.name = parcel.readString();
        String readString = parcel.readString();
        Uri uri2 = null;
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.linkUri = uri;
        String readString2 = parcel.readString();
        this.pictureUri = readString2 != null ? Uri.parse(readString2) : uri2;
    }
}
