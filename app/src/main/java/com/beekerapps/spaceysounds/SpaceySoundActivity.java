package com.beekerapps.spaceysounds;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/** SpaceySound version 1.0
 *  created by RJ
 *  Very basic implementation of an Android app that allows for a better interface
 *  of just some of the sounds available.  The sounds included in this version are
 *  from http://www.nasa.gov/connect/sounds
 *
 *  I would further like to improve this by allowing users to set their notifications
 *  or Ringtones right from this app
 */


public class SpaceySoundActivity extends ActionBarActivity {

    private static final String TAG = "SpaceySoundActivity";

    private AudioPlayer mPlayer = new AudioPlayer();
    private int mMusicId;
    private String mSubTitle;

    private Button mCassiniSaturnRadio1;
    private Button mCassiniSaturnRadio2;
    private Button mCassiniEnceladus;

    private Button mVoyagerInterstellar;
    private Button mVoyagerJupiterLightning;

    private Button mKeplerSound1;
    private Button mKeplerSound2;

    private Button mApollo8Xmas;
    private Button mApollo11LiftOff;
    private Button mApollo11EagleLanded;
    private Button mApollo11OneSmallStep;
    private Button mApollo13Houston;

    private Button mDiscoveryGoThrottle;
    private Button mDiscoveryGoDeploy;
    private Button mDiscoveryGoodPicture;
    private Button mDiscoveryHoustonDiscovery;
    private Button mDiscoveryHowDoYouRead;
    private Button mDiscoveryLookinAtIt;
    private Button mDiscoveryMECO;
    private Button mNiceToBeInOrbit;
    private Button mOnItsWayToOrbit;
    private Button mDiscoveryRogerRoll;
    private Button mDiscoverySTS26;

    private boolean mIsPlaying;

    void setSub(int i) {
        getSupportActionBar().setSubtitle(i);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spacey_sound);

