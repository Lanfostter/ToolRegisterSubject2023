package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.globits.core.dto.RoomDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.domain.ExamType;
import com.globits.education.domain.PrerequisiteSubject;
import com.globits.education.domain.SemesterSubject;
import com.globits.education.domain.SemesterSubjectExam;
import com.globits.education.domain.SemesterSubjectExamCourseSubject;
import com.globits.education.domain.SemesterSubjectExamDate;
import com.globits.education.domain.SemesterSubjectExamRoom;
import com.globits.education.domain.StudentSemesterSubjectExam;
import com.globits.education.domain.StudentSemesterSubjectExamRoom;
import com.globits.education.domain.Subject;
import com.globits.education.domain.TestBag;
import com.globits.education.domain.TrainingBaseSemesterSubject;
import com.globits.education.domain.TrainingBaseSemesterSubjectExam;

public class SemesterSubjectExamDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;//Tên tổng hợp: môn học,học kỳ,đợt học,khóa học
	private SemesterDto semester;
	private SubjectDto subject;
	private Integer numberRoom;
	private String description;
	private Integer numberEstimateStudent;// So luong sinh vien du kien
	private Integer numberStudent;// So luong sinh vien thuc te du thi
	private Integer numberTestBagStudent;
	private Integer duration;
	private Boolean autoGeneratedRoom;
	private Integer examRound;
	private List<SemesterSubjectExamRoomDto> listRoom;
	private List<TestBagDto> listTestBag;
	private List<StudentSemesterSubjectExamRoomDto> listStudent;
	private Integer courseSubjectCount;
	private CourseYearDto courseYearDto;
	private SemesterRegisterPeriodDto registerPeriod;
	private String registerPeriodName;
	private Set<TrainingBaseSemesterSubjectExamDto> trainingBaseSemesterSubjectExams;
	private String subjectName;//Tên môn học
	private String totalSubjectName;// Tên môn học -số tín chỉ- mã môn
	private String subjectCode;
	private ExamRegisterPeriodDto examPeriod;//đợt thi
	private String examPeriodName;
	private List<StudentSemesterSubjectExamDto> studentSemesterSubjectExams;
	private List<SemesterSubjectExamDateDto> examDates;
	private List<SemesterSubjectExamCourseSubjectDto> semesterSubjectExamCourseSubjects;
	private ExamTypeDto examType;	//Kiểu thi
	private SemesterSubjectDto semesterSubject;
	
	
	public SemesterSubjectDto getSemesterSubject() {
		return semesterSubject;
	}

	public void setSemesterSubject(SemesterSubjectDto semesterSubject) {
		this.semesterSubject = semesterSubject;
	}

	public ExamTypeDto getExamType() {
		return examType;
	}

	public void setExamType(ExamTypeDto examType) {
		this.examType = examType;
	}

	public List<StudentSemesterSubjectExamDto> getStudentSemesterSubjectExams() {
		return studentSemesterSubjectExams;
	}

	public void setStudentSemesterSubjectExams(List<StudentSemesterSubjectExamDto> studentSemesterSubjectExams) {
		this.studentSemesterSubjectExams = studentSemesterSubjectExams;
	}

	public List<SemesterSubjectExamDateDto> getExamDates() {
		return examDates;
	}

	public void setExamDates(List<SemesterSubjectExamDateDto> examDates) {
		this.examDates = examDates;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SemesterDto getSemester() {
		return semester;
	}

	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}

	public SubjectDto getSubject() {
		return subject;
	}

	public void setSubject(SubjectDto subject) {
		this.subject = subject;
	}

	public Integer getNumberRoom() {
		return numberRoom;
	}

	public void setNumberRoom(Integer numberRoom) {
		this.numberRoom = numberRoom;
	}

	public Boolean getAutoGeneratedRoom() {
		return autoGeneratedRoom;
	}

	public void setAutoGeneratedRoom(Boolean autoGeneratedRoom) {
		this.autoGeneratedRoom = autoGeneratedRoom;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getNumberEstimateStudent() {
		return numberEstimateStudent;
	}

	public void setNumberEstimateStudent(Integer numberEstimateStudent) {
		this.numberEstimateStudent = numberEstimateStudent;
	}

	public Integer getNumberStudent() {
		return numberStudent;
	}

	public void setNumberStudent(Integer numberStudent) {
		this.numberStudent = numberStudent;
	}

	public List<SemesterSubjectExamRoomDto> getListRoom() {
		return listRoom;
	}

	public void setListRoom(List<SemesterSubjectExamRoomDto> listRoom) {
		this.listRoom = listRoom;
	}

	public Integer getExamRound() {
		return examRound;
	}

	public void setExamRound(Integer examRound) {
		this.examRound = examRound;
	}	
	
	public List<TestBagDto> getListTestBag() {
		return listTestBag;
	}

	public void setListTestBag(List<TestBagDto> listTestBag) {
		this.listTestBag = listTestBag;
	}

	public Integer getNumberTestBagStudent() {
		return numberTestBagStudent;
	}

	public void setNumberTestBagStudent(Integer numberTestBagStudent) {
		this.numberTestBagStudent = numberTestBagStudent;
	}

	public List<StudentSemesterSubjectExamRoomDto> getListStudent() {
		return listStudent;
	}

	public void setListStudent(List<StudentSemesterSubjectExamRoomDto> listStudent) {
		this.listStudent = listStudent;
	}

	public SemesterSubjectExamDto() {

	}
	public Integer getCourseSubjectCount() {
		return courseSubjectCount;
	}

	public void setCourseSubjectCount(Integer courseSubjectCount) {
		this.courseSubjectCount = courseSubjectCount;
	}
	
	public CourseYearDto getCourseYearDto() {
		return courseYearDto;
	}

	public void setCourseYearDto(CourseYearDto courseYearDto) {
		this.courseYearDto = courseYearDto;
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
	
	public Set<TrainingBaseSemesterSubjectExamDto> getTrainingBaseSemesterSubjectExams() {
		return trainingBaseSemesterSubjectExams;
	}

	public void setTrainingBaseSemesterSubjectExams(
			Set<TrainingBaseSemesterSubjectExamDto> trainingBaseSemesterSubjectExams) {
		this.trainingBaseSemesterSubjectExams = trainingBaseSemesterSubjectExams;
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
	

	public String getTotalSubjectName() {
		return totalSubjectName;
	}

	public void setTotalSubjectName(String totalSubjectName) {
		this.totalSubjectName = totalSubjectName;
	}
	
	public ExamRegisterPeriodDto getExamPeriod() {
		return examPeriod;
	}

	public void setExamPeriod(ExamRegisterPeriodDto examPeriod) {
		this.examPeriod = examPeriod;
	}
	
	public String getExamPeriodName() {
		return examPeriodName;
	}

	public void setExamPeriodName(String examPeriodName) {
		this.examPeriodName = examPeriodName;
	}

	public List<SemesterSubjectExamCourseSubjectDto> getSemesterSubjectExamCourseSubjects() {
		return semesterSubjectExamCourseSubjects;
	}

	public void setSemesterSubjectExamCourseSubjects(
			List<SemesterSubjectExamCourseSubjectDto> semesterSubjectExamCourseSubjects) {
		this.semesterSubjectExamCourseSubjects = semesterSubjectExamCourseSubjects;
	}
	
}
