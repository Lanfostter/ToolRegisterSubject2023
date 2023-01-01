package com.example.demo.dto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import com.globits.core.dto.BaseObjectDto;
import com.globits.education.domain.ExamRegisterPeriod;
import com.globits.education.domain.SemesterRegisterPeriod;

public class SemesterRegisterPeriodDto extends BaseObjectDto {

	private static final long serialVersionUID = 1L;
	private SemesterDto semester;

	private String name;
	private Integer displayOrder;
	
	private Date startRegisterTime;
	private Date endRegisterTime;
	private Date endUnRegisterTime;
	
	private String startRegisterTimeString;
	private String endRegisterTimeString;
	private String endUnRegisterTimeString;
	
	private Boolean isLockRegister;//Khóa Đăng ký học
	private List<ExamRegisterPeriodDto> examPeriods;
	public SemesterDto getSemester() {
		return semester;
	}
	public void setSemester(SemesterDto semester) {
		this.semester = semester;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDisplayOrder() {
		return displayOrder;
	}
	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}
	public Date getStartRegisterTime() {
		return startRegisterTime;
	}
	public void setStartRegisterTime(Date startRegisterTime) {
		this.startRegisterTime = startRegisterTime;
	}
	public Date getEndRegisterTime() {
		return endRegisterTime;
	}
	public void setEndRegisterTime(Date endRegisterTime) {
		this.endRegisterTime = endRegisterTime;
	}
	public Date getEndUnRegisterTime() {
		return endUnRegisterTime;
	}
	public void setEndUnRegisterTime(Date endUnRegisterTime) {
		this.endUnRegisterTime = endUnRegisterTime;
	}
	
