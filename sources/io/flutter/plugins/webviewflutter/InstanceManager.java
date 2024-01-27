package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

public class InstanceManager {
    private static final long CLEAR_FINALIZED_WEAK_REFERENCES_INTERVAL = 3000;
    private static final long MIN_HOST_CREATED_IDENTIFIER = 65536;
    private static final String TAG = "InstanceManager";
    private final FinalizationListener finalizationListener;
    private final Handler handler;
    private boolean hasFinalizationListenerStopped;
    private final WeakHashMap<Object, Long> identifiers = new WeakHashMap<>();
    private long nextIdentifier;
    private final ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
    private final HashMap<Long, Object> strongInstances = new HashMap<>();
    private final HashMap<Long, WeakReference<Object>> weakInstances = new HashMap<>();
    private final HashMap<WeakReference<Object>, Long> weakReferencesToIdentifiers = new HashMap<>();

    public interface FinalizationListener {
        void onFinalize(long j10);
    }

    private InstanceManager(FinalizationListener finalizationListener2) {
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.handler = handler2;
        this.nextIdentifier = MIN_HOST_CREATED_IDENTIFIER;
        this.hasFinalizationListenerStopped = false;
        this.finalizationListener = finalizationListener2;
        handler2.postDelayed(new o2(this), CLEAR_FINALIZED_WEAK_REFERENCES_INTERVAL);
    }

    private void addInstance(Object obj, long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(String.format("Identifier must be >= 0: %d", new Object[]{Long.valueOf(j10)}));
        } else if (!this.weakInstances.containsKey(Long.valueOf(j10))) {
            WeakReference weakReference = new WeakReference(obj, this.referenceQueue);
            this.identifiers.put(obj, Long.valueOf(j10));
            this.weakInstances.put(Long.valueOf(j10), weakReference);
            this.weakReferencesToIdentifiers.put(weakReference, Long.valueOf(j10));
            this.strongInstances.put(Long.valueOf(j10), obj);
        } else {
            throw new IllegalArgumentException(String.format("Identifier has already been added: %d", new Object[]{Long.valueOf(j10)}));
        }
    }

    public static InstanceManager create(FinalizationListener finalizationListener2) {
        return new InstanceManager(finalizationListener2);
    }

    private void logWarningIfFinalizationListenerHasStopped() {
        hasFinalizationListenerStopped();
    }

    /* access modifiers changed from: private */
    public void releaseAllFinalizedInstances() {
        if (!hasFinalizationListenerStopped()) {
            while (true) {
                WeakReference weakReference = (WeakReference) this.referenceQueue.poll();
                if (weakReference != null) {
                    Long remove = this.weakReferencesToIdentifiers.remove(weakReference);
                    if (remove != null) {
                        this.weakInstances.remove(remove);
                        this.strongInstances.remove(remove);
                        this.finalizationListener.onFinalize(remove.longValue());
                    }
                } else {
                    this.handler.postDelayed(new o2(this), CLEAR_FINALIZED_WEAK_REFERENCES_INTERVAL);
                    return;
                }
            }
        }
    }

    public void addDartCreatedInstance(Object obj, long j10) {
        logWarningIfFinalizationListenerHasStopped();
        addInstance(obj, j10);
    }

    public long addHostCreatedInstance(Object obj) {
        logWarningIfFinalizationListenerHasStopped();
        if (!containsInstance(obj)) {
            long j10 = this.nextIdentifier;
            this.nextIdentifier = 1 + j10;
            addInstance(obj, j10);
            return j10;
        }
        throw new IllegalArgumentException("Instance of " + obj.getClass() + " has already been added.");
    }

    public void clear() {
        this.identifiers.clear();
        this.weakInstances.clear();
        this.strongInstances.clear();
        this.weakReferencesToIdentifiers.clear();
    }

    public boolean containsInstance(Object obj) {
        logWarningIfFinalizationListenerHasStopped();
        return this.identifiers.containsKey(obj);
    }

    public Long getIdentifierForStrongReference(Object obj) {
        logWarningIfFinalizationListenerHasStopped();
        Long l10 = this.identifiers.get(obj);
        if (l10 != null) {
            this.strongInstances.put(l10, obj);
        }
        return l10;
    }

    public <T> T getInstance(long j10) {
        logWarningIfFinalizationListenerHasStopped();
        WeakReference weakReference = this.weakInstances.get(Long.valueOf(j10));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean hasFinalizationListenerStopped() {
        return this.hasFinalizationListenerStopped;
    }

    public <T> T remove(long j10) {
        logWarningIfFinalizationListenerHasStopped();
        return this.strongInstances.remove(Long.valueOf(j10));
    }

    public void stopFinalizationListener() {
        this.handler.removeCallbacks(new o2(this));
        this.hasFinalizationListenerStopped = true;
    }
}
