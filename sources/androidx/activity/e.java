package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OnBackPressedCallback */
public abstract class e {
    private CopyOnWriteArrayList<a> mCancellables = new CopyOnWriteArrayList<>();
    private boolean mEnabled;

    public e(boolean z10) {
        this.mEnabled = z10;
    }

    /* access modifiers changed from: package-private */
    public void addCancellable(a aVar) {
        this.mCancellables.add(aVar);
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.mEnabled;
    }

    public final void remove() {
        Iterator<a> it = this.mCancellables.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void removeCancellable(a aVar) {
        this.mCancellables.remove(aVar);
    }

    public final void setEnabled(boolean z10) {
        this.mEnabled = z10;
    }
}
