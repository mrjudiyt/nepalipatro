package androidx.media2.session;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.util.c;
import j1.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class SessionCommand implements b {

    /* renamed from: d  reason: collision with root package name */
    static final SparseArray<List<Integer>> f3827d;

    /* renamed from: e  reason: collision with root package name */
    static final SparseArray<List<Integer>> f3828e;

    /* renamed from: f  reason: collision with root package name */
    static final SparseArray<List<Integer>> f3829f;

    /* renamed from: g  reason: collision with root package name */
    static final SparseArray<List<Integer>> f3830g;

    /* renamed from: h  reason: collision with root package name */
    static final SparseArray<List<Integer>> f3831h;

    /* renamed from: a  reason: collision with root package name */
    int f3832a;

    /* renamed from: b  reason: collision with root package name */
    String f3833b;

    /* renamed from: c  reason: collision with root package name */
    Bundle f3834c;

    static {
        SparseArray<List<Integer>> sparseArray = new SparseArray<>();
        f3827d = sparseArray;
        SparseArray<List<Integer>> sparseArray2 = new SparseArray<>();
        f3828e = sparseArray2;
        sparseArray.put(1, Arrays.asList(new Integer[]{10000, 10001, 10002, 10003, 10004, 11000, 11001, 11002}));
        sparseArray2.put(1, Arrays.asList(new Integer[]{10005, 10006, 10007, 10008, 10009, 10010, 10011, 10012, 10013, 10014, 10015, 10016, 10017, 10018}));
        sparseArray2.put(2, Collections.singletonList(10019));
        SparseArray<List<Integer>> sparseArray3 = new SparseArray<>();
        f3829f = sparseArray3;
        sparseArray3.put(1, Arrays.asList(new Integer[]{30000, 30001}));
        SparseArray<List<Integer>> sparseArray4 = new SparseArray<>();
        f3830g = sparseArray4;
        sparseArray4.put(1, Arrays.asList(new Integer[]{40000, 40001, 40002, 40003, 40010}));
        sparseArray4.put(2, Collections.singletonList(40011));
        SparseArray<List<Integer>> sparseArray5 = new SparseArray<>();
        f3831h = sparseArray5;
        sparseArray5.put(1, Arrays.asList(new Integer[]{50000, 50001, 50002, 50003, 50004, 50005, 50006}));
    }

    SessionCommand() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionCommand)) {
            return false;
        }
        SessionCommand sessionCommand = (SessionCommand) obj;
        if (this.f3832a != sessionCommand.f3832a || !TextUtils.equals(this.f3833b, sessionCommand.f3833b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return c.b(this.f3833b, Integer.valueOf(this.f3832a));
    }
}
