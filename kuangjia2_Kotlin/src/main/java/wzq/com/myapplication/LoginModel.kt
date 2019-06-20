package wzq.com.myapplication

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import wzq.com.myapplication.bean.LoginBean
import java.util.*

/**
 *<p>作者：wzq<p>
 * <p>创建时间：2019-06-18<p>
 * <p>文件描述：<p>
 *
 */

class LoginModel{

    fun login(map:HashMap<String,String> ,observer: DisposableObserver<LoginBean>){

        RetrofitManager.instance
                .getService(MApiService::class.java)    //  反射获取类型
                        .login(map)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(observer)

    }



}