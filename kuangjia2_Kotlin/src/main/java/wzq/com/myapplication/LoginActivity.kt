package wzq.com.myapplication

import android.util.Log
import android.widget.Toast
import wzq.com.myapplication.bean.LoginBean

class LoginActivity : BaseMVPActivity<ResponseInterface, LoginPresenter>(), ResponseInterface {

    override fun getLayoutResId(): Int = R.layout.activity_main


    override fun initPresenter(): LoginPresenter {
        return LoginPresenter()
    }

    override fun initView() {
    }

    override fun initData() {
        var map = hashMapOf<String, String>("phone" to "13412345678", "pwd" to "123456")
        presenter.login(map)

    }

    override fun setListener() {
    }

    override fun onSuccess(loginBean: LoginBean) {
        Toast.makeText(this,loginBean.toString(),Toast.LENGTH_LONG).show()
        Log.e("wzq", loginBean.toString())
    }

    override fun onFail() {
    }

    override fun onErro() {
    }

}
