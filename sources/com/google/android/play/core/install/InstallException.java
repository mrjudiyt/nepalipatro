package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import i6.a;
import java.util.Locale;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
public class InstallException extends ApiException {
    public InstallException(int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Install Error(%d): %s", new Object[]{Integer.valueOf(i10), a.a(i10)})));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
