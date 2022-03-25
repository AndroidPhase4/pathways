package com.Phase4.pathways.data

import com.Phase4.pathways.R
import com.Phase4.pathways.models.Job

class JobsDatasource() {

    fun loadJobs(): List<Job> {
        return listOf<Job>(
            Job(R.string.job1, R.drawable.chase, R.string.job1Desc, R.string.job1Url) ,
            Job(R.string.job2, R.drawable.bloomberg, R.string.job2Desc, R.string.job2Url),
            Job(R.string.job3, R.drawable.google, R.string.job3Desc, R.string.job3Url),
            Job(R.string.job4, R.drawable.meta, R.string.job4Desc, R.string.job4Url)
        )
    }
}