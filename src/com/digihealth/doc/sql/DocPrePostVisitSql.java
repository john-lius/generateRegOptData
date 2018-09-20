package com.digihealth.doc.sql;

public class DocPrePostVisitSql {
	public static final String insert = "insert into doc_pre_post_visit (id, regOptId, processState, "
			+ "blood, allergy, briefHis, "
			+ "briefHisOther, nurseProblem, nurseProblemOther, "
			+ "preVisitorId, preVisitorName, preVisitTime, "
			+ "psychological, psychologicalOther, environment, "
			+ "workAttitude, care, suggest, "
			+ "postVisitorId, postVisitorName, postVisitTime, "
			+ "hbsag, hcv, hiv, tpha, "
			+ "bloodSugar, isAllergy, operHis, "
			+ "bodyStatus, bodyType, mentalStatus, "
			+ "moveObstacle, bloodVessels, informContent, "
			+ "precautions, preDoctorSign, preAnaesSign, "
			+ "preNurseSign, spiritStatus, temp, "
			+ "pain, painDegree, skinDamaged, "
			+ "skinDamagedDetails, incisionDress, complication, "
			+ "complicationDetails, jobAssess, visitAttitude, "
			+ "specialOpinions, postDoctorSign, postAnaesSign, "
			+ "postNurseSign)"
			+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
}
