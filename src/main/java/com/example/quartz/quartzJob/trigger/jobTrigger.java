package com.example.quartz.quartzJob.trigger;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class jobTrigger {
    @Bean(name = "jobTriggerBoot")
    public Trigger jobTrigger(@Qualifier("bootJob") JobDetail jobDetail) {
        System.out.println("Initial execute triggerRunBoot");
        try {
            String cron = "0/10 * * * * ?";
            return TriggerBuilder.newTrigger().forJob(jobDetail)
                    .withIdentity("RUN_BOOT", "BOOT_JOB")
                    .startNow()
                    .withSchedule(CronScheduleBuilder.cronSchedule(cron))
                    .build();
        } catch (Exception ex) {
            System.out.println("Error trigger:" + ex);
            return null;
        }
    }
}
