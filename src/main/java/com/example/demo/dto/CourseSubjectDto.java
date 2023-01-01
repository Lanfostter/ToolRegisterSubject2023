package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.joda.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.globits.core.dto.BaseObjectDto;

import com.globits.core.dto.TrainingBaseDto;

import com.globits.hr.dto.StaffDto;

public class CourseSubjectDto extends BaseObjectDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long Id;

	private String code; // Mã lớp (dùng để định danh lớp (thông thường sẽ bằng Mã môn học + số thứ tự
							// của lớp trong kỳ : ví dụ - Toan1-001, Toan1-002)
	private String shortCode;
	private Long subjectId;
	private String subjectName;
	private String subjectCode;

	private CourseSubjectDto parent; // Lớp cha (ví dụ : 1 lớp lý thuyết có nhiều lớp bài tập)
	private Set<CourseSubjectDto> subCourseSubjects;

	private Boolean isUsingConfig = false;

	private Boolean isFullClass = false;

	// Các cấu hình (nếu khác NULL có nghĩa là có cấu hình)
	private List<CourseSubjectConfigDto> courseSubjectConfigs;
	private List<TimeTableDto> timetables;// Thời khóa biểu của lớp này (ví dụ : Thứ 3 tiết 1 đến tiết 3, thứ 5 : tiết
											// 4-6)
	private SemesterSubjectDto semesterSubject;
	private Integer maxStudent=0;// Số lượng sinh viên tối đa được đăng ký học vào lớp này
	private Integer minStudent=0;// Số lượng sinh viên tối đa được đăng ký học vào lớp này

	private Integer numberStudent=0;// Số lượng sinh viên thực tế

	private Integer courseSubjectType;// Lý thuyết =0 (mặc định), bài tập=1, thực hành=2, thí nghiệm (=3).

	private Long learningSkillId;
	private String learningSkillName;
	private String learningSkillCode;

	private Boolean isSelected=false;

	private List<CourseSubjectDto> children;

	private Hashtable<String, List<CourseSubjectDto>> hashCourseSubjects = new Hashtable<String, List<CourseSubjectDto>>();
	// private int numberLearningSkill;
	private Boolean expanded = true;
	private Boolean isGrantAll = false;
	private Boolean isDeniedAll = false;
	private TrainingBaseDto trainingBase;

	private Boolean isOvelapTime;

	private List<String> overLapClasses = new ArrayList<String>();

	private Long courseYearId;
	private String courseYearCode;
	private String courseYearName;

	private String displayName;

	private int numberOfCredit;

	private boolean isCheck;

	/*
	 * Tính học phí theo lớp học phần True: tính theo lớp học phần False: tính theo
	 * phương pháp thông thường
	 */
	private Boolean isFeeByCourseSubject;

	/*
	 * Mức phí tối thiểu mở lớp
	 */
//	private Double minFee;

	/*
	 * Mức phí / 1 đơn vị học trình (tín chỉ)
	 */
	private Double feePerCredit;
	/*
	 * Hệ số học phí cho lớp học phần này
	 */
	private Double tuitionCoefficient;

	/*
	 * Tổng học phí của lớp totalFee = minFee+feePerCredit*numberOfCredit
	 */
	private Double totalFee;
	/*
	 * Mức phí/1 sinh viên feePerStudent = totalFee/NumberOfStudent
	 */
	private Double feePerStudent;

