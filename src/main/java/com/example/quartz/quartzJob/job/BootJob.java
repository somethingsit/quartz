package com.example.quartz.quartzJob.job;

import com.example.quartz.service.UserService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

public class BootJob implements Job {
    @Autowired
    private UserService userService;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.print("*************RUN JOB****************");
        userService.handleUser();
    }
}
