package com.yo.news.clip.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yo.news.clip.dao.ClipDao;
import com.yo.news.clip.mapper.ClipModelMapper;
import com.yo.news.clip.vo.ClipModel;
 

@Repository
public class ClipImpl extends BaseDaoImpl<ClipModel> implements ClipDao {
	
	@Autowired
	private ClipModelMapper clipModelMapper;

	@Override
	public int deleteByPrimaryKey(Object key) {
		return clipModelMapper.deleteByPrimaryKey(key.toString());
	}

	@Override
	public int insert(ClipModel record) {
		return clipModelMapper.insert(record);
	}

	@Override
	public int insertSelective(ClipModel record) {
		return clipModelMapper.insertSelective(record);
	}

	@Override
	public ClipModel selectByPrimaryKey(Object key) {
		return clipModelMapper.selectByPrimaryKey(key.toString());
	}

	@Override
	public int updateByPrimaryKeySelective(ClipModel record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(ClipModel record) {
		return 0;
	}

	@Override
	public List<ClipModel> getClipsByUserId(String userId, Integer firstFrom, Integer needCount) {
		Map<String, Object> map = new HashMap<>();
		map.put("userId", userId);
		map.put("firstFrom", firstFrom);
		map.put("needCount", needCount);
		return clipModelMapper.getClipsByUserId(map);
	}

	@Override
	public ClipModel getClipByAliKey(String aliKey) {
		return clipModelMapper.getClipByAliKey(aliKey);
	}

	@Override
	public int addBatch(List<ClipModel> batchClips) {
		return clipModelMapper.addBatch(batchClips);
	}
	
	@Override
	public Integer getLengthByClipId(String clipId) {
		return clipModelMapper.getLengthByClipId(clipId);
	}
	
	@Override
	public int delClipsByScriptId(String scriptId) {
		return clipModelMapper.delClipsByScriptId(scriptId);
	}

 
}