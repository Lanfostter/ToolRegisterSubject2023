package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.globits.education.domain.Decision;
import com.globits.education.domain.StudentDecision;

public class DecisionDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String code;	//Số quyết định
	private String name;
	private StudentDecisionTypeDto studentDecisionType;	//Loại quyết định

	private String note;				//Ghi chú 
	private SemesterDto semester;			//Học kỳ
	private String attachedFilePath;	//File đính kèm nếu có
	private Date issuedDate;			//Ngày ban hành
	private Date decisionDate;			//Ngày quyết định
	private Date officialDate;			//Ngày hiệu lực
	private Date expiredDate;			//Ngày hết hạn
	private String whereIssued;			//Nơi ban hành
	private String theSigner;			//người ký
	private Set<StudentDecisionDto> studentDecisions;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentDecisionTypeDto getStudentDecisionType() {
		return studentDecisionType;
	}
	public void setStudentDecisionType(StudentDecisionTypeDto studentDecisionType) {
		this.studentDecisionType = studentDecisionType;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public String getAttachedFilePath() {
		return attachedFilePath;
	}
	public void setAttachedFilePath(String attachedFilePath) {
		this.attachedFilePath = attachedFilePath;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public Date getOfficialDate() {
		return officialDate;
	}
	public void setOfficialDate(Date officialDate) {
		this.officialDate = officialDate;
	}
	public Date getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	public String getWhereIssued() {
		return whereIssued;
	}
	public void setWhereIssued(String whereIssued) {
		this.whereIssued = whereIssued;
	}
	public String getTheSigner() {
		return theSigner;
	}
	public void setTheSigner(String theSigner) {
		this.theSigner = theSigner;
	}
	public Set<StudentDecisionDto> getStudentDecisions() {
		return studentDecisions;
	}
	public void setStudentDecisions(Set<StudentDecisionDto> studentDecisions) {
		this.studentDecisions = studentDecisions;
	}
	
	public Date getDecisionDate() {
		return decisionDate;
	}
	public void setDecisionDate(Date decisionDate) {
		this.decisionDate = decisionDate;
	}
	public DecisionDto() {
	}
	
	public DecisionDto(Decision entity) {
		if(entity!=null) {
			this.id = entity.getId();
			this.code = entity.getCode();
			this.name = entity.getName();
			if (entity.getStudentDecisionType() != null) {
				StudentDecisionTypeDto studentDecisionTypeDto = new StudentDecisionTypeDto();
				studentDecisionTypeDto.setId(entity.getStudentDecisionType().getId());
				studentDecisionTypeDto.setCode(entity.getStudentDecisionType().getCode());
				studentDecisionTypeDto.setName(entity.getStudentDecisionType().getName());
				
				this.studentDecisionType = studentDecisionTypeDto;
			}
			
			if (entity.getSemester() != null) {
				SemesterDto semesterDto = new SemesterDto();
				semesterDto.setId(entity.getSemester().getId());
				semesterDto.setSemesterName(entity.getSemester().getSemesterName());
				semesterDto.setSemesterCode(entity.getSemester().getSemesterCode());
				
				this.semester = semesterDto;
			}
			
			if (entity.getStudentDecisions() != null && entity.getStudentDecisions().size() > 0) {
				Set<StudentDecisionDto> listStudentDecisionDto = new HashSet<StudentDecisionDto>();
				for (StudentDecision studentDecision : entity.getStudentDecisions()) {
					StudentDecisionDto studentDecisionDto = new StudentDecisionDto();
					studentDecisionDto.setId(studentDecision.getId());
					
					if (studentDecision.getStudent() != null) {
						StudentDto student= new StudentDto();
						student.setId(studentDecision.getStudent().getId());
						student.setDisplayName(studentDecision.getStudent().getDisplayName());
						student.setStudentCode(studentDecision.getStudent().getStudentCode());
						
						studentDecisionDto.setStudent(student);
						listStudentDecisionDto.add(studentDecisionDto);
					}
				}
				this.studentDecisions = listStudentDecisionDto;
			}
			
			this.note = entity.getNote();
			this.attachedFilePath = entity.getAttachedFilePath();
			this.issuedDate = entity.getIssuedDate();
			this.decisionDate = entity.getDecisionDate();
			this.officialDate = entity.getOfficialDate();
			this.expiredDate = entity.getExpiredDate();
			this.whereIssued = entity.getWhereIssued();
			this.theSigner = entity.getTheSigner();
		}
		
	}
	public DecisionDto(Decision entity, boolean noListStudentDecision) {
		this.id = entity.getId();
		this.code = entity.getCode();
		this.name = entity.getName();
		
		if (entity.getStudentDecisionType() != null) {
			StudentDecisionTypeDto studentDecisionTypeDto = new StudentDecisionTypeDto();
			studentDecisionTypeDto.setId(entity.getStudentDecisionType().getId());
			studentDecisionTypeDto.setCode(entity.getStudentDecisionType().getCode());
			studentDecisionTypeDto.setName(entity.getStudentDecisionType().getName());
			
			this.studentDecisionType = studentDecisionTypeDto;
		}
		
		if (entity.getSemester() != null) {
			SemesterDto semesterDto = new SemesterDto();
			semesterDto.setId(entity.getSemester().getId());
			semesterDto.setSemesterName(entity.getSemester().getSemesterName());
			semesterDto.setSemesterCode(entity.getSemester().getSemesterCode());
			
			this.semester = semesterDto;
		}
		
		this.note = entity.getNote();
		this.attachedFilePath = entity.getAttachedFilePath();
		this.issuedDate = entity.getIssuedDate();
		this.decisionDate = entity.getDecisionDate();
		this.officialDate = entity.getOfficialDate();
		this.expiredDate = entity.getExpiredDate();
		this.whereIssued = entity.getWhereIssued();
		this.theSigner = entity.getTheSigner();
	}
	
	
}
