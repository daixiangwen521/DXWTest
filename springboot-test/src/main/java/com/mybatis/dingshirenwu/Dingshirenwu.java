package com.mybatis.dingshirenwu;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class Dingshirenwu {

	int i=0;
	
	/*@Scheduled(cron="0/2 * * * * ?")*/
	public void a() {
		i++;
		System.out.println("这是定时任务第"+i+"次执行");
	}
}
