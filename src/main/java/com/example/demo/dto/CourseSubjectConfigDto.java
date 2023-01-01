package com.example.demo.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.globits.core.domain.Department;
import com.globits.core.dto.BaseObjectDto;
import com.globits.core.dto.DepartmentDto;
import com.globits.education.domain.CourseSubject;
import com.globits.education.domain.CourseSubjectConfig;
import com.globits.education.domain.CourseYear;
import com.globits.education.domain.EducationProgram;
import com.globits.education.domain.EnrollmentClass;
import com.globits.education.domain.Speciality;
import com.globits.education.utils.EducationConstant;

public class CourseSubjectConfigDto extends BaseObjectDto{
	private Long id;
	private CourseSubjectDto courseSubject;
	private CourseYearDto courseYear;
	
	private Integer configType;	//Có thể chuyển thành enum hoặc gì đó (có những loại đặc biệt như : Cho phép tất cả, cấm tất cả,...)
	
	private DepartmentDto department;//Cho phép sinh viên của khoa nào được đăng ký học
	
	private EducationProgramDto program;
	
	private EnrollmentClassDto enrollmentClass;
	
	private SpecialityDto speciality;
	
	private Boolean isGrant=false;
	
	private Boolean isDenied=true;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public CourseSubjectDto getCourseSubject() {
		return courseSubject;
	}
	public void setCourseSubject(CourseSubjectDto courseSubject) {
		this.courseSubject = courseSubject;
	}
	public CourseYearDto getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(CourseYearDto courseYear) {
		this.courseYear = courseYear;
	}
	public Integer getConfigType() {
		return configType;
	}
	public void setConfigType(Integer configType) {
		this.configType = configType;
	}
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	public EducationProgramDto getProgram() {
		return program;
	}
	public void setProgram(EducationProgramDto program) {
		this.program = program;
	}
	public EnrollmentClassDto getEnrollmentClass() {
		return enrollmentClass;
	}
	public void setEnrollmentClass(EnrollmentClassDto enrollmentClass) {
		this.enrollmentClass = enrollmentClass;
	}
	public SpecialityDto getSpeciality() {
		return speciality;
	}
	public void setSpeciality(SpecialityDto speciality) {
		this.speciality = speciality;
	}
	public Boolean getIsGrant() {
		return isGrant;
	}
	public void setIsGrant(Boolean isGrant) {
		this.isGrant = isGrant;
	}
	public Boolean getIsDenied() {
		return isDenied;
	}
	public void setIsDenied(Boolean isDenied) {
		this.isDenied = isDenied;
	}
	public CourseSubjectConfigDto() {
		
	}
	public CourseSubjectConfigDto(CourseSubjectConfig csc) {
		super();
		if(csc!=null) {
			this.id = csc.getId();
			if(csc.getCourseSubject()!=null) {
				this.courseSubject = new CourseSubjectDto();
				this.courseSubject.setCode(csc.getCourseSubject().getCode());
				if(EducationConstant.courseSubjectsSize.get(csc.getId())!=null) {
					this.courseSubject.setNumberStudent(EducationConstant.courseSubjectsSize.get(csc.getCourseSubject().getId()));
				}
				else {
					this.courseSubject.setNumberStudent(csc.getCourseSubject().getNumberStudent());
				}				
				this.courseSubject.setIsUsingConfig(csc.getCourseSubject().getIsUsingConfig());
				this.courseSubject.setId(csc.getCourseSubject().getId());
			}
			if(csc.getCourseYear()!=null) {
				this.courseYear = new CourseYearDto();
				this.courseYear.setCode(csc.getCourseYear().getCode());
				this.courseYear.setId(csc.getCourseYear().getId());
				this.courseYear.setName(csc.getCourseYear().getName());
				this.courseYear.setYear(csc.getCourseYear().getYear());
			}
			this.setConfigType(csc.getConfigType());
			if(csc.getCourseSubject()!=null) {
				this.courseSubject = new CourseSubjectDto();
				this.courseSubject.setId(csc.getCourseSubject().getId());
				this.courseSubject.setCode(csc.getCourseSubject().getCode());
				this.courseSubject.setCourseSubjectType(csc.getCourseSubject().getCourseSubjectType());
				this.courseSubject.setIsSelected(csc.getCourseSubject().getIsSelected());				
			}
			if(csc.getDepartment()!=null) {
				this.setDepartment(new DepartmentDto(csc.getDepartment(),true));
			}
			if(csc.getEnrollmentClass()!=null) {
				this.setEnrollmentClass(new EnrollmentClassDto(csc.getEnrollmentClass(),true));
			}
			this.setIsDenied(csc.getIsDenied());
			this.setIsGrant(csc.getIsGrant());
			if(csc.getProgram()!=null) {
				this.setProgram(new EducationProgramDto(csc.getProgram(),true));
			}
		}
	}
	
