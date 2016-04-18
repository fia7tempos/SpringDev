package net.developia.funk.memo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoServiceImpl implements MemoService{
	
	@Autowired
	public MemoDAO memoDAO;
	
	@Override
	public void insertMemo(MemoVO memoVO) throws Exception {
		memoDAO.insertMemo(memoVO);
	}

	@Override
	public List<MemoVO> getMemoList() throws Exception {
		return memoDAO.getMemoList();
	}

	@Override
	public MemoVO getMemo(long no) throws Exception {
		return memoDAO.getMemo(no);
	}

	@Override
	public void updateMemo(MemoVO memoVO) throws Exception {
		if(memoDAO.updateMemo(memoVO) == 0){
			new RuntimeException("비밀번호가 다릅니다.");
		};
		
	}

	@Override
	public void deleteMemo(MemoVO memoVO) throws Exception {
		if(memoDAO.deleteMemo(memoVO) == 0){
			new RuntimeException("비밀번호가 다릅니다.");
		};
	}
}
