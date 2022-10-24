//package com.example.quartz.quartzJob.scheduler;
//
//import org.quartz.*;
//import org.quartz.impl.StdSchedulerFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.DependsOn;
//
//@Configuration
//public class schedulerConfig {
//
//    private final JobDetail jobDetail;
//
//    private final Trigger trigger;
//
//    public schedulerConfig(@Qualifier("bootJob") JobDetail jobDetail, @Qualifier("jobTriggerBoot") Trigger trigger) {
//        this.jobDetail = jobDetail;
//        this.trigger = trigger;
//    }
//
//    @DependsOn({"bootJob", "jobTriggerBoot"})
//    public void initJobAll() {
//        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
//        try {
//            Scheduler scheduler = schedulerFactory.getScheduler();
//
//            scheduler.scheduleJob(jobDetail, trigger);
//            scheduler.start();
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//        }
//    }
//}