	public CourseSubjectConfigDto(CourseSubjectConfig csc,int level) {
		super();
		if(csc!=null) {
			this.id = csc.getId();
			if(csc.getCourseSubject()!=null) {
				this.courseSubject = new CourseSubjectDto();
				this.courseSubject.setCode(csc.getCourseSubject().getCode());
				if(EducationConstant.courseSubjectsSize.get(csc.getId())!=null) {
					this.courseSubject.setNumberStudent(EducationConstant.courseSubjectsSize.get(csc.getCourseSubject().getId()));
				}
				else {
					this.courseSubject.setNumberStudent(csc.getCourseSubject().getNumberStudent());
				}
				
				this.courseSubject.setIsUsingConfig(csc.getCourseSubject().getIsUsingConfig());
				this.courseSubject.setId(csc.getCourseSubject().getId());
			}
			if(csc.getCourseYear()!=null) {
				this.courseYear = new CourseYearDto();
				this.courseYear.setCode(csc.getCourseYear().getCode());
				this.courseYear.setId(csc.getCourseYear().getId());
				this.courseYear.setName(csc.getCourseYear().getName());
				this.courseYear.setYear(csc.getCourseYear().getYear());
			}
			this.setConfigType(csc.getConfigType());
			if(csc.getCourseSubject()!=null) {
				this.courseSubject = new CourseSubjectDto();
				this.courseSubject.setId(csc.getCourseSubject().getId());
				this.courseSubject.setCode(csc.getCourseSubject().getCode());
				this.courseSubject.setCourseSubjectType(csc.getCourseSubject().getCourseSubjectType());
				this.courseSubject.setIsSelected(csc.getCourseSubject().getIsSelected());				
			}
			if(csc.getDepartment()!=null) {
				this.setDepartment(new DepartmentDto());
				this.department.setId(csc.getDepartment().getId());
			}
			if(csc.getEnrollmentClass()!=null) {
				this.setEnrollmentClass(new EnrollmentClassDto());
				this.enrollmentClass.setId(csc.getEnrollmentClass().getId());
			}
			this.setIsDenied(csc.getIsDenied());
			this.setIsGrant(csc.getIsGrant());
			if(csc.getProgram()!=null) {
				this.setProgram(new EducationProgramDto());
				this.program.setId(csc.getProgram().getId());
			}			
		}
	}
	
	public CourseSubjectConfig toEntity() {
		CourseSubjectConfig csc = new CourseSubjectConfig();
		csc.setId(this.id);
		if(this.getCourseSubject()!=null) {
			csc.setCourseSubject(new CourseSubject());
			csc.getCourseSubject().setCode(this.getCourseSubject().getCode());
			csc.getCourseSubject().setNumberStudent(this.getCourseSubject().getNumberStudent());
			csc.getCourseSubject().setIsUsingConfig(this.getCourseSubject().getIsUsingConfig());
			csc.getCourseSubject().setId(csc.getCourseSubject().getId());
		}
		if(this.getCourseYear()!=null) {
			csc.setCourseYear(new CourseYear());
			csc.getCourseYear().setCode(csc.getCourseYear().getCode());
			csc.getCourseYear().setId(csc.getCourseYear().getId());
			csc.getCourseYear().setName(csc.getCourseYear().getName());
			csc.getCourseYear().setYear(csc.getCourseYear().getYear());
		}	
		return csc;
	}
}
