package com.example.demo.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import com.globits.education.domain.ExamRegisterPeriod;
import com.globits.education.domain.Semester;

import com.globits.education.domain.SemesterRegisterPeriod;

public class SemesterDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String semesterCode;
	private String semesterName;
	private String description;
	private SchoolYearDto schoolYear;
	private Integer year;
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date startDate; // Ngày bắt đầu
	private Date endDate; // Ngày kết thúc
	private Boolean isCurrent;
	private SemesterDto parent;
	private List<SemesterDto> children;
	private List<SemesterDto> subSemesters;
	private Double tuitionFeePerCredit;// Mức học phí cho một tín chỉ
	private Date startRegisterDate;//Ngày bắt đầu đăng ký
	private String startRegisterDateString;//Ngày bắt đầu đăng ký
	private Date endRegisterDate;//Ngày kết thúc đăng ký
	private String endRegisterDateString;//Ngày kết thúc đăng ký
	private Boolean isLockRegister;//Khóa Đăng ký học
	private Integer ordinalNumbers;
	private Date behaviorMarkStart;
	private Date behaviorMarkEnd;
	private List<SemesterRegisterPeriodDto> semesterRegisterPeriods;
	
	private List<ExamRegisterPeriodDto> examRegisterPeriods;
	private Integer typeMarkRecognition;//loại điểm công nhận (=0 hoặc null thì là công nhận điểm theo lần học cuối, 
	//=1 là công nhận điểm cao nhất)
	private Date educationStart;//cấu hình thời gian cập nhật dữ liệu tự động từ P3 sang cho P5
	private Date educationEnd;//cấu hình thời gian cập nhật dữ liệu tự động từ P3 sang cho P5
	private Date studentStart;//cấu hình thời gian cập nhật dữ liệu tự động từ P7 sang cho P5
	private Date studentEnd;//cấu hình thời gian cập nhật dữ liệu tự động từ P7 sang cho P5
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getOrdinalNumbers() {
		return ordinalNumbers;
	}

	public void setOrdinalNumbers(Integer ordinalNumbers) {
		this.ordinalNumbers = ordinalNumbers;
	}

	public String getSemesterCode() {
		return semesterCode;
	}

	public void setSemesterCode(String semesterCode) {
		this.semesterCode = semesterCode;
	}

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SchoolYearDto getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(SchoolYearDto schoolYear) {
		this.schoolYear = schoolYear;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Boolean getIsCurrent() {
		return isCurrent;
	}

	public void setIsCurrent(Boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public SemesterDto getParent() {
		return parent;
	}

	public void setParent(SemesterDto parent) {
		this.parent = parent;
	}

	public List<SemesterDto> getChildren() {
		return children;
	}

	public void setChildren(List<SemesterDto> children) {
		this.children = children;
	}

	public List<SemesterDto> getSubSemesters() {
		return subSemesters;
	}

	public void setSubSemesters(List<SemesterDto> subSemesters) {
		this.subSemesters = subSemesters;
	}

	public List<SemesterRegisterPeriodDto> getSemesterRegisterPeriods() {
		return semesterRegisterPeriods;
	}

	public void setSemesterRegisterPeriods(List<SemesterRegisterPeriodDto> semesterRegisterPeriods) {
		this.semesterRegisterPeriods = semesterRegisterPeriods;
	}

	public Double getTuitionFeePerCredit() {
		return tuitionFeePerCredit;
	}

	public void setTuitionFeePerCredit(Double tuitionFeePerCredit) {
		this.tuitionFeePerCredit = tuitionFeePerCredit;
	}
	
	public Date getStartRegisterDate() {
		return startRegisterDate;
	}

	public void setStartRegisterDate(Date startRegisterDate) {
		this.startRegisterDate = startRegisterDate;
	}

	public String getStartRegisterDateString() {
		return startRegisterDateString;
	}

	public Date getEndRegisterDate() {
		return endRegisterDate;
	}

	public void setEndRegisterDate(Date endRegisterDate) {
		this.endRegisterDate = endRegisterDate;
	}

	public String getEndRegisterDateString() {
		return endRegisterDateString;
	}

	public Boolean getIsLockRegister() {
		return isLockRegister;
	}

	public void setIsLockRegister(Boolean isLockRegister) {
		this.isLockRegister = isLockRegister;
	}
	
	public List<ExamRegisterPeriodDto> getExamRegisterPeriods() {
		return examRegisterPeriods;
	}

	public void setExamRegisterPeriods(List<ExamRegisterPeriodDto> examRegisterPeriods) {
		this.examRegisterPeriods = examRegisterPeriods;
	}

	public Date getBehaviorMarkStart() {
		return behaviorMarkStart;
	}

	public void setBehaviorMarkStart(Date behaviorMarkStart) {
		this.behaviorMarkStart = behaviorMarkStart;
	}

	public Date getBehaviorMarkEnd() {
		return behaviorMarkEnd;
	}

	public void setBehaviorMarkEnd(Date behaviorMarkEnd) {
		this.behaviorMarkEnd = behaviorMarkEnd;
	}	

	public Integer getTypeMarkRecognition() {
		return typeMarkRecognition;
	}

	public void setTypeMarkRecognition(Integer typeMarkRecognition) {
		this.typeMarkRecognition = typeMarkRecognition;
	}
	public Date getEducationStart() {
		return educationStart;
	}

	public void setEducationStart(Date educationStart) {
		this.educationStart = educationStart;
	}

	public Date getEducationEnd() {
		return educationEnd;
	}

	public void setEducationEnd(Date educationEnd) {
		this.educationEnd = educationEnd;
	}

	public Date getStudentStart() {
		return studentStart;
	}

	public void setStudentStart(Date studentStart) {
		this.studentStart = studentStart;
	}

	public Date getStudentEnd() {
		return studentEnd;
	}

	public void setStudentEnd(Date studentEnd) {
		this.studentEnd = studentEnd;
	}

	public SemesterDto() {

	}
}
