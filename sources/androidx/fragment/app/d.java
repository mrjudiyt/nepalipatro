package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.m;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.t;

/* compiled from: DialogFragment */
public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId = -1;
    private boolean mCancelable = true;
    private boolean mCreatingDialog;
    /* access modifiers changed from: private */
    public Dialog mDialog;
    private boolean mDialogCreated = false;
    private Runnable mDismissRunnable = new a();
    private boolean mDismissed;
    private Handler mHandler;
    private t<m> mObserver = new C0047d();
    private DialogInterface.OnCancelListener mOnCancelListener = new b();
    /* access modifiers changed from: private */
    public DialogInterface.OnDismissListener mOnDismissListener = new c();
    private boolean mShownByMe;
    /* access modifiers changed from: private */
    public boolean mShowsDialog = true;
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mViewDestroyed;

    /* compiled from: DialogFragment */
    class a implements Runnable {
        a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            d.this.mOnDismissListener.onDismiss(d.this.mDialog);
        }
    }

    /* compiled from: DialogFragment */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (d.this.mDialog != null) {
                d dVar = d.this;
                dVar.onCancel(dVar.mDialog);
            }
        }
    }

    /* compiled from: DialogFragment */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (d.this.mDialog != null) {
                d dVar = d.this;
                dVar.onDismiss(dVar.mDialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    /* compiled from: DialogFragment */
    class C0047d implements t<m> {
        C0047d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(m mVar) {
            if (mVar != null && d.this.mShowsDialog) {
                View requireView = d.this.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (d.this.mDialog != null) {
                    if (n.F0(3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DialogFragment ");
                        sb.append(this);
                        sb.append(" setting the content view on ");
                        sb.append(d.this.mDialog);
                    }
                    d.this.mDialog.setContentView(requireView);
                }
            }
        }
    }

    /* compiled from: DialogFragment */
    class e extends g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f3177a;

        e(g gVar) {
            this.f3177a = gVar;
        }

        public View c(int i10) {
            if (this.f3177a.d()) {
                return this.f3177a.c(i10);
            }
            return d.this.onFindViewById(i10);
        }

        public boolean d() {
            return this.f3177a.d() || d.this.onHasView();
        }
    }

    public d() {
    }

    private void dismissInternal(boolean z10, boolean z11) {
        if (!this.mDismissed) {
            this.mDismissed = true;
            this.mShownByMe = false;
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.mDialog.dismiss();
                if (!z11) {
                    if (Looper.myLooper() == this.mHandler.getLooper()) {
                        onDismiss(this.mDialog);
                    } else {
                        this.mHandler.post(this.mDismissRunnable);
                    }
                }
            }
            this.mViewDestroyed = true;
            if (this.mBackStackId >= 0) {
                getParentFragmentManager().W0(this.mBackStackId, 1);
                this.mBackStackId = -1;
                return;
            }
            w m10 = getParentFragmentManager().m();
            m10.l(this);
            if (z10) {
                m10.g();
            } else {
                m10.f();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void prepareDialog(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.mDialog = onCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(onCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
                this.mCreatingDialog = false;
            } catch (Throwable th) {
                this.mCreatingDialog = false;
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public g createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.mObserver);
        if (!this.mShownByMe) {
            this.mDismissed = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (n.F0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
        }
        return new Dialog(requireContext(), getTheme());
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.mObserver);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.mViewDestroyed) {
            if (n.F0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("onDismiss called for DialogFragment ");
                sb.append(this);
            }
            dismissInternal(true, true);
        }
    }

    /* access modifiers changed from: package-private */
    public View onFindViewById(int i10) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.mShowsDialog || this.mCreatingDialog) {
            if (n.F0(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.mShowsDialog) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("mShowsDialog = false: ");
                    sb.append(str);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mCreatingDialog = true: ");
                    sb2.append(str);
                }
            }
            return onGetLayoutInflater;
        }
        prepareDialog(bundle);
        if (n.F0(2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("get layout inflater for DialogFragment ");
            sb3.append(this);
            sb3.append(" from dialog context");
        }
        Dialog dialog = this.mDialog;
        return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
    }

    /* access modifiers changed from: package-private */
    public boolean onHasView() {
        return this.mDialogCreated;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i10 = this.mStyle;
        if (i10 != 0) {
            bundle.putInt(SAVED_STYLE, i10);
        }
        int i11 = this.mTheme;
        if (i11 != 0) {
            bundle.putInt(SAVED_THEME, i11);
        }
        boolean z10 = this.mCancelable;
        if (!z10) {
            bundle.putBoolean(SAVED_CANCELABLE, z10);
        }
        boolean z11 = this.mShowsDialog;
        if (!z11) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z11);
        }
        int i12 = this.mBackStackId;
        if (i12 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i12);
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            m0.a(decorView, this);
            n0.a(decorView, this);
            d1.e.a(decorView, this);
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog != null && bundle != null && (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.mDialog != null && bundle != null && (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z10) {
        this.mCancelable = z10;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    public void setShowsDialog(boolean z10) {
        this.mShowsDialog = z10;
    }

    public void setStyle(int i10, int i11) {
        if (n.F0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(i10);
            sb.append(", ");
            sb.append(i11);
        }
        this.mStyle = i10;
        if (i10 == 2 || i10 == 3) {
            this.mTheme = 16973913;
        }
        if (i11 != 0) {
            this.mTheme = i11;
        }
    }

    public void setupDialog(Dialog dialog, int i10) {
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(n nVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        w m10 = nVar.m();
        m10.d(this, str);
        m10.f();
    }

    public void showNow(n nVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        w m10 = nVar.m();
        m10.d(this, str);
        m10.h();
    }

    public int show(w wVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        wVar.d(this, str);
        this.mViewDestroyed = false;
        int f10 = wVar.f();
        this.mBackStackId = f10;
        return f10;
    }

    public d(int i10) {
        super(i10);
    }
}
