package com.beekerapps.spaceysounds;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by RJ on 4/12/2015.
 * AudioPlayer
 */
public class AudioPlayer {

    private MediaPlayer mPlayer;

    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context c, int rId) {
         stop();
         mPlayer = MediaPlayer.create(c, rId);
         mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
             @Override
             public void onCompletion(MediaPlayer mediaPlayer) {
                 stop();
             }
         });
        mPlayer.start();
    }

    public void pause() {
        if (mPlayer != null) {
            if (mPlayer.isPlaying()) {
                mPlayer.pause();
            }
            else {
                mPlayer.start();
            }
        }
    }
}
