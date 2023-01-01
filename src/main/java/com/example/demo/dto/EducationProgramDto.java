package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import com.globits.education.domain.EducationProgram;
import com.globits.education.domain.GroupSubjectProgram;
import com.globits.education.domain.ProgramSubject;
import com.globits.education.domain.Speciality;

public class EducationProgramDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private EducationTypeDto educationType;

	private EducationLevelDto educationLevel;

	private String name;

	private String code;
	private SpecialityDto speciality;

	private CourseYearDto courseYear;

	private List<ProgramSubjectDto> subjects;
	private Integer pageIndex;
	private Integer totalSubject;
	private List<GroupSubjectProgramDto> groups;
	
	private EducationProgramDto inheritEducationProgram;
	
	private CourseYearDto inheritCourseYear;
	
	/*
	 * Loại chương trình: Tạm thời sử dụng trường đơn, xem xét tạo bảng loại chương trình riêng
	 * 0 || null = chương trình thường
	 * 1 = chương trình tiên tiến
	 * 
	 * Giá trị : Const.EducationProgramTypeEnu
	 */	
	private Integer type;
	
	public EducationTypeDto getEducationType() {
		return educationType;
	}

	public void setEducationType(EducationTypeDto educationType) {
		this.educationType = educationType;
	}

	public EducationLevelDto getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(EducationLevelDto educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public SpecialityDto getSpeciality() {
		return speciality;
	}

	public void setSpeciality(SpecialityDto speciality) {
		this.speciality = speciality;
	}

	public CourseYearDto getCourseYear() {
		return courseYear;
	}

	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
	}

	public List<ProgramSubjectDto> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<ProgramSubjectDto> subjects) {
		this.subjects = subjects;
	}

	public Integer getTotalSubject() {
		return totalSubject;
	}

	public void setTotalSubject(Integer totalSubject) {
		this.totalSubject = totalSubject;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<GroupSubjectProgramDto> getGroups() {
		return groups;
	}

	public void setGroups(List<GroupSubjectProgramDto> groups) {
		this.groups = groups;
	}
	
	public EducationProgramDto getInheritEducationProgram() {
		return inheritEducationProgram;
	}

	public void setInheritEducationProgram(EducationProgramDto inheritEducationProgram) {
		this.inheritEducationProgram = inheritEducationProgram;
	}

	public CourseYearDto getInheritCourseYear() {
		return inheritCourseYear;
	}

	public void setInheritCourseYear(CourseYearDto inheritCourseYear) {
		this.inheritCourseYear = inheritCourseYear;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public EducationProgramDto() {

	}

	public EducationProgramDto(EducationProgram ep) {
		this.id = ep.getId();
		this.code = ep.getCode();
		this.name = ep.getName();
		if (ep.getCourseYear() != null) {
			this.courseYear = new CourseYearDto(ep.getCourseYear());
		}
		if (ep.getSpeciality() != null) {
			this.speciality = new SpecialityDto();
			this.speciality.setId(ep.getSpeciality().getId());
			this.speciality.setCode(ep.getSpeciality().getCode());
			this.speciality.setName(ep.getSpeciality().getName());

		}
		if (ep.getSubjects() != null && ep.getSubjects().size() > 0) {
			this.subjects = new ArrayList<ProgramSubjectDto>();
			for (ProgramSubject ps : ep.getSubjects()) {
				ProgramSubjectDto psDto= new ProgramSubjectDto();
				psDto.setMark(ps.getMark());
				psDto.setSemester(ps.getSemester());
				psDto.setId(ps.getId());
				if(ps.getSubject()!=null) {
					SubjectDto subjectDto = new SubjectDto();
					subjectDto.setId(ps.getSubject().getId());
					subjectDto.setSubjectCode(ps.getSubject().getSubjectCode());
					subjectDto.setSubjectName(ps.getSubject().getSubjectName());
					psDto.setSubject(subjectDto);
				}
				this.subjects.add(psDto);
			}
		}
		if(ep.getGroups()!=null && ep.getGroups().size()>0) {
			this.setGroups(new ArrayList<GroupSubjectProgramDto>());
			for(GroupSubjectProgram gr:ep.getGroups()) {
				GroupSubjectProgramDto grDto = new GroupSubjectProgramDto();
				grDto.setId(gr.getId());
				grDto.setCode(gr.getCode());
				grDto.setMinNumberCredit(gr.getMinNumberCredit());
				this.getGroups().add(grDto);
			}
		}
		this.totalSubject = ep.getTotalSubject();
		this.type = ep.getType();
	}
	
	public EducationProgramDto(EducationProgram ep,Boolean isSimple) {
		this.id = ep.getId();
		this.code = ep.getCode();
		this.name = ep.getName();
		if(!isSimple) {
			if (ep.getCourseYear() != null) {
				this.courseYear = new CourseYearDto(ep.getCourseYear());
			}
			if (ep.getSpeciality() != null) {
				this.speciality = new SpecialityDto();
				this.speciality.setId(ep.getSpeciality().getId());
				this.speciality.setCode(ep.getSpeciality().getCode());
				this.speciality.setName(ep.getSpeciality().getName());

			}
			if (ep.getSubjects() != null && ep.getSubjects().size() > 0) {
				this.subjects = new ArrayList<ProgramSubjectDto>();
				for (ProgramSubject ps : ep.getSubjects()) {
					ProgramSubjectDto psDto= new ProgramSubjectDto();
					psDto.setMark(ps.getMark());
					psDto.setSemester(ps.getSemester());
					psDto.setId(ps.getId());
					if(ps.getSubject()!=null) {
						SubjectDto subjectDto = new SubjectDto();
						subjectDto.setId(ps.getSubject().getId());
						subjectDto.setSubjectCode(ps.getSubject().getSubjectCode());
						subjectDto.setSubjectName(ps.getSubject().getSubjectName());
						psDto.setSubject(subjectDto);
					}
					this.subjects.add(psDto);
				}
			}
			if(ep.getGroups()!=null && ep.getGroups().size()>0) {
				this.setGroups(new ArrayList<GroupSubjectProgramDto>());
				for(GroupSubjectProgram gr:ep.getGroups()) {
					GroupSubjectProgramDto grDto = new GroupSubjectProgramDto();
					grDto.setId(gr.getId());
					grDto.setCode(gr.getCode());
					grDto.setMinNumberCredit(gr.getMinNumberCredit());
					this.getGroups().add(grDto);
				}
			}
		}		
		this.totalSubject = ep.getTotalSubject();
		this.type = ep.getType();
	}
	
	public EducationProgramDto(Long epId,String epCode, String epName) {
		this.id = epId;
		this.code = epCode;
		this.name = epName;
	}

	public EducationProgramDto(Long epId,String epCode, String epName, Speciality speciality) {
		this.id = epId;
		this.code = epCode;
		this.name = epName;
		if(speciality != null) {
			this.speciality = new SpecialityDto();
			this.speciality.setId(speciality.getId());
			this.speciality.setCode(speciality.getCode());
			this.speciality.setName(speciality.getName());
		}
	}
	public EducationProgramDto(Long epId,String epCode, String epName, Long specialityId,String specialityCode, String specialityName) {
		this.id = epId;
		this.code = epCode;
		this.name = epName;
//		if(speciality != null) {
			this.speciality = new SpecialityDto();
			this.speciality.setId(specialityId);
			this.speciality.setCode(specialityCode);
			this.speciality.setName(specialityName);
//		}
	}
}
