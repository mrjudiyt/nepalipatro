package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;

@SuppressLint({"NewApi"})
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
public final class FragmentWrapper extends IFragmentWrapper.Stub {
    private final Fragment zza;

    private FragmentWrapper(Fragment fragment) {
        this.zza = fragment;
    }

    @KeepForSdk
    public static FragmentWrapper wrap(Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    public final boolean zzA() {
        return this.zza.isVisible();
    }

    public final int zzb() {
        return this.zza.getId();
    }

    public final int zzc() {
        return this.zza.getTargetRequestCode();
    }

    public final Bundle zzd() {
        return this.zza.getArguments();
    }

    public final IFragmentWrapper zze() {
        return wrap(this.zza.getParentFragment());
    }

    public final IFragmentWrapper zzf() {
        return wrap(this.zza.getTargetFragment());
    }

    public final IObjectWrapper zzg() {
        return ObjectWrapper.wrap(this.zza.getActivity());
    }

    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza.getResources());
    }

    public final IObjectWrapper zzi() {
        return ObjectWrapper.wrap(this.zza.getView());
    }

    public final String zzj() {
        return this.zza.getTag();
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        Fragment fragment = this.zza;
        Preconditions.checkNotNull(view);
        fragment.registerForContextMenu(view);
    }

    public final void zzl(boolean z10) {
        this.zza.setHasOptionsMenu(z10);
    }

    public final void zzm(boolean z10) {
        this.zza.setMenuVisibility(z10);
    }

    public final void zzn(boolean z10) {
        this.zza.setRetainInstance(z10);
    }

    public final void zzo(boolean z10) {
        this.zza.setUserVisibleHint(z10);
    }

    public final void zzp(Intent intent) {
        this.zza.startActivity(intent);
    }

    public final void zzq(Intent intent, int i10) {
        this.zza.startActivityForResult(intent, i10);
    }

    public final void zzr(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        Fragment fragment = this.zza;
        Preconditions.checkNotNull(view);
        fragment.unregisterForContextMenu(view);
    }

    public final boolean zzs() {
        return this.zza.getRetainInstance();
    }

    public final boolean zzt() {
        return this.zza.getUserVisibleHint();
    }

    public final boolean zzu() {
        return this.zza.isAdded();
    }

    public final boolean zzv() {
        return this.zza.isDetached();
    }

    public final boolean zzw() {
        return this.zza.isHidden();
    }

    public final boolean zzx() {
        return this.zza.isInLayout();
    }

    public final boolean zzy() {
        return this.zza.isRemoving();
    }

    public final boolean zzz() {
        return this.zza.isResumed();
    }
}
