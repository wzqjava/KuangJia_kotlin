package wzq.com.myapplication

import io.reactivex.Observable
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import wzq.com.myapplication.bean.LoginBean

/**
 *<p>作者：wzq<p>
 * <p>创建时间：2019-06-14<p>
 * <p>文件描述：<p>
 *
 */
interface  MApiService{

    @POST(API.Companion.LOHGIN_URL)
    @FormUrlEncoded
    fun  login(@FieldMap map:HashMap<String ,String>) :Observable<LoginBean>

}