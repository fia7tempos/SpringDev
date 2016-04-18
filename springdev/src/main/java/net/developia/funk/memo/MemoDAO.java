package net.developia.funk.memo;

import java.util.List;

public interface MemoDAO {

	void insertMemo(MemoVO memoVO) throws Exception;

	List<MemoVO> getMemoList() throws Exception;

	MemoVO getMemo(long no) throws Exception;

	int updateMemo(MemoVO memoVO) throws Exception;

	int deleteMemo(MemoVO memoVO) throws Exception;

}
