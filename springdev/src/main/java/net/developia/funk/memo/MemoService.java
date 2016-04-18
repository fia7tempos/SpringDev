package net.developia.funk.memo;

import java.util.List;

public interface MemoService {

	void insertMemo(MemoVO memoVO) throws Exception;

	List<MemoVO> getMemoList() throws Exception;

	MemoVO getMemo(long no) throws Exception;

	void updateMemo(MemoVO memoVO) throws Exception;

	void deleteMemo(MemoVO memoVO) throws Exception;
	
	
}
