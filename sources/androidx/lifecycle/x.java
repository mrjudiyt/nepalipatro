package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.h;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ReportFragment.kt */
public class x extends Fragment {

    /* renamed from: i  reason: collision with root package name */
    public static final b f3536i = new b((g) null);

    /* renamed from: h  reason: collision with root package name */
    private a f3537h;

    /* compiled from: ReportFragment.kt */
    public interface a {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* compiled from: ReportFragment.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final void a(Activity activity, h.a aVar) {
            m.f(activity, "activity");
            m.f(aVar, "event");
            if (activity instanceof o) {
                ((o) activity).getLifecycle().h(aVar);
            } else if (activity instanceof m) {
                h lifecycle = ((m) activity).getLifecycle();
                if (lifecycle instanceof n) {
                    ((n) lifecycle).h(aVar);
                }
            }
        }

        public final x b(Activity activity) {
            m.f(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            m.d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (x) findFragmentByTag;
        }

        public final void c(Activity activity) {
            m.f(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new x(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* compiled from: ReportFragment.kt */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a((g) null);

        /* compiled from: ReportFragment.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }

            public final void a(Activity activity) {
                m.f(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.a(activity);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            m.f(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            m.f(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            m.f(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            m.f(activity, "activity");
            x.f3536i.a(activity, h.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            m.f(activity, "activity");
            x.f3536i.a(activity, h.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            m.f(activity, "activity");
            x.f3536i.a(activity, h.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            m.f(activity, "activity");
            x.f3536i.a(activity, h.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            m.f(activity, "activity");
            x.f3536i.a(activity, h.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            m.f(activity, "activity");
            x.f3536i.a(activity, h.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            m.f(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            m.f(activity, "activity");
            m.f(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            m.f(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            m.f(activity, "activity");
        }
    }

    private final void a(h.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f3536i;
            Activity activity = getActivity();
            m.e(activity, "activity");
            bVar.a(activity, aVar);
        }
    }

    private final void b(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    private final void c(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private final void d(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    public static final void e(Activity activity) {
        f3536i.c(activity);
    }

    public final void f(a aVar) {
        this.f3537h = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f3537h);
        a(h.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(h.a.ON_DESTROY);
        this.f3537h = null;
    }

    public void onPause() {
        super.onPause();
        a(h.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        c(this.f3537h);
        a(h.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        d(this.f3537h);
        a(h.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(h.a.ON_STOP);
    }
}
