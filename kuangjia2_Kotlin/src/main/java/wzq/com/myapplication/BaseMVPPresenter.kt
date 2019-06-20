package wzq.com.myapplication

/**
 *<p>作者：wzq<p>
 * <p>创建时间：2019-06-14<p>
 * <p>文件描述：<p>
 *
 */
open class BaseMVPPresenter<V> {

    var view: V? = null

     fun attach(v: V) {
        this.view = v

    }

    fun detach() {
        if (view != null) {
            view = null
        }
    }


}