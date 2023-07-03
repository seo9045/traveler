package ddwu.com.mobile.traveler_login

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "59ef5457d73ab10ed5a7d1d62dcf8be7")
    }
}