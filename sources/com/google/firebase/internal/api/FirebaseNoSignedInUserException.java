package com.google.firebase.internal.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseException;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public class FirebaseNoSignedInUserException extends FirebaseException {
    @KeepForSdk
    public FirebaseNoSignedInUserException(String str) {
        super(str);
    }
}
