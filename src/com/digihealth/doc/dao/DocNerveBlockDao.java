package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.digihealth.doc.entity.DocNerveBlock;
import com.digihealth.doc.sql.DocNerveBlockSql;
import com.digihealth.utils.ConnectionManager;

public class DocNerveBlockDao {

	public void insert(DocNerveBlock entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocNerveBlockSql.insert);
			pstmt.setString(1, entity.getNerveBlockId());
			pstmt.setString(2, entity.getAnaSumId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("ִ��insert�������쳣(DocNerveBlockDao)��"
					+ e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
