

package com.googlecode.tesseract.android;

import com.googlecode.tesseract.android.TessBaseAPI.PageIteratorLevel;

public class PageIterator {
    static {
        System.loadLibrary("lept");
        System.loadLibrary("tess");
    }

    /** Pointer to native page iterator. */
    private final int mNativePageIterator;

    /* package */PageIterator(int nativePageIterator) {
        mNativePageIterator = nativePageIterator;
    }

    /**
     * Resets the iterator to point to the start of the page.
     */
    public void begin() {
        nativeBegin(mNativePageIterator);
    }

   
    public boolean next(int level) {
        return nativeNext(mNativePageIterator, level);
    }

    private static native void nativeBegin(int nativeIterator);
    private static native boolean nativeNext(int nativeIterator, int level);
}
