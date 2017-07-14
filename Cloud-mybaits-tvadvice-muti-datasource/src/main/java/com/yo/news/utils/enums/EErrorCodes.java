/**
 * 
 */
package com.yo.news.utils.enums;

/**
 * 错误信息枚举类
 * 
 * @author 张庆健 JAN Email:mingrui-521@163.com
 * @CreatedTime：2015年1月8日 下午1:46:40 说明：
 */
public class EErrorCodes {

	// Restful 标准HTTP Code
		/**
		 * HTTP Status 204 (无内容) 服务器成功处理了请求，但没有返回任何内容。
		 */
		public final static int HTTP204 = 204;
		/**
		 * HTTP Status 400 （错误请求） 服务器不理解请求的语法。
		 */
		public final static int HTTP400 = 400;
		/**
		 * 请求要求身份验证。 对于需要登录的网页，服务器可能返回此响应。 HTTP Status 403 （禁止）
		 */
		public final static int HTTP403 = 403;
		/**
		 * 代码详细及说明: HTTP Status 500 （服务器内部错误）
		 */
		public final static int HTTP500 = 500;
	// 新闻片相关错误 -2001至-3000
	/**
	 * 警告：新闻片添加重复
	 */
	public final static int DUPLICATE_SCRIPTID_WARNING = -2001;
	public final static int ADD_DOWNLOAD_TASK_ERROR = -2002;
	public final static int KEY_WORD_EMPTY_ERROR = -2003;
	/**
	 * 新闻片审核意见为空
	 */
	public final static int SCRIPT_ADVICE_IS_EMPTY_ERROR = -2004;
	/**
	 * 新闻片删除后，从消息列表获取该新闻片时返回该错误
	 */
	public final static int SCRIPT_NOT_EXIST_ERROR = -2005;
	
	// 素材相关错误 -3001至-3500
	/**
	 * 包含了敏感词汇
	 */
	public final static int INCLUDE_SENTITIVE_WORD_ERROR = -3001;
	/**
	 * 无效素材Id
	 */
	public final static int INVALID_CLIP_ID = -3002;
	/**
	 * 无效素材收藏Id
	 */
	public final static int INVALID_CLIP_COLLECTION_ID = -3003;
	/**
	 * 无效快编素材Id
	 */
	public final static int INVALID_QUICK_EDIT_CLIP_ID = -3004;
	
	
	// 快编相关错误 -3501至-4000
	/**
	 * 无效的快编主键（uniqueId无效）
	 */
	public final static int INVALID_QUICK_EDIT_PRIMARY_KEY = -3501;
	
	
	
	

