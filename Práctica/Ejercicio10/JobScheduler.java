package jobScheduler.jobScheduler;


import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected Strategy strategy;
     
    public JobScheduler () {
    	this.jobs = new ArrayList<>(); 
    }
    
    public Strategy getStrategy() {
    	return this.strategy; 
    }
    
    public void setStrategy(Strategy estrategia) {
    	this.strategy=estrategia;
    }
    
    
    public void schedule(JobDescription job) {
    	this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
    	if (job != null) {
    	   this.jobs.remove(job);
    	}
    }  
   
    
    public List<JobDescription> getJobs(){
    	return jobs;
    }
    
    
    public JobDescription next() {
    	JobDescription description= strategy.next(jobs);
    	this.unschedule(description);
    	return description;
    	
    }
   
      	
}
    


