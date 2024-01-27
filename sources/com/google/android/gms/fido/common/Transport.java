package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    CABLE("cable");
    
    public static final Parcelable.Creator<Transport> CREATOR = null;
    private final String zzc;

    /* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
    public static class UnsupportedTransportException extends Exception {
        public UnsupportedTransportException(String str) {
            super(str);
        }
    }

    static {
        CREATOR = new zza();
    }

    private Transport(String str) {
        this.zzc = str;
    }

    public static Transport fromString(String str) {
        for (Transport transport : values()) {
            if (str.equals(transport.zzc)) {
                return transport;
            }
        }
        throw new UnsupportedTransportException(String.format("Transport %s not supported", new Object[]{str}));
    }

    public static List<Transport> parseTransports(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            if (string != null && !string.isEmpty()) {
                try {
                    hashSet.add(fromString(string));
                } catch (UnsupportedTransportException unused) {
                    "Ignoring unrecognized transport ".concat(string);
                }
            }
        }
        return new ArrayList(hashSet);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.zzc;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzc);
    }
}
