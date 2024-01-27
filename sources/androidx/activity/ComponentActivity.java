package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.e;
import androidx.core.app.g;
import androidx.core.app.i;
import androidx.core.app.q;
import androidx.core.view.j;
import androidx.core.view.l;
import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import androidx.lifecycle.h;
import androidx.lifecycle.h0;
import androidx.lifecycle.k;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m;
import androidx.lifecycle.m0;
import androidx.lifecycle.n;
import androidx.lifecycle.n0;
import androidx.lifecycle.x;
import e.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentActivity extends g implements l0, androidx.lifecycle.g, d1.d, f, androidx.activity.result.d {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final d.a mContextAwareHelper;
    private h0.b mDefaultFactory;
    private final n mLifecycleRegistry;
    private final j mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<androidx.core.util.a<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a<i>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a<q>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a<Integer>> mOnTrimMemoryListeners;
    final d1.c mSavedStateRegistryController;
    private k0 mViewModelStore;

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    class b extends ActivityResultRegistry {

        class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f498h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ a.C0127a f499i;

            a(int i10, a.C0127a aVar) {
                this.f498h = i10;
                this.f499i = aVar;
            }

            public void run() {
                b.this.c(this.f498h, this.f499i.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        class C0008b implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f501h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f502i;

            C0008b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f501h = i10;
                this.f502i = sendIntentException;
            }

            public void run() {
                b.this.b(this.f501h, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f502i));
            }
        }

        b() {
        }

        public <I, O> void f(int i10, e.a<I, O> aVar, I i11, androidx.core.app.c cVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0127a<O> synchronousResult = aVar.getSynchronousResult(componentActivity, i11);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, synchronousResult));
                return;
            }
            Intent createIntent = aVar.createIntent(componentActivity, i11);
            Bundle bundle = null;
            if (createIntent.getExtras() != null && createIntent.getExtras().getClassLoader() == null) {
                createIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (createIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = createIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                createIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else if (cVar != null) {
                bundle = cVar.b();
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(createIntent.getAction())) {
                String[] stringArrayExtra = createIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.w(componentActivity, stringArrayExtra, i10);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(createIntent.getAction())) {
                e eVar = (e) createIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.b.B(componentActivity, eVar.e(), i10, eVar.b(), eVar.c(), eVar.d(), 0, bundle2);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new C0008b(i10, e10));
                }
            } else {
                androidx.core.app.b.A(componentActivity, createIntent, i10, bundle2);
            }
        }
    }

    static class c {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    static final class d {

        /* renamed from: a  reason: collision with root package name */
        Object f504a;

        /* renamed from: b  reason: collision with root package name */
        k0 f505b;

        d() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new d.a();
        this.mMenuHostHelper = new j(new d(this));
        this.mLifecycleRegistry = new n(this);
        d1.c a10 = d1.c.a(this);
        this.mSavedStateRegistryController = a10;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 19) {
                getLifecycle().a(new k() {
                    public void onStateChanged(m mVar, h.a aVar) {
                        if (aVar == h.a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                c.a(peekDecorView);
                            }
                        }
                    }
                });
            }
            getLifecycle().a(new k() {
                public void onStateChanged(m mVar, h.a aVar) {
                    if (aVar == h.a.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                    }
                }
            });
            getLifecycle().a(new k() {
                public void onStateChanged(m mVar, h.a aVar) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().c(this);
                }
            });
            a10.c();
            a0.c(this);
            if (19 <= i10 && i10 <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new b(this));
            addOnContextAvailableListener(new c(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void initViewTreeOwners() {
        m0.a(getWindow().getDecorView(), this);
        n0.a(getWindow().getDecorView(), this);
        d1.e.a(getWindow().getDecorView(), this);
        h.a(getWindow().getDecorView(), this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.h(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Context context) {
        Bundle b10 = getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (b10 != null) {
            this.mActivityResultRegistry.g(b10);
        }
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(l lVar) {
        this.mMenuHostHelper.c(lVar);
    }

    public final void addOnConfigurationChangedListener(androidx.core.util.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(d.b bVar) {
        this.mContextAwareHelper.a(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(androidx.core.util.a<i> aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(androidx.core.util.a<Intent> aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(androidx.core.util.a<q> aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(androidx.core.util.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.mViewModelStore = dVar.f505b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new k0();
            }
        }
    }

    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public p0.a getDefaultViewModelCreationExtras() {
        p0.d dVar = new p0.d();
        if (getApplication() != null) {
            dVar.c(h0.a.f3495h, getApplication());
        }
        dVar.c(a0.f3448a, this);
        dVar.c(a0.f3449b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            dVar.c(a0.f3450c, getIntent().getExtras());
        }
        return dVar;
    }

    public h0.b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new d0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.f504a;
        }
        return null;
    }

    public h getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public k0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.mActivityResultRegistry.b(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.c();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<androidx.core.util.a<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.d(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        x.e(this);
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.mMenuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mMenuHostHelper.j(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z10) {
        Iterator<androidx.core.util.a<i>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new i(z10));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<androidx.core.util.a<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i10, Menu menu) {
        this.mMenuHostHelper.i(menu);
        super.onPanelClosed(i10, menu);
    }

    public void onPictureInPictureModeChanged(boolean z10) {
        Iterator<androidx.core.util.a<q>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new q(z10));
        }
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.mMenuHostHelper.k(menu);
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        k0 k0Var = this.mViewModelStore;
        if (k0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            k0Var = dVar.f505b;
        }
        if (k0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f504a = onRetainCustomNonConfigurationInstance;
        dVar2.f505b = k0Var;
        return dVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        h lifecycle = getLifecycle();
        if (lifecycle instanceof n) {
            ((n) lifecycle).n(h.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
    }

    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<androidx.core.util.a<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(e.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b<O> bVar) {
        return activityResultRegistry.i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    public void removeMenuProvider(l lVar) {
        this.mMenuHostHelper.l(lVar);
    }

    public final void removeOnConfigurationChangedListener(androidx.core.util.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(d.b bVar) {
        this.mContextAwareHelper.e(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(androidx.core.util.a<i> aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(androidx.core.util.a<Intent> aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(androidx.core.util.a<q> aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(androidx.core.util.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    public void reportFullyDrawn() {
        try {
            if (h1.a.h()) {
                h1.a.c("reportFullyDrawn() for ComponentActivity");
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 > 19) {
                super.reportFullyDrawn();
            } else if (i10 == 19 && androidx.core.content.a.a(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
        } finally {
            h1.a.f();
        }
    }

    public void setContentView(int i10) {
        initViewTreeOwners();
        super.setContentView(i10);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    public void addMenuProvider(l lVar, m mVar) {
        this.mMenuHostHelper.d(lVar, mVar);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(l lVar, m mVar, h.b bVar) {
        this.mMenuHostHelper.e(lVar, mVar, bVar);
    }

    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        Iterator<androidx.core.util.a<i>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new i(z10, configuration));
        }
    }

    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        Iterator<androidx.core.util.a<q>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new q(z10, configuration));
        }
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(e.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i10) {
        this();
        this.mContentLayoutId = i10;
    }
}
