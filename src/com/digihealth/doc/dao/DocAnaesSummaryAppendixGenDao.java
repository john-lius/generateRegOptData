package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.digihealth.doc.entity.DocAnaesSummaryAppendixGen;
import com.digihealth.doc.sql.DocAnaesSummaryAppendixGenSql;
import com.digihealth.utils.ConnectionManager;

public class DocAnaesSummaryAppendixGenDao {

	public void insert(DocAnaesSummaryAppendixGen entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocAnaesSummaryAppendixGenSql.insert);
			pstmt.setString(1, entity.getAnaSumAppGenId());
			pstmt.setString(2, entity.getAnaSumId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("ִ��insert�������쳣(DocAnaesSummaryAppendixGenDao)��"
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
