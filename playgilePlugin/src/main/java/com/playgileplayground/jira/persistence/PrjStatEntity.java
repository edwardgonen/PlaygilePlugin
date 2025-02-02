package com.playgileplayground.jira.persistence;

import net.java.ao.Entity;
import net.java.ao.schema.StringLength;

import java.util.Date;

/**
 * Created by Ext_EdG on 7/2/2020.
 */
public interface PrjStatEntity extends Entity {
    String getProjectKey();
    void setProjectKey(String projectKey);
    String getRemainingStoriesEstimations();
    @StringLength(StringLength.UNLIMITED)
    void setRemainingStoriesEstimations(String data);
    double getProjectTeamVelocity();
    void setProjectTeamVelocity(double velocity);
    double getInitialEstimation();
    void setInitialEstimation(double initialEstimation);
    double getSprintLength();
    void setSprintLength(double sprintLength);
    String getTeamName();
    void setTeamName(String teamName);
    Date getProjectStartDate();
    void setProjectStartDate(Date projectStartDate);
    boolean getProjectStartedFlag();
    void setProjectStartedFlag(boolean flag);
    String getProjectVersionLabel();
    void setProjectVersionLabel(String label);
    String getRoadmapFeature();
    void setRoadmapFeature(String name);
    double getDefNotEstimdIssueValue();
    void setDefNotEstimdIssueValue(double defNotEstimdIssueValue);
    Date getTargetDate();
    void setTargetDate(Date targetDate);
    String getProjectConfiguration();
    void setProjectConfiguration(String projectConfiguration);
}
