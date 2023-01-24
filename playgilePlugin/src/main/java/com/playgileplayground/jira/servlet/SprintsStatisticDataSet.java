package com.playgileplayground.jira.servlet;
import java.util.Date;

public class SprintsStatisticDataSet {
    private String name;
    private Date activatedDate;
    private Date completeDate;
    private int completedIssuesInSprintNumber;
    private int uncompletedIssuesInSprintNumber;

    public String getName() {
        return name;
    }

    public Date getActivatedDate() {
        return activatedDate;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public int getCompletedIssuesInSprintNumber() {
        return completedIssuesInSprintNumber;
    }

    public int getUncompletedIssuesInSprintNumber() {
        return uncompletedIssuesInSprintNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActivatedDate(Date activatedDate) {
        this.activatedDate = activatedDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public void setCompletedIssuesInSprintNumber(int completedIssuesInSprintNumber) {
        this.completedIssuesInSprintNumber = completedIssuesInSprintNumber;
    }

    public void setUncompletedIssuesInSprintNumber(int uncompletedIssuesInSprintNumber) {
        this.uncompletedIssuesInSprintNumber = uncompletedIssuesInSprintNumber;
    }
}