	// 用户相关错误 -4001至-5000
	/**
	 * 用户输入的密码不正确
	 */
	public final static int INVALID_USER_LOGIN_PWD = -4000;
	/**
	 * 手机未注册
	 */
	public final static int TEL_NO_REGISTATION = -4001;
	/**
	 * 通过微信CODE实现微信授权失败
	 */
	public final static int WX_AUTHORIZED_BY_CODE_FAILED = -4002;
	/**
	 * 用户名称重复
	 */
	public final static int USER_NAME_EXIST = -4003;
	/**
	 * 用户nms直播未授权
	 */
	public final static int USER_NOT_AUTHORIZED_IN_NMS = -4004;
	/**
	 * 用户机构过期
	 */
	public final static int INST_EXPIRED = -4005;

	

	
	// 机构相关错误 -6001至-7000
	public final static int EMPTY_ID = -6001;
	public final static int EMPTY_CONTENT = -6002;
	public final static int DATABASE_OPERATION_ERROR = -6003;
	/**
	 * 重复申请认证
	 */
	public final static int REPEAT_REQUEST_VERIFY_WARNING = -6004;
	/**
	 * 无效机构logoKey;
	 */
	public final static int INVALID_INSTITUTION_LOGO_KEY_ERROR = -6005;
	/**
	 * 用户申请机构认证时，输入机构代码错误
	 */
	public final static int INSTITUTION_CODE_ERROR = -6006;
	/**
	 * 直播服务地址为空，该错误在用户获取直播认证信息时使用。
	 */
	public final static int LIVE_URL_EMPTY_ERROR = -6007;
	/**
	 * 用户真实姓名为空，可能原因为用户未申请机构认证，该错误在用户获取直播认证信息时使用。
	 */
	public final static int TRUE_NAME_SPELL_EMPTY_ERROR = -6008;
	/**
	 * 无效的客户端背景图片backgroundImgKey;
	 */
	public final static int INVALID_INSTITUTION_BACKGROUND_IMAGE_KEY_ERROR = -6009;
	/**
	 * 修改密码时输入的旧密码错误
	 */
	public final static int INSTITUTION_OLD_PASSWORD_ERROR = -6010;
	/**
	 * 重复的机构角色名称错误，用在添加角色时添加已有的角色名称
	 */
	public final static int DUPLICATED_INSTITUTION_ROLE_NAME_ERROR = -6011;
	/**
	 * 机构角色正在使用错误，当删除用户角色时，待删除的角色正在被用户使用时返回该错误
	 */
	public final static int INSTITUTION_USER_ROLE_IN_USEING_ERROR = -6012;
	/**
	 * 功能已经被使用错误，当删除爆新闻功能时，待删除的功能已经被机构使用返回该错误，禁止删除
	 */
	public final static int INSTITUTION_IN_USEING_FUNC_ERROR = -6013;
	/**
	 * 新增机构标签时，添加重复标签返回该错误
	 */
	public final static int INSTITUTION_TAG_NAME_EXIST_ERROR = -6014;
	/**
	 * 机构认证用户数达到上限
	 */
	public final static int INSTITUTION_REACH_AUTH_LIMIT_ERROR = -6015;
	/**
	 * 机构授权直播用户数达到上限
	 */
	public final static int LIVE_REACH_AUTH_LIMIT_ERROR = -6016;
	/**
	 * 机构直播授权信息为空
	 */
	public final static int NO_LIVE_AUTH_CONFIG = -6017;
	/**
	 * 阿里直播台标logo的aliKey错误
	 */
	public final static int INVALID_ALI_LIVE_TV_LOGO_KEY_ERROR = -6018;
	/**
	 * 机构下没有直播调度配置错误
	 */
	public final static int NO_LIVE_DISPATCH_CONFIG_ERROR = -6019;
	/**
	 * 获取阿里直播分发地址时，锐马（Realmagic）编解码器ip+port地址没有设置
	 */
	public final static int RM_IP_PORT_ADDRESS_EMPTY_ERROR = -6020;
	/**
	 * 锐马解码器输出通道状态为空
	 */
	public final static int RM_OUTPUT_CHANNEL_STATUS_IS_NULL_ERROR = -6021;
	/**
	 * 锐马编解码器没有有效的输出通道错误
	 */
	public final static int RM_ACTIVE_CHANNEL_IS_NULL_ERROR = -6022;
	/**
	 * 更新锐马解码器中的输出通道失败
	 */
	public final static int RM_OUTPUT_CHANNEL_MODIFY_ERROR = -6023;
	/**
	 * 锐马编解码器输出设置各通道为空
	 */
	public final static int RM_OUTPUT_CHANNEL_EMPTY_ERROR = -6024;
	/**
	 * 将直播绑定到锐马编解码器中失败（即设置直播分发地址失败）
	 */
	public final static int RM_BAND_RTMP_LIVE_ERROR = -6025;
	/**
	 * 获取锐马解码器中的输出通道失败（可能是连接异常）
	 */
	public final static int GET_LIVE_OUTPUT_CHANNEL_FROM_RM_ERROR = -6026;
	/**
	 * 锐马编解码器频道编码更新错误
	 */
	public final static int RM_CHANNEL_ENCODE_MODIFY_ERROR = -6027;
	
	
	// 下载相关错误 -7001至-8000
	public final static int LOGIN_ID_OR_PASSWORD_EMPTY = -7001;
	public final static int INVALID_POSITION = -7002;
	public final static int INST_CODE_EMPTY = -7003;
	public final static int ZOOKEEPER_ADDRESS_EMPTY = -7004;
	public final static int DOWNLOADER_LOGIN_ERROR = -7005;
	public final static int ZOOKEEPER_CLIENT_NOT_INIT = -7006;
	public final static int REDO_DOWNLOAD_ERROR = -7007;
	public final static int REDO_DOWNLOAD_CANNOT_FIND_INSTCODE = -7008;
	public final static int ADD_TO_RABBITMQ_FAIL = -7009;
	// 后台管理相关错误 -8001至-9000
	public final static int ALI_API_ERROR = -8001;
	/**
	 * 获取OSS Token失败
	 */
	public final static int FAILED_TO_GET_OSS_TOKEN = -400;
	/**
	 * 加入到带密码活动时的验证密码错误
	 */
	public final static int INVALID_PWD_TO_PRIVATE_EVENT = -300;

	/**
	 * 通过从微信服务器上获取到的资源的serverId;拼装微信资源的全路径出错
	 */
	public final static int FAILED_TO_GET_WX_CLIP_URL_BY_SERVERID = -203;
	/**
	 * getJSAuthorityParam接口用到，通过微信公众号获取acces_token时出错
	 */
	public final static int FAILED_TO_GET_WX_ACCESSTOKEN = -202;
	/**
	 * 从微信上下载图片后上载到OSS上失败
	 */
	public final static int UPLOAD_CLIP_FROM_WX_TO_OSS_FAILED = -201;
	/**
	 * 从通过openId和token从微信官方服务器中获取unionId失败
	 */
	public final static int WX_FAILED_GET_UNIONID_FROM_WX_SERVER = -200;

