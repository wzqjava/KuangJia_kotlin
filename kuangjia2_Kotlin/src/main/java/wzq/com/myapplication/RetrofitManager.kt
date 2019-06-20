package wzq.com.myapplication

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 *<p>作者：wzq<p>
 * <p>创建时间：2019-06-14<p>
 * <p>文件描述：<p>
 *
 */
class RetrofitManager private constructor() {


    /**
     * kotlin的单例模式
     */
    companion object {
        lateinit var retrofit: Retrofit
        lateinit var gson: Gson
        val instance: RetrofitManager by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            gson = GsonBuilder().create()
            retrofit = Retrofit.Builder()
                    .baseUrl(API.GETNETWORK)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(OkhttpManager.instance.mOkHttpCilent)
                    .build()
            RetrofitManager()
        }
    }


    fun <T> getService(glass: Class<T>): T {
        return retrofit.create(glass)
    }


}