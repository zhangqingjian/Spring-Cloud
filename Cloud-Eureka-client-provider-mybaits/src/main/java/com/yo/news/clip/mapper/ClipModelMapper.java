package com.yo.news.clip.mapper;

import java.util.List;
import java.util.Map;

import com.yo.news.clip.vo.ClipModel;

public interface ClipModelMapper {
	// int deleteByPrimaryKey(@Param("clipId") String clipId, @Param("cId") Long cId);
	int deleteByPrimaryKey(String clipId);

	int insert(ClipModel record);

	int insertSelective(ClipModel record);

	// ClipModel selectByPrimaryKey(@Param("clipId") String clipId, @Param("cId") Long cId);
	ClipModel selectByPrimaryKey(String clipId);

 

	int updateByPrimaryKeySelective(ClipModel record);

	int updateByPrimaryKey(ClipModel record);

	List<ClipModel> getClipsByUserId(Map<String, Object> map);

	ClipModel getClipByAliKey(String aliKey);

	int addBatch(List<ClipModel> batchClips);

	Integer getLengthByClipId(String clipId);

	int delClipsByScriptId(String scriptId);
}