	/**
	 * 输入的电话号码与获取验证码时用的电话号码不一样
	 */
	public final static int INVALID_VERCODE_TEL = -111;
	/**
	 * 无亿无线的服务返回的错误
	 */
	public final static int GET_VERIFICATION_CODE_WUYI_SERVER_ERROR = -110;
	/**
	 * 该手机号获取验证码的次数已超过当天最大限制
	 */
	public final static int GET_VERIFICATION_CODE_EXCEED_MAX_ERROR = -109;
	/**
	 * 恶意的手机验证码攻击 该手机号获取验证码的次数已超过当天最大限制
	 */
	public final static int SPITE_TEL_VERIFY_CODE_ATTACK = -108;

	/**
	 * 未注册的手机号码
	 */
	public final static int UNREGESTATION_TELEPHONE_ERROR = -105;
	/**
	 * 无效素材key;或者素材上传完之后素材长度为0
	 */
	public final static int INVALID_CLIP_KEY_ERROR = -104;
	/**
	 * 手机号码与当前登录用户的手机号码不匹配
	 */
	public final static int UNMACHED_TELEPHONE_CODE_ERROR = -103;
	/**
	 * 输入的验证码无效
	 */
	public final static int INVALID_VERIFICATION_CODE_ERROR = -102;
	/**
	 * 获取手机验证码失败
	 */
	public final static int GET_VERIFICATION_CODE_ERROR = -101;
	/**
	 * 电话号码已被占用
	 */
	public final static int TEL_EXIST_ERROR = -100;

	/**
	 * 给用户推送消息失败
	 */
	public final static int PUSH_MSG_ERROR = -9;
	/**
	 * 数据访问出错
	 */
	public final static int DB_ERROR = -8;

	/**
	 * 上传素材出错
	 */
	public final static int UPLOAD_CLIP_ERROR = -6;
	/**
	 * 用户已存在
	 */
	public final static int USER_EXIST_ERROR = -5;
	/**
	 * 服务器获取数据出错;涉及到读打包进度，或者获取本地文件等
	 */
	public final static int SERVER_ERROR = -4;
	/**
	 * 无效请求
	 */
	public final static int INVALID_REQUEST_ERROR = -3;
	/**
	 * 用户没有权限
	 */
	public final static int NO_POWER = -2001;
	/**
	 * 登录验证出错
	 */
	public final static int LOGIN_ERROR = -2;
	/**
	 * 出现未知错误
	 */
	public final static int ERROR = -1;
	/**
	 * 没有错误
	 */
	public final static int NO_ERROR = 0;
	
	/**
	 * 添加App版本号错误，可能是版本号已经存在，或者新增加的版本小于已存在版本
	 */
	public final static int APP_VERSION_CODE_ERROR = -600;
	/**
	 * 爆新闻管理后台未添加默认App版本错误
	 */
	public final static int DEFAULT_APP_VERSION_NOT_EXIST_ERROR = -601;
	/**
	 * 没有添加默认的标签
	 */
	public final static int DEFAULT_TAGS_NOT_EXIST_ERROR = -602;
	/**
	 * admin管理添加管理员角色时，还没有设置管理模块时报该错误
	 */
	public final static int ADMIN_MODULE_HAVE_NOT_SETTED_ERROR = -603;
	
	/**
	 * admin管理员登录时，登录邮箱未被注册为管理员
	 */
	public final static int ADMIN_LOGIN_EMAIL_NOT_REGISTRATION_ERROR = -604;
	/**
	 * admin管理员登录时，密码错误
	 */
	public final static int ADMIN_LOGIN_PASSWORD_ERROR = -605;
	/**
	 * 修改admin登录密码时，旧密码输入错误
	 */
	public final static int ADMIN_LOGIN_OLD_PASSWORD_ERROR = -606;
	/**
	 * 机构注册时，电话已被注册使用
	 */
	public final static int ADMIN_REGISTER_TELEPHONE_ALREADY_USED_ERROR = -607;
	/**
	 * 机构注册时，邮箱已被注册使用
	 */
	public final static int ADMIN_REGISTER_EMAIL_ALREADY_USED_ERROR = -608;
	/**
	 * 申请试用机构时，邮箱已经申请过
	 */
	public final static int APPLY_INSTITUTION_EMAIL_DUPLICATE_ERROR = -609;
	/**
	 * 申请试用机构时，电话已经申请过
	 */
	public final static int APPLY_INSTITUTION_TEL_DUPLICATE_ERROR = -610;

	
	
	
	
	
	
	

}
