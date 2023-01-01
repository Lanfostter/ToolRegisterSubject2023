package com.example.demo.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globits.core.domain.Room;
import com.globits.core.dto.RoomDto;
import com.globits.core.dto.TrainingBaseDto;
import com.globits.education.Const;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.SemesterSubjectExamHour;
import com.globits.education.domain.SemesterSubjectExamRoom;
import com.globits.education.domain.Student;
import com.globits.education.domain.StudentCourseSubject;
import com.globits.education.domain.StudentSemesterSubjectExamRoom;
import com.globits.education.utils.EducationConstant;


public class SemesterSubjectExamRoomDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String roomCode;
	private CourseHourDto startHour;
	private CourseHourDto endHour;
	private SemesterSubjectExamHourDto subjectExamHour;
	private int duration;// Tính theo phút tính thời gian thi chính xác bao nhiêu phút.
	private Date examDate;
	private String examDateString;
	private Integer numberExpectedStudent;// So luong sinh vien du kien
	private Integer numberStudent;// So luong sinh vien thuc te du thi
	private Integer numberStudentAddToBag;
	private Boolean isAddedToTestBag;
	private String resultCode;// Trả về kết quả thành công hay thất bại, thuộc tính này không có trong Entity
							  // chỉ có trong model
	private Boolean isAddedFullToTestBag;
	private Boolean isAbleToCreateBag;
	private SemesterSubjectExamDto semesterSubjectExam;

	private List<StudentSemesterSubjectExamRoomDto> studentList;
	private String subjectName;
	private String semesterName;
	private String courseYearName;
	private String registerPeriodName;
	
	private ExamHourDto examHour;
	private TrainingBaseDto trainingBase;
	private ExamSkillDto examSkill;
	
	private RoomDto room;
	private Integer viewOrder;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public CourseHourDto getStartHour() {
		return startHour;
	}

	public void setStartHour(CourseHourDto startHour) {
		this.startHour = startHour;
	}

	public CourseHourDto getEndHour() {
		return endHour;
	}

	public void setEndHour(CourseHourDto endHour) {
		this.endHour = endHour;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Integer getNumberExpectedStudent() {
		return numberExpectedStudent;
	}

	public void setNumberExpectedStudent(Integer numberExpectedStudent) {
		this.numberExpectedStudent = numberExpectedStudent;
	}

	public Integer getNumberStudent() {
		return numberStudent;
	}

	public void setNumberStudent(Integer numberStudent) {
		this.numberStudent = numberStudent;
	}

	public SemesterSubjectExamDto getSemesterSubjectExam() {
		return semesterSubjectExam;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public void setSemesterSubjectExam(SemesterSubjectExamDto semesterSubjectExam) {
		this.semesterSubjectExam = semesterSubjectExam;
	}

	public List<StudentSemesterSubjectExamRoomDto> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentSemesterSubjectExamRoomDto> studentList) {
		this.studentList = studentList;
	}
	public RoomDto getRoom() {
		return room;
	}

	public void setRoom(RoomDto room) {
		this.room = room;
	}

	public Boolean getIsAddedToTestBag() {
		return isAddedToTestBag;
	}

	public void setIsAddedToTestBag(Boolean isAddedToTestBag) {
		this.isAddedToTestBag = isAddedToTestBag;
	}	
	
	public Boolean getIsAddedFullToTestBag() {
		return isAddedFullToTestBag;
	}

	public void setIsAddedFullToTestBag(Boolean isAddedFullToTestBag) {
		this.isAddedFullToTestBag = isAddedFullToTestBag;
	}

	public Boolean getIsAbleToCreateBag() {
		return isAbleToCreateBag;
	}

	public void setIsAbleToCreateBag(Boolean isAbleToCreateBag) {
		this.isAbleToCreateBag = isAbleToCreateBag;
	}

	public Integer getNumberStudentAddToBag() {
		return numberStudentAddToBag;
	}

	public void setNumberStudentAddToBag(Integer numberStudentAddToBag) {
		this.numberStudentAddToBag = numberStudentAddToBag;
	}
	

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public String getCourseYearName() {
		return courseYearName;
	}

	public void setCourseYearName(String courseYearName) {
		this.courseYearName = courseYearName;
	}
	
	public String getRegisterPeriodName() {
		return registerPeriodName;
	}

	public void setRegisterPeriodName(String registerPeriodName) {
		this.registerPeriodName = registerPeriodName;
	}	

	public ExamHourDto getExamHour() {
		return examHour;
	}

	public void setExamHour(ExamHourDto examHour) {
		this.examHour = examHour;
	}
	

	public TrainingBaseDto getTrainingBase() {
		return trainingBase;
	}

	public void setTrainingBase(TrainingBaseDto trainingBase) {
		this.trainingBase = trainingBase;
	}

	public ExamSkillDto getExamSkill() {
		return examSkill;
	}

	public void setExamSkill(ExamSkillDto examSkill) {
		this.examSkill = examSkill;
	}

	public SemesterSubjectExamHourDto getSubjectExamHour() {
		return subjectExamHour;
	}

	public void setSubjectExamHour(SemesterSubjectExamHourDto subjectExamHour) {
		this.subjectExamHour = subjectExamHour;
	}

	public Integer getViewOrder() {
		return viewOrder;
	}

	public void setViewOrder(Integer viewOrder) {
		this.viewOrder = viewOrder;
	}

}
