package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;

import com.globits.core.dto.DepartmentDto;
import com.globits.core.dto.RoomDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.CourseSubjectTimetable;
import com.globits.education.domain.LearningSkill;
import com.globits.education.domain.PrerequisiteSubject;
import com.globits.education.domain.SemesterRegisterPeriod;
import com.globits.education.domain.SemesterSubject;
import com.globits.education.domain.SemesterSubjectLearningSkill;
import com.globits.education.domain.Subject;
import com.globits.education.domain.SubjectExam;
import com.globits.education.domain.TrainingBaseSemesterSubject;
import com.globits.education.utils.EducationConstant;
import com.globits.hr.dto.StaffDto;

public class SemesterSubjectDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private SemesterDto semester;
	private SemesterDto subSemester;
	private SubjectDto subject;
	private int numberCourse; // Số lượng lớp dự kiến mở
	private double tuitionFeeCoefficient;// Hệ số học phí
	private double tuitionFee;// Mức học phí cơ bản cho môn học
	private double remunerationCoefficient;// Hệ số thù lao
	private double remunerationFee;// Mức thù lao cơ bản
	private List<CourseSubjectDto> courseSubjects;
	private Set<TrainingBaseSemesterSubjectDto> trainingBaseSemesterSubjects;
	private String semesterName;
	private String subjectName;
	private String totalSubjectName;// Tên môn học -số tín chỉ- mã môn
	private Integer numberCurrentCourseSubject=0;
	private Boolean generateCourseSubject;
	
	private Integer maxNumberStudentPerParentCourse;//Số lượng sinh viên tối đa sinh viên trong 1 lớp cha
	private Integer minNumberStudentPerParentCourse;//Số lượng sinh viên tối thiểu sinh viên trong 1 lớp cha
	
	private Integer maxNumberStudentPerChildCourse;//Số lượng sinh viên tối đa sinh viên trong 1 lớp con
	private Integer minNumberStudentPerChildCourse;//Số lượng sinh viên tối thiểu sinh viên trong 1 lớp con
	
	private Integer defaultParentCourseType=0;//Loại lớp cha
	private Integer defaultChildCourseType=1;//Loại lớp con
	private Integer numberChildCourse=0;//Số lượng lớp con trong 1 lớp cha
	private Set<SubjectExamDto> subjectExams;
	private CourseYearDto courseYearDto;
	private LearningSkillDto mainLearningSkill;
	
	private List<SemesterSubjectLearningSkillDto> learningSkills;
	
	private Double numberMainSkillHours;//Số giờ của lớp chính
	
	private Double totalNumberHours;//Tổng số giờ
	
	private Boolean isFeeBySubject;
	
	private Boolean useByCourseYear;
	
	private int retCode=1;
	private Long semesterId;
	private Long subjectId;

	private SemesterRegisterPeriodDto registerPeriod;
	private String registerPeriodName;
	
	private Long courseYearId;
	private Long registerPeriodId;

	private Boolean isUsingLearningSkill = false;
	private String name;
	private String formular;//công thức tính điểm
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public SemesterDto getSubSemester() {
		return subSemester;
	}

	public void setSubSemester(SemesterDto subSemester) {
		this.subSemester = subSemester;
	}

	public SubjectDto getSubject() {
		return subject;
	}

	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}

	public LearningSkillDto getMainLearningSkill() {
		return mainLearningSkill;
	}

	public void setMainLearningSkill(LearningSkillDto mainLearningSkill) {
		this.mainLearningSkill = mainLearningSkill;
	}

	public Double getNumberMainSkillHours() {
		return numberMainSkillHours;
	}

	public void setNumberMainSkillHours(Double numberMainSkillHours) {
		this.numberMainSkillHours = numberMainSkillHours;
	}

	public Double getTotalNumberHours() {
		return totalNumberHours;
	}

	public void setTotalNumberHours(Double totalNumberHours) {
		this.totalNumberHours = totalNumberHours;
	}

	public int getNumberCourse() {
		return numberCourse;
	}

	public void setNumberCourse(int numberCourse) {
		this.numberCourse = numberCourse;
	}

	public double getTuitionFeeCoefficient() {
		return tuitionFeeCoefficient;
	}

	public void setTuitionFeeCoefficient(double tuitionFeeCoefficient) {
		this.tuitionFeeCoefficient = tuitionFeeCoefficient;
	}

	public double getTuitionFee() {
		return tuitionFee;
	}

	public void setTuitionFee(double tuitionFee) {
		this.tuitionFee = tuitionFee;
	}

	public double getRemunerationCoefficient() {
		return remunerationCoefficient;
	}

	public void setRemunerationCoefficient(double remunerationCoefficient) {
		this.remunerationCoefficient = remunerationCoefficient;
	}

	public double getRemunerationFee() {
		return remunerationFee;
	}

	public void setRemunerationFee(double remunerationFee) {
		this.remunerationFee = remunerationFee;
	}	
	
	public Boolean getIsFeeBySubject() {
		return isFeeBySubject;
	}

	public void setIsFeeBySubject(Boolean isFeeBySubject) {
		this.isFeeBySubject = isFeeBySubject;
	}

	public List<CourseSubjectDto> getCourseSubjects() {
		return courseSubjects;
	}

	public void setCourseSubjects(List<CourseSubjectDto> courseSubjects) {
		this.courseSubjects = courseSubjects;
	}

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getRetCode() {
		return retCode;
	}

	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}
	

	public Long getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Set<TrainingBaseSemesterSubjectDto> getTrainingBaseSemesterSubjects() {
		return trainingBaseSemesterSubjects;
	}

	public void setTrainingBaseSemesterSubjects(Set<TrainingBaseSemesterSubjectDto> trainingBaseSemesterSubjects) {
		this.trainingBaseSemesterSubjects = trainingBaseSemesterSubjects;
	}

	public List<SemesterSubjectLearningSkillDto> getLearningSkills() {
		return learningSkills;
	}

	public void setLearningSkills(List<SemesterSubjectLearningSkillDto> learningSkills) {
		this.learningSkills = learningSkills;
	}

	public Boolean getGenerateCourseSubject() {
		return generateCourseSubject;
	}

	public Integer getMaxNumberStudentPerParentCourse() {
		return maxNumberStudentPerParentCourse;
	}

	public void setMaxNumberStudentPerParentCourse(Integer maxNumberStudentPerParentCourse) {
		this.maxNumberStudentPerParentCourse = maxNumberStudentPerParentCourse;
	}

	public Integer getMinNumberStudentPerParentCourse() {
		return minNumberStudentPerParentCourse;
	}

	public void setMinNumberStudentPerParentCourse(Integer minNumberStudentPerParentCourse) {
		this.minNumberStudentPerParentCourse = minNumberStudentPerParentCourse;
	}

	public Integer getMaxNumberStudentPerChildCourse() {
		return maxNumberStudentPerChildCourse;
	}

	public void setMaxNumberStudentPerChildCourse(Integer maxNumberStudentPerChildCourse) {
		this.maxNumberStudentPerChildCourse = maxNumberStudentPerChildCourse;
	}

	public Integer getMinNumberStudentPerChildCourse() {
		return minNumberStudentPerChildCourse;
	}

	public void setMinNumberStudentPerChildCourse(Integer minNumberStudentPerChildCourse) {
		this.minNumberStudentPerChildCourse = minNumberStudentPerChildCourse;
	}

	public Integer getDefaultParentCourseType() {
		return defaultParentCourseType;
	}

	public void setDefaultParentCourseType(Integer defaultParentCourseType) {
		this.defaultParentCourseType = defaultParentCourseType;
	}

	public Integer getDefaultChildCourseType() {
		return defaultChildCourseType;
	}

	public void setDefaultChildCourseType(Integer defaultChildCourseType) {
		this.defaultChildCourseType = defaultChildCourseType;
	}

	public Integer getNumberChildCourse() {
		return numberChildCourse;
	}

	public void setNumberChildCourse(Integer numberChildCourse) {
		this.numberChildCourse = numberChildCourse;
	}

	public void setGenerateCourseSubject(Boolean generateCourseSubject) {
		this.generateCourseSubject = generateCourseSubject;
	}

	public Integer getNumberCurrentCourseSubject() {
		return numberCurrentCourseSubject;
	}

	public void setNumberCurrentCourseSubject(Integer numberCurrentCourseSubject) {
		this.numberCurrentCourseSubject = numberCurrentCourseSubject;
	}

	public Set<SubjectExamDto> getSubjectExams() {
		return subjectExams;
	}

	public void setSubjectExams(Set<SubjectExamDto> subjectExams) {
		this.subjectExams = subjectExams;
	}
	
	public CourseYearDto getCourseYearDto() {
		return courseYearDto;
	}

	public void setCourseYearDto(CourseYearDto courseYearDto) {
		this.courseYearDto = courseYearDto;
	}

	public Boolean getUseByCourseYear() {
		return useByCourseYear;
	}

	public void setUseByCourseYear(Boolean useByCourseYear) {
		this.useByCourseYear = useByCourseYear;
	}
	

	public Long getCourseYearId() {
		return courseYearId;
	}

	public void setCourseYearId(Long courseYearId) {
		this.courseYearId = courseYearId;
	}

	public SemesterRegisterPeriodDto getRegisterPeriod() {
		return registerPeriod;
	}

	public void setRegisterPeriod(SemesterRegisterPeriodDto registerPeriod) {
		this.registerPeriod = registerPeriod;
	}

	public String getRegisterPeriodName() {
		return registerPeriodName;
	}

	public void setRegisterPeriodName(String registerPeriodName) {
		this.registerPeriodName = registerPeriodName;
	}

	public Boolean getIsUsingLearningSkill() {
		return isUsingLearningSkill;
	}

	public void setIsUsingLearningSkill(Boolean isUsingLearningSkill) {
		this.isUsingLearningSkill = isUsingLearningSkill;
	}
	

	public Long getRegisterPeriodId() {
		return registerPeriodId;
	}

	public void setRegisterPeriodId(Long registerPeriodId) {
		this.registerPeriodId = registerPeriodId;
	}

	public String getTotalSubjectName() {
		return totalSubjectName;
	}

	public void setTotalSubjectName(String totalSubjectName) {
		this.totalSubjectName = totalSubjectName;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getFormular() {
		return formular;
	}

	public void setFormular(String formular) {
		this.formular = formular;
	}

	public SemesterSubjectDto() {

	}
}
