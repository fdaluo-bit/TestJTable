public class MyColumn {
	private String title;
	private String name;
	private Class<?> type;
	public MyColumn(String title,String name,Class<?> type) {
		this.title=title;
		this.name=name;
		this.type=type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Class<?> getType() {
		return type;
	}
	public void setType(Class<?> type) {
		this.type = type;
	}
}
