package mvc.address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.util.DBConnectionMgr;

public class RetrieveEntity {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
//오버로딩에 리턴타입은 영향이 없다.
	/*******************************************
	 * 상세조회 구현
	 * @param pavo - vo.getID();
	 * @return AddressVo (or Map)
	 * Select
     *   	 id, name, address, telephone, gender
     *   	,realationship , birthday, comments, registedate
  	 *	 From mkaddrtb
 	 *	Where id=:x
	 *******************************************/
	public AddressVO select(AddressVO pavo) {//무조건 1개 로우만 가능함.
		System.out.println("RetrieveEntity select(pavo) 호출 성공");
		return null;
	}
	public Map<String,Object> selectMap(AddressVO vo) {//무조건 1개 로우만 가능함.
		System.out.println("RetrieveEntity select(vo) 호출 성공");
		return null;
	}
	public AddressVO[] select() {//n개 로우 가능함.
		System.out.println("RetrieveEntity select() 호출 성공");
		StringBuilder sql = new StringBuilder();
		sql.append("Select                                              ");
	    sql.append("   	 id, name, address, telephone, gender      	  	");
	    sql.append("  	,relationship, birthday, comments, registedate  ");
	  	sql.append("  From mkaddrtb                                     ");
	  	DBConnectionMgr dbMgr = DBConnectionMgr.getInstance();
	  	Vector<AddressVO> v = new Vector<>();
	  	AddressVO[] aVOS = null;
	  	try {
			con = dbMgr.getConnection();
			//pstmt = con.prepareStatement(sql.toString());
			pstmt = con.prepareStatement(String.valueOf(sql));
			rs = pstmt.executeQuery();
			
			AddressVO aVo = null;
			while(rs.next()) {
				aVo = new AddressVO();
				aVo.setId(rs.getInt("id"));
				aVo.setName(rs.getString("name"));
				aVo.setAddress(rs.getString("address"));
				aVo.setTelephone(rs.getString("telephone"));
				aVo.setGender(rs.getString("gender"));
				aVo.setRelationship(rs.getString("relationship"));
				aVo.setBirthday(rs.getString("birthdayme"));
				aVo.setComments(rs.getString("comments"));
				aVo.setRegistedate(rs.getString("registedate"));
				v.add(aVo);
			}
			aVOS = new AddressVO[v.size()];
			v.copyInto(aVOS);
		} catch (SQLException se) {
			
		} finally {//사용한 자원 반납하기
			dbMgr.freeConnection(con, pstmt, rs);
		}
		return aVOS;
	}
	/********************************************
	 * 
	 * @param vo
	 * @return
	 ********************************************/
	public List<AddressVO> selectList(AddressVO vo) {//n개 로우 가능함.
		System.out.println("RetrieveEntity selectList() 호출 성공");
		return null;
	}

}
