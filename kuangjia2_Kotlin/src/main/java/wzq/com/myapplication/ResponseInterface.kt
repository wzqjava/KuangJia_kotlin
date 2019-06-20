package wzq.com.myapplication

import wzq.com.myapplication.bean.LoginBean

/**
 *<p>作者：wzq<p>
 * <p>创建时间：2019-06-14<p>
 * <p>文件描述：<p>
 *
 */

interface ResponseInterface {

    fun onSuccess(loginBean: LoginBean);
    fun onFail();
    fun onErro();

}