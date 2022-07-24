package com.mygdx.game;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class AndroidLauncher extends AndroidApplication implements AdsListener, RewardedVideoAdListener {
	InterstitialAd interstitialAd;
	RewardedVideoAd rewardedVideoAd;
	private LibGDXR_Game15 game;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		game = new LibGDXR_Game15();
		game.setListener(this);
		initialize(game, config);
		MobileAds.initialize(this,"ca-app-pub-6842706804183779/2273138146");
		interstitialAd = new InterstitialAd(this);
		interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/8691691433");
		AdRequest adRequest = new AdRequest.Builder().build();
		interstitialAd.loadAd(adRequest);
		rewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
		rewardedVideoAd.setRewardedVideoAdListener(this);
		rewardedVideoAd.loadAd("ca-app-pub-3940256099942544/5224354917", adRequest);

	}
	public void showAds(){
		try {
			runOnUiThread(new Runnable() {
				public void run() {
					if(interstitialAd.isLoaded()){
						interstitialAd.show();
					}else {
						AdRequest adRequest = new AdRequest.Builder().build();
						interstitialAd.loadAd(adRequest);
					}
				}
			});
		}catch (Exception e){
		}
	}

	@Override
	public void showRewardedAds() {
		try {
			runOnUiThread(new Runnable() {
				public void run() {
					if (rewardedVideoAd.isLoaded()) {
						rewardedVideoAd.show();
					} else {
						AdRequest adRequest = new AdRequest.Builder().build();
						rewardedVideoAd.loadAd("ca-app-pub-3940256099942544/5224354917", adRequest);
					}
				}
			});
		}catch (Exception e){
		}
	}

	@Override
	public void onRewardedVideoAdLoaded() {

	}

	@Override
	public void onRewardedVideoAdOpened() {

	}

	@Override
	public void onRewardedVideoStarted() {

	}

	@Override
	public void onRewardedVideoAdClosed() {
		AdRequest adRequest = new AdRequest.Builder().build();
		rewardedVideoAd.loadAd("ca-app-pub-3940256099942544/5224354917", adRequest);

	}

	@Override
	public void onRewarded(RewardItem rewardItem) {
		game.reward(rewardItem.getAmount());
	}

	@Override
	public void onRewardedVideoAdLeftApplication() {

	}

	@Override
	public void onRewardedVideoAdFailedToLoad(int i) {

	}

	@Override
	public void onRewardedVideoCompleted() {

	}
}
