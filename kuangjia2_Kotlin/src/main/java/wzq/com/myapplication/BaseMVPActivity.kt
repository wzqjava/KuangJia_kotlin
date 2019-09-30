package wzq.com.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


/**
 *<p>作者：wzq<p>
 * <p>创建时间：2019-06-14<p>
 * <p>文件描述：<p>
 *
 */

abstract class BaseMVPActivity<View, Presenter : BaseMVPPresenter<View>> : AppCompatActivity() {
    lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        presenter = initPresenter()
        initView()
        initData()
        setListener()
    }

    abstract fun initPresenter(): Presenter //  定义方法的返回值
    abstract fun getLayoutResId(): Int
    abstract fun initView()
    abstract fun initData()
    abstract fun setListener()


    override fun onResume() {
        super.onResume()
        presenter.attach(this as View)
    }


    override fun onDestroy() {
        super.onDestroy()
        presenter.detach()
    }
}