//	private EnrollmentClassDto enrollmentClassDto;

	private Long enrollmentClassId;
	private String enrollmentClassCode;
	private Double numberHours;// Số giờ học của lớp
	private StaffDto teacher;
	private String teacherName;
	private String teacherCode;
	private Date startDate;
	private Date endDate;
	private Integer learningMethod;
	private Integer status;
	private List<SubjectExamDto> subjectExams;
	private Long semesterId;
	private String semesterCode;
	private Long periodId;
	private String periodName;
	private String username;
	private LocalDateTime actionTime;

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseSubjectDto other = (CourseSubjectDto) obj;
		return Objects.equals(Id, other.Id);
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		this.Id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public Long getLearningSkillId() {
		return learningSkillId;
	}

	public void setLearningSkillId(Long learningSkillId) {
		this.learningSkillId = learningSkillId;
	}

	public String getLearningSkillName() {
		return learningSkillName;
	}

	public void setLearningSkillName(String learningSkillName) {
		this.learningSkillName = learningSkillName;
	}

	public String getLearningSkillCode() {
		return learningSkillCode;
	}

	public void setLearningSkillCode(String learningSkillCode) {
		this.learningSkillCode = learningSkillCode;
	}

	public Integer getCourseSubjectType() {
		return courseSubjectType;
	}

	public void setCourseSubjectType(Integer courseSubjectType) {
		this.courseSubjectType = courseSubjectType;
	}

	public SemesterSubjectDto getSemesterSubject() {
		return semesterSubject;
	}

	public void setSemesterSubject(SemesterSubjectDto semesterSubject) {
		this.semesterSubject = semesterSubject;
	}

	public CourseSubjectDto getParent() {
		return parent;
	}

	public Boolean getIsFullClass() {
		return isFullClass;
	}

	public void setIsFullClass(Boolean isFullClass) {
		this.isFullClass = isFullClass;
	}

	public void setParent(CourseSubjectDto parent) {
		this.parent = parent;
	}

	public List<TimeTableDto> getTimetables() {
		return timetables;
	}

	public void setTimetables(List<TimeTableDto> timetables) {
		this.timetables = timetables;
	}

	public Integer getMaxStudent() {
		return maxStudent;
	}

	public void setMaxStudent(Integer maxStudent) {
		this.maxStudent = maxStudent;
	}

	public Integer getNumberStudent() {
		return numberStudent;
	}

	public void setNumberStudent(Integer numberStudent) {
		this.numberStudent = numberStudent;
	}

	public Boolean getIsSelected() {
		return this.isSelected;
	}

	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}

	public Integer getMinStudent() {
		return minStudent;
	}

	public void setMinStudent(Integer minStudent) {
		this.minStudent = minStudent;
	}

	public Set<CourseSubjectDto> getSubCourseSubjects() {
		return subCourseSubjects;
	}

	public void setSubCourseSubjects(Set<CourseSubjectDto> subCourseSubjects) {
		this.subCourseSubjects = subCourseSubjects;
	}

	public Hashtable<String, List<CourseSubjectDto>> getHashCourseSubjects() {
		return hashCourseSubjects;
	}

	public void setHashCourseSubjects(Hashtable<String, List<CourseSubjectDto>> hashCourseSubjects) {
		this.hashCourseSubjects = hashCourseSubjects;
	}

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	public int getNumberLearningSkill() {
		return hashCourseSubjects.size();
	}

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	public int getNumberSubCourseSubject() {
		// return numberSubCourseSubject;
		if (subCourseSubjects != null) {
			return subCourseSubjects.size();
		}
		return 0;
	}

	// public void setNumberSubCourseSubject(int numberSubCourseSubject) {
	// this.numberSubCourseSubject = numberSubCourseSubject;
	// }

	public Boolean getIsUsingConfig() {
		return isUsingConfig;
	}

	public void setIsUsingConfig(Boolean isUsingConfig) {
		this.isUsingConfig = isUsingConfig;
	}

	public List<CourseSubjectConfigDto> getCourseSubjectConfigs() {
		return courseSubjectConfigs;
	}

	public void setCourseSubjectConfigs(List<CourseSubjectConfigDto> courseSubjectConfigs) {
		this.courseSubjectConfigs = courseSubjectConfigs;
	}

	public List<CourseSubjectDto> getChildren() {
		return children;
	}

	public void setChildren(List<CourseSubjectDto> children) {
		this.children = children;
	}

	public Boolean getExpanded() {
		return expanded;
	}

	public void setExpanded(Boolean expanded) {
		this.expanded = expanded;
	}

	public Boolean getIsGrantAll() {
		return isGrantAll;
	}

	public void setIsGrantAll(Boolean isGrantAll) {
		this.isGrantAll = isGrantAll;
	}

	public Boolean getIsDeniedAll() {
		return isDeniedAll;
	}

	public void setIsDeniedAll(Boolean isDeniedAll) {
		this.isDeniedAll = isDeniedAll;
	}

	public Boolean getIsOvelapTime() {
		return isOvelapTime;
	}

	public void setIsOvelapTime(Boolean isOvelapTime) {
		this.isOvelapTime = isOvelapTime;
	}

	public Long getCourseYearId() {
		return courseYearId;
	}

	public void setCourseYearId(Long courseYearId) {
		this.courseYearId = courseYearId;
	}

	public String getCourseYearCode() {
		return courseYearCode;
	}

	public void setCourseYearCode(String courseYearCode) {
		this.courseYearCode = courseYearCode;
	}

	public String getCourseYearName() {
		return courseYearName;
	}

	public void setCourseYearName(String courseYearName) {
		this.courseYearName = courseYearName;
	}

	public List<String> getOverLapClasses() {
		return overLapClasses;
	}

	public void setOverLapClasses(List<String> overLapClasses) {
		this.overLapClasses = overLapClasses;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

//	public EnrollmentClassDto getEnrollmentClassDto() {
//		return enrollmentClassDto;
//	}
//
//	public void setEnrollmentClassDto(EnrollmentClassDto enrollmentClassDto) {
//		this.enrollmentClassDto = enrollmentClassDto;
//	}

	public int getNumberOfCredit() {
		return numberOfCredit;
	}

	public void setNumberOfCredit(int numberOfCredit) {
		this.numberOfCredit = numberOfCredit;
	}

	public boolean isCheck() {
		return isCheck;
	}

	public void setCheck(boolean isCheck) {
		this.isCheck = isCheck;
	}

	public Long getEnrollmentClassId() {
		return enrollmentClassId;
	}

	public void setEnrollmentClassId(Long enrollmentClassId) {
		this.enrollmentClassId = enrollmentClassId;
	}

	public String getEnrollmentClassCode() {
		return enrollmentClassCode;
	}

	public void setEnrollmentClassCode(String enrollmentClassCode) {
		this.enrollmentClassCode = enrollmentClassCode;
	}

	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}

	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
	}

	public Double getNumberHours() {
		return numberHours;
	}

	public void setNumberHours(Double numberHours) {
		this.numberHours = numberHours;
	}

	public StaffDto getTeacher() {
		return teacher;
	}

	public void setTeacher(StaffDto teacher) {
		this.teacher = teacher;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
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

	public Boolean getIsFeeByCourseSubject() {
		return isFeeByCourseSubject;
	}

	public void setIsFeeByCourseSubject(Boolean isFeeByCourseSubject) {
		this.isFeeByCourseSubject = isFeeByCourseSubject;
	}

	public Double getFeePerCredit() {
		return feePerCredit;
	}

	public void setFeePerCredit(Double feePerCredit) {
		this.feePerCredit = feePerCredit;
	}

	public Double getTuitionCoefficient() {
		return tuitionCoefficient;
	}

	public void setTuitionCoefficient(Double tuitionCoefficient) {
		this.tuitionCoefficient = tuitionCoefficient;
	}

	public Double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}

	public Double getFeePerStudent() {
		return feePerStudent;
	}

	public void setFeePerStudent(Double feePerStudent) {
		this.feePerStudent = feePerStudent;
	}

	public Integer getLearningMethod() {
		return learningMethod;
	}

	public void setLearningMethod(Integer learningMethod) {
		this.learningMethod = learningMethod;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<SubjectExamDto> getSubjectExams() {
		return subjectExams;
	}

	public void setSubjectExams(List<SubjectExamDto> subjectExams) {
		this.subjectExams = subjectExams;
	}

	public Long getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}

	public String getSemesterCode() {
		return semesterCode;
	}

	public void setSemesterCode(String semesterCode) {
		this.semesterCode = semesterCode;
	}

	public Long getPeriodId() {
		return periodId;
	}

	public void setPeriodId(Long periodId) {
		this.periodId = periodId;
	}

	public String getPeriodName() {
		return periodName;
	}

	public void setPeriodName(String periodCode) {
		this.periodName = periodCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDateTime getActionTime() {
		return actionTime;
	}

	public void setActionTime(LocalDateTime actionTime) {
		this.actionTime = actionTime;
	}

	public CourseSubjectDto() {

	}
}
