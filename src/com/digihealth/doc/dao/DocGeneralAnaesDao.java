package com.digihealth.doc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.digihealth.basedata.service.BaseDataService;
import com.digihealth.doc.entity.DocGeneralAnaes;
import com.digihealth.doc.sql.DocGeneralAnaesSql;
import com.digihealth.utils.ConnectionManager;

public class DocGeneralAnaesDao {

	public void insert(DocGeneralAnaes entity) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocGeneralAnaesSql.insert);
			pstmt.setString(1, entity.getGeneralAnaesId());
			pstmt.setString(2, entity.getAnaSumId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("ִ��insert�������쳣(DocGeneralAnaesDao)��"
					+ e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void deleteByRegOptId(String name) {
		String beid = BaseDataService.getCurBasBusEntity().getBeid();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getAISDEVConnection();
			pstmt = conn.prepareStatement(DocGeneralAnaesSql.deleteByRegOptId);
			pstmt.setString(1, beid);
			pstmt.setString(2, "%" + name + "%");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("----------DocGeneralAnaesDao-deleteByRegOptId----------" + e.getMessage());
		} finally {
			try {
				ConnectionManager.close(conn, pstmt, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
