package wzq.com.myapplication


import io.reactivex.observers.DisposableObserver
import wzq.com.myapplication.bean.LoginBean

/**
 *<p>作者：wzq<p>
 * <p>创建时间：2019-06-14<p>
 * <p>文件描述：<p>
 *
 */
class LoginPresenter : BaseMVPPresenter<ResponseInterface>() {
     var loginModel: LoginModel

    init {
        loginModel = LoginModel()
    }


    fun login(map: HashMap<String, String>) {
        loginModel.login( map, object : DisposableObserver<LoginBean>() {
            override fun onComplete() {

            }

            override fun onNext(t: LoginBean) {
                view!!.onSuccess(t)
            }

            override fun onError(e: Throwable) {
            }

        })

    }

}