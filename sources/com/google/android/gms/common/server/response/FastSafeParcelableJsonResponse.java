package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    public final int describeContents() {
        return 0;
    }

    @KeepForSdk
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field next : getFieldMappings().values()) {
            if (isFieldSet(next)) {
                if (!fastJsonResponse.isFieldSet(next) || !Objects.equal(getFieldValue(next), fastJsonResponse.getFieldValue(next))) {
                    return false;
                }
            } else if (fastJsonResponse.isFieldSet(next)) {
                return false;
            }
        }
        return true;
    }

    @VisibleForTesting
    public Object getValueObject(String str) {
        return null;
    }

    @KeepForSdk
    public int hashCode() {
        int i10 = 0;
        for (FastJsonResponse.Field next : getFieldMappings().values()) {
            if (isFieldSet(next)) {
                i10 = (i10 * 31) + Preconditions.checkNotNull(getFieldValue(next)).hashCode();
            }
        }
        return i10;
    }

    @VisibleForTesting
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }

    @KeepForSdk
    public byte[] toByteArray() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
