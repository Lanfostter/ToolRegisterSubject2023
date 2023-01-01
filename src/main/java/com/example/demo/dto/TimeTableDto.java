package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import com.globits.core.dto.RoomDto;
import com.globits.education.domain.CourseSubjectTimetable;
import com.globits.hr.dto.StaffDto;

public class TimeTableDto implements Serializable {

	private Long id;

	private Long CourseSubjectId;

	private static final long serialVersionUID = 1L;
	private CourseHourDto endHour;// Giờ kết thúc
	private CourseHourDto startHour;// Giờ bắt đầu
	private StaffDto teacher;
	private StaffDto assistantTeacher;
	private RoomDto room;

	private int weekIndex;// Thu trong tuan

	private Integer fromWeek;// Tuần bắt đầu

	private Integer toWeek;// Tuần kết thúc

	private String start;// Giờ bắt đầu

	private String end;// Giờ kết thúc

	private String teacherName;

	private String roomName;
	
	private String roomCode;
	
	private String staffCode;
	private String assistantStaffCode;
	
	private Integer courseHourseStartCode;
	
	private Integer courseHourseEndCode;

	private Double numberHours;//Số giờ học
	
	private Date startDate;
	
	private Date endDate;
	
	public Long getCourseSubjectId() {
		return CourseSubjectId;
	}

	public void setCourseSubjectId(Long courseSubjectId) {
		CourseSubjectId = courseSubjectId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public int getWeekIndex() {
		return weekIndex;
	}

	public void setWeekIndex(int weekIndex) {
		this.weekIndex = weekIndex;
	}

	public Integer getFromWeek() {
		return fromWeek;
	}

	public void setFromWeek(Integer fromWeek) {
		this.fromWeek = fromWeek;
	}

	public Integer getToWeek() {
		return toWeek;
	}

	public void setToWeek(Integer toWeek) {
		this.toWeek = toWeek;
	}

	public CourseHourDto getEndHour() {
		return endHour;
	}

	public void setEndHour(CourseHourDto endHour) {
		this.endHour = endHour;
	}

	public CourseHourDto getStartHour() {
		return startHour;
	}

	public void setStartHour(CourseHourDto startHour) {
		this.startHour = startHour;
	}

	public StaffDto getTeacher() {
		return teacher;
	}

	public void setTeacher(StaffDto teacher) {
		this.teacher = teacher;
	}

	public RoomDto getRoom() {
		return room;
	}

	public void setRoom(RoomDto room) {
		this.room = room;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public String getAssistantStaffCode() {
		return assistantStaffCode;
	}

	public void setAssistantStaffCode(String assistantStaffCode) {
		this.assistantStaffCode = assistantStaffCode;
	}

	public Integer getCourseHourseStartCode() {
		return courseHourseStartCode;
	}

	public void setCourseHourseStartCode(Integer courseHourseStartCode) {
		this.courseHourseStartCode = courseHourseStartCode;
	}

	public Integer getCourseHourseEndCode() {
		return courseHourseEndCode;
	}

	public void setCourseHourseEndCode(Integer courseHourseEndCode) {
		this.courseHourseEndCode = courseHourseEndCode;
	}
	
	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public StaffDto getAssistantTeacher() {
		return assistantTeacher;
	}

	public void setAssistantTeacher(StaffDto assistantTeacher) {
		this.assistantTeacher = assistantTeacher;
	}

	public Double getNumberHours() {
		return numberHours;
	}

	public void setNumberHours(Double numberHours) {
		this.numberHours = numberHours;
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

	public TimeTableDto() {

	}

	public TimeTableDto(CourseSubjectTimetable cst) {
		this.id = cst.getId();
		if (cst.getStart() != null) {
			this.startHour = new CourseHourDto(cst.getStart());
			this.start = cst.getStart().getName();
		}
		if (cst.getEnd() != null) {
			this.endHour = new CourseHourDto(cst.getEnd());
			this.end = cst.getEnd().getName();
		}
		if (cst.getTeacher() != null) {
			this.teacher = new StaffDto(cst.getTeacher());
			this.teacherName = cst.getTeacher().getDisplayName();
			this.staffCode = cst.getTeacher().getStaffCode();
		}
		if (cst.getAssistantTeacher() != null) {
			this.assistantTeacher = new StaffDto(cst.getAssistantTeacher());
//			this.teacherName = cst.getAssistantTeacher().getDisplayName();
//			this.staffCode = cst.getTeacher().getStaffCode();
		}
		if (cst.getRoom() != null) {
			this.room = new RoomDto(cst.getRoom());
			this.roomName = cst.getRoom().getName();
		}
		this.weekIndex = cst.getWeekIndex();
		this.fromWeek = cst.getFromWeek();
		this.toWeek = cst.getToWeek();
		this.startDate = cst.getStartDate();
		this.endDate = cst.getEndDate();
	}
}
