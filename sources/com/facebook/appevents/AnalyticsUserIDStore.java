package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AppEventUtility;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: AnalyticsUserIDStore.kt */
public final class AnalyticsUserIDStore {
    private static final String ANALYTICS_USER_ID_KEY = "com.facebook.appevents.AnalyticsUserIDStore.userID";
    public static final AnalyticsUserIDStore INSTANCE = new AnalyticsUserIDStore();
    private static final String TAG = AnalyticsUserIDStore.class.getSimpleName();
    private static volatile boolean initialized;
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private static String userID;

    private AnalyticsUserIDStore() {
    }

    public static final String getUserID() {
        if (!initialized) {
            INSTANCE.initAndWait();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = lock;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = userID;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th) {
            lock.readLock().unlock();
            throw th;
        }
    }

    private final void initAndWait() {
        if (!initialized) {
            ReentrantReadWriteLock reentrantReadWriteLock = lock;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (initialized) {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                userID = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).getString(ANALYTICS_USER_ID_KEY, (String) null);
                initialized = true;
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                lock.writeLock().unlock();
                throw th;
            }
        }
    }

    public static final void initStore() {
        if (!initialized) {
            InternalAppEventsLogger.Companion.getAnalyticsExecutor().execute(b.f5946h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initStore$lambda-0  reason: not valid java name */
    public static final void m23initStore$lambda0() {
        INSTANCE.initAndWait();
    }

    public static final void setUserID(String str) {
        AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
        AppEventUtility.assertIsNotMainThread();
        if (!initialized) {
            INSTANCE.initAndWait();
        }
        InternalAppEventsLogger.Companion.getAnalyticsExecutor().execute(new a(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: setUserID$lambda-1  reason: not valid java name */
    public static final void m24setUserID$lambda1(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = lock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            userID = str;
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
            edit.putString(ANALYTICS_USER_ID_KEY, userID);
            edit.apply();
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            lock.writeLock().unlock();
            throw th;
        }
    }
}
