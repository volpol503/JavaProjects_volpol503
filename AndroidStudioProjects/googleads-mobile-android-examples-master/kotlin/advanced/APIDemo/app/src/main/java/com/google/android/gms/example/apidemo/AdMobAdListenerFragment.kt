package com.google.android.gms.example.apidemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import kotlinx.android.synthetic.main.fragment_admob_ad_listener.*

/**
 * The [AdMobAdListenerFragment] demonstrates the use of the [com.google.android.gms.ads.AdListener]
 * class.
 */
class AdMobAdListenerFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.fragment_admob_ad_listener, container, false)
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)

    listener_ad_view.adListener = object : AdListener() {
      private fun showToast(message: String) {
        val context = this@AdMobAdListenerFragment.view?.context
        if (context != null) {
          Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
      }

      override fun onAdLoaded() {
        showToast("Ad loaded.")
      }

      override fun onAdFailedToLoad(errorCode: Int) {
        showToast(String.format("Ad failed to load with error code %d.", errorCode))
      }

      override fun onAdOpened() {
        showToast("Ad opened.")
      }

      override fun onAdClosed() {
        showToast("Ad closed.")
      }

      override fun onAdLeftApplication() {
        showToast("Ad left application.")
      }
    }

    val adRequest = AdRequest.Builder().build()
    listener_ad_view.loadAd(adRequest)
  }
}
