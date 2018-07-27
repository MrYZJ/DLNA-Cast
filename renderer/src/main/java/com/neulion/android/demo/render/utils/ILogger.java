package com.neulion.android.demo.render.utils;

import android.util.Log;

import com.neulion.android.demo.render.Constants;

/**
 * User: liuwei(wei.liu@neulion.com.com)
 * Date: 2018-07-02
 * Time: 14:19
 */
public interface ILogger
{
    String PREFIX_TAG = "4Droid_";

    void d(String msg);

    void i(String msg);

    void w(String msg);

    void e(String msg);

    class DefaultLoggerImpl implements ILogger
    {
        private final String TAG;
        private final boolean DEBUG;

        public DefaultLoggerImpl(Object object)
        {
            this(object.getClass().getSimpleName() + "@" + Integer.toHexString(object.hashCode()));
        }

        public DefaultLoggerImpl(String tag)
        {
            this(tag, Constants.DEBUG);
        }

        public DefaultLoggerImpl(String tag, boolean log)
        {
            TAG = PREFIX_TAG + tag;
            DEBUG = log;
        }

        @Override
        public void d(String msg)
        {
            if (DEBUG)
            {
                Log.d(TAG, msg);
            }
        }

        @Override
        public void i(String msg)
        {
            if (DEBUG)
            {
                Log.i(TAG, msg);
            }
        }

        @Override
        public void w(String msg)
        {
            if (DEBUG)
            {
                Log.w(TAG, msg);
            }
        }

        @Override
        public void e(String msg)
        {
            if (DEBUG)
            {
                Log.e(TAG, msg);
            }
        }
    }
}