	public String getStartRegisterTimeString() {
		try {
			 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
			 startRegisterTimeString = formatter.format(this.startRegisterTime);
		} catch (Exception e) {
			// TODO: handle exception
		}	
		return startRegisterTimeString;
	}
	public String getEndRegisterTimeString() {
		try {
			 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
			 endRegisterTimeString = formatter.format(this.endRegisterTime);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return endRegisterTimeString;
	}
	public String getEndUnRegisterTimeString() {
		try {
			 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
			 endUnRegisterTimeString = formatter.format(this.endUnRegisterTime);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return endUnRegisterTimeString;
	}
	public Boolean getIsLockRegister() {
		return isLockRegister;
	}
	public void setIsLockRegister(Boolean isLockRegister) {
		this.isLockRegister = isLockRegister;
	}
	
	
	public List<ExamRegisterPeriodDto> getExamPeriods() {
		return examPeriods;
	}
	public void setExamPeriods(List<ExamRegisterPeriodDto> examPeriods) {
		this.examPeriods = examPeriods;
	}
	public SemesterRegisterPeriodDto() {
		
	}
	
	public SemesterRegisterPeriodDto(SemesterRegisterPeriod entity) {
		if(entity!=null) {
			this.setId(entity.getId());
			this.displayOrder = entity.getDisplayOrder();
			if(entity.getEndRegisterTime()!=null) {
				this.endRegisterTime= entity.getEndRegisterTime().toDate();
			}				
			if(entity.getStartRegisterTime()!=null) {
				this.startRegisterTime = entity.getStartRegisterTime().toDate();
			}
			if(entity.getEndUnRegisterTime()!=null) {
				this.endUnRegisterTime =entity.getEndUnRegisterTime().toDate();
			}				
			this.name = entity.getName();
			if(entity.getSemester()!=null) {
				this.semester = new SemesterDto();
				this.semester.setId(entity.getSemester().getId());	
				this.semester.setSemesterCode(entity.getSemester().getSemesterCode());
				this.semester.setSemesterName(entity.getSemester().getSemesterName());
				this.semester.setDescription(entity.getSemester().getDescription());
				this.semester.setStartDate(entity.getSemester().getStartDate());
				this.semester.setEndDate(entity.getSemester().getEndDate());
				this.semester.setStartRegisterDate(entity.getSemester().getStartRegisterDate());
				this.semester.setEndRegisterDate(entity.getSemester().getEndRegisterDate());
				if(entity.getSemester().getIsLockRegister()!=null) {
					this.semester.setIsLockRegister(entity.getSemester().getIsLockRegister());
				}
			}
			if(entity.getExamPeriods()!=null) {
				this.examPeriods = new ArrayList<ExamRegisterPeriodDto>();
				for(ExamRegisterPeriod examPeriod:entity.getExamPeriods()) {
					ExamRegisterPeriodDto examPeriodDto = new ExamRegisterPeriodDto();
					examPeriodDto.setId(examPeriod.getId());
					examPeriodDto.setCode(examPeriod.getCode());
					examPeriodDto.setFromDate(examPeriod.getFromDate());
					examPeriodDto.setToDate(examPeriod.getToDate());
					examPeriodDto.setStart(examPeriod.getStart());
					examPeriodDto.setEnd(examPeriod.getEnd());
				}
			}
			if(entity.getIsLockRegister()!=null) {
				this.isLockRegister=entity.getIsLockRegister();
			}
		}
	}	
	public SemesterRegisterPeriodDto(SemesterRegisterPeriod entity, Boolean isGetFull) {
		if(entity!=null) {
			if(isGetFull) {
				this.setId(entity.getId());
				this.displayOrder = entity.getDisplayOrder();
				if(entity.getEndRegisterTime()!=null)
					this.endRegisterTime= entity.getEndRegisterTime().toDate();
				if(entity.getStartRegisterTime()!=null)
					this.startRegisterTime = entity.getStartRegisterTime().toDate();
				if(entity.getEndUnRegisterTime()!=null)
					this.endUnRegisterTime =entity.getEndUnRegisterTime().toDate();
				this.name = entity.getName();
				if(entity.getSemester()!=null) {
					this.semester = new SemesterDto();
					this.semester.setId(entity.getSemester().getId());	
					this.semester.setSemesterCode(entity.getSemester().getSemesterCode());
					this.semester.setSemesterName(entity.getSemester().getSemesterName());
					this.semester.setDescription(entity.getSemester().getDescription());
					this.semester.setStartDate(entity.getSemester().getStartDate());
					this.semester.setEndDate(entity.getSemester().getEndDate());
					this.semester.setStartRegisterDate(entity.getSemester().getStartRegisterDate());
					this.semester.setEndRegisterDate(entity.getSemester().getEndRegisterDate());
					if(entity.getSemester().getIsLockRegister()!=null) {
						this.semester.setIsLockRegister(entity.getSemester().getIsLockRegister());
					}
				}
				if(entity.getExamPeriods()!=null) {
					this.examPeriods = new ArrayList<ExamRegisterPeriodDto>();
					for(ExamRegisterPeriod examPeriod:entity.getExamPeriods()) {
						ExamRegisterPeriodDto examPeriodDto = new ExamRegisterPeriodDto();
						examPeriodDto.setId(examPeriod.getId());
						examPeriodDto.setCode(examPeriod.getCode());
						examPeriodDto.setFromDate(examPeriod.getFromDate());
						examPeriodDto.setToDate(examPeriod.getToDate());
						examPeriodDto.setStart(examPeriod.getStart());
						examPeriodDto.setEnd(examPeriod.getEnd());
					}
				}
				if(entity.getIsLockRegister()!=null) {
					this.isLockRegister=entity.getIsLockRegister();
				}
			} else {
				this.setId(entity.getId());
				this.displayOrder = entity.getDisplayOrder();			
				this.name = entity.getName();
				if(entity.getStartRegisterTime()!=null)
				this.startRegisterTime = entity.getStartRegisterTime().toDate();
				if(entity.getEndRegisterTime()!=null)
				this.endRegisterTime = entity.getEndRegisterTime().toDate();
				if(entity.getEndUnRegisterTime()!=null)
				this.endUnRegisterTime = entity.getEndUnRegisterTime().toDate();
			}
		}
	}
}
