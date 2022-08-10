import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import sql.SqlMapClient;

public class CustomerDAO {
	private SqlSessionFactory sqlSessionFactory = SqlMapClient.getSqlSession();
	
	// 조회
	public Vector select(Map<String, String> param) {
		SqlSession session = sqlSessionFactory.openSession();
		List<CustomerDTO> data = session.selectList("Customer.select", param);	// namespace.id
		
		Vector rData = new Vector();	// 최종적으로 return 할 데이터
		
		for(CustomerDTO dto : data) {
			Vector rowData = new Vector();
			
			rowData.add(dto.getIdx());
			rowData.add(dto.getNm());
			rowData.add(dto.getAge());
			rowData.add(dto.getEmail());
			rowData.add(dto.getJumin());
			
			rData.add(rowData);
		}
		
		return rData;
		
	}
	
	// 추가
	public boolean insert(CustomerDTO dto) {
		SqlSession session = sqlSessionFactory.openSession();
		int insertCnt = session.insert("Customer.insert", dto);	// namespace.id, parameter (DTO)
		session.commit();
		session.close();
		return insertCnt > 0 ? true : false;
	}
	
	// 삭제
	public boolean delete(String idx) {
		SqlSession session = sqlSessionFactory.openSession();
		int deleteCnt = session.delete("Customer.delete", idx);
		session.commit();
		session.close();
		return deleteCnt > 0 ? true : false;
	}
}
