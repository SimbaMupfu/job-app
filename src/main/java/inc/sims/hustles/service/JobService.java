package inc.sims.hustles.service;

import inc.sims.hustles.model.JobPost;
import inc.sims.hustles.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public void addJob(JobPost jobPost) {
        jobRepository.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepository.findAllJobs();
    }
}
