package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
final class zzl implements DynamiteModule.VersionPolicy {
    zzl() {
    }

    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        int i10;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int zza = iVersions.zza(context, str);
        selectionResult.localVersion = zza;
        int i11 = 0;
        if (zza != 0) {
            i10 = iVersions.zzb(context, str, false);
            selectionResult.remoteVersion = i10;
        } else {
            i10 = iVersions.zzb(context, str, true);
            selectionResult.remoteVersion = i10;
        }
        int i12 = selectionResult.localVersion;
        if (i12 != 0) {
            i11 = i12;
        } else if (i10 == 0) {
            selectionResult.selection = 0;
            return selectionResult;
        }
        if (i10 >= i11) {
            selectionResult.selection = 1;
        } else {
            selectionResult.selection = -1;
        }
        return selectionResult;
    }
}
