package com.nakib.firstjobapp.Job;

import java.util.List;

public interface JobService {
  List<Job> findAll();
  void createJob(Job job);
}