        mCassiniSaturnRadio1 = (Button) findViewById(R.id.cassini_saturn_radio1);
        mCassiniSaturnRadio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.main_spookysaturn;
                mSubTitle = "Cassini Saturn Radio Emissions 1";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.cassini_saturn1);
                makeToast();
                mIsPlaying = true;
            }
        });

        mCassiniSaturnRadio2 = (Button) findViewById(R.id.cassini_saturn_radio2);
        mCassiniSaturnRadio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.main_saturn_radio_waves;
                mSubTitle = "Cassini Saturn Radio Emissions 2";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.cassini_saturn2);
                makeToast();
                mIsPlaying = true;
            }
        });

        mCassiniEnceladus = (Button) findViewById(R.id.cassini_enceladus);
        mCassiniEnceladus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.main_enceladus;
                mSubTitle = "Cassini Enceladus Sound";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.cassini_enceladus);
                makeToast();
                mIsPlaying = true;
            }
        });

        mVoyagerInterstellar = (Button) findViewById(R.id.voyager_interstellar_plasma);
        mVoyagerInterstellar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.interstellar;
                mSubTitle = "Voyager Interstellar Plasma Sounds";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.voyager_interstellar_plasma);
                makeToast();
                mIsPlaying = true;
            }
        });

        mVoyagerJupiterLightning = (Button) findViewById(R.id.voyager_lightning);
        mVoyagerJupiterLightning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.main_voyager_jupiter_lightning;
                mSubTitle = "Voyager Lightning on Jupiter";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.voyager_lightning);
                makeToast();
                mIsPlaying = true;
            }
        });

        mKeplerSound1 = (Button) findViewById(R.id.kepler_star_kic12268220c);
        mKeplerSound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.main_kepler_star_2;
                mSubTitle = "Kepler light waves as sound (Star KIC12268220C)";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.kepler_star_kic12268220c);
                makeToast();
                mIsPlaying = true;
            }
        });

        mKeplerSound2 = (Button) findViewById(R.id.kepler_star_kic7671081b);
        mKeplerSound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.main_kepler_star_1;
                mSubTitle = "Kepler light waves as sound (Star KIC7671081B)";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.kepler_star_kic7671081b);
                makeToast();
                mIsPlaying = true;
            }
        });


        mApollo8Xmas = (Button) findViewById(R.id.apollo_merry_chrismas);
        mApollo8Xmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.apollo_8_merry_christmas;
                mSubTitle = "Apollo 8 Greeting";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.apollo_merry_chrismas);
                makeToast();
                mIsPlaying = true;
            }
        });

        mApollo11LiftOff = (Button) findViewById(R.id.apollo11_we_have_lift_off);
        mApollo11LiftOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.apollo11_countdown;
                mSubTitle = "Apollo 11: We have liftoff";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.apollo11_we_have_lift_off);
                makeToast();
                mIsPlaying = true;
            }
        });

        mApollo11EagleLanded = (Button) findViewById(R.id.apollo11_eagle_has_landed);
        mApollo11EagleLanded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.apollo11_eagle_has_landed;
                mSubTitle = "Apollo 11: Eagle has landed";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.apollo11_eagle_has_landed);
                makeToast();
                mIsPlaying = true;
            }
        });

        mApollo11OneSmallStep = (Button) findViewById(R.id.apollo11_one_small_step);
        mApollo11OneSmallStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.apollo11_one_small_step;
                mSubTitle = "Apollo 11: One Small Step";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.apollo11_one_small_step);
                makeToast();
                mIsPlaying = true;
            }
        });

        mApollo13Houston = (Button) findViewById(R.id.apollo13_houston_problem);
        mApollo13Houston.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.apollo13_houston_problem;
                mSubTitle = "Apollo 13: Houston, we have a problem";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.apollo13_houston);
                makeToast();
                mIsPlaying = true;
            }
        });

        mDiscoveryGoThrottle = (Button) findViewById(R.id.discovery_go_at_throttle);
        mDiscoveryGoThrottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.discovery_go_at_throttle;
                mSubTitle = "Discovery - Go at throttle up";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.discovery_throttle_up);
                makeToast();
                mIsPlaying = true;
            }
        });

        mDiscoveryGoDeploy = (Button) findViewById(R.id.discovery_go_for_deploy);
        mDiscoveryGoDeploy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.discovery_go_for_deploy;
                mSubTitle = "Discovery - Go for deploy";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.discovery_go_for_deploy);
                makeToast();
                mIsPlaying = true;
            }
        });

        mDiscoveryGoodPicture = (Button) findViewById(R.id.discovery_good_picture_of_steve);
        mDiscoveryGoodPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.discovery_good_picture_of_steve;
                mSubTitle = "Discovery - Good picture of Steve";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.discovery_good_picture);
                makeToast();
                mIsPlaying = true;
            }
        });

        mDiscoveryHoustonDiscovery = (Button) findViewById(R.id.discovery_houston_discovery);
        mDiscoveryHoustonDiscovery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.discovery_houston;
                mSubTitle = "Discovery - Houston Discovery";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.discovery_houston);
                makeToast();
                mIsPlaying = true;
            }
        });

        mDiscoveryHowDoYouRead = (Button) findViewById(R.id.discovery_how_do_you_read);
        mDiscoveryHowDoYouRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.discovery_how_do_you_read;
                mSubTitle = "Discovery - How do you read?";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.discovery_how_do_you_read);
                makeToast();
                mIsPlaying = true;
            }
        });

        mDiscoveryLookinAtIt = (Button) findViewById(R.id.discovery_lookin_at_it);
        mDiscoveryLookinAtIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.discovery_lookin_at_it;
                mSubTitle = "Discovery - Lookin' at it";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.discovery_lookin_at_it);
                makeToast();
                mIsPlaying = true;
            }
        });

        mDiscoveryMECO = (Button) findViewById(R.id.discovery_meco);
        mDiscoveryMECO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.discovery_meco;
                mSubTitle = "Discovery - MECO";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.discovery_meco);
                makeToast();
                mIsPlaying = true;
            }
        });

        mNiceToBeInOrbit = (Button) findViewById(R.id.discovery_nice_to_be_in_orbit);
        mNiceToBeInOrbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.discovery_nice_to_be_in_orbit;
                mSubTitle = "Discovery - Nice to be in orbit";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.discovery_nice_to_be_in_orbit);
                makeToast();
                mIsPlaying = true;
            }
        });

        mOnItsWayToOrbit = (Button) findViewById(R.id.discovery_on_its_way_to_orbit);
        mOnItsWayToOrbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.discovery_on_its_way_to_orbit;
                mSubTitle = "Discovery - On its way to orbit";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.discovery_on_its_way_to_orbit);
                makeToast();
                mIsPlaying = true;
            }
        });

        mDiscoveryRogerRoll = (Button) findViewById(R.id.discovery_roger_roll);
        mDiscoveryRogerRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.discovery_roger_roll;
                mSubTitle = "Discovery - Roger Roll";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.discovery_roger_roll);
                makeToast();
                mIsPlaying = true;
            }
        });

        mDiscoverySTS26 = (Button) findViewById(R.id.discovery_sts26_liftoff);
        mDiscoverySTS26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMusicId = R.raw.discovery_sts26_liftoff;
                mSubTitle = "Discovery - STS-26 Liftoff";
                mPlayer.play(SpaceySoundActivity.this, mMusicId);
                setSub(R.string.discovery_sts26_liftoff);
                makeToast();
                mIsPlaying = true;
            }
        });

    }

    private void makeToast() {
        Toast.makeText(this, mSubTitle + " is playing", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPlayer.stop();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_spacey_sound, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mMusicId != 0) {
            switch (item.getItemId()) {
                case R.id.menu_play:
                    mPlayer.play(SpaceySoundActivity.this, mMusicId);
                    mIsPlaying = true;
                    makeToast();
                    return true;
                case R.id.menu_pause:
                    mPlayer.pause();
                    if (mIsPlaying) {
                        item.setTitle(R.string.spaceysounds_resume);
                        mIsPlaying = false;
                    } else {
                        item.setTitle(R.string.spaceysounds_pause);
                        mIsPlaying = true;
                    }
                    return true;
                case R.id.menu_stop:
                    mPlayer.stop();
                    mIsPlaying = false;
                    return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }

}
