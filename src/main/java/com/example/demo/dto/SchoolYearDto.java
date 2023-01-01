package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.globits.education.domain.SchoolYear;
import com.globits.education.domain.Semester;
import com.globits.education.domain.SemesterRegisterPeriod;

public class SchoolYearDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String code;
	private Integer year;
	private Boolean current;
	private Date startDate;
	private Date endDate;
	
	//dùng để hiển thị cây
	private List<SchoolYearDto> children; 
	private String displayName;
	private Long semesterId;
	private int isSemester;
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

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Boolean getCurrent() {
		return current;
	}

	public void setCurrent(Boolean current) {
		this.current = current;
	}

	private Set<SemesterDto> semesters;

	public Set<SemesterDto> getSemesters() {
		return semesters;
	}

	public void setSemesters(Set<SemesterDto> semesters) {
		this.semesters = semesters;
	}

	public List<SchoolYearDto> getChildren() {
		return children;
	}

	public void setChildren(List<SchoolYearDto> children) {
		this.children = children;
	}

	public Long getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}

	public int getIsSemester() {
		return isSemester;
	}

	public void setIsSemester(int isSemester) {
		this.isSemester = isSemester;
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

	public SchoolYearDto() {

	}

	public SchoolYearDto(SchoolYear sy) {
		if(sy!=null) {
			this.year = sy.getYear();
			this.code = sy.getCode();
			this.name = sy.getName();
			this.displayName = sy.getName();
			this.id = sy.getId();
			this.current= sy.getIsCurrent();
			this.isSemester = 0;
			this.startDate = sy.getStartDate();
			this.endDate = sy.getEndDate();
			if(sy.getSemesters()!=null && sy.getSemesters().size()>0) {
				this.semesters = new HashSet<SemesterDto>();
				for(Semester s: sy.getSemesters()) {
					SemesterDto sDto = new SemesterDto();
					sDto.setId(s.getId());
					sDto.setStartDate(s.getStartDate());
					sDto.setEndDate(s.getEndDate());
					sDto.setIsCurrent(s.getIsCurrent());
					sDto.setDescription(s.getDescription());
					sDto.setSemesterCode(s.getSemesterCode());
					sDto.setSemesterName(s.getSemesterName());
					sDto.setYear(s.getYear());
					sDto.setBehaviorMarkEnd(s.getBehaviorMarkEnd());
					sDto.setBehaviorMarkStart(s.getBehaviorMarkStart());
					sDto.setTuitionFeePerCredit(s.getTuitionFeePerCredit());
					if(s.getParent()!=null) {
						SemesterDto parent = new SemesterDto();
						parent.setId(s.getParent().getId());
						parent.setDescription(s.getParent().getDescription());
						parent.setSemesterCode(s.getParent().getSemesterCode());
  						parent.setSemesterName(s.getParent().getSemesterName());
						sDto.setParent(parent);
					}
					if(s.getSemesterRegisterPeriods()!=null && s.getSemesterRegisterPeriods().size()>0) {
						sDto.setSemesterRegisterPeriods(new ArrayList<SemesterRegisterPeriodDto>());
						for (SemesterRegisterPeriod period : s.getSemesterRegisterPeriods()) {
							SemesterRegisterPeriodDto peDto = new SemesterRegisterPeriodDto(period,false);
							sDto.getSemesterRegisterPeriods().add(peDto);
						}
					}
					this.semesters.add(sDto);
				}
			}
			if(sy.getSemesters() != null && sy.getSemesters().size() > 0) {
				this.children = new ArrayList<SchoolYearDto>();
				for(Semester s: sy.getSemesters()) {
					SchoolYearDto sDto = new SchoolYearDto();
					sDto.setSemesterId(s.getId());
					sDto.setDisplayName(s.getSemesterName());
					sDto.setCode(s.getSemesterCode());
					sDto.setStartDate(s.getStartDate());
					sDto.setEndDate(s.getEndDate());
					sDto.setCurrent(s.getIsCurrent());
					sDto.setIsSemester(1);
					this.children.add(sDto);
				}
			}
		}
	}
	
}
