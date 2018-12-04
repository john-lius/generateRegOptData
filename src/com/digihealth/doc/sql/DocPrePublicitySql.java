package com.digihealth.doc.sql;

public class DocPrePublicitySql {
	public static final String insert = "insert into doc_pre_publicity (id, regOptId, processState) values (?, ?, ?)";

	public static final String deleteByRegOptId = "DELETE FROM doc_pre_publicity WHERE regOptId IN(SELECT t.regOptId FROM bas_reg_opt t WHERE t.beid = ? AND t.name LIKE ?)";
}
