package com.google.android.gms.fido.u2f.api.messagebased;

import com.google.android.gms.fido.u2f.api.messagebased.RequestType;

@Deprecated
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public enum ResponseType {
    REGISTER("u2f_register_response"),
    SIGN("u2f_sign_response");
    
    private final String zzb;

    private ResponseType(String str) {
        this.zzb = str;
    }

    public static ResponseType getResponseTypeForRequestType(RequestType requestType) {
        if (requestType != null) {
            int ordinal = requestType.ordinal();
            if (ordinal == 0) {
                return REGISTER;
            }
            if (ordinal == 1) {
                return SIGN;
            }
            throw new RequestType.UnsupportedRequestTypeException(requestType.toString());
        }
        throw new RequestType.UnsupportedRequestTypeException((String) null);
    }

    public String toString() {
        return this.zzb;
    }
}
