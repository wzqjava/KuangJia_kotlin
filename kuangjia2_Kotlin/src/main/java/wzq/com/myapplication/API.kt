package wzq.com.myapplication

/**
 *<p>作者：wzq<p>
 * <p>创建时间：2019-06-14<p>
 * <p>文件描述：<p>
 */

class API {


    companion object {
        private val flag = false
        /**
         * 通过flag返回内网/外网测试环境
         */
        val GETNETWORK = netWrok()

        fun netWrok(): String {
            return if (flag) {
                //内网环境
                "http://172.17.8.100"
            } else {
                //外网环境
                "http://mobile.bwstudent.com"
            }
        }


        //注册的接口
        val REGISTER_URL = "movieApi/user/v1/registerUser"
        //登录的接口
       const val LOHGIN_URL = "movieApi/user/v1/login"
        //登录的接口
        val WeiChart = "movieApi/user/v1/weChatBindingLogin"
        //首页的热门电影
        val MOVIEFRAGMENT_REMEN = "movieApi/movie/v1/findHotMovieList"
        //首页的正在上映
        val MOVIEFRAGMENT_ZHENGZAI = "movieApi/movie/v1/findReleaseMovieList"
        //首页的即将上映
        val MOVIEFRAGMENT_JIJIANG = "movieApi/movie/v1/findComingSoonMovieList"
        //影片详情
        val DETAIL_DETAIL = "movieApi/movie/v1/findMoviesDetail"
        //影片详情的评论
        val DETAIL_PINGLUN = "movieApi/movie/v1/findAllMovieComment"
        //根据影片查询影院
        val SELECTTHRATERS_RECYCLERVIEW = "movieApi/movie/v1/findCinemasListByMovieId"

        //根据影片和影院的id查询排期列表
        val PAIQI_RECYCLERVIEW = "movieApi/movie/v1/findMovieScheduleList"
        //取消关注
        val QUXIAOGUANZHU = "movieApi/movie/v1/verify/cancelFollowMovie"
        //关注
        val GUANZHU = "movieApi/movie/v1/verify/followMovie"
        //我的页面的通知
        val REMINDRECYCLERVIEW = "movieApi/tool/v1/verify/findAllSysMsgList"

        //推荐影院
        val RECOMMEND_CINEMA = "movieApi/cinema/v1/findRecommendCinemas"
        //附近影院
        val NEARBY_CINEMA = "movieApi/cinema/v1/findNearbyCinemas"
        //影院详情的影片海报
        val CINEMA_POSTER = "movieApi/movie/v1/findMovieListByCinemaId"
        //影院影片排期
        val CINEMA_SCHEDULE = "movieApi/movie/v1/findMovieScheduleList"
        //影院详情
        val CINEMA_DETAIL = "movieApi/cinema/v1/findCinemaInfo"
        //影院详情介绍弹框
        val CINEMA_DETAIL_DIALOG = "movieApi/cinema/v1/findCinemaInfo"
        //影院评论
        val CINEMA_COMMENT = "movieApi/cinema/v1/findAllCinemaComment"
        //电影购票下单
        val MOVIE_BUY_TICKET = "movieApi/movie/v1/verify/buyMovieTicket"
        //电影购票下单支付
        val MOVIE_BUY_TICKET_PAY = "movieApi/movie/v1/verify/pay"
        //搜索查询
        val SERARCH_URL = "movieApi/cinema/v1/findAllCinemas"
        //关注影院
        val ATTENTION_URL = "movieApi/cinema/v1/verify/followCinema"
        //取消关注影院
        val UNATTENTION_URL = "movieApi/cinema/v1/verify/cancelFollowCinema"
        //zan
        val DETAIL_PINGLUN_ZAN = "movieApi/movie/v1/verify/movieCommentGreat"
        //评论评论
        val DETAIL_PINGLUN_PINGLUN = "movieApi/movie/v1/verify/commentReply"
        //评论影片
        val DETAIL_PINGLUN_YINGPIAN = "movieApi/movie/v1/verify/movieComment"

        //查询购票记录
        val QUERY_TICKET = "movieApi/user/v1/verify/findUserBuyTicketRecordList"

        //查询用户信息
        val USERID_USERBEAN = "movieApi/user/v1/verify/getUserInfoByUserId"
        //上传头像
        val SHANGCHUANTOUXAING = "movieApi/user/v1/verify/uploadHeadPic"
        /**
         * 和信鸽关联
         */
        val XinGe = "movieApi/tool/v1/verify/uploadPushToken"
    }
}