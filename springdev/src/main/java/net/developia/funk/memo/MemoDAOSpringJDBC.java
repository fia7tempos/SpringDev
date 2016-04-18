package net.developia.funk.memo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("memoDAOSpringJDBC")
public class MemoDAOSpringJDBC implements MemoDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate ;

	@Override
	public void insertMemo(MemoVO memoVO) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append(" insert into tb_memo(no,title,name,pwd,email,content)");
		sql.append(" values(seq_emp.nextval, ?, ?, ?,?,?)");
		
		Object[] args = {
				memoVO.getTitle(),
				memoVO.getName(),
				memoVO.getPwd(),
				memoVO.getEmail(),
				memoVO.getContent()
		};
		
		jdbcTemplate.update(sql.toString(),args);
		
	}

	@Override
	public List<MemoVO> getMemoList() throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT no, title, name,regdate");
		sql.append(" from tb_memo");
		sql.append(" ORDER BY no DESC");
		
		RowMapper rowMapper = new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				MemoVO memoVO = new MemoVO();
				memoVO.setNo(rs.getLong("no"));
				memoVO.setTitle(rs.getString("title"));
				memoVO.setName(rs.getString("name"));
				memoVO.setRegdate(rs.getString("regdate"));
				return memoVO;
			}
		};
		
		
		
		return jdbcTemplate.query(sql.toString(),rowMapper);
	}

	@Override
	public MemoVO getMemo(long no) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT no,title,name,email,content,regdate ");
		sql.append(" FROM tb_memo ");
		sql.append(" WHERE no = ? ");
		
		RowMapper rowMapper = new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				MemoVO memoVO = new MemoVO();
				memoVO.setNo(rs.getLong("no"));
				memoVO.setTitle(rs.getString("title"));
				memoVO.setName(rs.getString("name"));
				memoVO.setEmail(rs.getString("email"));
				memoVO.setContent(rs.getString("content"));
				memoVO.setRegdate(rs.getString("regdate"));
				return memoVO;
			}
		};
		
		return (MemoVO) jdbcTemplate.queryForObject(sql.toString(), new Object[]{no},rowMapper);
	}

	@Override
	public int updateMemo(MemoVO memoVO) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append(" update tb_memo set title=?,name=?,email=?,content=? ");
		sql.append(" where no=? and pwd=? ");
		
		Object[] args = {
				memoVO.getTitle(),
				memoVO.getName(),
				memoVO.getEmail(),
				memoVO.getContent(),
				memoVO.getNo(),
				memoVO.getPwd()
		};
		
		return jdbcTemplate.update(sql.toString(),args);
	}

	@Override
	public int deleteMemo(MemoVO memoVO) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append(" delete from tb_memo");
		sql.append(" where no=? and pwd=? ");
		
		Object[] args = {
				memoVO.getNo(),
				memoVO.getPwd()
		};
		
		return jdbcTemplate.update(sql.toString(),args);
	}

}
