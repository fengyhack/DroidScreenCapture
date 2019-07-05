package cn.fengyh.capturescreen;

import android.app.Application;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;


public class MyApplication extends Application
{

    public Intent getResultIntent() 
	{
        return mResultIntent;
    }

    public void setResultIntent(Intent mResultIntent)
	{
        this.mResultIntent = mResultIntent;
    }

    public int getResultCode() 
	{
        return mResultCode;
    }

    public void setResultCode(int mResultCode) 
	{
        this.mResultCode = mResultCode;
    }

    private Intent mResultIntent = null;
    private int mResultCode = 0;

    public MediaProjectionManager getMpmngr() 
	{
        return mMediaProjectionMgr;
    }

    public void setMpmngr(MediaProjectionManager mMediaProjectionMgr) 
	{
        this.mMediaProjectionMgr = mMediaProjectionMgr;
    }

    private MediaProjectionManager mMediaProjectionMgr;


    @Override
    public void onCreate()
    {
        super.onCreate();
    }
}
