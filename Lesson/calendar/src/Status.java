public class Status {
    private String date;
    private Integer fatal;
    private Integer totalFatal;

    public Status(String date, Integer status, Integer totalFatal) {
        this.date = date;
        this.fatal = status;
        this.totalFatal = totalFatal;
    }

    public Status() {
    }

    public Integer getToalFatal() {
        return totalFatal;
    }

    public void setToalFatal(Integer toalFatal) {
        this.totalFatal = toalFatal;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getFatal() {
        return fatal;
    }

    public void setFatal(Integer fatal) {
        this.fatal = fatal;
    }
}
