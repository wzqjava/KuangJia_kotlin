package wzq.com.myapplication

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

/**
 *<p>作者：wzq<p>
 * <p>创建时间：2019-06-14<p>
 * <p>文件描述：<p>
 *
 */

class OkhttpManager private constructor() {
    /**
     * 只使用一个实例的，以便重用response cache、thread pool、connection re-use 等
     */
     val mOkHttpCilent: OkHttpClient

    private object Holder {
        val INSTANCE = OkhttpManager()
    }

    companion object {
        //构造单例
        private val sMap = HashMap<String, String>()
        //sMap.put("Content-Type","application/x-www-form-urlencoded");
        val instance: OkhttpManager by lazy { Holder.INSTANCE }
    }

    //由于primary constructor不能包含任何代码，因此使用 init 代码块对其初始化，同时可以在初始化代码块中使用构造函数的参数
    init {
        sMap.put("ak", "0110010010000")
        //application/x-www-form-urlencoded
        sMap.put("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
        mOkHttpCilent = OkHttpClient.Builder()
                .addInterceptor(LoginInterceptor(sMap))
                .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build()
    }
    /**
     * kotlin的单例模式
     */

    /*companion object {
        open lateinit var okHttpClient: OkHttpClient
        private val sMap = HashMap<String, String>()

        val instance: OkhttpManager by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {

            sMap.put("ak", "0110010010000")
            //application/x-www-form-urlencoded
            sMap.put("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
            //sMap.put("Content-Type","application/x-www-form-urlencoded");
            okHttpClient  = OkHttpClient.Builder()
                    .addInterceptor(LoginInterceptor(sMap))
                    .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                    .build()
            OkhttpManager()
        }
    }*/


}