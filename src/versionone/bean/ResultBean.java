package versionone.bean;

public class ResultBean {

	private String[]    userNameList;
	private String      userName;
	private String      title;
	private String      backlog;
	private String      featureGroup;
	private String      status;
	private String      owner;
	private String      capacity;
	private String      detailEstimate;
	private String      toDO;
	private String      id;
	private String      devCompletePlannedDate;
	
	public ResultBean() {
		
	}
	public ResultBean(String[] userNameList)
	{
		setUserNameList(userNameList);
	}
	
	public void setUserNameList(String[] userNameList) {
		this.userNameList = userNameList;
	}
	
	public String[] getUserNameList() {
		return userNameList;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setBacklog(String backlog) {
		this.backlog = backlog;
	}
	
	public String getBacklog() {
		return backlog;
	}
	
	public void setFeatureGroup(String featureGroup) {
		this.featureGroup = featureGroup;
	}
	
	public String getFeatureGroup() {
		return featureGroup;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
	public String getCapacity() {
		return capacity;
	}
	
	public void setDetailEstimate(String detailEstimate) {
		this.detailEstimate = detailEstimate;
	}
	
	public String getDetailEstimate() {
		return detailEstimate;
	}
	
	public void setToDO(String toDO) {
		this.toDO = toDO;
	}
	
	public String getToDO() {
		return toDO;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setDevCompletePlannedDate(String devCompletePlannedDate) {
		this.devCompletePlannedDate = devCompletePlannedDate;
	}
	
	public String getDevCompletePlannedDate() {
		return devCompletePlannedDate;
	}
}
