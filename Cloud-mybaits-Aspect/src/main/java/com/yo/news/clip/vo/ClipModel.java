package com.yo.news.clip.vo;

public class ClipModel {
	/**
	 * 素材类型 
	 * 		 0：视频，1：图片，2：文本 ，3：音频
	 */
	/**
	 * 视频
	 */
	public static final int CLIP_TYPE_VIDEO = 0;
	/**
	 * 图片
	 */	
	public static final int CLIP_TYPE_IMAGE = 1;
	/**
	 * 文本
	 */
	public static final int CLIP_TYPE_TEXT = 2;
	/**
	 * 音频
	 */
	public static final int CLIP_TYPE_AUDIO = 3;
	
	/**
	 * 音频的默认地址
	 */
	public static final String AUDIO_CLIP_BG_DEFAULT_URL="http://img.yomovie.cn/news/static/imgs/script/script_only_audio.jpg";	
	
	private String clipId;
	
	private String name;

	private String userId;
	
	private String instId;

	private String thumb;

	private Integer types;

	private Integer createdTime;

	private Integer length=0;

	private String url;

	private String aliKey;

	private String dpi;

	private Integer trimIn;

	private Integer trimOut;
	
	/**
	 * 素材描述
	 */
	private String description;
	/**
	 * 素材拍摄位置
	 */
	private String position;
	/**
	 * 素材拍摄时间
	 */
	private String shootTime;
	/**
	 * 素材大小，单位字节
	 */
	private Integer clipSize;

	public String getClipId()
	{
		return clipId;
	}

	public void setClipId(String clipId)
	{
		this.clipId = clipId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public Integer getTypes() {
		return types;
	}

	public void setTypes(Integer types) {
		this.types = types;
	}

	public Integer getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Integer createdTime) {
		this.createdTime = createdTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAliKey() {
		return aliKey;
	}

	public void setAliKey(String aliKey) {
		this.aliKey = aliKey;
	}

	public String getDpi() {
		return dpi;
	}

	public void setDpi(String dpi) {
		this.dpi = dpi;
	}

	public Integer getTrimIn() {
		return trimIn;
	}

	public void setTrimIn(Integer trimIn) {
		this.trimIn = trimIn;
	}

	public Integer getTrimOut() {
		return trimOut;
	}

	public void setTrimOut(Integer trimOut) {
		this.trimOut = trimOut;
	}

	/**
	 * @return the instId
	 */
	public String getInstId()
	{
		return instId;
	}

	/**
	 * @param instId the instId to set
	 */
	public void setInstId(String instId)
	{
		this.instId = instId;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getShootTime() {
		return shootTime;
	}

	public void setShootTime(String shootTime) {
		this.shootTime = shootTime;
	}

	public Integer getClipSize() {
		return clipSize;
	}

	public void setClipSize(Integer clipSize) {
		this.clipSize = clipSize;
	}

}