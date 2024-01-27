package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.savedstate.a;
import d1.d;
import kotlin.jvm.internal.m;

/* compiled from: LegacySavedStateHandleController.kt */
public final class LegacySavedStateHandleController {

    /* renamed from: a  reason: collision with root package name */
    public static final LegacySavedStateHandleController f3409a = new LegacySavedStateHandleController();

    /* compiled from: LegacySavedStateHandleController.kt */
    public static final class a implements a.C0077a {
        public void a(d dVar) {
            m.f(dVar, "owner");
            if (dVar instanceof l0) {
                k0 viewModelStore = ((l0) dVar).getViewModelStore();
                androidx.savedstate.a savedStateRegistry = dVar.getSavedStateRegistry();
                for (String b10 : viewModelStore.c()) {
                    g0 b11 = viewModelStore.b(b10);
                    m.c(b11);
                    LegacySavedStateHandleController.a(b11, savedStateRegistry, dVar.getLifecycle());
                }
                if (!viewModelStore.c().isEmpty()) {
                    savedStateRegistry.i(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(g0 g0Var, androidx.savedstate.a aVar, h hVar) {
        m.f(g0Var, "viewModel");
        m.f(aVar, "registry");
        m.f(hVar, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) g0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.i()) {
            savedStateHandleController.g(aVar, hVar);
            f3409a.c(aVar, hVar);
        }
    }

    public static final SavedStateHandleController b(androidx.savedstate.a aVar, h hVar, String str, Bundle bundle) {
        m.f(aVar, "registry");
        m.f(hVar, "lifecycle");
        m.c(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, z.f3539f.a(aVar.b(str), bundle));
        savedStateHandleController.g(aVar, hVar);
        f3409a.c(aVar, hVar);
        return savedStateHandleController;
    }

    private final void c(androidx.savedstate.a aVar, h hVar) {
        h.b b10 = hVar.b();
        if (b10 == h.b.INITIALIZED || b10.d(h.b.STARTED)) {
            aVar.i(a.class);
        } else {
            hVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(hVar, aVar));
        }
    }
}
