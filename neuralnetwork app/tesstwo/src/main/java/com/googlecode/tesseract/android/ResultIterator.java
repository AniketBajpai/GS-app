

package com.googlecode.tesseract.android;

import com.googlecode.tesseract.android.TessBaseAPI.PageIteratorLevel;


public class ResultIterator extends PageIterator {
    static {
        System.loadLibrary("lept");
        System.loadLibrary("tess");
    }

    /** Pointer to native result iterator. */
    private final int mNativeResultIterator;

    /* package */ResultIterator(int nativeResultIterator) {
        super(nativeResultIterator);

        mNativeResultIterator = nativeResultIterator;
    }

    /**
     * Returns the text string for the current object at the given level.
     *
     * @param level the page iterator level. See {@link PageIteratorLevel}.
     * @return the text string for the current object at the given level.
     */
    public String getUTF8Text(int level) {
        return nativeGetUTF8Text(mNativeResultIterator, level);
    }

    /**
     * Returns the mean confidence of the current object at the given level. The
     * number should be interpreted as a percent probability (0-100).
     *
     * @param level the page iterator level. See {@link PageIteratorLevel}.
     * @return the mean confidence of the current object at the given level.
     */
    public float confidence(int level) {
        return nativeConfidence(mNativeResultIterator, level);
    }

    private static native String nativeGetUTF8Text(int nativeResultIterator, int level);
    private static native float nativeConfidence(int nativeResultIterator, int level);
}
